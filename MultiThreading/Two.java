class Two implements Runnable{
      @Override
      public void run() {
            System.out.println("Thread is running...");
      }
      public static void main(String[] args) {
            Two one = new Two();
            Thread t1 = new Thread(one);
            t1.start();
      }
}
//15_Comp_A_Hemant Chaubey