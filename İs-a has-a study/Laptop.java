class Laptop extends Computer{
    private int refreshRate; // Screen refresh rate

    // Constructor for Laptop class
    public Laptop(int refreshRate, String processor, int memory, int storage) {
        super(processor, memory, storage);
        this.refreshRate = refreshRate;
    }
    // Getter method for refresh rate
    public int getRefreshRate(){
        return refreshRate;
    }

    //Print method for refresh rate
    public void printRefreshRate(){
        System.out.println("Screen Refresh Rate is "+ refreshRate+" Hz" );
    }

    // Setter method for refresh rate
    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    // Override method to display the type of computer
    @Override
    void displayType() {
        System.out.println("Type of computer: Laptop");
    }

}
