import java.awt.*;
public class Testawt
{
  Testawt()
 {
    Frame fm=new Frame("Frame 1");
    Label lb=new Label("Welcome to java graphics");
    fm.add(lb);
    fm.setSize(300,300);
    fm.setVisible(true);
  }
  public static void main(String args[])
 {
    Testawt ta=new Testawt();
 }
}
