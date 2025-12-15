Title: Inheritance  
Author: Brooke Taylor / ChatGPT / W3Schools  
Date: 12/14/2025  
Description: Learning Java Inheritance. 
---

# Java Inheritance (Subclass and Superclass) 

In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:

* **subclass** (child) - the class that inherits from another class
*  **superclass** (parent) - the class being inherited from

To inherit from a class, use the `extends` keyword.

> [w3schools](https://www.w3schools.com/java/java_inheritance.asp)

---

# What is Inheritance (in plain English)

**Inheritance** means 

A **child class** can **reuse** and **extend** the behavior of a **parent class** 

Think: 
* "A **Dog** *is an* **Animal**"
* "A **Manager** *is an* **Employee**"
* "A **FlooringProduct** *is a* **Product**"

## Basic Syntax (the `extends` keyword)

        class ChildClass extends ParentsClass {
            // extra stuff goes here
        }

## Simple Example (Animal -> Dog)

### Parent class
        public class Animal {
            String name;
        
            void eat() {
                System.out.println("This animal eats food.");
            }
        }


### Child class
        public class Dog extends Animal {
        
            void bark() {
                System.out.println("Woof!");
            }
        }


### Using it
        public class Main {

            public static void main(String[] args) {
                Dog dog = new Dog();
                dog.name = "Otto";

                dog.eat();   // inherited
                dog.bark();  // dog-specific
            }
        }

> [ChatGPT](https://www.chatgpt.com/)

