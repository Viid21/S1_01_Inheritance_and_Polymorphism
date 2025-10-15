# 🧑‍💻 Task S1.01. Inheritance and Polymorphism
**Author:** David Rey  
**Corrected by:** Lois González ([pantalois](https://github.com/Viid21/S1_01_Inheritance_and_Polymorphism/issues/1))  
## 📄 Description
This project contains several object-oriented programming exercises in Java, organized by difficulty levels.
### 🔹 Level 1
#### Exercise 1 – Musical Instruments
An abstract class Instrument is defined with attributes name and price, and an abstract method play().
Subclasses are created: Wind, String, and Percussion, which implement the play() method by displaying a specific message.
The behavior of class loading with static members and initialization blocks is demonstrated.
#### Exercise 2 – Car Class
The Car class is created with the following attributes:
- brand → static final
- model → static
- power → final
The differences between these modifiers are demonstrated, along with which ones can be initialized in the constructor.
Includes two methods:
- brake() → static method
- accelerate() → non-static method
Usage of these methods is shown in the main().
### 🔹 Level 2
#### Smartphone
The Phone class is created with attributes brand and model, and the method call(String number).
Two interfaces are defined:
- Camera with the method takePhoto()
- Clock with the method alarm()
The Smartphone class inherits from Phone and implements both interfaces.
Method usage is demonstrated in the main().
### 🔹 Level 3
#### Sports News Writing
Editors are defined with attributes name, immutable ID, and a shared salary.
Each editor can have multiple news articles.
News articles are categorized by sport: football, basketball, tennis, F1, and motorcycling.
Each type of news has specific attributes and a method calculateNewsPrice() based on detailed criteria.
Each article also has a score calculated based on its content.
A menu is created with the following options:
- Add editor
- Remove editor
- Add news to an editor
- Remove news
- Show news by editor
- Calculate news score
- Calculate news price

### 💻 Technologies Used
- Java SE 24
- IntelliJ IDEA as the development environment
- Git & GitHub for version control
- JDK for compiling and running the code
- Collections Framework (ArrayList, etc.)
- OOP: Classes, inheritance, interfaces, abstract methods, and static members

### 📋 Requirements
- Java Development Kit (JDK) 24 or higher
- IntelliJ IDEA or any Java-compatible IDE
- Git installed to clone the repository
- Basic knowledge of object-oriented programming

### 🛠️ Installation
- Clone the repository:
git clone https://github.com/Viid21/S1_01_Inheritance_and_Polymorphism.git
