
public class Agrotoxic {
    private Comum comum = new Comum();
    private Premiun premiun = new Premiun();
    private SuperPremiun superPremiun = new SuperPremiun();
    
    public void amountAgrotoxic(){
        System.out.println("Comum: "+ this.comum.getAmount());
        System.out.println("Premium: "+ this.premiun.getAmount());
        System.out.println("Super Premiun: "+ this.superPremiun.getAmount());
    }
    
    public void setAmountAgrotoxic(int type, double amount){
        switch (type){
            case 1: this.comum.setAmount(amount);
            break;
            case 2: this.premiun.setAmount(amount);
            break;
            case 3: this.superPremiun.setAmount(amount);
            break;
            default: System.out.println("Opção invalida!!!");
        }
    }
    
    public double getAmountAgrotoxic(int type){
        double amount = 0;
        switch (type){
            case 1: amount = this.comum.getAmount();
            break;
            case 2: amount =  this.premiun.getAmount();
            break;
            case 3: amount =  this.superPremiun.getAmount();
            break;
            default: System.out.println("Opção invalida!!!");
        }
        return amount;
    }
    
    public double getValueAgrotoxic(int type){
        double value = 0;
        switch (type){
            case 1: value = this.comum.getValue();
            break;
            case 2: value =  this.premiun.getValue();
            break;
            case 3: value =  this.superPremiun.getValue();
            break;
            default: System.out.println("Opção invalida!!!");
        }
        return value;
    }
    public double getUseReduction(int type){
        double value = 0;
        switch (type){
            case 1: value = this.comum.getUseReduction();
            break;
            case 2: value =  this.premiun.getUseReduction();
            break;
            case 3: value =  this.superPremiun.getUseReduction();
            break;
            default: System.out.println("Opção invalida!!!");
        }
        return value;
    }
    public int getPollution(int type){
        int value = 0;
        switch (type){
            case 1: value = this.comum.getPollution();
            break;
            case 2: value =  this.premiun.getPollution();
            break;
            case 3: value =  this.superPremiun.getPollution();
            break;
            default: System.out.println("Opção invalida!!!");
        }
        return value;
    }
    class Comum{
        private double amount = 0;
        private double useReduction = 0;
        private double lossReduction = 0.015;
        private int pollution = 15;
        private double value = 200;
        
        public void setAmount(double amount){
            this.amount = amount;
        }
        public double getAmount(){
            return this.amount;
        }
        public double getUseReduction(){
            return this.useReduction;
        }
        public double getLossReduction(){
            return this.lossReduction;
        }
        public int getPollution(){
            return this.pollution;
        }
        public double getValue(){
            return this.value;
        }
    }
    
    class Premiun{
        private double amount = 0;
        private double useReduction = 0.25;
        private double lossReduction = 0.02;
        private int pollution = 10;
        private double value = 500;
        
        public void setAmount(double amount){
            this.amount = amount;
        }
        public double getAmount(){
            return this.amount;
        }
        public double getUseReduction(){
            return this.useReduction;
        }
        public double getLossReduction(){
            return this.lossReduction;
        }
        public int getPollution(){
            return this.pollution;
        }
        public double getValue(){
            return this.value;
        }
    }
    
    class SuperPremiun{
        private double amount = 0;
        private double useReduction = 0.5;
        private double lossReduction = 0.03;
        private int pollution = 5;
        private double value = 1000;
        
       public void setAmount(double amount){
            this.amount = amount;
        }
        public double getAmount(){
            return this.amount;
        }
        public double getUseReduction(){
            return this.useReduction;
        }
        public double getLossReduction(){
            return this.lossReduction;
        }
        public int getPollution(){
            return this.pollution;
        }
        public double getValue(){
            return this.value;
        }
    }
}
