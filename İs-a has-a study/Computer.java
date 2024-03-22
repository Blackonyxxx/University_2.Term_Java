abstract class Computer{

    private final String processor;
    private final int memory;
    private final int storage;

     // Constructor for the Computer class
    public Computer(String processor, int memory, int storage){
        this.processor=processor;
        this.memory=memory;
        this.storage=storage;
    }

    abstract void displayType();

    public String getProcessor(){
        return processor;
    }
    // Getter methods
    public int getMemory(){
        return memory;
    }

    public int getStorage(){
        return storage;
    }
    
    // Print methods
    public void printProcessor(){
        System.out.println("Processor is "+ processor );
    }

    public void printMemory(){
        System.out.println("Memory is "+ memory+ " gb" );
    }

    public void printStorage(){
        System.out.println("Storage is "+ storage +" gb" );
    }
}


