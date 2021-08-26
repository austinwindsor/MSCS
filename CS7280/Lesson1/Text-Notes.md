# Lesson 1 Reading
Assigned reading for week 1 2021/8/23 is chapter 1 of (*"Network Science"* by Albert-laszlo Barabasi)[http://networksciencebook.com/]. I'll go ahead and cover (Chapter 0)[http://networksciencebook.com/chapter/0], the Personal Introduction as well.

## Chapter 0: Personal Introduction
The author wishes to strongly convey that the rapid growth of network science into the world-tier frontier field that it is today was not inevitable, easy nor straightforward. He demonstrates by way of personal anecdotes.

***Name to Review***
Béla Bollobás: Random Graphs
Erdős and Rényi: Classical work
Stuart Kaufmann: Biological Networks
Reka Albert: Author's best student at the time
Ithiel de Sola Pool and Manfred Kochen: Social Network authors from 1960
José Mendes, Sergey Dorogovtsev and Sid Redner: continuum of scale-free networks
Béla Bollobá: proof of scale-free networks
Shlomo Havlin: connected robustness and percolation theory 

***Terms to Review***
*growth*
*preferential attachment* 
*phas transistion*
*subgraphs*
*giant components*
*small worlds*
*weak ties*
*communities*

Albert-Laszlo had trouble, as many researchers do, of finding contemporaries who find the field of research 1) interesting, 2) relevant and 3) useful to their own fields of research. He particularly tried demonstrating network methods to the neuroscience field to little effect. The major difficulty was in motivating the research. So instead, he turned to practical applications using real maps of networks. However, in reaching out to Internet providers in 1996 (I don't know if that's the correct term for them in this nascent phase of the Internet?), he didn't receive any responses for linkage maps of the young Internet. Finally, he resolved himself to more conventional research.

That is, until Isaac Asimov's *Foundation* reinvigorated his fascination with complex systems in 1998. He recruits his brightest student Reka Albert to his cause. 

He drops some key term:
```
The graph theorists worried about phase transitions, subgraphs and giant components, while social scientists were fascinated by small worlds, weak ties and communities.
```

Watts and Strogatz's released a paper in *Nature* about small world networks which received much attention from the academic community. This highlighted the Albert-Laszlo's failings to frame his research properly: he was asking questions of interest to physicists to a neuroscience community.

Albert-Laszlo eventually recruited Hawoong Jeong from SNU, who eventually created a robot (web crawler) to map out the Internet. They were expecting a Poisson Distribution as per random network theory; however, a power rule greeted them instead. Indeed, upon gathering more maps, this pattern continued to emerge. Upon some critical thinking, Albert-Laszlo was able to explain this behavior using two variables: *growth* and *preferential attachment*. 

This finding was not immediately greeting with open arms by the academic community. There were many vocal dissidents of the field and the theory of scale-free networks. However, this paper in Nature *2000* on this scale-free network theory prompted other researchers to develop strong mathematical proofs of the theory, thus giving birth to the massively funded field.

## Chapter 1: Vulnerability Due to Interconnectedness
This chapter discusses the prevelance of networks and their non-locality property: their ability to spread benefits and information, as well as vulnerabilities across the network. Often times, there are faults in a node/edge of a network, but the burden can shift to neighboring nodes without much impact on the network behavior, as long as it falls within the neighbors' ability to bear. The issue is when the passed-on burden surpasses the neighbors' ability, it can result in cascading failures that echo intensely throughout the network. By way of example, imagine how a highway shutdown or a power outage in a single location can affect entire regional behavior. As the world has been becoming increasingly interconnected since WWII, this occurrence of cascading failures is becoming more prevalent. On one hand, this cascading failures can cause massive societal and fiscal problems, but on the other hand, scientists can leverage this trait to kills cancer cells or remove the terrorist group funding.

