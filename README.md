# Project Template

This is a Java Maven Project Template - This is ed testing

# Assumption

There are two types of drink, coffee and tea. User can order a coffee or tea. After users order a coffee, they are allowed to add milk or sugar and know the drink type, specific coffee name, unit milk, unit sugar and total condiments they added. For tea, users are allowed to know drink type and tea name they ordered.



# Implementation Description

I try use factory pattern to redo this assignment. So, when we want to add a new drink type, we can just write a class for it and will not change anything in other files.

My code is simplicity and understandability. For example, the methods for getting unit milk or sugar that users have already ordered are `getUnitMilk()` and `getUnitSugar()`. To get the total condiments, we have `getTotalNumberOfCondiments()`, which returns `getUnitMilk() + getUnitSugar()`.

The way of avoiding duplicated code is write their common method in superclass. Like, `CoffeeMathod` and `TeaMethod` class achieve all the methods in the Drink Interface. So, in each specific drink, we do not need to write the same code. Also, it's easy to override the method if they have unqiue requirements.

So, the first time, I just write a Drink superclass and two subclasses: TeaMachine and CoffeeMachine. I store the drink type in a list. It's hard to add new drink type or add something new. This time, I try to use factory pattern. We have a lot of products here. So, we create an interface for creating an object. our products can decide which class to instantiate. 



# Class Diagram

My class Diagram is in the template folder: UML Diagram.pdf




# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

# Run all the unit test classes.


```bash
mvn clean compile test checkstyle:check  spotbugs:check
```

# Using Spotbugs to find bugs in your project 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn spotbugs:gui 
```

or 


```bash
mvn spotbugs:spotbugs
```


```bash
mvn spotbugs:check 
```

check goal runs analysis like spotbugs goal, and make the build failed if it found any bugs. 


For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html


SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```



