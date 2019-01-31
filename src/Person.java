
public class Person {
    private String name;
    private String city;
    private double property = 0; // valor hectare: R$ 30.000,00
    private double latifundio = 0;
    private double equity = 0;
    private int pollution = 0;
    private int wastwater = 0;
    private double tax = 0;
    
    protected void setProperty(double property){
        this.property = property;
    }
    protected double getProperty(){
        return this.property;
    }
    
    protected void setLatifundio(double latifundio){
        this.latifundio = latifundio;
    }
    protected double getLatifundio(){
        return this.latifundio;
    }
    protected void setEquity(double equity){
        this.equity = equity;
    }
    protected double getEquity(){
        return this.equity;
    }
    protected void setPollution(int pollution){
        this.pollution = pollution;
    }
    protected int getPollution(){
        return this.pollution;
    }
    protected void setWastWater(int wastwater){
        this.wastwater = wastwater;
    }
    protected int getWastWater(){
        return this.wastwater;
    }
    protected void setTax(double tax){
        this.tax = tax;
    }
    protected double getTax(){
        return this.getTax();
    }
    protected String getName(){
        return this.name;
    }
    protected String getCity(){
        return this.city;
    }
    private void saleProperty(double hectares){
        this.property -= hectares;
        this.latifundio -= hectares * 30000;
        this.equity += hectares * 30000;
    }
    private void buyProperty(double hectares){
        this.property += hectares;
        this.latifundio += hectares * 30000;
        this.equity -= hectares * 30000;
    }
    protected void BSProperty(double value, Person saller){ // parte de quem quer vender
        this.buyProperty(value);
        saller.saleProperty(value);
    }
    protected void Negotiation(double value, Person negotiator){
        this.equity -= value;
        negotiator.setEquity(negotiator.getEquity()+value);
    }
    
    public void initializeInorganicFarmer(){
        this.property = 100;
        this.latifundio = 3000000;
        this.equity = 300000;
        this.tax = 0.2;
    }
    public void initializeOrganicFarmer(){
        this.property = 20;
        this.latifundio = 600000;
        this.equity = 150000;
        this.tax = 0.15;
    }
    public void initializeFertilizerBusinessman(){
        this.latifundio = 6500000;
        this.equity = 700000;
        this.tax = 0.4;
    }
    public void initializeMachineBusinessman(){
        this.latifundio = 6500000;
        this.equity = 700000;
        this.tax = 0.35;
    }
    public void initializeAgrotoxicBusinessman(){
        this.latifundio = 6500000;
        this.equity = 700000;
        this.tax = 0.45;
    }
    public void initializeSupervisor(){
        this.equity = 100000;
        this.tax = 0.08;
    }
    public void initializeAlderman(){
        this.equity = 150000;
        this.tax = 0.08;
    }
    public void initializeMayor(){
        this.equity = 1000000;
    }
    public void initializeONG(){
        this.equity = 50000;
        this.tax = 0.08;
    }
    public void print(){
        System.out.println("Nome: "+this.name);
        System.out.println("Cidade: "+this.city);
        System.out.println("Propriedade: "+this.property);
        System.out.println("Latifundio: "+this.latifundio);
        System.out.println("Capital: "+this.equity);
        System.out.println("Poluição individual: "+this.pollution);
        System.out.println("Disperdício de água: "+this.wastwater);
        System.out.println("Taxa de imposto: "+this.tax);
        System.out.println();
    }
    private class Partnership{
        private double pct;
        private String who;
        
        public void setPct(double pct){
            this.pct = pct;
        }
        public double getPct(){
            return this.pct;
        }
        public void setWho(String who){
            this.who = who;
        }
        public String getWho(){
            return this.who;
        }
    }
    public Person(String name, String city){
        this.name = name;
        this.city = city;
    }
}
