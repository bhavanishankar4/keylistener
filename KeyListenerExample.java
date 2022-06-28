import java.awt.*;
import java.awt.event.*;
class KeyListenerExample extends Frame implements KeyListener 
{
Label I;
TextArea area;
public KeyListenerExample()
{
I=new Label();
I.setBounds(20,50,100,20);
area=new TextArea();
area.setBounds(20,80,300,300);
area.addKeyListener(this);//
add(I);
add(area);
}
public void keyPressed(KeyEvent e)
{
I.setText("Key Pressed");
}
public void keyReleased(KeyEvent e)
{
I.setText ("Key Released");
}
public void keyTyped (KeyEvent e)
{
I.setText("Key Typed");
}
public static void main(String[] args)
{
KeyListenerExample k1=new KeyListenerExample();
k1.setSize( 400,400);
k1.setLayout(null);
k1.setVisible(true);
}
} 

