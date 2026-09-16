# NetworkOpsManager

NetworkOpsManager is a Java-based network device management application designed to track and manage network infrastructure from a command-line interface.

This project is being developed as a hands-on software engineering project to apply Java fundamentals, object-oriented programming, data structures, testing, databases, APIs, and application development to a real-world network management use case.

## Current Features

- Interactive command-line menu
- Network device model
- Device name tracking
- IP address tracking
- MAC address tracking
- Object-oriented design using Java classes
- Getters and setters for device information

## Planned Features

- Add network devices
- Remove network devices
- Search for devices
- Update device information
- List all managed devices
- Input validation
- IP and MAC address validation
- Persistent device storage
- REST API
- Database integration
- Automated testing
- Containerized deployment

## Technologies

### Currently Used

- Java
- Git
- GitHub
- Visual Studio Code

### Planned

- Maven
- JUnit
- Spring Boot
- PostgreSQL
- REST APIs
- Docker

## Project Structure

    NetworkOpsManager/
    ├── src/
    │   ├── Main.java
    │   └── NetworkDevice.java
    ├── .gitignore
    └── README.md

`Main.java` contains the application's command-line interface and menu logic.

`NetworkDevice.java` defines the network device model, including device name, IP address, and MAC address.

## Getting Started

### Prerequisites

- Java Development Kit (JDK)
- Git

### Compile

From the project root:

    javac src/Main.java src/NetworkDevice.java

### Run

    java -cp src Main

## Example Device

A network device currently contains the following information:

    Device Name: pfSense-FW01
    IP Address: 192.168.1.1
    MAC Address: AA:BB:CC:DD:EE:FF

## Project Goals

The goal of NetworkOpsManager is to evolve from a simple Java command-line application into a full backend network management application.

The project will progressively incorporate:

1. Java fundamentals
2. Object-oriented programming
3. Collections and data structures
4. Error handling and input validation
5. Unit testing
6. Database persistence
7. REST API development
8. Spring Boot
9. Docker and application deployment

## Development Status

🚧 **In Development**

The current version implements the initial CLI interface and `NetworkDevice` object model. Device management functionality is currently being developed.