
public class FertilizerBusinessman extends Person {
    private Fertilizer fertilizer = new Fertilizer();
    
    public void initializeFertilizer(){
        this.fertilizer.setAmountFertilizer(1, 1000);
        this.fertilizer.setAmountFertilizer(2, 1000);
        this.fertilizer.setAmountFertilizer(3, 1000);
    }
    public void production(){
        this.fertilizer.setAmountFertilizer(1, this.fertilizer.getAmountFertilizer(1)+ 1000);
        this.fertilizer.setAmountFertilizer(2, this.fertilizer.getAmountFertilizer(2)+ 1000);
        this.fertilizer.setAmountFertilizer(3, this.fertilizer.getAmountFertilizer(3)+ 1000);
    }
    public void productionCost(){
        double aux = this.getEquity();
        this.setEquity(aux - 1150000);
    }
    public void addProduction(int type){
        this.fertilizer.setAmountFertilizer(type, 250);
        double aux = this.getEquity();
        this.setEquity(aux - 250 * (this.fertilizer.getValueFertilizer(type)/2));
        this.setPollution(this.fertilizer.getPollution(type));
    }
    public void saleFertilizer(int type, int amount){
        this.fertilizer.setAmountFertilizer(type, this.fertilizer.getAmountFertilizer(type)- amount);
        this.setEquity(this.getEquity() + this.fertilizer.getValueFertilizer(type)*amount);
    }
    public FertilizerBusinessman(String name, String city) {
        super(name, city);
        this.initializeFertilizer();
    }
    
}
