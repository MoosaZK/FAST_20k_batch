public class Gen <T> {
T a;
Gen(T a1){
a= a1;
}
void get() {
System.out.println(a.getClass().getName());
}
    public static void main(String[] args) {

        Gen<Integer> b = new Gen<Integer>(2);

        //shorten the syntax
        // Gen<Integer> b = new Gen<>(2);
        b.get();
    }
}