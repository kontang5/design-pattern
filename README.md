# Design Pattern

Implementation of *Design Pattern* in Java with description and class diagram.
Based on *Java 17*.

## Table of Contents

## Project Structure

```text
design-pattern/ 
├── src.main.java/
│   └── source code
├── gradle/  
│   └── wrapper
├── build.gradle.kts
├── gradlew, gradle.bat
├── settings.gradle.kts
├── docs/  
│   └── documentation files
└── README.md 
```

## Class Diagram

Describes the system's classes, fields, methods, and the relationships between classes.

### Class

Defines what it has—*fields* and what it can do—*methods*.

- Field: Defines the properties of the class
- Method: Represents the behavior the class can perform.

#### Types of Class

- **Normal Class**: Standard class with fields and methods.
- *Abstract Class*: Cannot be instantiated directly; meant to be subclassed.
- *<<Interface\>\>*: Defines a contract that implementing classes must follow.
- <<Enumeration\>\>: A set of named constants.

#### Access Modifiers (Visibility)

| Symbol | Meaning         |
|--------|-----------------|
| `+`    | public          |
| `-`    | private         |
| `#`    | protected       |
| `~`    | default/package |

### Relationship

Defines how classes are connected or interact in a system.

- **Association**: Structural connection between classes.  
  `Student ———> Course`  
- **Aggregation**: “whole-part” relationship where the part can exist independently of the whole.  
  `Book ——–<> Library`
- **Composition**: Strong “whole-part” relationship where the part’s lifecycle depends on the whole.  
  `Room ———◆ House`
- **Dependency**: Temporary relationship where one class uses or depends on another.  
  `Car ---> Engine`
- **Generalization**: Relationship where a class inherits fields and methods from a superclass (“is-a” relationship).  
  `Dog ———|> Animal`
- **Realization**: Relationship where a class implements an interface.  
  `Car - - |> Drivable`