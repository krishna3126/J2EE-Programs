import java.util.*;

public class Iterator1p {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();

        num.add(10);
        num.add(20);
        num.add(30);

        Iterator<Integer> itr = number.iterator();
		
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
