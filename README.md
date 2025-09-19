# Design Pattern

Implementation of *GoF Design Pattern* in Java with description and class diagram.
Based on *Java 17*.

## Introduction

**Design pattern** is a general solution to a commonly occurring problem in software design. It is based on Object-Oriented—encapsulation, inheritance, and polymorphism—with SOLID principles.

> [!Note]
> There is no silver bullet and **The Pattern** is not a *panacea*.  
> Tailor the solution to the specific problem as possible.

## Table of Contents

- [Iterator](docs/iterator.md)

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

**Class diagram** describes the system's classes, fields, methods, and the relationships between classes.

### Class

**Class** defines what it has—*fields* and what it can do—*methods*.

- Field: Defines the properties of the class
- Method: Represents the behavior the class can perform.

#### Access Modifiers (Visibility)

| Symbol | Meaning         |
|--------|-----------------|
| `+`    | public          |
| `-`    | private         |
| `#`    | protected       |
| `~`    | default/package |

### Relationship

**Relationship** defines how classes or instances are connected in a system.

#### Association

Structural connection between classes.  
`Car ———> Driver`

#### Inheritance

Subclass inherits fields and methods from superclass.  
`Car ———▷ Vehicle`

#### Implementation

Class implements an interface.  
`Car ----▷ Driveable`

#### Dependency

Temporary connection where one class depends on another.  
`Car ----> Fuel`

#### Aggregation

'Whole-part' connection between classes where parts can exist independently.  
`Car ———♢ Parkinglot`
#### Composition

'Whole-part' connection between classes where the class owns parts.  
`Car ———♦ Engine`

