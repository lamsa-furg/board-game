
public class Farmer extends Person{
    
    private Agrotoxic agrotoxic = new Agrotoxic();
    private Fertilizer fertilizer = new Fertilizer();
    private Machines machines = new Machines();    
    
    public void buyAgrotoxic(int type, int amount, AgrotoxicBusinessman BM){
        this.agrotoxic.setAmountAgrotoxic(type, this.agrotoxic.getAmountAgrotoxic(type)+ amount);
        this.setEquity(this.getEquity()- (this.agrotoxic.getValueAgrotoxic(type) * amount));
        BM.saleAgrotoxic(type, amount);
    }
    public void buyFertilizer(int type, int amount, FertilizerBusinessman BM){
        this.fertilizer.setAmountFertilizer(type, this.fertilizer.getAmountFertilizer(type)+ amount);
        this.setEquity(this.getEquity()- (this.fertilizer.getValueFertilizer(type) * amount));
        BM.saleFertilizer(type, amount);
    }
    public void rentMachines(int type, int amount, MachinesBusinessman BM){
        this.machines.setAmountMachines(type, this.machines.getAmountMachines(type)+ amount);
        this.setEquity(this.getEquity()- (this.machines.getValueMachines(type)* amount));
        BM.rent(type, amount);
    }
    public void returnMachines(){
        this.machines.setAmountMachines(1, 0);
        this.machines.setAmountMachines(2, 0);
        this.machines.setAmountMachines(3, 0);
    }
    public double plantCost(int type, double hectare, int agrotoxic, int extraagrotoxic, int addagrotoxic){
        Plantation plant = new Plantation();
        int harvest;
        double cost;
        if(agrotoxic == 1)harvest = plant.plantationAgrotoxicHarvest(type);
        else harvest = plant.plantationOrganicHarvest(type);
        if(extraagrotoxic == 1)harvest += addagrotoxic;
        cost = hectare * plant.plantationProductionCost(type) * harvest;
        return cost;
    }
    public double plantProfit(int type, double hectare,int agrotoxic, int seeder, int spray, int combine, int extraagrotoxic, int addagrotoxic){
        Plantation plant = new Plantation();
        int harvest;
        double loss = plant.plantationLoss(type);
        double Bprofit;
        double Lprofit;
        if(seeder == 1)loss -= this.machines.getLossReduction(1);
            if(spray == 1)loss -= this.machines.getLossReduction(2);
                if(combine == 1)loss -= this.machines.getLossReduction(3);
        if(agrotoxic == 1)harvest = plant.plantationAgrotoxicHarvest(type);
        else harvest = plant.plantationOrganicHarvest(type);
        if(extraagrotoxic == 1)harvest += addagrotoxic;
        Bprofit = hectare * plant.plantationSale(type) * harvest;
        Lprofit = Bprofit - (loss * Bprofit)- this.plantCost(type, hectare, agrotoxic,extraagrotoxic, addagrotoxic );
        
        return Lprofit;
        
    }
    public void plant(int type, double hectare,int typefertilizer, int seeder, int spray, int combine,int agrotoxic,int typeagrotoxic, int extraagrotoxic, int addagrotoxic){
        Plantation _Plant = new Plantation();
        Fertilizer _Fertilizer = new Fertilizer();
        Agrotoxic _Agrotoxic = new Agrotoxic();
        int _machine = 0;
        int _add = 0;
        
        this.fertilizer.setAmountFertilizer(typefertilizer,this.fertilizer.getAmountFertilizer(typefertilizer)- (_Plant.plantationFertilizer(type) - ( _Plant.plantationFertilizer(type)*_Fertilizer.getUseReduction(typefertilizer)) ));
        if(typeagrotoxic != 0)this.agrotoxic.setAmountAgrotoxic(typeagrotoxic, this.agrotoxic.getAmountAgrotoxic(typeagrotoxic)-(_Plant.plantationFertilizer(type) - ( _Plant.plantationFertilizer(type)*_Agrotoxic.getUseReduction(typefertilizer))));
        
        if(seeder == 1)_machine += this.machines.getPollution(1);
            if(spray == 1)_machine += this.machines.getPollution(2);
                if(combine == 1)_machine += this.machines.getPollution(3);
        
        if(extraagrotoxic == 1)_add = addagrotoxic * 10;
        
        this.setPollution(_Agrotoxic.getPollution(typeagrotoxic) + _Plant.plantationPollution(type) + _Fertilizer.getPollution(typefertilizer)+ _machine + _add );
        this.setEquity(this.getEquity() + this.plantProfit(type, hectare, agrotoxic, seeder, spray, combine, extraagrotoxic, addagrotoxic));
        int aux = this.getWastWater();
        this.setWastWater(aux += _Plant.plantationWastWater(type));
    }
    
    
    public Farmer(String name, String city){
        super(name,city);
    }
}
