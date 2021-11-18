package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> val=new ArrayList<Integer>();
		int count=0;
		for(int var:arr)
		{
			val.add(var);
		}
		
		for(int i=0;i<val.size();i++)
		{
			for(int j=1;j<val.size();j++)
			{
				if(val.get(i)==val.get(j))
					count++;
			}
		}
		if(count>0)
			System.out.println(val);
	}

}
