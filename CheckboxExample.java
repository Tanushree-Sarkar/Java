import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
//<applet code=CheckboxExample.class width=200 height=200></applet>
public class CheckboxExample extends Applet implements ItemListener
{
    Checkbox chk1,chk2,chk3;
    TextField tf;
    public void init()
    {
        tf=new TextField(10);
        add(tf);
        chk1=new Checkbox("Science");
        chk2=new Checkbox("Arts");
        chk3=new Checkbox("Commerce");
        add(chk1);
        chk1.addItemListener(this);
        add(chk2);
        chk2.addItemListener(this);
        add(chk3);
        chk3.addItemListener(this);
    }
}
public void itemStateChanged(ItemEvent e)
{
    if(e.getItemSelectable()==chk1)
    {
        if(chk1.getState()==true)
        tf.setText("Science");
        else
        tf.setText("");
    }
    if(e.getItemSelectable()==chk1)
    {
        if(chk1.getState()==true)
        tf.setText("Arts");
        else
        tf.setText("");
    }
    if(e.getItemSelectable()==chk1)
    {
        if(chk1.getState()==true)
        tf.setText("Commerce");
        else
        tf.setText("");
    }
}