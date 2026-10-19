# NetworkOpsManager

NetworkOpsManager is a Java-based command-line application designed to manage network devices and their information.

The project serves as a hands-on software engineering portfolio project, combining Java fundamentals, object-oriented programming, data structures, and software development practices with real-world network infrastructure management.

The long-term goal is to evolve NetworkOpsManager into a full-stack network management application using Spring Boot, PostgreSQL, REST APIs, and Docker.

## Features

### Implemented Features

- Interactive command-line interface (CLI)
- Add network devices
- Remove network devices by name
- Search for devices by name
- List all stored network devices
- Update existing device information
- Case-insensitive device searching
- Display device names, IP addresses, and MAC addresses
- In-memory device storage using `ArrayList`
- Reusable methods for CRUD operations
- Shared device lookup and display methods
- Menu input validation for non-numeric entries
- Empty device-list handling
- Device-not-found handling
- Maven project configuration

### Planned Features

- Separate `DeviceManager` class
- Duplicate device prevention
- IPv4 address validation
- MAC address validation
- Device name validation
- Persistent JSON file storage
- Automated unit testing with JUnit
- Improved exception handling
- PostgreSQL database integration
- REST API using Spring Boot
- Authentication and authorization
- Docker containerization

## Technologies

### Current

- Java 17+
- Apache Maven
- Git
- GitHub
- Visual Studio Code

### Planned

- JUnit 5
- JSON serialization library
- Spring Boot
- PostgreSQL
- REST APIs
- Docker

## Project Structure

```text
NetworkOpsManager/
├── src/
│   ├── Main.java
│   └── NetworkDevice.java
├── pom.xml
├── README.md
└── .gitignore
```

### Main.java

The main application currently contains:

- CLI menu and application loop
- User input handling
- CRUD operation methods
- Reusable device search method
- Reusable device display method
- Basic menu input validation

The application has been refactored so that individual CRUD operations are no longer implemented directly inside the `switch` statement.

### NetworkDevice.java

Represents an individual network device with three properties:

- Device name
- IP address
- MAC address

The class uses private fields, a constructor, getters, and setters to demonstrate encapsulation and object-oriented programming.

### pom.xml

Defines the Maven project configuration, Java compilation settings, and executable JAR packaging.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 17 or newer
- Apache Maven
- Git (optional, for version control)

Verify your Java installation:

```powershell
java -version
javac -version
```

Verify Maven:

```powershell
mvn -version
```

### Build the Application

Open a terminal in the project root directory and run:

```powershell
mvn clean package
```

Maven will compile the project and generate an executable JAR file.

### Run the Application

```powershell
java -jar target/networkopsmanager.jar
```

## Application Menu

```text
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
```

## Usage Examples

### Add Device

```text
--- Add Network Device ---

Device Name: pfSense-FW01
IP Address: 192.168.1.1
MAC Address: AA:BB:CC:DD:EE:FF

Device added successfully!
```

### Remove Device

```text
--- Remove Device ---

Enter device name: pfSense-FW01
Device removed successfully!
```

### Search Device

```text
--- Search Device ---

Enter device name: pfsense-fw01

Device found!
Device Name: pfSense-FW01
IP Address: 192.168.1.1
MAC Address: AA:BB:CC:DD:EE:FF
```

Searching is case-insensitive.

### List Devices

```text
--- Network Devices ---

Device Name: pfSense-FW01
IP Address: 192.168.1.1
MAC Address: AA:BB:CC:DD:EE:FF

Device Name: PiHole-01
IP Address: 192.168.50.120
MAC Address: 11:22:33:44:55:66

Total Devices: 2
```

### Update Device

```text
--- Update Device ---

Enter device name: pfSense-FW01

Current Device Information:
Device Name: pfSense-FW01
IP Address: 192.168.1.1
MAC Address: AA:BB:CC:DD:EE:FF

Enter new device name: pfSense-Firewall
Enter new IP address: 192.168.1.254
Enter new MAC address: AA:BB:CC:DD:EE:FF

Device updated successfully!
```

## CRUD Functionality

