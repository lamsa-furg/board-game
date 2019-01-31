
public class Mayor extends Person{
    private WaterTreatment water = new WaterTreatment();
    private TrashTreatment trash = new TrashTreatment();
    private AirPurification air = new AirPurification();
    
    public double PollutionReduction(double pollution, double critical, int water, int trash, int air){
        double reduction = 0;
        double cost = 0;
        if(water == 1){
            reduction += this.water.getWeightedReduction();
            cost += this.water.getCost();
        }
        if(trash == 1){
            reduction += this.trash.getWeightedReduction();
            cost += this.trash.getCost();
        }
        if(air == 1){
            reduction += this.air.getWeightedReduction();
            cost += this.air.getCost();
        }
        this.setEquity(this.getEquity()- cost);
        return pollution *(reduction/3);
    }
    class WaterTreatment{
        private double weightedReduction = 0.15;
        private double coast = 100000;
        
        protected double getWeightedReduction(){
            return this.weightedReduction;
        }
        protected double getCost(){
            return this.coast;
        }
    }
    class TrashTreatment{
        private double weightedReduction = 0.25;
        private double coast = 200000;
        
        protected double getWeightedReduction(){
            return this.weightedReduction;
        }
        protected double getCost(){
            return this.coast;
        }
    }
    class AirPurification{
        private double weightedReduction = 0.35;
        private double coast = 350000;
        
        protected double getWeightedReduction(){
            return this.weightedReduction;
        }
        protected double getCost(){
            return this.coast;
        }
    }
    public Mayor(String name, String city){
        super(name,city);
    }
}
