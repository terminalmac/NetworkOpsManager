# NetworkOpsManager

NetworkOpsManager is a Java-based network device management application designed to track and manage network infrastructure through a command-line interface.

This project is being developed as a hands-on software engineering project to apply Java fundamentals, object-oriented programming, data structures, testing, databases, APIs, and application development to a real-world network management use case.

## Current Features

- Interactive command-line interface
- Add network devices through user input
- Remove network devices by name
- Search for devices by name
- List all managed network devices
- Update existing network devices
- Case-insensitive device searching
- Display device name, IP address, and MAC address
- Store multiple network devices using an `ArrayList`
- Network device object model
- Continuous application menu using a `while` loop
- Menu option handling using a `switch` statement
- Empty device-list handling
- Device-not-found handling
- Complete CRUD functionality

## Planned Features

- Refactor device-management logic into reusable methods
- Prevent duplicate devices
- IP address validation
- MAC address validation
- Improved menu input validation
- Exception handling
- Persistent device storage
- Unit testing
- Database integration
- REST API
- Authentication and authorization
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
- Device removal
- Device searching
- Device listing
- Device updates
- In-memory device storage

### NetworkDevice.java

`NetworkDevice.java` defines the network device model.

Each network device currently contains:

- Device name
- IP address
- MAC address

The class uses private fields, a constructor, getters, and setters to demonstrate object-oriented programming and encapsulation.

## Getting Started

### Prerequisites

To compile and run NetworkOpsManager, you will need:

- Java Development Kit (JDK)
- Git

Verify that Java is installed:

    java -version

Verify that the Java compiler is installed:

    javac -version

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

## Adding a Device

Selecting option `1` allows the user to add a network device.

Example:

    --- Add Network Device ---

    Device Name: pfSense-FW01
    IP Address: 192.168.1.1
    MAC Address: AA:BB:CC:DD:EE:FF

    Device added successfully!

The application creates a new `NetworkDevice` object using the supplied information and stores it in an `ArrayList<NetworkDevice>`.

## Removing a Device

Selecting option `2` allows the user to remove an existing device by name.

Example:

    --- Remove Device ---

    Enter device name: PiHole-01

    Device removed successfully!

The application searches the device collection for a matching `NetworkDevice` and removes it from the `ArrayList`.

If the requested device does not exist:

    No device found with the name: Cisco-Router

Device-name matching is case-insensitive.

## Searching for a Device

Selecting option `3` allows the user to search for an existing device by name.

Example:

    --- Search Device ---

    Enter device name: pfsense-fw01

    Device found!

    Device Name: pfSense-FW01
    IP Address: 192.168.1.1
    MAC Address: AA:BB:CC:DD:EE:FF

Device-name searches are case-insensitive.

If the requested device does not exist:

    No device found with the name: Cisco-Router

## Listing Devices

Selecting option `4` displays all devices currently stored in the application.

Example:

    --- Network Devices ---

    Device Name: pfSense-FW01
    IP Address: 192.168.1.1
    MAC Address: AA:BB:CC:DD:EE:FF

    Device Name: PiHole-01
    IP Address: 192.168.50.120
    MAC Address: 11:22:33:44:55:66

If no devices have been added:

    No devices found.

## Updating a Device

Selecting option `5` allows the user to search for an existing device and modify its information.

Example:

    --- Update Device ---

    Enter device name: pfSense-FW01

    Device found!

    Current Device Information:
    Device Name: pfSense-FW01
    IP Address: 192.168.1.1
    MAC Address: AA:BB:CC:DD:EE:FF

    Enter new device name: pfSense-Firewall
    Enter new IP address: 192.168.1.254
    Enter new MAC address: AA:BB:CC:DD:EE:FF

    Device updated successfully!

The application uses the `NetworkDevice` setters to modify the existing object stored in the device collection.

If the requested device does not exist:

    No device found with the name: Cisco-Router

## Concepts Practiced

### Java Fundamentals

- Variables and data types
- Strings
- Boolean values
- Conditional statements
- `while` loops
- Enhanced `for` loops
- `switch` statements
- User input with `Scanner`

### Object-Oriented Programming

- Classes
- Objects
- Constructors
- Private fields
- Encapsulation
- Getters
- Setters
- Object references

### Collections

- `ArrayList`
- Adding objects to collections
- Removing objects from collections
- Iterating through collections
- Searching collections
- Modifying objects stored in collections
- Checking for empty collections

### String Handling

- String comparison
- Case-insensitive comparison using `equalsIgnoreCase()`

### Application Development

- Command-line interface design
- Menu-driven applications
- User input handling
- CRUD operations
- Device-not-found handling
- In-memory data management

## CRUD Progress

NetworkOpsManager now implements all four primary CRUD operations:

| Operation | Feature | Status |
| --- | --- | --- |
| Create | Add Device | ✅ Implemented |
| Read | List Devices | ✅ Implemented |
| Read | Search Device | ✅ Implemented |
| Update | Update Device | ✅ Implemented |
| Delete | Remove Device | ✅ Implemented |

**CLI CRUD functionality is complete.**

## Development Progress

### Phase 1 - Initial CLI

- Created command-line menu
- Added user input with `Scanner`
- Added continuous application loop
- Added menu handling with `switch`
- Added invalid menu-option handling

### Phase 2 - Network Device Model

- Created `NetworkDevice` class
- Added private device fields
- Added constructor
- Added getters
- Added setters
- Introduced object-oriented programming and encapsulation

### Phase 3 - Device Collection

- Added `ArrayList<NetworkDevice>`
- Added in-memory storage for multiple network devices
- Added enhanced `for` loops for collection traversal

### Phase 4 - CRUD Device Management

- Implemented Add Device
- Implemented List Devices
- Implemented Search Device
- Implemented Remove Device
- Implemented Update Device
- Added case-insensitive device-name matching
- Added empty-list handling
- Added device-not-found handling

### Phase 5 - Code Refactoring

🚧 Next

The next phase will focus on improving the application's internal structure by moving device-management functionality out of the main application loop and into reusable methods.

## Next Milestone

Refactor `Main.java` so each major operation is handled by its own method.

Instead of keeping all application logic inside the `switch` statement:

    case 1:
        // Large amount of Add Device code

the application will move toward:

    case 1:
        addDevice(scanner, devices);
        break;

    case 2:
        removeDevice(scanner, devices);
        break;

    case 3:
        searchDevice(scanner, devices);
        break;

    case 4:
        listDevices(devices);
        break;

    case 5:
        updateDevice(scanner, devices);
        break;

This will introduce method design, parameters, return types, code reuse, and separation of concerns.

## Long-Term Goals

NetworkOpsManager will progressively evolve from a Java command-line application into a backend network management service.

The planned development path includes:

1. ~~Complete CLI CRUD functionality~~ ✅
2. Refactor application logic
3. Input validation
4. Exception handling
5. Automated testing with JUnit
6. Maven project management
7. Persistent data storage
8. PostgreSQL database integration
9. Spring Boot
10. REST API development
11. Authentication and authorization
12. Docker containerization
13. Application deployment

The long-term architecture is expected to resemble:

    Client
       |
       v
    REST API
       |
       v
    Spring Boot Application
       |
       v
    PostgreSQL Database

## Development Status

🚧 **Active Development**

NetworkOpsManager now supports full CRUD functionality for network devices using in-memory storage.

Users can create, search, list, update, and delete network devices containing a device name, IP address, and MAC address.

Device information is currently stored in memory and is not persisted after the application closes.

The next development phase will focus on refactoring the application into reusable methods before introducing input validation, testing, and persistent storage.