# Spring Boot CRUD Operations with Scheduler and Spring Data JPA

This Spring Boot project demonstrates how to automate CRUD operations using Spring Scheduler and Spring Data JPA with an H2 database. It provides an example of managing Employee data through a RESTful API.

## Features

- Create, Read, Update, and Delete (CRUD) operations for Employee entities.
- Scheduling tasks to perform automated operations.
- In-memory H2 database for data storage.

## Technologies Used

- Spring Boot
- Spring Data JPA
- Spring Scheduler
- H2 Database
- Java

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or later
- Maven (for building and managing dependencies)

### Installation and Usage

1. Clone this repository:

```shell
git clone https://github.com/your-username/spring-boot-scheduler-crud.git


mvn spring-boot:run


Access the API documentation:

Open your web browser and go to http://localhost:8080/swagger-ui.html for interactive API documentation using Swagger.

**API Endpoints**

* GET /api/employees: Retrieve a list of all employees.
* GET /api/employees/{id}: Retrieve an employee by ID.
* POST /api/employees: Create a new employee.
* PUT /api/employees/{id}: Update an existing employee by ID.
* DELETE /api/employees/{id}: Delete an employee by ID.

**Scheduling Operations**

You can configure the scheduling of CRUD operations by modifying the SchedulerService class and the related scheduling configurations in the project source code.

**Database**

This project uses an H2 in-memory database by default. You can configure a different database by modifying the application.properties file.

**License**

This project is licensed under the MIT License - see the LICENSE file for details.

**Acknowledgments**

* Spring Framework
* H2 Database
