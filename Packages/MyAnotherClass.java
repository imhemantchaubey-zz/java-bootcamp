package mypack;

class MyAnotherClass{
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
            MyAnotherClass one = new MyAnotherClass();
            one.getName("Hemant Chaubey");
            one.getRollno(15);
      }
}
//15_Comp_A_Hemant Chaubey