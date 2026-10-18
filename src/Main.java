
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<NetworkDevice> devices = new ArrayList<>();

        int choice = 0;

        while (choice != 6) {

            System.out.println("==============================");
            System.out.println("     NetworkOps Manager");
            System.out.println("==============================");
            System.out.println();
            System.out.println("1. Add Device");
            System.out.println("2. Remove Device");
            System.out.println("3. Search Device");
            System.out.println("4. List Devices");
            System.out.println("5. Update Device");
            System.out.println("6. Exit");
            System.out.println();
            System.out.print("Select an option: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Enter a number.");
                scanner.nextLine();
                continue;
            }

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
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

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    // Add a new network device
    private static void addDevice(
            Scanner scanner,
            ArrayList<NetworkDevice> devices) {

        System.out.println();
        System.out.println("--- Add Network Device ---");

        System.out.print("Device Name: ");
        String deviceName = scanner.nextLine();

        System.out.print("IP Address: ");
        String ipAddress = scanner.nextLine();

        System.out.print("MAC Address: ");
        String macAddress = scanner.nextLine();

        NetworkDevice newDevice =
                new NetworkDevice(deviceName, ipAddress, macAddress);

        devices.add(newDevice);

        System.out.println("Device added successfully!");
    }

    // Remove an existing network device
    private static void removeDevice(
            Scanner scanner,
            ArrayList<NetworkDevice> devices) {

        System.out.println();
        System.out.println("--- Remove Device ---");

        System.out.print("Enter device name: ");
        String removeName = scanner.nextLine();

        NetworkDevice deviceToRemove = findDevice(devices, removeName);

        if (deviceToRemove != null) {
            devices.remove(deviceToRemove);
            System.out.println("Device removed successfully!");
        } else {
            System.out.println("No device found with the name: " + removeName);
        }
    }

    // Search for a network device
    private static void searchDevice(
            Scanner scanner,
            ArrayList<NetworkDevice> devices) {

        System.out.println();
        System.out.println("--- Search Device ---");

        System.out.print("Enter device name: ");
        String searchName = scanner.nextLine();

        NetworkDevice device = findDevice(devices, searchName);

        if (device != null) {
            System.out.println();
            System.out.println("Device found!");
            printDevice(device);
        } else {
            System.out.println("No device found with the name: " + searchName);
        }
    }

    // Display all network devices
    private static void listDevices(ArrayList<NetworkDevice> devices) {

        System.out.println();
        System.out.println("--- Network Devices ---");

        if (devices.isEmpty()) {
            System.out.println("No devices found.");
            return;
        }

        for (NetworkDevice device : devices) {
            printDevice(device);
        }

        System.out.println("Total Devices: " + devices.size());
    }

    // Update an existing network device
    private static void updateDevice(
            Scanner scanner,
            ArrayList<NetworkDevice> devices) {

        System.out.println();
        System.out.println("--- Update Device ---");

        System.out.print("Enter device name: ");
        String updateName = scanner.nextLine();

        NetworkDevice device = findDevice(devices, updateName);

        if (device == null) {
            System.out.println("No device found with the name: " + updateName);
            return;
        }

        System.out.println();
        System.out.println("Current Device Information:");
        printDevice(device);

        System.out.print("Enter new device name: ");
        String newDeviceName = scanner.nextLine();

        System.out.print("Enter new IP address: ");
        String newIpAddress = scanner.nextLine();

        System.out.print("Enter new MAC address: ");
        String newMacAddress = scanner.nextLine();

        device.setDeviceName(newDeviceName);
        device.setIpAddress(newIpAddress);
        device.setMacAddress(newMacAddress);

        System.out.println("Device updated successfully!");
    }

    // Reusable method for finding a device by name
    private static NetworkDevice findDevice(
            ArrayList<NetworkDevice> devices,
            String deviceName) {

        for (NetworkDevice device : devices) {
            if (device.getDeviceName().equalsIgnoreCase(deviceName)) {
                return device;
            }
        }

        return null;
    }

    // Reusable method for displaying device information
    private static void printDevice(NetworkDevice device) {

        System.out.println("Device Name: " + device.getDeviceName());
        System.out.println("IP Address: " + device.getIpAddress());
        System.out.println("MAC Address: " + device.getMacAddress());
        System.out.println();
    }
}
