package sir_task2;

public class SimpGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics BY KHUZEMA");
		
		//Show the types.
	    tgObj.showTypes();
	    //Obtain and show values.
	    int v = tgObj.getob1();
	    System.out.println("value: " + v);
	    String str = tgObj.getob2(); System.out.println("value: " + str);	 
	}
}