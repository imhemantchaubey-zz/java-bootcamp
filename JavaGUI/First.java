import java.awt.*;

class First extends Frame{

      public void run(){
            Button b = new Button("Click me...!");
            b.setBounds(100, 100, 100, 50);
            add(b);
            setSize(300, 300);
            setLayout(null);
            setVisible(true);
            setTitle("Hemant");
      }
      public static void main(String[] args) {
            First f = new First();
            f.run();
      }
}
//15_Comp_A_Hemant Chaubey