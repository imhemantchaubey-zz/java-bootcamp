class Fifth {
      public static void main(String[] args) {
            int x, y, z, age;
            float weight;
            String name;
            System.out.println("Enter your name: ");
            name = System.console().readLine();
            System.out.println("Name: "+name);
            age = Integer.parseInt(args[0]);
            System.out.println("Age: " + age);
            weight = Float.parseFloat(args[1]);
            System.out.println("Weight: " + weight);
            x = Integer.parseInt(args[2]);
            y = Integer.parseInt(args[3]);
            z = x + y;
            System.out.println("x + y = " + z);
      }
}
