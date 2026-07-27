
# Calculator CI/CD Pipeline

A simple Calculator application demonstrating a complete **CI/CD pipeline** using **GitHub Actions**.

The project automatically builds, tests, and validates changes whenever code is pushed or a pull request is created.

---

##  Features

- Basic calculator operations:
  - Addition
  - Subtraction
  - Multiplication
  - Division
- Unit testing
- Automated CI pipeline
- GitHub Actions workflow
- Automatic build verification

---

##  Technologies Used

- Programming Language: Java
- Build Tool: Maven
- Testing Framework: JUnit 5
- CI/CD Platform: GitHub Actions
- Version Control: Git & GitHub

---

##  Project Structure
    
    calculator-api/
    │
    ├── .github/
    │ └── workflows/
    │           └── ci-cd.yml
    ├── ScreenShots
    ├── src/
    │ ├── main/
    │ │ ├── java/
    | | |      └── com.example.calculatorapi
    | | |                 ├── controller
    | | |                 ├── service
    │ │ |                 └── CalculatorApiApplication.java
    | | └──resources/    
    │ │
    │ └── test/
    │       └── java/
    |              └── com.example.calculatorapi
    │                 └── CalculatorApiApplicationTests.java
    │
    ├── Dockerfile
    ├── pom.xml
    └── README.md


---

##  CI/CD Workflow

The GitHub Actions pipeline runs automatically on every:

- Push to the repository
- Pull Request

### Pipeline Steps:

Push / Pull Request
1. Validate
2. Build & Test
3. Dockerfile
4. Publish Docker Image to GHCR
Container Registry

Workflow file:
```
.github/workflows/ci-cd.yml
```


 Run Locally
 
Clone Repository

    git clone https://github.com/Almo3tasem200/calculator-ci-cd.git

Navigate to Project

    cd calculator-ci-cd

Run Tests

    mvn clean test

 Testing
 ```
The project uses JUnit tests to verify calculator functionality.
```

 Purpose of This Project

This repository demonstrates:
```
  Continuous Integration (CI)

  Automated testing

  GitHub Actions workflows

  Maven build automation

```

👨‍💻 Author

Almoatasem Wael

Computer Engineer

📄 License

This project is for educational purposes.



