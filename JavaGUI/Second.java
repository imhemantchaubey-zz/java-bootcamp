import java.awt.*;

class Second {
      void run(){
            Frame frame = new Frame("Details");
            Label label = new Label("Name: ");
            TextField textField = new TextField("Enter your name...");
            Button button = new Button("Submit");

            frame.add(label);
            frame.add(textField);
            frame.add(button);

            label.setBounds(20, 50, 150, 25);
            button.setBounds(20, 110, 150, 25);
            textField.setBounds(20, 80, 150, 25);

            frame.setSize(500, 300);
            frame.setLayout(null);
            frame.setVisible(true);
      }
      public static void main(String[] args) {
            Second s = new Second();
            s.run();
            
      }      
}
//15_Comp_A_Hemant Chaubey