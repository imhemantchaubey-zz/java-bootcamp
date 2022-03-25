class Three{
      public static void main(String[] args) {
            Thread t1 = new Thread(
                  () -> System.out.println("Thread is running...")
            );
            t1.start();
            t1.setName("Hemant's Thread");
            System.out.println("Thread Name: " + t1.getName());
      }
}
//15_Comp_A_Hemant Chaubey