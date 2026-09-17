# NetworkOpsManager

NetworkOpsManager is a Java-based network device management application designed to track and manage network infrastructure through a command-line interface.

This project is being developed as a hands-on software engineering project to apply Java fundamentals, object-oriented programming, data structures, testing, databases, APIs, and application development to a real-world network management use case.

## Current Features

- Interactive command-line interface
- Add network devices through user input
- List all network devices
- Search for devices by name
- Case-insensitive device searching
- Display device name, IP address, and MAC address
- Store multiple network devices using an `ArrayList`
- Network device object model
- Continuous application menu using a `while` loop
- Menu option handling using a `switch` statement
- Empty device-list handling
- Device-not-found handling

## Planned Features

- Remove network devices
- Update device information
- Prevent duplicate devices
- IP address validation
- MAC address validation
- Improved input validation
- Exception handling
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

`Main.java` currently handles:

- Application startup
- Command-line menu
- User input
- Application loop
- Menu selection
- Device creation
- Device storage
- Device listing
- Device searching

### NetworkDevice.java

`NetworkDevice.java` defines the network device model.

Each device currently contains:

- Device name
- IP address
- MAC address

The class uses private fields, a constructor, getters, and setters to demonstrate object-oriented programming and encapsulation.

## Getting Started

### Prerequisites

- Java Development Kit (JDK)
- Git

### Compile

From the project root:

    javac src/Main.java src/NetworkDevice.java

### Run

    java -cp src Main

## Usage

When the application starts, the following menu is displayed:

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

### Adding a Device

Selecting option `1` allows a network device to be added:

    --- Add Network Device ---

    Device Name: pfSense-FW01
    IP Address: 192.168.1.1
    MAC Address: AA:BB:CC:DD:EE:FF

    Device added successfully!

The application creates a `NetworkDevice` object and stores it in an `ArrayList<NetworkDevice>` for the current session.

### Searching for a Device

Selecting option `3` allows the user to search by device name:

    --- Search Device ---

    Enter device name: pfsense-fw01

    Device found!
    Device Name: pfSense-FW01
    IP Address: 192.168.1.1
    MAC Address: AA:BB:CC:DD:EE:FF

Device-name searches are case-insensitive.

If the device does not exist:

    No device found with the name: Cisco-Router

### Listing Devices

Selecting option `4` displays all devices currently stored by the application:

    --- Network Devices ---

    Device Name: pfSense-FW01
    IP Address: 192.168.1.1
    MAC Address: AA:BB:CC:DD:EE:FF

    Device Name: PiHole-01
    IP Address: 192.168.50.120
    MAC Address: 11:22:33:44:55:66

If no devices have been added:

    No devices found.

## Concepts Practiced

NetworkOpsManager currently demonstrates:

- Java classes and objects
- Object-oriented programming
- Constructors
- Encapsulation
- Getters and setters
- Variables and data types
- Boolean values
- Conditional statements
- `while` loops
- Enhanced `for` loops
- `switch` statements
- `ArrayList`
- User input with `Scanner`
- String comparison
- Case-insensitive searching
- Basic collection searching
- Object collections
- Command-line application design

## CRUD Progress

NetworkOpsManager is progressively implementing CRUD operations:

| Operation | Feature | Status |
| --- | --- | --- |
| Create | Add Device | ✅ Implemented |
| Read | List Devices | ✅ Implemented |
| Read | Search Device | ✅ Implemented |
| Update | Update Device | 🚧 Planned |
| Delete | Remove Device | 🚧 Planned |

## Development Progress

### Initial CLI

- Created command-line menu
- Added user input with `Scanner`
- Added continuous application loop
- Added menu handling with `switch`

### Network Device Model

- Created `NetworkDevice` class
- Added private device fields
- Added constructor
- Added getters and setters

### Device Management

- Added in-memory device storage with `ArrayList`
- Implemented Add Device
- Implemented List Devices
- Implemented Search Device
- Added case-insensitive searching
- Added device-not-found handling

## Next Milestone

Implement **Remove Device** so a user can search for a device and remove its `NetworkDevice` object from the application's `ArrayList`.

## Long-Term Goals

NetworkOpsManager will progressively evolve from a Java CLI application into a backend network management service.

The planned architecture is:

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

Future development will introduce persistent storage, automated testing, API development, authentication, containerization, and deployment.

## Development Status

🚧 **Active Development**

NetworkOpsManager currently supports creating, listing, and searching network devices using in-memory storage. Device information is not yet persisted after the application closes.