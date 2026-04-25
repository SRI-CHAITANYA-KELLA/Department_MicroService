# 🏢 Department Service (Spring Boot Microservice)

## 📌 Overview

The **Department Service** is a Spring Boot-based microservice that manages department-related data in a microservices architecture.

It provides RESTful APIs to perform CRUD operations on department records and integrates with a MySQL database using **Spring Data JPA**.

This service is designed to work with an **API Gateway (Spring Cloud Gateway)** as part of a distributed system.

---

## 🚀 Key Features

* ✔️ Create new department
* ✔️ Retrieve department by ID
* ✔️ Update department name
* ✔️ Delete department
* ✔️ RESTful API design
* ✔️ Integration-ready with API Gateway
* ✔️ Logging using Lombok (@Slf4j)

---

## 🛠️ Tech Stack

| Layer      | Technology        |
| ---------- | ----------------- |
| Backend    | Java, Spring Boot |
| Database   | MySQL             |
| ORM        | Hibernate (JPA)   |
| Build Tool | Maven             |
| Logging    | Lombok            |

---

## 🏗️ Architecture

This project follows a **layered architecture**:

* **Controller Layer**

  * Handles HTTP requests and responses

* **Service Layer**

  * Contains business logic

* **Repository Layer**

  * Handles database operations using JPA

* **Entity Layer**

  * Represents department data

---

## 📂 Project Structure

```id="deptstruct"
com.demo
├── controller
│   └── DepartmentController.java
├── entity
│   └── Department.java
├── repository
│   └── DepartmentRepository.java
├── service
│   └── DepartmentService.java
├── config
│   └── SecurityConfig.java (currently empty)
├── filter
│   └── JwtAuthFilter.java (not implemented)
```

---

## 🔗 API Endpoints

| Method | Endpoint                         | Description            |
| ------ | -------------------------------- | ---------------------- |
| POST   | /dept/insert                     | Create department      |
| GET    | /dept/getById/{id}               | Get department by ID   |
| PUT    | /dept/update/{deptId}/{deptName} | Update department name |
| DELETE | /dept/delete/{deptId}            | Delete department      |

---

## ⚙️ Configuration

### application.properties

```id="deptprop"
spring.datasource.url=jdbc:mysql://localhost:3306/DepartmentService?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=root@123

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### application.yml

```yaml id="deptyml"
server:
  port: 9002

spring:
  application:
    name: department-service
```

---

## ▶️ How to Run

### 1️⃣ Clone Repository

```id="deptclone"
git clone https://github.com/your-username/department-service.git
```

### 2️⃣ Open in IDE

* Import as Maven Project

### 3️⃣ Configure Database

* Create MySQL database
* Update credentials

### 4️⃣ Run Application

```id="deptrun"
mvn spring-boot:run
```

### 5️⃣ Access Service

```id="depturl"
http://localhost:9002/dept
```

---

## 🧪 Example JSON

```id="deptjson"
{
  "deptName": "IT",
  "deptAddress": "Hyderabad",
  "deptCode": "IT001"
}
```

---

## 🔄 Integration

This service is designed to work with:

* 🌐 **Spring Cloud API Gateway**
* 👤 **User Service (Authentication Service)**

---

## ⚠️ Current Limitations

* SecurityConfig is not implemented
* JwtAuthFilter is not implemented
* No authentication or authorization
* No exception handling layer

---

## 📈 Future Enhancements

* 🔐 Add JWT Authentication
* 🛡️ Implement Spring Security
* ❗ Add Global Exception Handling
* 📦 Add DTO & validation
* ☁️ Deploy with Docker & Kubernetes

---

## 📌 Resume Description

> Developed a Department microservice using Spring Boot and JPA, providing REST APIs for CRUD operations and designed to integrate with an API Gateway in a microservices architecture.

---

## 👤 Author

**Chaitanya**

---

## ⭐ Support

If you like this project, give it a ⭐ on GitHub!
