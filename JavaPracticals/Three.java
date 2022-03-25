import java.util.*;

class Three {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = sc.next();
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            System.out.println("Enter your weight: ");
            float weight = sc.nextFloat();
            sc.close();
            System.out.println("Details you entered: ");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Weight: " + weight);
      }
}
