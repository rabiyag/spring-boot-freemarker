# Spring Boot Freemarker

This project demonstrates integrating Freemarker templates with Spring Boot, allowing for dynamic rendering of HTML views in web applications.

## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Running the Application](#running-the-application)
- [Usage](#usage)

## Features
- Freemarker Template Engine: Use Freemarker to generate dynamic HTML views.
- Spring Boot Integration: Seamlessly integrates Freemarker with Spring Boot for easy configuration and setup.
- Model Data Binding: Bind model data to the views for rendering.
- Custom Templates: Customize Freemarker templates for personalized content rendering.
- Error Handling: Structured error responses for view rendering issues.

## Technologies Used
- **Spring Boot** (backend framework)
- **Freemarker** (Template Engine)
- **Maven** (dependency management)

## Prerequisites
- **JDK 8** or higher
- **Maven** for dependency management

## Setup
1. **Clone the repository**:
   ```bash
   git clone https://github.com/rabiyag/spring-boot-freemarker.git
   cd spring-boot-freemarker
   ```

2. **Update application.properties to enable freemarker:**:
    ```properties
    spring.freemarker.enabled=true
    spring.freemarker.prefix=classpath:/templates/
    spring.freemarker.suffix=.ftl
    ```
   
3. **Build the project with Maven**:
   ```bash
   mvn clean install
   ```

## Running the Application
1. **Run the application**:
   ```bash
   mvn spring-boot:run
   ```

2. **Access the application**:
   - The application will be available at http://localhost:8080:
  

## Usage

1. Create Templates: Place .ftl templates in the src/main/resources/templates/ directory.

2. Render Views: Use controllers to pass model data to the templates and render dynamic content.

**Sample Controller**: 

```java
   @Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to Freemarker with Spring Boot!");
        return "home"; // home.ftl will be rendered
    }
}
   ```
