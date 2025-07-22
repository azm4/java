# About 
Developed at **Sun Microsystems** which was purchased by **Oracle** in 2010. **Java** is general purpose and mostly used for developing software running on *mobile, desktop, and servers*.
It is also machine independent. It is based on the **C Programming Language**. 
# Java Language Specification
To write usable code in **Java** we need to follow it's own *Syntax* and *Semantics*. 
# Application Programming Interface
It is also known as a ***library***. Contains predefined java codes. Similar to **Library Functions in C**.
# Java Editions
Different **Java** editions are used for developing different types of application. 
- **Java Standart Edition (SE)**: Used for desktop application.
- **Java Enterprise Edition (EE)**: Used for server-side application.
- **Java Micro Edition (ME)**: Used for mobile application.
# Java Development Kit (JDK)
It is a set of programs which enable us to develop programs in **Java**.
It contains **Java Runtime Environment(JRE)** it is used to run our programs.
> JRE & JDK both contain Java Virtual Machine (JVM). JVM executes **Java** program on different machines. For that reason, Java is machine independent.
# Integrated Development Environment (IDE)
It is a program that allows us to *write, compile, debug, build, run* Java code.
# Java Program Anatomy (How a simple JAVA program looks like)
> - Classes & Objects
> - Methods
> - Naming Conventions
> - Java Program Structure
> - Packages
### Classes & Objects
> Technically speaking, A **Class** is a blueprint to create an **Object** and an **Object** is an instance of a **Class**.
### Class Structure
```java
class class_name { // class name must be similar to the filename if public
    // code block
}
```
**class** is a keyword.
### Method 
Group of instruction to do a specific task. Methods are similar to functions that we use in **C**.
### Method Structure
```java
return_type method_name (parameters) {
    // code block
}
```
> Note: Every Method is written inside a **Class**.
### Calling A Method
```java
method_name ( input parameters );
```
> Note: The **main()** method is automatically called when we run our **Java** program.
> - Similar to the **main()** function in **C**.
> - Starting of the program execution.
> - All methods are executed inside **main()** method.
### Access Modifiers
Specifies how to access Classes & Methods. They are all keywords.
> - Public
> - Private
> - Protected
> - Default
### Naming Conventions
Ways of naming things in Java. There are many. Some are given here. 
- **Pascal case convention**: The first letter of each word is **uppercase**.
  > Example: **T**his**I**s**AN**ame  
  > They are used in **Classes**.
- **Camel case convention**: Similar to **Pascal case convention** except the *first letter of the first word* is **lowercase**.
  > Example: this**I**s**AN**ame  
  > Used in **Variables** & **Methods**.
- **Snake case convention**: Every letter is **lowercase**. However, there is an underscore `_` after every letter except the last one.
  > Example: this_is_a_name
### Java Program Structure
```java
public class Main {            // <access modifier> <keyword> <class_name>
    public static void main (String[] args) { // <access modifier> <modifier> <return_type> <name> <parameters>
        // code block
    }
}
```
- Declaration of the **Class**
  > **public** = Access Modifier. Not always necessary.  
  > **class**  = Keyword for declaring a **Class**.     
  > **Main**   = name of the **Class**. It follows the **Pascal** naming convention.  
- Declaration of the **Method**
  > **public** = Access Modifier.  
  > **static** = Modifier. It means that this **method** belongs to this class, not to **objects**.  
  > **void**   = Return type.  
  > **main**   = Method name. Follows the **Camel** naming convention.
#### Takeaways: 
- Each Java program has atleast one class.
- **Pascal** case is used with Classes.
- **Camel** case is used with Methods.
- A **Method** exists inside a Class.
- **main()** is a method. It is the starting point of a java program.
- Every Java program has a **main()**.
### Packages
They are a container for Classes. 
# Displaying Messages in a Java Program
> - Strings
> - print & println methods
> - `System` Class
### Strings
A **String** is a group of characters. It should be put in **double quotes** `" "`.
### print & println
They are **Methods**, similar to functions in **C**.
```java
System.out.print("hello"); // calling print
// We access the "System" class to find the "out" field so that, we can use methods like print/println and many more.
```
> **print/println** = Method. **println** is the same as print except it prints an linebreak at the end of the output.

> **out** = an **Object** of the **PrintStream** Class.
> - It contains **Methods**.
> - We use `.` operator to access the methods within **out** object.
> - Example: out`.`
> - **out** refers to the standart output device.
### `System` Class
Follows the **Pascal** naming convention.
> out is inside **System**.  
> out is a field of **System**.

# Displaying Numbers in Java
```Java
System.out.println(4);
System.out.println(4+5);
System.out.println(4-2);
System.out.println(4*3);
System.out.println(4/2);
```
We can use all normal Arithmatic Operators.
