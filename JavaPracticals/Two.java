import java.util.*;

class Two {
      public static void main(String[] args) {
            int a[][] = new int[3][4];
            System.out.println("Enter the elements of the matrix: ");
            Scanner scanner = new Scanner(System.in);
            for(int i=0; i<3; i++){
                  for(int j=0; j<3; j++){
                        a[i][j] = scanner.nextInt();
                  }
            }
            scanner.close();
                  System.out.println("The matrix is:");
                  for(int i=0; i<3; i++){
                  for(int j=0; j<3; j++){
                        System.out.print(a[i][j] + "\t");
                  }
                  System.out.println();
            }
      }
}
//15_Comp_A_Hemant Chaubey