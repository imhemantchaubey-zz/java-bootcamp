import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class StringsJava{
      public static void main(String[] args) throws IOException{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String name = br.readLine();
            String dep = br.readLine();
            String test = br.readLine();
            String substrtest1 = test.substring(5);
            String substrtest2 = test.substring(5, 8);
            br.close();
            System.out.println("Substring from index 5 of string 'test': " + substrtest1);
            System.out.println("Substring from index 5 to index 8 of string 'test': " + substrtest2);
            System.out.println("String 'name' in the uppercase: " + name.toUpperCase());
            System.out.println("String 'dep' in the lowercase: " + dep.toLowerCase());
            System.out.println("The length of the string 'name': " + name.length());
            System.out.println("The length of the string 'dep': " + dep.length());
            System.out.println("Comparison of the string 'name' and 'Hemant': " + name.compareTo("Hemant"));
            System.out.println("Comparison of the string 'dep' with 'dep': " + dep.compareTo(dep));
            System.out.println("Comparison of the string 'name' with 'dep': " + name.compareTo(dep));
            System.out.println("Comparison of the string 'dep' with 'name' ignoring the uppercase or lowercase: " + dep.compareToIgnoreCase(name));
            System.out.println("'dep' contains 'COMP': " + dep.contains("COMP"));
            System.out.println("'name' contains 'Hemant': " + name.contains("Hemant"));
            System.out.println("The index of 'H' in String 'name': " + name.indexOf('H'));
            System.out.println("The index of 'a' after n positions in String 'name': " + name.indexOf('a', 7));
            System.out.println("The trimmed string 'name' in which all white spaces are trimmed: " + name.trim());
            System.out.println("The character at 5th position of the string 'name': " + name.charAt(5));
      }
}
//15_Comp_A_Hemant Chaubey