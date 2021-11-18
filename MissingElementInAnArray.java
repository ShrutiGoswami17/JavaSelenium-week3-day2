package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		List<Integer> val=new ArrayList<Integer>();
		for(int var:arr)
		{
			val.add(var);
		}
		
		System.out.println("First List:"+val);
		Collections.sort(val);
		
		for(int i=1;i<val.size();i++)
		{
			if(val.get(i-1)!=i)
				{System.out.println("The missing number is:"+i);
			break;
				}
		}

	}

}
