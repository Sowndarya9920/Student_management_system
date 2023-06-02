
# Student Administration

- The aim of this project is to create a simple student management application where we perform the basic CRUD operations.
- We use spring initializer to create the spring boot application.

![Screenshot (70)](https://user-images.githubusercontent.com/112794922/230353722-f69081b4-d5f0-41db-9f8c-6c2e9b97767f.png)



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

![Screenshot (71)](https://user-images.githubusercontent.com/112794922/230356468-292c5036-ad97-4495-95ad-70af0d17bb79.png)

## Data Flow:

### Model:
- It consists of class name called Student it is typically used to "model" data in our application.
- We use @Data , @AllArgsConstructor , @NoArgsConstructor annotations in order to create getters,setters,toString method and constructors.
- @Entity annotation is used to create table in database.
- @Id annotation is used to create the primary key and @GeneratedValue(strategy=GenerationType.IDENTITY) for auto increment.

![Screenshot (76)](https://user-images.githubusercontent.com/112794922/230358666-1cf87a8c-e322-45dc-a80a-d39d220735c7.png)


### Controller:
- It consists of a class named StudentController which basically controls the flow of data.
- @RestController annotation is used to make the StudentController as a controller layer.
- We perform the CRUD operations such as @PostMapping , @GetMapping , @PutMapping , @DeleteMapping.

![Screenshot (76)](https://user-images.githubusercontent.com/112794922/230359174-9d8a1441-803b-4377-bb2e-e81efbc3322f.png)



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

![Screenshot (76)](https://user-images.githubusercontent.com/112794922/230357693-4f185ac2-4d3b-4fa8-85c7-021d5bdb96bf.png)


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

![Screenshot (76)](https://user-images.githubusercontent.com/112794922/230359705-af7bb594-b48f-4707-8207-3f9ba4316e91.png)


### Data.sql file:
- This file is used to write the queries for inserting the data in the database.

## Documentation
- For documentation of Rest Api's we use Swagger.

[Swagger](https://localhost:8080/swagger-ui.html)


## Project Description:
- In this project I have created the Rest Api's for performing various CRUD operations such as add , read , delete , update. In order to insert the data I have used H2 database which is a in-memory database.
