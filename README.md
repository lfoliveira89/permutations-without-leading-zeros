# Permutation Calculator

This is a Java application for calculating number of permutations with or without leading zeroes.

## Getting Started

### Prerequisites
* Git
* JDK 8
* Maven 3.0 or later

### Clone
To get started you can simply clone this repository using git:
```
git clone https://github.com/lfoliveira89/permutations-without-leading-zeros.git
cd permutations-without-leading-zeros
```

### Quick start
You can run the tests from the command line using:
```
mvn test
```
You can run the application from the command line using:
```
mvn clean install
```
```
java -jar target/permutations-without-leading-zeros.jar 432
```
or
```
mvn clean install exec:java -Dexec.mainClass="main.Main" -Dexec.args="432"
```

## Calculation logic

The application uses the following formula in order to calculate the number of permutations:

### 1) Without leading zeroes

(n0 + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9)! / n0! n1! n2! n3! n4! n5! n6! n7! n8! n9!

### 2) With leading zeroes

((n0 - 1) + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9)! / (n0 -1)! n1! n2! n3! n4! n5! n6! n7! n8! n9!

### Usage

Where n is a number occurrence in the input.
* Input without number zero: Formula 1
* Input with number zero: Formula 1 - Formula 2

### Example

Given the input 432. Only formula 1 is used for the calculation.

Then, we have the following number occurrences:
* 4 --> 1
* 3 --> 1
* 2 --> 1

The math will be: (1 + 1 + 1)! / 1! 1! 1! --> 3! / 1! --> 6

Given the input 6006. Formula 1 and Formula 2 will be used for the calculation.

Then, we have the following number occurrences:
* 6 --> 2
* 0 --> 2

Formula 1: (2 + 2)! / 2! 2! --> 4! / 2! 2! --> 24 / 2 x 2 --> 6

Formula 2: ((2 - 1) + 2)! / (2 - 1)! 3! --> 3! / 1! 2! --> 6 / 1 x 2 --> 3

Result is the difference between Formula 1 result and Formula 2 result: 6 - 3 --> 3