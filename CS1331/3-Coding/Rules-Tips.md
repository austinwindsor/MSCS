# Errors
Generally, there are three type of errors that can occur: compiler, runtime and logical

There are two main concepts to break these down: syntax and semantics.

Syntax represents how a language must be written according to certain rules. It's very mechanical in function.

Semantics, on the other hand, has to deal with the meaning and purpose of the bit of language. *Even if something abides by the syntax, it can still not make much semantic sense.* This means that we can get unexpected code that runs smoothly but has unintended functionality.

## Compiler Errors
Typically represents syntax violations. this is because a compiler is responsible for translating source code to low code.

## Runtime Errors
This happens in the Java Virtual Machine (JVM) as the interpreter tries to run the low code. This error denotes semantic errors. Additionally, it can also error due to lack of resources or memory to perform its tasks.

## Logical Errors
This pertains to the italicized bit of notes above: something can make syntactical sense but not semantic sense. This error will NOT be flagged in the command line. Instead, this relates to when the code compiles and runs successfully but doesn't perform as expected.

* to avoid running into too many kinds of error, incrementally (after every method) compile and run. writing entire swaths of code and only testing at the end can make debugging very difficult.

# Comments
There are three types: line comments, block comments, and Javadoc comments.
Line comments use // at the front; block comments are surrounded by /* ... */. Javadoc instead extracts comments surrounded in /**  ... */ and compiles it into a nice preformatted HTML file.

# Variables vs Constants
They are essentially the same: same scope, declaration and everything. The only difference is that a constant has a reserved term 'final' preceding it which means it cannot be reassigned another value within the current scope.

# Primitive Types
Types inherently declared in Java: byte, short, int, long, float, double, char and boolean.
* float: 32 bits, -3.402E38 to 3.402E38 with 6-7 digits of precision
* double: 64 bits, -1.79E308 to 1.79E308 with 15-16 digits of precision

## Default types
default type for integers is **int**
default type for decimals/floating point numbers is **double**
* ***must be careful that the type of value and the type of the variable align. ***    
* Java provides a shortcut by appending "L" to the end of the integer to make sure it's a long, and not the default Integer.
* Java provides a shortcut by appending "F" to the end of the integer to make sure it's a float, and not the default Double.

# Expressions
* possible to concat a string/char with a int
* integer division results in division that's **truncated** to th integer. As long as one portion of the division is a floating point, will not truncate result.

# Conversions
* when an expression is comprised of mixed data types, it will **promote** the lower data types temporarily to the appropriate type and return the highest level present in the expression.
* when assigning a variable with using the value of a lower data type, it will automatically **convert** it to the appropriate *higher* level, without affecting the original variable's data type
* however, a lossy conversion, going from a higher data type ot a lower one (ex: float --> int) will result in an error of incompatible data types. 
* the legality of the above error is based on a data type hierarchy. This hierarchy is NOT defined by the amount of bits it requires, but rather by the range. 
```
For example, both an int and float are 32 bits, but the float's range in much greater than that of the int; therefore, it's legal to assign a float (the wider type) using the value of an int (the narrower type).
```
***the hierarchy can be demonstrated as below***
```
Double
	Float
		Long
			Int
				Char
				Short
					Byte
```

* there's also **casting** which forcefully changes a values type
`(double)5/9 == 5.0/9 == 5D/9`
* this can be used to avoid data incompatibility errors as seen below
```
double average = 4.0;
int gpa = (int)average;
```
