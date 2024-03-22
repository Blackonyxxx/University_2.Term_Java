public class Test {

    public static void main(String[] args) {
        
        // Creating instances of Desktop, Laptop, and Tablet
        Desktop desktop = new Desktop("Nvidia RTX 4080", "Intel Core i9", 64, 2048);
        Laptop laptop = new Laptop(144, "AMD Ryzen 7", 32, 1024);
        Tablet tablet = new Tablet(80, "Apple A14 Bionic", 8, 512);

        // Displaying computers specifications
        desktop.displayType();
        desktop.printProcessor();
        desktop.printMemory();
        desktop.printStorage();
        desktop.printGpu();

        System.out.println();

        laptop.displayType();
        laptop.printProcessor();
        laptop.printMemory();
        laptop.printStorage();
        laptop.printRefreshRate();

        System.out.println();

        tablet.displayType();
        tablet.printProcessor();
        tablet.printMemory();
        tablet.printStorage();
        tablet.printBatteryLife();
        
        System.out.println();

        // Creating an array of Computer objects
        Computer[] computers = {desktop, laptop, tablet};
        // Creating a DeviceManager object with the array of computers
        DeviceManager manager = new DeviceManager(computers);
        // Displaying the computers managed by the DeviceManager
        manager.getMyComputers();

        System.out.println();

        // Creating a newDesktop instance
        Desktop newDesktop = new Desktop("AMD Radeon RX 6900 XT", "AMD Ryzen 7", 64, 4000);
        // Adding the newDesktop to the list of managed computers
        manager.addComputer(newDesktop);
        manager.getMyComputers();

        System.out.println();

        //Changing the newDesktop's gpu
        newDesktop.setGpu("AMD Radeon RX 7900 XTX");

        // Displaying specifications of the newDesktop
        newDesktop.displayType();
        newDesktop.printProcessor();
        newDesktop.printMemory();
        newDesktop.printStorage();
        newDesktop.printGpu();

    }
}