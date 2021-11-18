package week3.day2;

public class Automation extends MultipleLanguage implements Language,TestTool{
	
	public void selenium() {
		System.out.println("Calling Selenium");
		
	}

	public void java() {
		System.out.println("Calling java");
	}

	@Override
	public void ruby() {
		System.out.println("Calling ruby");
		
	}

	public static void main(String[] args) {
		Automation auto=new Automation();
		auto.java();
		auto.selenium();
		auto.python();
		auto.ruby();

		
	}

	

}
