import java.util.*;

class Eighth{
      int length, breadth;
      float l, b;
      Eighth(int x, int y){
            length = x;
            breadth = y;
      }
      Eighth(int x){
            length = breadth = x;
      }
      Eighth(float x, float y){
            l = x;
            b = y;
      }
      Eighth(float y){
            l = b = y;
      }
      void getArea(){
            System.out.println("Area: " + length*breadth);
      }
      void printArea(){
            System.out.println("Area: " + l*b);
      }
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an integer: ");
            int a = scanner.nextInt();
            System.out.println("Enter an integer: ");
            int b = scanner.nextInt();
            System.out.println("Enter a float: ");
            float c = scanner.nextFloat();
            System.out.println("Enter a float: ");
            float d = scanner.nextFloat();
            scanner.close();
            Eighth one = new Eighth(a, b);   //Calling the constructor with two int parameters
            Eighth two = new Eighth(c, d);   //Calling the constructor with two float parameters
            Eighth three = new Eighth(b);    //Calling the constructor with one int parameters
            Eighth four = new Eighth(c);     //Calling the constructor with one float parameters
            one.getArea();
            two.printArea();
            three.getArea();
            four.printArea();
      }
}
//15_Comp_A_Hemant Chaubey