import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Ex_3 {
public static void main(String[] args) {
List<Integer> l = new ArrayList();
l.add(1);
l.add(2);
l.add(3);
Iterator i = l.iterator();
//without loop
System.out.println(i.next());
System.out.println(i.next());
System.out.println(i.next());
}}