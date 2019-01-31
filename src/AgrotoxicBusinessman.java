
public class AgrotoxicBusinessman extends Person {
    private Agrotoxic agrotoxic = new Agrotoxic();
   
    public void initializeAgrotoxic(){
        this.agrotoxic.setAmountAgrotoxic(1, 1000);
        this.agrotoxic.setAmountAgrotoxic(2, 1000);
        this.agrotoxic.setAmountAgrotoxic(3, 1000);
    }
    public void saleAgrotoxic(int type, int amount){
        this.agrotoxic.setAmountAgrotoxic(type, this.agrotoxic.getAmountAgrotoxic(type)- amount);
        this.setEquity(this.getEquity() + (this.agrotoxic.getValueAgrotoxic(type)*amount));
    }
    public void productionCost(){
        double aux = this.getEquity();
        this.setEquity(aux - 1150000);
    }
    public void addProduction(int type){
        this.agrotoxic.setAmountAgrotoxic(type, 250);
        double aux = this.getEquity();
        this.setEquity(aux - 250 * (this.agrotoxic.getValueAgrotoxic(type)/2));
        this.setPollution(this.agrotoxic.getPollution(type));
    }
    
    public AgrotoxicBusinessman(String name, String city) {
        super(name, city);
        this.initializeAgrotoxic();
    }
}
