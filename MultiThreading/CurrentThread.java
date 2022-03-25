class CurrentThread extends Thread{
   @Override
   public void run(){
      for(int i=0; i<6; i++){
         Thread.currentThread().setName("Hemant's Thread" + i);
         System.out.println(Thread.currentThread().getName());
      }
   }
   public static void main(String args[]){
      CurrentThread one = new CurrentThread();
      CurrentThread two = new CurrentThread();
      one.start();
      two.start();
   }
}
//15_Comp_A_Hemant Chaubey