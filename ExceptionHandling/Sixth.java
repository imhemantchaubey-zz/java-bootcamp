import java.util.*;

class Sixth{
      public static void validate(int age){
            if(age<18){
                  throw new ArithmeticException("You are not eligible to vote...");
            }
            else{
                  System.out.println("You are eligible to vote...");
            }
      }
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your age...");
            int c = scanner.nextInt();
            validate(c);
            scanner.close();
      }
}
//15_Comp_A_Hemant Chaubey