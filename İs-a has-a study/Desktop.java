class Desktop extends Computer{
    private String gpu;//GPU model

    // Constructor for Desktop class
    public Desktop(String gpu, String processor, int memory, int storage) {
        super(processor, memory, storage);
        this.gpu = gpu;
    }

    // Getter method for GPU
    public String getGpu(){
        return gpu;
    }

    //Print method for GPU
    public void printGpu(){
        System.out.println("Gpu model is "+ gpu );
    }

    // Setter method for GPU
    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    // Override method to display the type of computer
    @Override
    void displayType() {
        System.out.println("Type of computer: Desktop");
    }

}
