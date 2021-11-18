package week3.day2;

public class College extends University{
	
	public void ug() {
		System.out.println("Printing ug from College");
		
	}

	public static void main(String[] args) {
		College clg=new College();
		clg.pg();
		clg.ug();

	}

	
	

}
