import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Ex_4 {
public static void main(String[] args) {
List<Integer> l = new ArrayList();
l.add(1);
l.add(2);
l.add(3);
Iterator<Integer> i = l.iterator();//you can also specify type
//with loop
while(i.hasNext())
System.out.println(i.next());
}}