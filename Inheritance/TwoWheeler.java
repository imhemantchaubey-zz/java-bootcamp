class TwoWheeler{
      String model;
      String type;
      int year;
      int a=15;
      double b= 45.56;
      void sound(){
            System.out.println("Vroom Vroom..........");
      }
      void add(){
            System.out.println("Addition: " + a+b);
      }
      void multiply(){
            System.out.println("Multiplication: " + a*b);
      }
      TwoWheeler(String m, String t, int y){
            model = m;
            type = t;
            year = y;
      }
      void getDetails(){
            sound();
            System.out.println("Type: " + type);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
      }
}
//15_Comp_A_Hemant Chaubey