import java.util.Vector;
class vector {
public static void main(String[] args) {
Vector<Integer> s = new Vector<>();
System.out.println(s.capacity());
s.add(66);
s.add(66);
s.add(66);
s.add(66);
s.add(66);
s.add(66);
s.add(66);

s.add(66);
s.add(66);
s.add(66);
s.add(66);//size will be double when you insert 11th element

System.out.println(s.capacity());
}}