import java.util.*;

public class Enhanforloop1p {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        num.add(10);
        num.add(20);
        num.add(30);

        System.out.println("The number is : "+num.get(2));

        System.out.println("The size is : "+num.size());
	
		System.out.println("Remove Number is : "+num.remove(1));
		
		System.out.println("Number is Present in List : "+num.contains(10));
		
		System.out.println("List is Empty : "+num.isEmpty());
		
		num.clear();
	
        for (int n : num) {
            System.out.println(n);
			
        }
        
    }
}
