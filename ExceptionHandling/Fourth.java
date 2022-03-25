class Fourth {
      public static void main(String[] args) {
            try{
                  int a[] = new int[5];
                  a[10] = 15/0;
            }
            catch(ArrayIndexOutOfBoundsException e){
                  System.out.println("Array Index Out Of Bounds Exception occured...");
            }
            catch(ArithmeticException e){
                  System.out.println(e);
                  System.out.println("Arithmetic Exception occured...");
            }
            finally{
                  System.out.println("Multiple catch blocks alongwith the finally block successfully executed...");
            }
      }      
}

//15_Comp_A_Hemant Chaubey