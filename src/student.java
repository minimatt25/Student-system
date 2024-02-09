public class student {
    String id;
    String name;
    int year;
    int group;

    public student(){
        id = "not assigned";
        name = "unknown";
        year = 0;
        group = 0;
    }
    public student(String newid, String newName, int newYear, int newGroup){
        id = newid;
        name = newName;
        year = newYear;
        group = newGroup;
    }

    public String toString(){
        return "id: " + id + "\nname: " + name + "\nyear: " + year + "\ngroup: " + group;
    }
}

