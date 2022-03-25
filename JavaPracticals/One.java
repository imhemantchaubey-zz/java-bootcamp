import java.util.*;

class One{
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the array size: ");
            int n = scanner.nextInt();
            int a[] = new int[n];
            for(int i=0; i<n; i++){
                  a[i] = scanner.nextInt();
            }
            scanner.close();
            System.out.println("The array: ");
            for(int i=0; i<n; i++){
                  System.out.print(a[i] + "\t");
            }
      }
}

//15_Comp_A_Hemant Chaubey