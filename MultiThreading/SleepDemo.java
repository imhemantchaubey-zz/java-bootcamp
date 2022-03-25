class SleepDemo extends Thread{
   public void run(){
      for(int i=0; i<6; i++){
         try{
            if(i==4 || i==2){
               Thread.sleep(5555, 89);
            }
            else if(i==3){
               Thread.sleep(50);
            }
         }
         catch(InterruptedException e){
            System.out.println(e);
         }
         System.out.println("Child Thread " + i + " running...");
      }
   }
   public static void main(String args[]){
      SleepDemo one = new SleepDemo();
      SleepDemo two = new SleepDemo();
      one.start();
      two.start();
   }
}
//15_Comp_A_Hemant Chaubey