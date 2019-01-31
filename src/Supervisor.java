
public class Supervisor extends Person {
   
    public void applyPenalty(Person player,Mayor mayor, double penalty){
        player.setEquity(player.getEquity()-penalty);
        mayor.setEquity(mayor.getEquity()-penalty);
    }   
    public Supervisor(String name, String city){
        super(name,city);
    }
}
