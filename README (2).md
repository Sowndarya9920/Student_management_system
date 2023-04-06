
# Student Management System

- The aim of this project is to create a simple student management application where we perform the basic CRUD operations.
- We use spring initializer to create the spring boot application.


## Frameworks and Languages used:

- Java
- SpringBoot
- H2 Database
## Dependency used:

- Spring Web
- Spring Boot Dev Tool
- Lombook
- Springdoc-openapi-ui
- Spring-boot-starter-data-jpa
- H2 Database
- Hibernate-validator
## Data Flow:

### Model:
- It consists of class name called Student it is typically used to "model" data in our application.
- We use @Data , @AllArgsConstructor , @NoArgsConstructor annotations in order to create getters,setters,toString method and constructors.
- @Entity annotation is used to create table in database.
- @Id annotation is used to create the primary key and @GeneratedValue(strategy=GenerationType.IDENTITY) for auto increment.

### Controller:
- It consists of a class named StudentController which basically controls the flow of data.
- @RestController annotation is used to make the StudentController as a controller layer.
- We perform the CRUD operations such as @PostMapping , @GetMapping , @PutMapping , @DeleteMapping.


- ### API Reference

  #### Add Students

  ```http
   https://localhost:8080/api/student-app/add-student
  ```

  #### Find All Students

  ```http
   https://localhost:8080/api/student-app/find-all-students
  ```

  #### Find Student By Id

  ```http
   https://localhost:8080/api/student-app/find-student/id/{id}
  ```

  #### Update Student

  ```http
   https://localhost:8080/api/student-app/update-student/id/{id}
  ```

  #### Delete Student

  ```http
   https://localhost:8080/api/student-app/delete-student/id/{id}
  ```







### Service:
- It consists of a class caller StudentService and an interface called IStudentService where it helps us with business functionalities.
- @Service annotation is used to make the class as service layer.
- The StudentService class implements the IStudentService interface where we declare all the methods.

### Repository:
- It consists of an interface IStudentRepository which extends the JpaRepository which is mainly used for managing the data in Spring boot application.

## Resources:
### Application.properties File:
- spring.datasource.url=jdbc:h2:mem:studentdb
- spring.datasource.driverClassName=org.h2.Driver
- spring.datasource.username=sa
- spring.datasource.password=
- spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
- The above properties is used for creating url's , username , password for H2 database.
- spring.jpa.defer-datasource-initialization=true
- The above property is used to tell the SpringBoot to create table before inserting the data.

### Data.sql file:
- This file is used to write the queries for inserting the data in the database.

## Documentation
- For documentation of Rest Api's we use Swagger.

[Swagger](https://localhost:8080/swagger-ui.html)


## Project Description:
- In this project I have created the Rest Api's for performing various CRUD operations such as add , read , delete , update. In order to insert the data I have used H2 database which is a in-memory database.