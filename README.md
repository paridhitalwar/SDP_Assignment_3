
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Paridhi Talwar             |
| Date         | 10/21/2024                 |
| Course       | Fall 2024                  |
| Assignment # | 3                          |

# Assignment Overview
The email generation application utilizes the Template Method Pattern to create a structured process for generating emails for different types of customers. This pattern allows for a skeleton of an algorithm to be defined in the superclass (EmailGenerationTemplate), while specific steps of the algorithm are implemented in subclasses (BusinessCustomer, ReturningCustomer, FrequentCustomer, NewCustomer, VIPCustomer). This design promotes code reuse and adheres to the Open/Closed Principle by allowing the application to be open for extension but closed for modification.

# GitHub Repository Link:
https://github.com/paridhitalwar/SDP_Assignment_3

# Implementation Description 


## Flexibility
The implementation of the email generation application demonstrates high flexibility by utilizing the Template Method Pattern. This design allows for easy addition of new customer types by simply creating new subclasses that extend the `EmailGenerationTemplate` abstract class and implementing the required methods specific to the new customer type. Similarly, removing a customer type is straightforward as it only involves deleting the corresponding subclass without affecting the rest of the codebase. This modular approach ensures that the system remains open for extension but closed for modification, adhering to the Open/Closed Principle.

## Simplicity and Understandability
The application is designed with simplicity and understandability in mind, achieved through clear structure, encapsulation, and modularity. Each customer type is encapsulated within its own class, following the Single Responsibility Principle, which makes the code easy to read and maintain. The use of small, focused methods ensures that each part of the email generation process is clearly defined and easy to follow. Comprehensive documentation and comments for each class and method further enhance the readability and ease of understanding, making it accessible for new developers and reducing the learning curve.

## Avoiding Duplicated Code
To avoid duplicated code in the email generation application, the Template Method Pattern is used. This pattern allows common code, such as the overall structure and repeated steps of the email generation process, to be defined once in the abstract `EmailGenerationTemplate` class. Specific details that vary between customer types, such as the subject line and message body, are implemented in subclasses (`BusinessCustomer`, `ReturningCustomer`, `FrequentCustomer`, `NewCustomer`, and `VIPCustomer`). By centralizing the common behavior in the superclass and customizing only the necessary parts in subclasses, duplicated code is minimized. This approach not only reduces redundancy but also enhances maintainability and consistency across different customer types.

## Design Patterns Used
The Template Method Pattern is the primary design pattern used in this implementation. It was chosen because it allows for defining the skeleton of an algorithm in a base class while letting subclasses override specific steps of the algorithm without changing its structure. This pattern is particularly suitable for scenarios where an algorithm's steps are fixed, but the details of some steps can vary. By using this pattern, the codebase remains organized, easy to extend with new customer types, and ensures that the core logic of email generation remains consistent and reusable across different customer segments.

# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
```



## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




