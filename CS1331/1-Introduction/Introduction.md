# Origin of Java
* Java 1.0 was officially released by a company called Sun Microsustems in 1996.    
* due to need for a language to run on appliances
* other oop languages existed by then, but Sun thought that a "safer" language was needed for personal devices
* even experienced programmers of C and C++ can have signifcant memory errors and securty bugs
* more easily avoidable in Java because memory management is automatically built into the language
* nowadays, Java is an oracle product


# Basic Elements of Java Programs
* statements can be grouped together into a method, kind of simliar to functions
* program must have one or more methods
* must have a main
* methods are enclosed in classes
* a program must have one or more classes
* classes are usually camelCase

## Example 1
```
// A simple program that prints text on the terminal
public class HelloWorld {
	public static void main(String[] args) {
			System.out.println("Hello,World!");
	}
}
```

* name of file must match the name of the class in file
* handle is .java
* the above code is still too-high level, needs a translator (Compiler and Interpreter) to convert it to low code
* Compiler: take a program that's written in one high-level language to a low-level, trnaslates everything in one session with intermediate files
* an interpreter  translates a language on the fly, no intermediate file involved

# Compile vs Interpret
* compiled language are fast since doesn't need translation each time
* a compiled code's instruction set can be incompatible with different OS, so would have to compile different versions of compiled code depending on the device
* interpretted language can work on any device

# Java's Approach
Java takes a hypbrid approach: does not compile directly to machine code like C and C++
Instead, creates a bytecode, .class, which is close to mahcine code, but slightly higher and makes no assumption about device requirements
Then it uses an interpretter to take the lower level code to machine level code
This interpretter is called the Java Virtual Machine (JVM)
There are also other clever optimizations like ***Just-In-Time compilation*** which are beyond the scope of this course

# Instructions to run Java
1. run `javac HelloWorld.java` to compile to bytecode
2. run `java HelloWorld` to execute the bytecode

