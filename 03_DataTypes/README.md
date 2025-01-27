Title: Java Data Types  
Author: Brooke Taylor  
Date: 01/26/2025  
Description: Data Types!  

[w3schools.com](https://www.w3schools.com/java/java_data_types.asp)


# Java Data Types

    int myNum = 5;                // Integer 
    float myFloatNum = 5.99f;     // Floating point number
    char currency = '$';          // Character
    boolean myBool = true;        // Boolean
    String myText = "Hello";      // String

Data types are divided into two groups:

* Primitive data types - includes `byte`, `short`, `int`, `long`, `float`, `double`, `boolean` and `char`
* Non-primitive data types - such as `String`, `Arrays` and `Classes`



| Data Type | Description |
| ----------- | ----------- |
| `byte` | Stores whole numbers from -128 to 127 |
| `short` | Stores whole numbers from -32,768 to 32,767 | 
| `int` | Stores whole numbers from -2,147,483,648 to 2,147,483,647 | 
| `long` | Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | 
| `float` | Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits | 
| `double` | Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits | 
| `boolean` | Stores true or false values | 
| `char` | Stores a single character/letter or ASCII values | 



## Java Numbers 

Primitive number types are divided into two groups: 

**Integer types** stores whole numbers, positive ro negative (such as 123 or -456), without decimals. Valid types are `byte`, `short`, `int` and `long`. Which type you should use, depends on the numeric value.

**Floating point types** represents numbers with a fractional part, containing one or more decimals. There are two types: `float` and `double`.

> Even though there are many numeric types in Java, the most used for numbers are `int` (for whole numbers) and `double` (for floating point numbers).

## Non-Primitive Data Types

Non-primitive data types are called **reference types** because they refer to objects.

The main differences between **primitive** and **non-primitive** data types are: 

* Primitive types in Java are predefined and built into the language, while non-primitive types are created by the programmer (except for `String`).

* Non-primitive types can be used to call methods to perform certain operations, whereas primitive types cannot.

* Primitive types start with a lowercase letter (like `int`), while non-primitive types typically starts with an uppercase letter (like `String`).

* Primitive types always hold a value, whereas non-primitive types can be `null`.

Examples of non-primitive types are `Strings`, `Arrays`, `Classes`.