JAVA
====

This is simple code for the students of corejava
import java.awt.*;

import java.awt.event.*;

import java.applet.*;

/*

*/

public class Calculator extends Applet implements ActionListener,

ItemListener

{

String result;

double v1,v2,v3;

TextField in1,in2,rst;

Label val1,val2,r1;

Button addbutton,subbutton,divbutton,multibutton,rootbutton;

public void init()

{

setLayout(new FlowLayout(FlowLayout.LEFT,40,10));

result="";

val1=new Label("Value1:",Label.RIGHT);

in1=new TextField(12);

add(val1);

add(in1);

val2=new Label("Value2:",Label.RIGHT);

in2=new TextField(12);

add(val2);

add(in2);

r1=new Label("Result:",Label.RIGHT);

rst=new TextField(12);

add(r1);

add(rst);

rst.setEditable(false);

addbutton=new Button("+");

add(addbutton);

addbutton.addActionListener(this);

subbutton=new Button("-");

add(subbutton);

subbutton.addActionListener(this);

multibutton=new Button("*");

add(multibutton);

multibutton.addActionListener(this);

divbutton=new Button("/");
add(divbutton);
divbutton.addActionListener(this);
rootbutton=new Button("Sqrt");
add(rootbutton);
rootbutton.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
repaint();
String arg=ae.getActionCommand();
if(arg.equals("+"))
{
v1=Double.parseDouble(in1.getText());
v2=Double.parseDouble(in2.getText());
v3=v1+v2;
result=Double.toString(v3);
rst.setText(result);
}
else if(arg.equals("-"))
{
v1=Double.parseDouble(in1.getText());
v2=Double.parseDouble(in2.getText());
v3=v1-v2;
result=Double.toString(v3);
rst.setText(result);
}
else if(arg.equals("*"))
{
v1=Double.parseDouble(in1.getText());
v2=Double.parseDouble(in2.getText());
v3=v1*v2;
result=Double.toString(v3);
rst.setText(result);
}
else if(arg.equals("/"))
{
v1=Double.parseDouble(in1.getText());
v2=Double.parseDouble(in2.getText());
v3=v1/v2;
result=Double.toString(v3);
rst.setText(result);
}
else if(arg.equals("Sqrt"))
{
v1=Double.parseDouble(in1.getText());
v3=Math.sqrt(v1);
result=Double.toString(v3);
rst.setText(result);
}
}
public void itemStateChanged(ItemEvent ie)
{
repaint();
}
}
