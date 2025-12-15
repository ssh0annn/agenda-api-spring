# 🚀 Agenda Backend – Spring Boot + PostgreSQL

API REST desarrollada con **Spring Boot** que implementa un CRUD completo de usuarios utilizando **Spring Data JPA** y **PostgreSQL** como base de datos.  
Proyecto ideal como base para aplicaciones frontend (React, Angular, etc.) o como backend de aprendizaje y portafolio.

---

## 🧰 Stack Tecnológico

| Tecnología | Uso |
|----------|-----|
| ☕ **Java 21** | Lenguaje principal |
| 🌱 **Spring Boot** | Framework backend |
| 🗄️ **Spring Data JPA (Hibernate)** | Persistencia ORM |
| 🐘 **PostgreSQL** | Base de datos |
| 📦 **Maven** | Gestión de dependencias |
| 🌐 **REST API** | Arquitectura |

**Badges:**

![Java](https://img.shields.io/badge/Java-21-red?logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?logo=springboot)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-blue?logo=postgresql)
![Maven](https://img.shields.io/badge/Maven-Build-orange?logo=apachemaven)

---

## 🗄️ Modelo de Base de Datos

### 📌 Entidad: `User`

La aplicación maneja una única entidad llamada **User**, persistida en la tabla `users`.

### 🧩 Atributos

| Campo | Tipo | Descripción |
|-----|-----|-------------|
| id | BIGINT | Identificador único (PK) |
| username | VARCHAR | Nombre de usuario |
| name | VARCHAR | Nombre completo |
| email | VARCHAR | Correo electrónico |

### 📐 Diagrama ER

```text
┌─────────────────┐
│      users      │
├─────────────────┤
│ id (PK)         │
│ username        │
│ name            │
│ email           │
└─────────────────┘
```
🌐 Endpoints de la API (Rutas + JSON Explicado)
➕ Crear Usuario

POST /user

📌 Descripción:
Crea un nuevo usuario y lo guarda en la base de datos.

📥 Request Body (JSON):

{
  "username": "jdoe",
  "name": "John Doe",
  "email": "john@example.com"
}


📤 Response (201 OK):

{
  "id": 1,
  "username": "jdoe",
  "name": "John Doe",
  "email": "john@example.com"
}


📎 Notas:

El id se genera automáticamente.

No es necesario enviarlo en el request.
