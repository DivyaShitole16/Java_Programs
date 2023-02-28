import java.awt.*;
public class ButtonDemo
{
  public static void main(String[] args)
  {
    Frame f1=new Frame("Studytonight==>Button Demo");
    Button b1=new Button("Press Here");
    b1.setBounds(80,200,80,50);
    f1.add(b1);
    f1.setSize(400,400);
    f1.setLayout(null);
    f1.setVisible(true);
  }
}
