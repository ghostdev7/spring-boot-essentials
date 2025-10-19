# Spring Boot Learning

## Basics

Spring solves tight coupling by IoC or DI. Vendor Lock-In (by using POJOs). Brings modularity.

**Inversion of control**

Inversion of control (IoC) is a software design principle where the flow of control for a program is inverted, transferring the responsibility of managing object creation and dependencies from the application code to an external framework or container. Instead of a component creating its own dependencies, it receives them from an external source, which promotes loose coupling and makes the system easier to test and maintain. A common way to implement IoC is through dependency injection.

**Dependency injection**

Dependency injection is a programming technique where an object or function receives its dependencies (other objects or functions it needs) from an external source, rather than creating them itself. This approach, which is a form of Inversion of Control, makes code more flexible, maintainable, and testable by decoupling components and allowing them to be replaced or mocked easily. 

**Bean**

A Bean in Spring is simply an object managed by the Spring IoC container. Basically it is an object whose lifecycle (creation, initialization, destruction) is handled by Spring.

**Annotations**

Annotations in Spring are a form of metadata used to provide supplemental information about a program, simplifying configuration and development by reducing the need for extensive XML setup. 


@SpringBootApplication: It is the entry point for any Spring Boot application. It combines three annotations:

@Configuration - Makes this a configuration class

@EnableAutoConfiguration - Enables Spring Boot auto-configuration

@ComponentScan - Scans for components in this package and subpackages



### Run spring boot application

```
mvn spring-boot:run
```
