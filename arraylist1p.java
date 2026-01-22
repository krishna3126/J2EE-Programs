import java.util.ArrayList;  //using genericks (ex: <int,float,char etc>)
public class arraylist1p{
    public static void main(String[] args) {	
		ArrayList <Integer> num = new ArrayList<>();
		num.add(10);
		num.add(20);
		num.add(30);
		System.out.println("Integer List is : " + num);
		
		ArrayList<Float> num2 = new ArrayList<>();
		num2.add(10.10f);
		num2.add(20.20f);
		num2.add(30.30f);
		System.out.println("Float List is : " + num2);
		
		ArrayList<Character> num3 = new ArrayList<>();
		num3.add('a');
		num3.add('b');
		num3.add('c');
		System.out.println("Character List is : " + num3);
	}
}
