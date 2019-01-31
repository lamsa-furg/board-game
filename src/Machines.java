
public class Machines {
    private Seeder seeder = new Seeder();
    private Spray spray = new Spray();
    private Combine combine = new Combine();
    
    public void setAmountMachines(int type, int amount){
        switch (type){
            case 1: this.seeder.setAmount(amount);
            break;
            case 2: this.spray.setAmount(amount);
            break;
            case 3: this.combine.setAmount(amount);
            break;
            default: System.out.println("Opção invalida!!!");
        }
    }
    public int getAmountMachines(int type){
        int amount = 0;
        switch (type){
            case 1: amount = this.seeder.getAmount();
            break;
            case 2: amount = this.spray.getAmount();
            break;
            case 3: amount = this.combine.getAmount();
            break;
            default: System.out.println("Opção invalida!!!");
        }
        return amount;
    }
    public double getValueMachines(int type){
        double value = 0;
        switch (type){
            case 1: value = this.seeder.getRental();
            break;
            case 2: value = this.spray.getRental();
            break;
            case 3: value = this.combine.getRental();
            break;
            default: System.out.println("Opção invalida!!!");
        }
        return value;
    }
    public double getLossReduction(int type){
        double value = 0;
        switch (type){
            case 1: value = this.seeder.getLossReduction();
            break;
            case 2: value = this.spray.getLossReduction();
            break;
            case 3: value = this.combine.getLossReduction();
            break;
            default: System.out.println("Opção invalida!!!");
        }
        return value;
    }
    public int getPollution(int type){
        int value = 0;
        switch (type){
            case 1: value = this.seeder.getPollution();
            break;
            case 2: value = this.spray.getPollution();
            break;
            case 3: value = this.combine.getPollution();
            break;
            default: System.out.println("Opção invalida!!!");
        }
        return value;
    }
    public double getRental(int type){
        double value = 0;
        switch (type){
            case 1: value = this.seeder.getRental();
            break;
            case 2: value = this.spray.getRental();
            break;
            case 3: value = this.combine.getRental();
            break;
            default: System.out.println("Opção invalida!!!");
        }
        return value;
    }
    
    class Seeder{
        private int amount = 0;
        private double lossReduction = 0.08;
        private int pollution = 20;
        private double rental = 20000;
        
        public void setAmount(int amount){
            this.amount = amount;
        }
        public int getAmount(){
            return this.amount;
        }
        public double getLossReduction(){
            return lossReduction;
        }
        public int getPollution(){
            return this.pollution;
        }
        public double getRental(){
            return rental;
        }
    }
    
    class Spray{
        private int amount = 0;
        private double lossReduction = 0.03;
        private int pollution = 40;
        private double rental = 5000;
        
        public void setAmount(int amount){
            this.amount = amount;
        }
        public int getAmount(){
            return this.amount;
        }
        public double getLossReduction(){
            return lossReduction;
        }
        public int getPollution(){
            return this.pollution;
        }
        public double getRental(){
            return rental;
        }
    }
    
    class Combine{
        private int amount = 0;
        private double lossReduction = 0.05;
        private int pollution = 20;
        private double rental = 10000;
        
        public void setAmount(int amount){
            this.amount = amount;
        }
        public int getAmount(){
            return this.amount;
        }
        public double getLossReduction(){
            return lossReduction;
        }
        public int getPollution(){
            return this.pollution;
        }
        public double getRental(){
            return rental;
        }
    }
}
