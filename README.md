
# Simple Spring Boot REST API

This is a simple Spring Boot application that provides basic REST endpoints to display simple text messages.
It contains two controllers:
- `AppController.java` – Displays message and name.
- `DetailsController.java` – Displays basic details.

---

## 📂 Project Structure

```
myapp
├── src
│   └── main
│       ├── java
│       │   └── lk
│       │       └── ac
│       │           └── vau
│       │               └── fas
│       │                   └── ict
│       │                       └── controller
│       │                           ├── AppController.java
│       │                           └── DetailsController.java
│       └── resources
│           └── application.properties
├── pom.xml
└── README.md
```

---

## 🚀 How to Run

1. Open the project in **Spring Tool Suite 4 (STS 4)** or any IDE.
2. Run the project as a **Spring Boot App**.
3. Open your browser and access the following URLs.

---

## 🌐 API Endpoints & Outputs

### 1️⃣ Message Endpoint

**URL:**  
```
http://localhost:8080/app/msg
```

**Output:**  
```
Hello SpringBoot
```

---

### 2️⃣ Name Endpoint

**URL:**  
```
http://localhost:8080/app/name
```

**Output:**  
```
My name is SpringBoot
```

---

### 3️⃣ Details Endpoint

**URL:**  
```
http://localhost:8080/app/details
```

**Output:**  
```
Name: Ruzla
Reg_No: 2020ICT82
Age: 23
Course: IT
```

---

## ✅ Requirements

- Java 8 or higher
- Maven
- Spring Boot
- Spring Tool Suite 4 (Recommended)
