class Tablet extends Computer{
    private int batteryLife; // Battery life percentage

    // Constructor for Tablet class
    public Tablet(int batteryLife, String processor, int memory, int storage) {
        super(processor, memory, storage);
        this.batteryLife = batteryLife;
    }

    // Getter method for battery life
    public int getBatteryLife(){
        return batteryLife;
    }
 
    // Print method for battery life
    public void printBatteryLife(){
        System.out.println("Battery Life is "+ batteryLife+"%" );
    }

    // Setter method for battery life
    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    // Override method to display the type of computer
    @Override
    void displayType() {
        System.out.println("Type of computer: Tablet");
    }

}
