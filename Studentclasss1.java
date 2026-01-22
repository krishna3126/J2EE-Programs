import java.util.*;

class Studentclasss1 {
    int Rollno;
    float Marks;
    String Name;

    public String toString() {
        return Rollno + " " + Name + " " + Marks;
    }
}

public class Students {
    public static void main(String args[]) {

        ArrayList<Studentclasss1> obj = new ArrayList<>();

        Studentclasss1 s1 = new Studentclasss1();
        s1.Rollno = 101;
        s1.Marks = 92.28f;
        s1.Name = "Pavan";

        Studentclasss1 s2 = new Studentclasss1();
        s2.Rollno = 102;
        s2.Marks = 93.30f;
        s2.Name = "Yash";

        obj.add(s1);
        obj.add(s2);

        System.out.println(obj);
    }
}
