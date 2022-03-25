import java.util.ArrayList;
import java.util.Collections;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<String>();
        one.add("Three");
        one.add("Apple");
        one.add("Ball");
        System.out.println(one);
        Collections.sort(one);
        System.out.println(one);
    }
}

