import java.awt.*;
public class CheckboxDemo1
{
  CheckboxDemo1()
  {
    Frame checkB_f=new Frame("studytonight==>CheckboxExample");
    Checkbox Ckbox1=new Checkbox("Yes",true);
    Ckbox1.setBounds(100,100,60,60);
    Checkbox Ckbox2=new Checkbox("No");
    Ckbox1.setBounds(100,150,60,60);
    checkB_f.add(Ckbox1);
     checkB_f.add(Ckbox2);
  }
public static void main(String args [])
      {
              new CheckboxDemo1();
      }
}
