public class bounded<T extends Number> {
        T a;
        bounded(T a1 ){
        a= a1;
        }
        void get() {
        System.out.println(a.getClass().getName());
        }
        public static void main(String[] args) {
        
        bounded<Integer> b = new bounded<>(2); // works fine
        bounded<Double> b1 = new bounded<>(2.0); // works fine
        bounded<Character> b2 = new bounded<>('a'); // error
        bounded<String> b2 = new bounded<>("error"); // error
        
        b.get();
        }
}
