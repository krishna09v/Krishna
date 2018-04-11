package testpackage;

public class MyTestClass {

	public static void main(String[] args) {
		
		System.out.println("This is a test class");
		
		String[] names = {"Ram","Mahesh","Jai","Shabeena","Sai Kumar","Sapneel"};
		
		//Print greetings
		for(int i=0; i<names.length; i++){
			System.out.format("Hai %s!\n", names[i]);
		}
	}

}
