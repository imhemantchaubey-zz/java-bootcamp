class One extends Thread{
      public void run(){
            System.out.println("The thread is running...");
      }
      public static void main(String[] args) {
            One one = new One();
            one.start();
      }
}
//15_Comp_A_Hemant Chaubey