import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyListener implements ActionListener
{
static boolean isX = true;
public void actionPerformed(ActionEvent e)
{
JButton b = (JButton) e.getSource();
if(isX ) b.setLabel("X");
else b.setLabel("0");
isX = !isX;
b.setEnabled(false);
}
}


class MyFrame42
{
static public void main(String [] rk)
{
JFrame f = new JFrame("Hello Wolrd"); // parameter is accepting title of frame.
f.setSize(500, 700);
//f.setResizable(false);
// by defualat frame is resizebale and wont allow maximization either
f.setLocationRelativeTo(null);
f.getContentPane().setBackground(Color.YELLOW);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //property of close button by defualt its is hide on close Exit_on_close is static memeber 
JPanel p = new JPanel();
JButton b1 = new JButton("Submit");
JButton b2 = new JButton("Reset");
p.add(b1); p.add(b2);
f.add(p, BorderLayout.SOUTH);

//Center Panel
JPanel pc = new JPanel(new GridLayout(3, 3, 10, 10));
MyListener ml = new MyListener();
for(int i=1; i<= 9; i++)
{
JButton b = new JButton();
pc.add(b);
b.setFont(new Font("asfgdf", 2, 50));
b.addActionListener(ml);
}
f.add(pc);

f.setVisible(true);
}
}
