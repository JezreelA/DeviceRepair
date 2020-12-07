
package devicerepair;


public class mobilePhone extends Device{
    private int priority;

    public mobilePhone(int priority, String IdentificationCode, String MakeAndModel, String Owner, String ProblemDescription, String RepairNotes) {
        super(IdentificationCode, MakeAndModel, Owner, ProblemDescription, RepairNotes);
        this.priority = priority;
    }
    public int priorityRank(){
        return 1;
    }
    public boolean isChargeable(boolean a){
         return a;
     }
    
}
