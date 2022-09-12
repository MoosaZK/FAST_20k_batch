class MyExceptions extends Exception{
    public String a;
    
    public MyExceptions(String a) {
        this.a=a;
        check(a);
    }

    public void check(String s) {
        char[] chars = s.toCharArray();
        int i=0;
        for(char c : chars){
            if(!Character.isLetter(c)){
                try {
                    throw this;
                }catch(MyExceptions e)
                {
                    System.out.println("Error occured on index " + i);
                    System.out.println(e);
                }
                
                break;
            }
            else {
                System.out.println("Correct at index: " + i);
            }
            i++;

        }
        
    }

    @Override
    public String toString() {
        return "Some error occurred";   
    } 
}
public class task2 {
    public static void main(String[] args) {

    System.out.println(" trying ");
    MyExceptions e = new MyExceptions("ksdAn45af");

    }
}