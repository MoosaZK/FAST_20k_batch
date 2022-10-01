import java.util.HashMap;
import java.util.Map;
import java.util.Set;
class map6 {
public static void main(String[] args) {
Map<Integer,String> map=new HashMap();
map.put(1,"Engr. Abdul Rahman");
map.put(2," Dr. Atif Tahir ");
map.put(3," Dr. Abdul Aziz ");
map.put(4," Dr. Fahad Samad ");
Set<Map.Entry<Integer,String>> pair =
map.entrySet();
//Traversing Map
for(Map.Entry m:pair){
System.out.println(m.getKey()+" "+m.getValue());
}
}}