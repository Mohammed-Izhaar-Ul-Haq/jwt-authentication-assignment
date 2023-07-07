# jwt-authentication-assignment
Assignment implementing jwt

## Table of Contents

- [About](#about)
- [Getting Started](#getting-started)
- [Dependencies Used](#dependencies-used)
- [Endpoints](#endppoints)
- [Testing](#testing)
- [Contact](#contact)

## About

## JWT Implementation for User Registration, Login, and Current User Retrieval

This project implements JSON Web Token (JWT) authentication for user registration, login, and retrieving the current user information. JWT is a stateless authentication mechanism that allows secure communication between a client and a server using digitally signed tokens. 

### Main Features
1. User Registration: Users can create an account by providing their name, email, and password. The registration process securely stores user information in a database.
2. User Login: Registered users can log in by providing their email and password. Upon successful authentication, the server generates a JWT token and sends it back to the client.
3. Authentication Middleware: The project includes middleware that validates the JWT token sent by the client on subsequent requests. This ensures that only authenticated users can access protected routes.
4. Current User Retrieval: The server provides an endpoint to retrieve the current user's information based on the authenticated JWT token. This allows the client to display personalized content or perform user-specific actions.

### Technologies Used
- Java: The project is developed using Java programming language.
- Spring Boot: Spring Boot framework is used to build the RESTful API.
- Spring Security: Spring Security is employed for handling authentication and authorization.
- JSON Web Tokens (JWT): JWT is used for creating and validating tokens for user authentication.
- Database:H2 Dtatbase.
- PORT NUMBER:8080(can be changed in application.properties(spring.h2.console.settings.web-port=protno))

## Getting Started

To get the Spring Boot project up and running on your local machine using Spring Boot Tool Suite (STS), you'll need to follow these instructions:

Prerequisites:
1. Java Development Kit (JDK): Make sure you have JDK installed on your machine.
2. Java version:11
3. Spring Boot Tool Suite (STS): Download and install the latest version of STS(version 4) from the official website.

   
Installation Steps:
1. Clone the Project: Open a command prompt or terminal and navigate to the directory where you want to clone the project. Run the following command to clone the project repository from GitHub:
   ```
   git clone https://github.com/mohammedizhaarulhaq/jwt-authentication-assignment-intershala.git
   ```

2. Open STS: Launch Spring Boot Tool Suite (STS) on your machine.

3. Import the Project: In STS, go to `File -> Import -> Maven -> Existing Maven Projects` and click "Next".

4. Select Project Directory: Click on the "Browse" button and navigate to the directory where you cloned the project. Select the project directory and click "Finish". STS will import the project.

5. Run the Application: In STS, navigate to the `src/main/java` directory and  locate com.greenstitch.jwt the main class of Spring Boot application (a class annotated with `@SpringBootApplication`). Right-click on the class and select `Run As -> Spring Boot App` or `Run As -> Java Application`.

6. Verify the Application: The Spring Boot application will start running. You can verify its successful startup by checking the console output for any errors or exceptions. Once the application is running, you can access it in your browser by visiting `http://localhost:8080` (or a different port if you have configured it differently).

## Dependencies Used

- org.springframework.boot:spring-boot-starter-web
- org.springframework.boot:spring-boot-starter-data-jpa
- org.projectlombok:lombok:1.18.26 (provided)
- org.springframework.boot:spring-boot-starter-test (scope: test)
- org.springframework.boot:spring-boot-starter-security
- com.h2database:h2:2.1.214 (scope: runtime)
- io.jsonwebtoken:jjwt-api:0.11.5
- io.jsonwebtoken:jjwt-impl:0.11.5 (scope: runtime)
- io.jsonwebtoken:jjwt-jackson:0.11.5 (scope: runtime)
- org.hibernate.validator:hibernate-validator:6.2.0.Final

## Endpoints

-//http://localhost:8080/auth/create-user<br/>
-//http://localhost:8080/auth/login<br/>
-//http://localhost:8080/home/users<br/>
-//http://localhost:8080/home/current-user<br/>

## Testing

1. open postman or browser and paste.
2. http://localhost:8080/auth/create-user<br/>
   METHOD:POST<br/>
   json format: for creating new user<br/>
   {  
    "name":"izhaar",  
    "email":"izhaar@gmail.com",  
    "password":"abc"  
}  
NOTE:  
i. user name should be not null.<br/>
ii. Password must be at least 8 characters long and contain at least one letter and one digit.  
iii. email should be not null and valid.


4. http://localhost:8080/auth/login<br/>
   METHOD:POST<br/>
   json format: for login<br/>
   {    
    "email":"izhaar@gmail.com",  
    "password":"abc"  

  } 
  
4. IF user created and successfully loggedin a Token is generated    
5. Copy token and access    
http://localhost:8080/home/users<br/>
METHOD:GET<br/>
paste token in postman header <br/> 
KEY=Authorization VALUE=Bearer (token)    
  
7. http://localhost:8080/home/current-user <br/>
  METHOD:GET<br/>
  to view current user <br/> 
  paste token in postman header   
  KEY=Authorization VALUE=Bearer (token)

## Contact

mohammedizhaarulhaq@gmail.com
phone:+91 7019409191
