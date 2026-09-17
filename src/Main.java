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

            choice = scanner.nextInt();

            scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                System.out.println();
                System.out.println("--- Add Network Device ---");

                System.out.print("Device Name: ");
                String deviceName = scanner.nextLine();

                System.out.print("IP Address: ");
                String ipAddress = scanner.nextLine();

                System.out.print("MAC Address: ");
                String macAddress = scanner.nextLine();

                NetworkDevice newDevice = new NetworkDevice(
                    deviceName,
                    ipAddress,
                    macAddress
                );

                devices.add(newDevice);

                System.out.println("Device added successfully!");

                break;
            case 2:
                System.out.println("Remove Device selected.");
                // Remove device logic here
                break;
            case 3:
                System.out.println();
                System.out.println("--- Search Device ---");

                System.out.print("Enter device name: ");
                String searchName = scanner.nextLine();

                boolean found = false;

                for (NetworkDevice device : devices) {

                    if (device.getDeviceName().equalsIgnoreCase(searchName)) {

                        found = true;

                        System.out.println();
                        System.out.println("Device found:");
                        System.out.println("Device Name: " + device.getDeviceName());
                        System.out.println("IP Address: " + device.getIpAddress());
                        System.out.println("MAC Address: " + device.getMacAddress());
        
                        break;
                    }

                    if (!found) {
                        System.out.println("No device found with the name: " + searchName);
                    }
                }

                break;
            case 4:
                System.out.println();
                System.out.println("--- Network Devices ---");

                if (devices.isEmpty()) {
                    System.out.println("No devices found.");
                } else {
                    for (NetworkDevice device : devices) {
                        System.out.println("Device Name: " + device.getDeviceName());
                        System.out.println("IP Address: " + device.getIpAddress());
                        System.out.println("MAC Address: " + device.getMacAddress());
                        System.out.println();
                    }
                    System.out.println("Total Devices: " + devices.size());
                }

                break;
            case 5:
                System.out.println("Update Device selected.");
                // Update device logic here
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
}