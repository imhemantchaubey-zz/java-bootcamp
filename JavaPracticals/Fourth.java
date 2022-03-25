import java.io.*;

class Fourth {
      public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your name: ");
            String name = br.readLine();
            System.out.println("Enter your age: ");
            String str1 = br.readLine();
            int age = Integer.parseInt(str1);
            System.out.println("Enter your weight: ");
            String str2 = br.readLine();
            float weight = Float.parseFloat(str2);
            br.close();
            System.out.println("Details you entered: ");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Weight: " + weight);
      }
}
