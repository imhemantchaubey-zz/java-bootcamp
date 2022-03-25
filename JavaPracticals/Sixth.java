class Sixth {
      private String name;
      private int rollno;
      
      void getName(String n){
            name = n;
            System.out.println(name);
      }
      void getRollno(int r){
            rollno = r;
            System.out.println(rollno);
      }
      public static void main(String[] args) {
            Sixth student1 = new Sixth();
            student1.getName("Hemant Chaubey");
            student1.getRollno(15);
      }
}
//15_Comp_A_Hemant Chaubey