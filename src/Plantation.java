
public class Plantation {
    private Rice rice = new Rice();
    private Soy soy = new Soy();
    private Vegetables vegetables = new Vegetables();
    private Greens greens = new Greens();
    
    public int plantationFertilizer(int type){
        int amount = 0;
        switch (type){
            case 1: amount = this.rice.getFertilizer();
            break;
            case 2: amount = this.soy.getFertilizer();
            break;
            case 3: amount = this.vegetables.getFertilizer();
            break;
            case 4: amount = this.greens.getFertilizer();
            break;
            default: System.out.println("Opção inválida");
        }
        return amount;
    }
    public double plantationAgrotoxic(int type){
        double amount = 0;
        switch (type){
            case 1: amount = this.rice.getAgrotoxic();
            break;
            case 2: amount = this.soy.getAgrotoxic();
            break;
            case 3: amount = this.vegetables.getAgrotoxic();
            break;
            case 4: amount = this.greens.getAgrotoxic();
            break;
            default: System.out.println("Opção inválida");
        }
        return amount;
    }
    public int plantationAgrotoxicHarvest(int type){
        int amount = 0;
        switch (type){
            case 1: amount = this.rice.getAgrotoxicHarvest();
            break;
            case 2: amount = this.soy.getAgrotoxicHarvest();
            break;
            case 3: amount = this.vegetables.getAgrotoxicHarvest();
            break;
            case 4: amount = this.greens.getAgrotoxicHarvest();
            break;
            default: System.out.println("Opção inválida");
        }
        return amount;
    }
    public int plantationOrganicHarvest(int type){
        int amount = 0;
        switch (type){
            case 1: amount = this.rice.getOrganicHarvest();
            break;
            case 2: amount = this.soy.getOrganicHarvest();
            break;
            case 3: amount = this.vegetables.getOrganicHarvest();
            break;
            case 4: amount = this.greens.getOrganicHarvest();
            break;
            default: System.out.println("Opção inválida");
        }
        return amount;
    }
    public double plantationLoss(int type){
        double amount = 0;
        switch (type){
            case 1: amount = this.rice.getLoss();
            break;
            case 2: amount = this.soy.getLoss();
            break;
            case 3: amount = this.vegetables.getLoss();
            break;
            case 4: amount = this.greens.getLoss();
            break;
            default: System.out.println("Opção inválida");
        }
        return amount;
    }
    public int plantationPollution(int type){
        int amount = 0;
        switch (type){
            case 1: amount = this.rice.getPollution();
            break;
            case 2: amount = this.soy.getPollution();
            break;
            case 3: amount = this.vegetables.getPollution();
            break;
            case 4: amount = this.greens.getPollution();
            break;
            default: System.out.println("Opção inválida");
        }
        return amount;
    }
    public int plantationWastWater(int type){
        int amount = 0;
        switch (type){
            case 1: amount = this.rice.getWastWater();
            break;
            case 2: amount = this.soy.getWastWater();
            break;
            case 3: amount = this.vegetables.getWastWater();
            break;
            case 4: amount = this.greens.getWastWater();
            break;
            default: System.out.println("Opção inválida");
        }
        return amount;
    }
    public double plantationProductionCost(int type){
        double amount = 0;
        switch (type){
            case 1: amount = this.rice.getProductionCost();
            break;
            case 2: amount = this.soy.getProductionCost();
            break;
            case 3: amount = this.vegetables.getProductionCost();
            break;
            case 4: amount = this.greens.getProductionCost();
            break;
            default: System.out.println("Opção inválida");
        }
        return amount;
    }
    public double plantationSale(int type){
        double amount = 0;
        switch (type){
            case 1: amount = this.rice.getSale();
            break;
            case 2: amount = this.soy.getSale();
            break;
            case 3: amount = this.vegetables.getSale();
            break;
            case 4: amount = this.greens.getSale();
            break;
            default: System.out.println("Opção inválida");
        }
        return amount;
    }
    class Rice{
        private int fertilizer = 10;
        private double agrotoxic = 5;
        private int agrotoxicHarvest = 5;
        private int organicHarvest = 2;
        private double loss = 0.25;
        private int pollution = 10;
        private int wastWater = 80;
        private double productionCost = 425.25;
        private double sale = 750;
        
        public int getFertilizer(){
            return this.fertilizer;
        }
        public double getAgrotoxic(){
            return this.agrotoxic;
        }
        public int getAgrotoxicHarvest(){
            return this.agrotoxicHarvest;
        }
        public int getOrganicHarvest(){
            return this.organicHarvest;
        }
        public double getLoss(){
            return this.loss;
        }
        public int getPollution(){
            return this.pollution;
        }
        public int getWastWater(){
            return this.wastWater;
        }
        public double getProductionCost(){
            return this.productionCost;
        }
        public double getSale(){
            return this.sale;
        }
    }
    
    class Soy{
        private int fertilizer = 30;
        private int agrotoxic = 10;
        private int agrotoxicHarvest = 8;
        private int organicHarvest = 3;
        private double loss = 0.34;
        private int pollution = 25;
        private int wastWater = 50;
        private double productionCost = 675;
        private double sale = 1200;
        
        public int getFertilizer(){
            return this.fertilizer;
        }
        public int getAgrotoxic(){
            return this.agrotoxic;
        }
        public int getAgrotoxicHarvest(){
            return this.agrotoxicHarvest;
        }
        public int getOrganicHarvest(){
            return this.organicHarvest;
        }
        public double getLoss(){
            return this.loss;
        }
        public int getPollution(){
            return this.pollution;
        }
        public int getWastWater(){
            return this.wastWater;
        }
        public double getProductionCost(){
            return this.productionCost;
        }
        public double getSale(){
            return this.sale;
        }
    }
    
    class Vegetables{
        private int fertilizer = 5;
        private double agrotoxic = 2;
        private int agrotoxicHarvest = 4;
        private int organicHarvest = 2;
        private double loss = 0.4;
        private int pollution = 5;
        private int wastWater = 20;
        private double productionCost = 282;
        private double sale = 645;
        
        public int getFertilizer(){
            return this.fertilizer;
        }
        public double getAgrotoxic(){
            return this.agrotoxic;
        }
        public int getAgrotoxicHarvest(){
            return this.agrotoxicHarvest;
        }
        public int getOrganicHarvest(){
            return this.organicHarvest;
        }
        public double getLoss(){
            return this.loss;
        }
        public int getPollution(){
            return this.pollution;
        }
        public int getWastWater(){
            return this.wastWater;
        }
        public double getProductionCost(){
            return this.productionCost;
        }
        public double getSale(){
            return this.sale;
        }
    }
    
    class Greens{
        private int fertilizer = 5;
        private double agrotoxic = 2;
        private int agrotoxicHarvest = 4;
        private int organicHarvest = 1;
        private double loss = 0.45;
        private int pollution = 5;
        private int wastWater = 10;
        private double productionCost = 210;
        private double sale = 525;
        
        public int getFertilizer(){
            return this.fertilizer;
        }
        public double getAgrotoxic(){
            return this.agrotoxic;
        }
        public int getAgrotoxicHarvest(){
            return this.agrotoxicHarvest;
        }
        public int getOrganicHarvest(){
            return this.organicHarvest;
        }
        public double getLoss(){
            return this.loss;
        }
        public int getPollution(){
            return this.pollution;
        }
        public int getWastWater(){
            return this.wastWater;
        }
        public double getProductionCost(){
            return this.productionCost;
        }
        public double getSale(){
            return this.sale;
        }
    }
}
