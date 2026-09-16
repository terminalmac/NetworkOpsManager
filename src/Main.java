import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        NetworkDevice testDevice = new NetworkDevice(
            "pfSense-FW01",
            "192.168.1.1",
            "AA:BB:CC:DD:EE:FF"
        );

        System.out.println("Device: " + testDevice.getDeviceName());
        System.out.println("IP Address: " + testDevice.getIpAddress());
        System.out.println("MAC Address: " + testDevice.getMacAddress());
        System.out.println();
        
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

        switch (choice) {
            case 1:
                System.out.println("Add Device selected.");
                // Add device logic here
                break;
            case 2:
                System.out.println("Remove Device selected.");
                // Remove device logic here
                break;
            case 3:
                System.out.println("Search Device selected.");
                // Search device logic here
                break;
            case 4:
                System.out.println("List Devices selected.");
                // List devices logic here
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