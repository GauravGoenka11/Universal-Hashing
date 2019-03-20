-------------------UNIVERSAL HASHING------------------

PROBLEM STATEMENT:A universal hash function is to be designed for data set of 1000 unique numerical values.
                  The hash table is of size 20 and with each block memory of size 100 is attached.
                  Out of available locations ending with 1,3,4,5,9 can be used.
                  Illustrate the snapshot of the storage.

TECHNOLOGY STACK: JAVA

				  
DESCRIPTION:
	In this problem defination we have to design a function which can store 1000 unique values.
Hash table is given of  size 20 and memory size attached to it is 100.
The locations ending with 1,3,4,5,9 only can be used.
Universal hashing refers to selecting a hash function at random from a family of hash functions with a certain mathematical property. 
This guarantees a low number of collisions in expectation.

Functionality:
	Arraylist is the key functionality used in the program.
ArrayList is a part of collection framework and is present in java.util package. 
It provides us dynamic arrays in Java.Java ArrayList allows us to randomly access the list.

Random is also another key functionality used for generating random key values.
We have generated 1000 random numbers.The nextInt() is used to get the next random integer value from 
this random number generator’s sequence.The method call returns the next integer number from the sequence.
We are adding all the random numbers in the array.	
				  
Hashing is also used as main functionality.
Hashing is a technique that is used to uniquely identify a specific object from a group of similar objects.
Assume that you have an object and you want to assign a key to it to make searching easy. 
To store the key/value pair, you can use a simple array like a data structure where keys (integers) can be used directly as an index to store values. 
However, in cases where the keys are large and cannot be used directly as an index, you should use hashing.

In hashing, large keys are converted into small keys by using "Hash Functions".
The values are then stored in a data structure called "Hash table". 
The idea of hashing is to distribute entries (key/value pairs) uniformly across an array.
In the given problem statement,
		HASH FUNCTION USED IS "(((a*(arr.get(i))+b)%p)%m)" i.e. a=3,b=42,p=101,m=20
		HASH TABLE SIZE IS 20 with block memory 100.

		
		
		