import java.util.HashMap;
import java.util.Map;
import java.util.Set;
class map7 {
public static void main(String[] args) {
Map<String, String> s = new HashMap<>();
s.put("MyName" , "Engr. Abdul Rahman");
s.put("LName" , "Mahmood");
s.put("MyName" , "Engr. Abdul Rahman");
s.put("Name" , "Engr. Abdul Rahman");
Set<String> s1 = s.keySet();
for(String k : s1)
System.out.println(k + " " + s.get(k));

}}