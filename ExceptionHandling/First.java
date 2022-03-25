class First{
      public static void main(String[] args){
            int a = 5;
            int b = 0;
            try{
                  System.out.println(a/b);
            }
            catch(Exception e){
                  System.out.println(e);
                  System.out.println("Arithmetic Exception occured...");
                  System.out.println(a/(b+1));
            }
            finally{
                  System.out.println("Finally block executed successfully...");
            }

      }
}
//15_Comp_A_Hemant Chaubey