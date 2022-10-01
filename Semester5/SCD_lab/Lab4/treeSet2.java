import java.util.Set;
import java.util.TreeSet;
public class treeSet2 {
public static void main(String[] args) {
Set<Integer> s = new TreeSet<>();
s.add(66);
s.add(55);
s.add(88);
s.add(99);
for (int i : s) {
System.out.println(i);
} }}