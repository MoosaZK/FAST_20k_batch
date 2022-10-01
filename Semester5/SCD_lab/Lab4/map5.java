import java.util.HashMap;
import java.util.Map;
import java.util.Set;
class map5 {
public static void main(String[] args) {
Map<String, String> s = new HashMap<>();
s.put("MyName" , "Engr. Moosa Zafar");
s.put("LName" , "Khan");
Set<String> s1 = s.keySet();
for(String k : s1)
System.out.println(k + " " + s.get(k));

}}