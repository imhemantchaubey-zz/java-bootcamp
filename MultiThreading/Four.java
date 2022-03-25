import java.util.*;

class Four extends Thread{
      public void run(){
            System.out.println("The thread is running...");
            System.out.println("5*5="+5*5);
      }
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Four one = new Four();
            Four two = new Four();
            one.start();
            System.out.println("Enter the name for the thread: ");
            String x = sc.nextLine();
            one.setName(x);
            System.out.println("Thread name: " + one.getName());
            two.start();
            System.out.println("Enter the name for the thread: ");
            String y = sc.nextLine();
            two.setName(y);
            System.out.println("Thread name: " + two.getName());
            sc.close();
      }
}
//15_Comp_A_Hemant Chaubey