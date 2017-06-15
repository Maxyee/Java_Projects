package switch123;

public class Switch {

	public static void main(String[] args){
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		
		switch(d)
		{
			case 10:
				System.out.println("Hello value 10");
				break;
			
			case 20:
				System.out.println("hello value 20");
				break;
				
			case 30:
				System.out.println("Hello value 30");
				break;
				
			default:
				System.out.println("no value matched");
				break;
		}
	}
}
