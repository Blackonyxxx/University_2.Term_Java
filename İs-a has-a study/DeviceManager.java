public class DeviceManager  {
    private Computer[] myComputers ;
    
    // Constructor for DeviceManager class
     DeviceManager(Computer[] myComputers){
        this.myComputers=myComputers;
    }

    // Method to add a new computer to the managed computers
     void addComputer(Computer newComputer){
        int newLength = myComputers.length+1;
        Computer[] newArray = new Computer[newLength];
        System.arraycopy(myComputers, 0, newArray, 0, myComputers.length);
        newArray[newLength - 1] = newComputer;
        myComputers = newArray;
    }

    // Method to display the computers managed by the DeviceManager
    public void getMyComputers(){
        System.out.println("My computers: ");
        for (Computer myComputer : myComputers) {
            myComputer.displayType();
        }
    }

}
