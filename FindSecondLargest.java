package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		Set<Integer> val=new TreeSet<Integer>();
		for(int var:data)
		{
			val.add(var);
		}
		
		System.out.println(val);
		List<Integer> val2=new ArrayList<Integer>();
		val2.addAll(val);
		System.out.println("List:"+val2);
		System.out.println("Second largest no.:"+val2.get(val2.size()-2));
	}

}
