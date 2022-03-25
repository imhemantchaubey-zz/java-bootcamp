class Fifth {
      public static void main(String[] args) {
            try{
                  try{
                        System.out.println("Going to divide by 0");
                        System.out.println(25/0);
                  }
                  catch(Exception e){
                        System.out.println("Cannot divide by 0...Dividing by 1");
                        System.out.println(25/1);
                  }
                  try{
                        int b[] = new int[3];
                        b[5] = 15;
                  }
                  catch(Exception e){
                        System.out.println("Array Out of Index Exception occured...");
                        System.out.println(e);
                  }
            }
            catch(Exception e){
                  System.out.println("Handled the exception...Outer catch block...");
            }
            System.out.println("Normal flow...");
      }      
}
//15_Comp_A_Hemant Chaubey