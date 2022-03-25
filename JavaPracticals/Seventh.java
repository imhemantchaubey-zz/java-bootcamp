class Seventh {
      private String name;
      private int age;
      Seventh(String n, int a){
            name = n;
            age = a;
      }
      void getDetails(){
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
      }
      public static void main(String[] args) {
            Seventh stud1 = new Seventh("Hemant Chaubey", 19);
            stud1.getDetails();
      }
}

//15_Comp_A_Hemant Chaubey