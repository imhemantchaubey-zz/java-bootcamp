import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pattern to be searched: ");  
        String search = sc.nextLine();
        Pattern pattern = Pattern.compile(search, Pattern.CASE_INSENSITIVE);
        System.out.println("Enter the phrase from which the pattern is to be searched: ");  
        String sample_text = sc.nextLine();
        sc.close();
        Matcher matcher = pattern.matcher(sample_text);
        boolean b = matcher.find();
        if(b)
            System.out.println("Match found...");
        else if(!b)
            System.out.println("Match not found...");

    }
}
