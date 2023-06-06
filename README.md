# Student Administration
![60d0f685e4661743bd213cb3_Effective-school-administration-supports-databased-decision-making_896_6065058_0_14102171_1000](https://github.com/Sowndarya9920/Student_management_system/assets/112794922/1d9d7146-1ff1-4be3-8d6e-5c4fc0275dbf)

   
##### 🔸The student administration system you have built using the Spring Boot framework is designed to handle basic CRUD (Create, Read, Update, Delete) operations for managing student records.
## :one: Frameworks and Languages Used -
    1. SpringBoot
    2. JAVA
    3. Postman
    4. H2 Database
    
## :two: Dependency Used
    1. Spring Web
    2. Spring Boot Dev Tools
    3. Lombok
    4. Spring Data JPA
    5. H2
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
## :three: Dataflow (Functions Used In)
### :white_flower: 1. Model - This used to show the mirror of our database which involves real world entities.
#### :o: Student.java

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

### :white_flower: 2. Service - This Layer is used to perform business functionalities.
#### :o: StudentService.java

----------------------------------------------------------------------------------------------------------------------------------------------------

### :white_flower: 3. Controller - This Controller is used to create RestApi's and perform basic CRUD operations.
#### :o: StudentController.java

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
### :white_flower: 4. Repository : data access object (DAO) is an object that provides an abstract interface to some type of database or other persistence mechanisms.
#### :o: IStudentsDao.java

-------------------------------------------------------------------------------------------------------------------------------------------------------
### :white_flower: 5. Application.properties File : The application.properties file in Spring Boot is a configuration file used to specify various settings and properties for the application.
```java

```
-------------------------------------------------------------------------------------------------------------------------------------------------------
## :five: Test Rest Api's
#### :white_check_mark: User Controller
```java
http://localhost:8080/signUp
```

```java
http://localhost:8080/signIn
```

#### :white_check_mark: PremiumRole Controller
```java
http://localhost:8080/roles
```

#### :white_check_mark: Recipe Controller
```java
http://localhost:8080/recipe
```

#### :white_check_mark: Ingredients Controller
```java
http://localhost:8080/ingredients
```

## :six: Documentation in Swagger
```java
 http://localhost:8080/swagger-ui/index.html#/
```
![image](https://github.com/Sowndarya9920/Recipe_Management_System/assets/112794922/29532ed4-f71d-44d2-b4bd-b38f75c68641)


## :seven: View in mySql Database

![image](https://github.com/Sowndarya9920/Recipe_Management_System/assets/112794922/3e6f6f82-002c-4846-8146-672facd32099)



#  Summary
- :small_orange_diamond:  This is a sample recipe management system that allows two users :
- :one: Normal
- :two: Admin
- :small_orange_diamond: Admin users have all access to perform all the CRUD operations whereas the normal users can only edit and view the receipes.
-  :small_orange_diamond: The API is built using mySQL database to store the recipes,ingredients and all its fields . IP Address of the deployment link must be static to ensure its availability. Additionally , the Api's uses annotation based validations to ensure that all the user inputs are valid before being processed.
-  :small_orange_diamond: Therefore , this project provides a scalable and secure API that allows to manage all the datas.
