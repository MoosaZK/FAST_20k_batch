import java.util.HashSet;
import java.util.Set;
public class hashSet {
public static void main(String[] args) {
Set<Integer> s = new HashSet<>();
s.add(66);
s.add(55);
s.add(88);
s.add(99);
for (int i : s) {
System.out.println(i);
} }}