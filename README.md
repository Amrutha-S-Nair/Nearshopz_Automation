# Nearshopz Automation

## Description
The Nearshopz Automation project is designed to automate the testing of the Nearshopz e-commerce website. This project includes automation scripts for the Seller, Customer, and Admin portals to ensure that all functionalities of the website are thoroughly tested and work as expected. We use Cucumber with TestNG for behavior-driven development (BDD) and testing.

## Prerequisites
- Java JDK (version 8 or higher)
- Maven
- Selenium WebDriver
- TestNG (version 7.10.2)
- Cucumber
- Chrome Browser
- WebDriverManager

## Installation
1. **Clone the repository:**
   ```sh
   git clone https://github.com/Amrutha-S-Nair/Nearshopz_Automation.git
   ```
2. **Navigate to the project directory:**
   ```sh
   cd automation-nearshopz
   ```
3. **Install the dependencies:**
   ```sh
   mvn install
   ```

## Usage
1. **Set up WebDriverManager:**
   WebDriverManager will automatically manage the browser driver for you.
2. **Configure the test suite:**
   Modify the `testng.xml` and `cucumber.properties` files to suit your testing requirements.
3. **Run the tests:**
   ```sh
   mvn test
   ```

## Running Tests in Eclipse
1. **Run tests using the Runner file:**
    Open Eclipse IDE.
    Navigate to the runner.java file located in src/test/java/Runner/.
    Right-click on the runner.java file and select Run As > TestNG Test.
2. **Run individual feature files:**
    Open Eclipse IDE.
    Navigate to the feature file you want to run located in src/test/resources/features/.
    Right-click on the feature file and select Run As > Cucumber Feature.


## Test Reports

After running the tests, a Cucumber HTML report will be generated. This report can be found in the `reports` folder. It provides a detailed overview of test results, including any failed scenarios, along with attached screenshots if applicable.

## Writing Tests

To write your E2E tests, follow these steps:

1. Create feature files in the `features` directory using Gherkin syntax. Describe the behavior you want to test in these files.

2. Implement step definitions in the `stepDefinitions` directory. These step definitions will map Gherkin steps to actual test actions using Playwright.

3. Organize your test code in the `pageObjects` directory using Page-Object design patterns. This helps maintain clean and reusable code for interacting with web pages.

4. Use the `config` directory for setting up base URL.

5. Run the tests using `npm test` to execute the scenarios defined in your feature files.


## Project Structure
```
automation-nearshopz/
├── src/
│   ├── main/
│       ├── java/
│       |     └── config/
│       |     |     └── config.java
│       |     └── hooks/
│       |     |     └── hooks.java
│       |     └── pages.customer/
│       |     |     └── homepage.java
│       |     └── pages.seller/
│       |     |     └── homepage.java
│       |     |     └── registerationpage.java
│       |     |     └── dashboardpage.java
│       |     └── utilities/
│       |           └── existingsellerinfoLoader.java
│       └── resources/
│           └── existingsellerinfo.properties
│   └── test/
│       ├── java/
│       |     └── Runner/
│       |     |     └── runner.java
│       |     └── StepDefination.customer/
│       |     |     └── homepageSteps.java
│       |     └── StepDefination.seller/
│       |           └── homepageSteps.java
│       |           └── registerationpageSteps.java
│       |           └── dashboardpageSteps.java
│       └── resources/
│           └── features/
│              └── customer/
│              └── seller/
└── pom.xml
```

- **src/main/java/config**: Contains configuration files.
- **src/main/java/hooks**: Contains hooks for setting up and tearing down tests.
- **src/main/java/pages.customer**: Contains page objects for the customer portal.
- **src/main/java/pages.seller**: Contains page objects for the seller portal.
- **src/main/java/utilities**: Contains utility classes.
- **src/main/resources**: Contains resource files like properties files.
- **src/test/java/Runner**: Contains the test runner class.
- **src/test/java/StepDefination.customer**: Contains step definitions for customer-related features.
- **src/test/java/StepDefination.seller**: Contains step definitions for seller-related features.
- **src/test/resources/features**: Contains feature files organized by portal (customer, seller).

## Contributing
1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature`).
3. Commit your changes (`git commit -am 'Add some feature'`).
4. Push to the branch (`git push origin feature/your-feature`).
5. Create a new Pull Request.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
