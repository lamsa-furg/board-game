
public class MachinesBusinessman extends Person{
    private Machines machines = new Machines();
    
    public void initializeMachines(){
        this.machines.setAmountMachines(1, 2);
        this.machines.setAmountMachines(2, 2);
        this.machines.setAmountMachines(3, 2);
    }
    public void rent(int type, int amount){
        this.machines.setAmountMachines(type, this.machines.getAmountMachines(type)- amount);
        this.setEquity(this.getEquity() + this.machines.getValueMachines(type)* amount);
    }
    public MachinesBusinessman(String name, String city) {
        super(name, city);
        initializeMachines();
    }
}
