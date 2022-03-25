import java.util.HashMap;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap<String, Integer> person = new HashMap<String, Integer>();
        person.put("Hemant", 198);
        person.put("Himanchali", 148);
        person.put("Nandani", 456);
        person.put("Namrata", 457);
        System.out.println(person);
        System.out.println(person.get("Hemant"));
        for(String i: person.keySet()){
            System.out.println("Key: " + i + "\n" + "Value: " + person.get(i));
        }
    }
}
