# Standards And Practices

## Index
- [Preface](#preface)
- [Language](#language)
- [Order of Source File Contents](#order-of-source-file-contents)
- [Comments](#comments)
  - [Header Comment](#header-comment)
  - [Standard Comments](#standard-comments)
- [Package and Import Statements](#package-and-import-statements)
- [Class Definitions](#class-definitions)
  - [Data Attributes](#data-attributes)
    - [Constants](#constants)
  - [Class Methods and Brackets](#class-methods-and-brackets)


## Preface
These standards and practices will be largely sourced and modified from ["Java Code Conventions" by Oracle](https://www.oracle.com/technetwork/java/codeconventions-150003.pdf).

---

## Language
We will be using the Java programming language for our application.

---

## Order of Source File Contents
1. Header comment
2. Package and import statements
3. Class definitions

---

## Comments

### Header Comment
All source files should begin with a c-style comment that:
- lists the programmer(s), <br>
- the date of creation, <br>
- and also a brief description of the purpose of the program. 
```
example:

/*
* Firstname Lastname
* 2025-02-11
* Filename: short explanation of the purpose for this file
*/
```

### Standard Comments
Comments should be consise and to-the-point. Economize usage of comments as to not clutter the file.

---

## Package and Import Statements
Should be located right after the header comment, and before any other sections.
One line per import, do not combine import statements into a single line.

Good example:  
```
import java.applet.Applet;
import java.awt.*;
import java.net.*;
```

Bad example:
```
import java.applet.Applet;import java.awt.*;import java.net.*;
```

---

## Class Definitions
Class definitions should follow this order:
1. Class statement
2. Class implementation comment (if the purpose of the class is not self-evident)
3. Data attributes
	1. public attributes
	2. protected attributes
	3. private attributes
4. Constructors
5. Helpers
6. Getters
7. Setters
8. To-String

### Data Attributes
At most one declaration per line.
Camel case.

Example: `int attributeName;`

#### Constants
Any `final` attributes should be written with upper-case snake case.

Example: `final int ATTRIBUTE_NAME;`

### Class Methods and Brackets

If you can, expand brackets into multiple lines.

Good example:
```
public void methodName(param) {
	if (param == 1) {
		return FALSE;
	} else {
		return TRUE;
	}
}
```

Bad example:
```
public void methodName(param) {
	if (param == 1) {return FALSE;} 
	else {return TRUE;}
}
```
