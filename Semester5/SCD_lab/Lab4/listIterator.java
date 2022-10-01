import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class listIterator {
public static void main(String[] args) {
List<String> l = new ArrayList();

l.add("A");
l.add("B");
//modify objects using listiterator
ListIterator<String> i = l.listIterator();
while(i.hasNext()) {
String e = i.next();
i.set(e + "+");
}
//printing
i = l.listIterator();
while(i.hasNext()) {
System.out.println(i.next());
}
}}