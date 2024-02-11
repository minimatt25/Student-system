import java.io.Serializable;

public class student implements Serializable {
    private final int id;
    private final String Fname;
    private final String Lname;
    private final int year;
    private final int group;

    public student(){
        id = 0 ;
        Fname = "unknown";
        Lname = "unknown";
        year = 0;
        group = 0;
    }
    public student(int newid, String newFname, String newLname, int newYear, int newGroup){
        id = newid;
        Fname = newFname;
        Lname = newLname;
        year = newYear;
        group = newGroup;
    }

    public String toString(){
        return "id: " + id + "\nfirst name: " + Fname + "\nlast name: " + Lname +"\nyear: " + year + "\ngroup: " + group;
    }
}

