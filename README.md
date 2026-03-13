Users API – Spring Boot

API REST desarrollada con Spring Boot para gestionar usuarios.
Permite crear, consultar, actualizar y eliminar usuarios mediante endpoints HTTP.

Requisitos

Antes de ejecutar el proyecto asegúrate de tener instalado:

Java 17

Maven 3.8+

Postman (opcional para pruebas)

VS Code o IntelliJ

Verificar versiones:

java -version
mvn -version
Clonar el repositorio
git clone https://github.com/tu-repositorio/users-api.git
cd users-api

Ejecutar el proyecto

En la terminal ejecutar:

mvn clean install

Luego iniciar la aplicación:

mvn spring-boot:run

Si todo funciona correctamente verás:

Started UsersApiApplication

Tomcat started on port(s): 8080

La API estará disponible en:

http://localhost:8080


Estructura del proyecto
src
 └main
    java/com/chakray/usersapi
    controller
    UserController.java
    service
    UserService.java
    model
    User.java
    UsersApiApplication.java
    resources
    application.properties

Endpoints de la API

Obtener todos los usuarios

GET /users

Ejemplo:

http://localhost:8080/users

Obtener usuario por ID

GET /users/{id}

Ejemplo:

http://localhost:8080/users/1

Crear usuario

POST /users

Body JSON:

{
 "email": "user@email.com",
 "name": "User Name",
 "phone": "123456",
 "password": "1234",
 "taxId": "TAX001"
}

Actualizar usuario

PUT /users/{id}

Body:

{
 "email": "updated@email.com",
 "name": "Updated Name",
 "phone": "999999",
 "password": "1234",
 "taxId": "TAX001"
}

Eliminar usuario

DELETE /users/{id}

Ejemplo:

http://localhost:8080/users/1

Pruebas con Postman

Crear una colección llamada:

Users API Test

Agregar las siguientes peticiones:

GET Users
GET Users by ID
POST Create User
PUT Update User
DELETE User

Base URL:

http://localhost:8080/users

Tecnologías utilizadas

Java 17

Spring Boot

Maven

Lombok

REST API