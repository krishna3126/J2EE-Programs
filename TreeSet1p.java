import java.util.*;
public class TreeSet1p
{
	public static void main(String args[])
	{
		TreeSet <Integer> num = new TreeSet <>();
		num.add(30);
		num.add(20);
		num.add(10);
		System.out.println("The Numbers are : "+num);
		
		TreeSet <Float> num2 = new TreeSet <>();
		num2.add(30.10f);
		num2.add(20.1000f);
		num2.add(10.00f);
		System.out.println("The Numbers are : "+num2);
		
		TreeSet <Character> num3 = new TreeSet <>();
		num3.add('z');
		num3.add('y');
		num3.add('x');
		System.out.println("The Characters are : "+num3);
		
		
	}
}