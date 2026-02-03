import java.util.*;

public class IteratorMap1p
{
	public static void main(String args[])
	{
		HashMap<Integer, String> map = new HashMap <>();
		
		map.put(101, "Pavan");
		map.put(102, "Yash");
		map.put(103, "Karan");
		
		Iterator<Map.Entry<Integer, String>> num = map.entrySet().iterator();
		while(num.hasNext())
		{
			Map.Entry<Integer, String> num2 = num.next();
			System.out.println(num2.getKey() + " = " + num2.getValue());
		}
	}
}