class Second {
      public static void main(String[] args) {
            String first = null;
            try{
                  System.out.println(first.length());
            }
            catch(Exception e){
                  System.out.println(e);
                  System.out.println("Null Pointer Exception occured...");
            }
            finally{
                  System.out.println("Finally block executed successfully...");
            }
      }      
}

//15_Comp_A_Hemant Chaubey