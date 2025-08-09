
# Selenium Java Automation Framework

This project is a **UI Automation Framework** built with **Selenium WebDriver** and **Java** to automate web application testing.
It follows **Page Object Model (POM)** design principles for scalability, reusability, and maintainability.

---

## **Tech Stack**

* **Language:** Java (JDK 11+)
* **Automation Tool:** Selenium WebDriver
* **Build Tool:** Maven
* **Test Runner:** TestNG (or JUnit if preferred)
* **Logging:** Log4j2
* **Reporting:** Extent Reports / Allure Reports
* **Design Pattern:** Page Object Model (POM)
* **Others (optional):**

  * WebDriverManager (for automatic driver management)
  * Apache POI (for Excel data handling)
  * JSON / Jackson (for test data in JSON)

---

## **Project Structure**

```
selenium-java-framework/
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── base        # Base classes (BaseTest, BasePage)
│   │   │   ├── pages       # Page Object classes
│   │   │   ├── utils       # Utility/helper classes
│   │   │   └── config      # Config reader & environment setup
│   │   └── resources
│   │       ├── config.properties # Environment configs
│   │       ├── testdata           # Test data files (Excel, JSON)
│   │       └── log4j2.xml         # Logging config
│   │
│   ├── test
│       ├── java
│       │   └── tests       # Test classes (TestNG or JUnit)
│       └── resources
│
├── pom.xml                 # Maven dependencies & plugins
├── testng.xml              # TestNG suite configuration
├── README.md               # Project documentation
└── reports/                # Test execution reports
```

---

## **Setup Instructions**

### **1. Prerequisites**

* Install **Java JDK 11+**
* Install **Maven**
* Install **Git**
* Install an IDE (IntelliJ IDEA / Eclipse / VS Code)

Check installations:

```bash
java -version
mvn -version
git --version
```

---

### **2. Clone the Repository**

```bash
git clone https://github.com/swatidhoke/UIAutomation_selenium_Java_mvn.git
cd UIAutomation_selenium_Java_mvn
```

---

### **3. Install Dependencies**

```bash
mvn clean install
```

---

### **4. Configure Environment**

* Update `src/main/resources/config.properties`:

```properties
baseUrl=https://example.com
browser=chrome
timeout=10
```

---

## **Running Tests**

### **Run all tests**

```bash
mvn clean test
```

### **Run specific test class**

```bash
mvn -Dtest=LoginTest test
```

### **Run tests via TestNG suite**

```bash
mvn clean test -DsuiteXmlFile=testng.xml
```

---

## **Reports**

* **Extent Reports** will be generated in `/reports/extent-report.html`
* **Allure Reports** (if configured):

```bash
allure serve allure-results
```

---

## **Best Practices**

* Keep test logic separate from page logic (POM).
* Use reusable utility methods in the `utils` package.
* Store test data in **Excel/JSON** files under `testdata/`.
* Manage browser drivers using **WebDriverManager**.

---
