
package devicerepair;

import java.util.ArrayList;


public class Laptop extends Device{
    private int priority;

    public Laptop(int priority, String IdentificationCode, String MakeAndModel, String Owner, String ProblemDescription, String RepairNotes) {
        super(IdentificationCode, MakeAndModel, Owner, ProblemDescription, RepairNotes);
        this.priority = priority;
    }
    public int priorityRank(){
        return 1;
        
    }
    
     public ArrayList<Components> Components = new ArrayList<>();
     
     public boolean isChargeable(boolean a){
         return a;
     }
    
}

