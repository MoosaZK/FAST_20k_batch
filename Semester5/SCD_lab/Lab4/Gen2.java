public class Gen2 <T , V>{
    T a;
    V b;
    Gen2(T a1 , V b1){
    a= a1;
    b= b1;
    }
    void get() {
    System.out.println(a.getClass().getName());
    System.out.println(b.getClass().getName());
    }
    public static void main(String[] args) {
    
    Gen2<Integer , Double> b = new Gen2<>(2 , 2.0);
    
    b.get();
    }
    
    
}
