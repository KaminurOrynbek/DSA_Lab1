# Recursion - Algorithms and Data Structures
There is a 10 problems solved by recursion.
## Run the code:
1. Download file
2. Open your IDEA (Intellij IDEA, Eclipse, etc.)
3. Create new project
4. Open file in IDEA
5. Click the run button
## Methods and explanation
### *minFinder()* : 
* Function finds and prints the minimum element in an array and defines first element as minimum, then compares it with each element until finds the minimum.
* Time Complexity: O(n).
### *averageValue()*:
* Function finds and prints average of elements in an array: defines sum as 0 and adds each iteration to each element of array and in the last divides sum to n.
* Time complexity: O(n)
### *isPrime()*:
* Function checks whether the number is prime or not. It checks each iteration
    starting from 2 until number itself is this number divides to the iteration.
    If it is true loop breaks, otherwise this number is prime. Also, we can consider only half of number.
    Because, if the first half isn't composite, the other half too and vice versa.
* Time complexity: 0(n)
### *factorial()*:
* Function uses recursion to find a factorial of given number by multiplying number and subtracting 1 each time
* Time complexity: 0(n)
### *fibonacci()*:
* Function finds n-th elements in Fibonacci sequence by giving number n and this function uses recursion.
* Time complexity: 0(2^n)
### *power()*:
*  Function returns a^n by giving a and power n
*  Time complexity: 0(n)
### *reversed()*:
* The function recursively prints the elements of the array in reverse order until it
     reaches the base case where n is less than or equal to 1.
* Time complexity: O(n)
### *CheckingDigits()*:
* Checks the given s string contains only number and prints Yes otherwise No
* Time complexity: O(n)
### *binomialCoeff()*:
* Recursively calculates the binomial coefficient C(n, k).
* Time Complexity: O(2^n)
### *findGCD()*
* The function findGCD calculates the Greatest Common Divisor
    (GCD) of two numbers a and b using recursion based on the Euclidean Algorithm\
* Time Complexity: O(log(n))
## *duration(Runnable task)*:
* This allows you to measure the execution time of different tasks or code blocks by passing them as Runnable objects to the duration method.
* @param: The Runnable interface in Java is a functional interface defined in the java.lang package. It contains a single abstract method named run(), which does not take any arguments and does not return any value. This method represents a task or action that can be performed.
When you pass a Runnable object to the duration method, the run() method of that object will be executed.
