package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		int[] arr1={3,2,11,4,6,7};
		int[] arr2 ={1,2,8,4,9,7};
		
		List<Integer> val1=new ArrayList<Integer>();
		for(int var:arr1)
		{
			val1.add(var);
		}
		
		System.out.println("First List:"+val1);
		
		List<Integer> val2=new ArrayList<Integer>();
		for(int var:arr2)
		{
			val2.add(var);
		}
		
		System.out.println("Second List:"+val2);
		for (int i = 0; i < val1.size();i++) {
			for( int j = 0; j < val2.size(); j++ )
			{
				if( val1.get(i)==val2.get(j))

					System.out.println("Intersection numbers in both List are "+val1.get(i));

			}
	}

	}
}
	

