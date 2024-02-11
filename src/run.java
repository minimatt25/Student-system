import java.io.*;

public class run {
    public static void main(String[] args) {
        student student1 = new student(1, "Jimmy", "Jones", 7, 4);
        System.out.println(student1);

        //Appending to file
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("students.dat"));
            output.writeObject(student1);
            output.close();
        }
        catch (IOException ioe){
            System.err.println("Error saving to students file");
        }

        //Reading from file
        student student2 = null;

        try{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("students.dat"));
            student2 = (student) input.readObject();
            input.close();
        }
        catch (IOException ioe){
            System.err.println("Error opening students file");
        }
        catch (ClassNotFoundException cnfe){
            System.err.println("Object is not a student");
        }

        //printing the student out
        System.out.println("-----------");
        System.out.println(student2);
    }
}
