package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		List<String> values=new ArrayList<String>();
		
		System.out.println("Converting array to list");
		
		for (String eachData : input) {
			
			values.add(eachData);
			
		}
		
		System.out.println("List : "+values);
		
		Collections.sort(values);
		System.out.println("Printing sorted values: "+values);
		
		System.out.println("Printing values in reverse order");
		
		for(int i=(values.size()-1);i>=0;i--)
		{
			
			System.out.println(values.get(i));
		}
		
		
		
	}

}
