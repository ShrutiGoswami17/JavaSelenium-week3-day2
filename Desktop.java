package week3.day2;

public class Desktop implements HardWare,SoftWare {
	
	public void softwareResources() {
		System.out.println("Software Resources");
		
	}

	public void hardwareResources() {
		System.out.println("Hardware Resources");
		
	}
	
	public void desktopModel()
	{
		
		System.out.println("Printing desktop model");
	}

	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.softwareResources();
		d.hardwareResources();
		d.desktopModel();
	}

	

}
