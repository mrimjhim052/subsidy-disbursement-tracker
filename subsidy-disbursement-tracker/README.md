# Subsidy Disbursement Tracker

## Overview
The Subsidy Disbursement Tracker is a Spring Boot application designed to manage and track subsidy disbursements efficiently. This application provides a user-friendly interface for managing subsidy data and offers various features to streamline the disbursement process.

## Features
- Track subsidy applications and their statuses
- Manage user accounts and permissions
- Generate reports on disbursement activities
- Configuration options for different subsidy programs

## Prerequisites
- Java 11 or higher
- Maven 3.6 or higher
- An IDE (e.g., IntelliJ IDEA, Eclipse) for Java development

## Setup Instructions
1. Clone the repository:
   ```
   git clone https://github.com/yourusername/subsidy-disbursement-tracker.git
   ```
2. Navigate to the project directory:
   ```
   cd subsidy-disbursement-tracker
   ```
3. Build the project using Maven:
   ```
   mvn clean install
   ```
4. Run the application:
   ```
   mvn spring-boot:run
   ```

## Configuration
Update the `src/main/resources/application.properties` file with your specific configuration settings, such as database connection details and server port.

## Usage
Once the application is running, you can access it via your web browser at `http://localhost:8080`. Follow the on-screen instructions to manage subsidy disbursements.

## Testing
To run the tests, use the following Maven command:
```
mvn test
```

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.