| Operation | Feature | Status |
|---|---|---|
| Create | Add Device | Complete |
| Read | Search Device | Complete |
| Read | List Devices | Complete |
| Update | Update Device | Complete |
| Delete | Remove Device | Complete |

All core CRUD operations are implemented.

## Code Refactoring

The application originally contained all device-management logic directly inside the `main()` method.

To improve readability, maintainability, and code reuse, the application was refactored into smaller methods.

### CRUD Methods

```java
addDevice(scanner, devices);
removeDevice(scanner, devices);
searchDevice(scanner, devices);
listDevices(devices);
updateDevice(scanner, devices);
```

### Helper Methods

```java
findDevice(devices, deviceName);
printDevice(device);
```

The `findDevice()` method centralizes case-insensitive device lookup, eliminating duplicated search logic across Remove, Search, and Update operations.

The `printDevice()` method centralizes device information formatting.

### Benefits of Refactoring

- Reduced code duplication
- Improved readability
- Easier debugging
- Reusable functionality
- More maintainable application structure
- Better foundation for automated testing

## Input Handling

The application uses `Scanner` to process user input.

The main menu checks whether the user entered an integer before attempting to read a menu selection.

Invalid non-numeric input produces a message instead of causing an immediate `InputMismatchException`.

Further validation for device names, IPv4 addresses, MAC addresses, and duplicate devices is planned.

## Concepts Practiced

### Java Fundamentals

- Variables and data types
- Conditional statements
- `switch` statements
- `while` loops
- Enhanced `for` loops
- Methods and parameters
- Return values
- User input with `Scanner`

### Object-Oriented Programming

- Classes and objects
- Constructors
- Encapsulation
- Private fields
- Getters and setters
- Object references

### Data Structures

- `ArrayList`
- Adding and removing elements
- Collection iteration
- Searching collections
- Modifying existing objects

### Software Engineering

- CRUD operations
- Code refactoring
- Separation of responsibilities
- Reusable helper methods
- Basic input validation
- Maven build management
- Git version control
- Incremental development

## Development Progress

### Phase 1 — CLI Foundation

- Created application menu
- Implemented continuous menu loop
- Added user input handling
- Implemented `switch`-based menu selection

### Phase 2 — Object-Oriented Programming

- Created `NetworkDevice` class
- Implemented private fields
- Added constructor, getters, and setters

### Phase 3 — CRUD Functionality

- Implemented Add Device
- Implemented Remove Device
- Implemented Search Device
- Implemented List Devices
- Implemented Update Device

### Phase 4 — Maven Integration

- Created `pom.xml`
- Configured Java compilation
- Configured executable JAR packaging
- Successfully built the application using Maven

### Phase 5 — Code Refactoring

- Extracted CRUD operations into reusable methods
- Created shared `findDevice()` method
- Created shared `printDevice()` method
- Corrected Search Device's not-found handling
- Added non-numeric menu input handling

### Phase 6 — Device Management Architecture

**Next milestone**

- Create a dedicated `DeviceManager` class
- Move device collection management out of `Main.java`
- Separate user interface logic from application logic
- Prepare for persistence and automated testing

## Development Roadmap

| Milestone | Status |
|---|---|
| CLI application | Complete |
| NetworkDevice model | Complete |
| CRUD functionality | Complete |
| Maven integration | Complete |
| Initial method refactoring | Implemented |
| DeviceManager class | Planned |
| Input validation | In progress |
| JSON persistence | Planned |
| JUnit testing | Planned |
| PostgreSQL integration | Planned |
| Spring Boot REST API | Planned |
| Docker deployment | Planned |

## Future Architecture

The long-term goal is to evolve NetworkOpsManager into a backend network management service.

```text
Client Application
        |
        v
Spring Boot REST API
        |
        v
Device Management Service
        |
        v
PostgreSQL Database
```

This architecture will support persistent device management, automated testing, API access, and future integration with network monitoring tools.

## Development Status

**Active Development**

NetworkOpsManager currently provides full CRUD functionality through a Java command-line interface.

The project uses Maven for building and packaging and has undergone its first major code refactoring.

Device records are currently stored in memory and are lost when the application closes.

The next development phase will introduce a dedicated `DeviceManager` class, followed by input validation, JSON persistence, and automated testing.

