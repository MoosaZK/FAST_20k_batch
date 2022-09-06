public class exception{
    public static void main(String[] args) {
        try{
            int a[] = new int[5];
            a[5]=30/0;
            System.out.println(a[10]);
        }
        catch(ArithmeticException e){
            System.out.println("arthmetic");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array");
        }
    }

    @Override
    public String toString() {
        return "exception [a=+a+]";
    }
}