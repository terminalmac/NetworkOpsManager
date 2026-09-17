# NetworkOpsManager

NetworkOpsManager is a Java-based network device management application designed to track and manage network infrastructure through a command-line interface.

This project is being developed as a hands-on software engineering project to apply Java fundamentals, object-oriented programming, data structures, testing, databases, APIs, and application development to a real-world network management use case.

## Current Features

- Interactive command-line menu
- Add network devices through user input
- Store multiple network devices using an `ArrayList`
- Network device object model
- Track device names
- Track IP addresses
- Track MAC addresses
- Object-oriented design using Java classes
- Constructors for creating network device objects
- Getters and setters for device information
- Continuous menu using a `while` loop
- Menu option handling using a `switch` statement

## Planned Features

- List all managed devices
- Search for devices
- Remove network devices
- Update device information
- IP address validation
- MAC address validation
- Improved input validation and exception handling
- Persistent device storage
- Unit testing
- Database integration
- REST API
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

### Main.java

`Main.java` contains the command-line interface, application loop, menu logic, user input handling, and the collection of network devices.

### NetworkDevice.java

`NetworkDevice.java` defines the network device model.

Each network device currently contains:

- Device name
- IP address
- MAC address

The class uses private fields with constructors, getters, and setters to demonstrate object-oriented programming and encapsulation.

## Getting Started

### Prerequisites

- Java Development Kit (JDK)
- Git

### Compile

From the project root:

    javac src/Main.java src/NetworkDevice.java

### Run

    java -cp src Main

## Example

When running the application, the user is presented with the following menu:

    ==============================
         NetworkOps Manager
    ==============================

    1. Add Device
    2. Remove Device
    3. Search Device
    4. List Devices
    5. Update Device
    6. Exit

    Select an option:

Selecting **Add Device** allows the user to enter network device information:

    --- Add Network Device ---

    Device Name: pfSense-FW01
    IP Address: 192.168.1.1
    MAC Address: AA:BB:CC:DD:EE:FF

    Device added successfully!

The application creates a `NetworkDevice` object from the provided information and stores it in an `ArrayList<NetworkDevice>` for use during the current application session.

## Concepts Practiced

This project currently demonstrates:

- Java classes and objects
- Constructors
- Encapsulation
- Getters and setters
- Variables and data types
- User input with `Scanner`
- `while` loops
- `switch` statements
- `ArrayList`
- Object collections
- Basic command-line application design

## Project Goals

The goal of NetworkOpsManager is to progressively evolve from a simple Java command-line application into a full backend network management application.

Planned development stages include:

1. Java fundamentals
2. Object-oriented programming
3. Collections and data structures
4. CRUD device management
5. Error handling and input validation
6. Unit testing
7. Maven project management
8. Database persistence
9. REST API development
10. Spring Boot
11. Docker and application deployment

## Development Status

🚧 **In Development**

### Implemented

- CLI menu
- Continuous application loop
- Menu selection handling
- `NetworkDevice` object model
- Device creation from user input
- In-memory device storage using `ArrayList`

### Next Milestone

Implement **List Devices** so users can view all `NetworkDevice` objects currently stored in the application.

## Future Direction

NetworkOpsManager will eventually transition from an in-memory CLI application to a persistent backend service.

The long-term architecture is expected to include:

    Client
       |
       v
    REST API
       |
       v
    Spring Boot
       |
       v
    PostgreSQL

The application will also incorporate automated testing, containerization, and deployment as development progresses.