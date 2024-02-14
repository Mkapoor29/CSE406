import java.awt.*;
import javax.swing.*;

// constructor approach is nvr used for creating frames as second window frame can be created if same object is called twice.

class LogIn
{
    public static void main(String[] args) 
    {
        JFrame f = new JFrame("Login Form");
        f.setSize(600, 800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null); 

        f.setLayout(null);
        // f.setBackground(Color.LIGHT_GRAY);
        f.setBackground(null);
        /*
         * get text and set text methods are provided in the menthod or constructor
         */

         JTextField t1 = new JTextField("Username");
        //  f.add(t1, BorderLayout.NORTH);
        f.add(t1); t1.setBounds(100, 50, 400, 40);

         JPasswordField pwd = new JPasswordField(20);
         f.add(pwd); pwd.setBounds(100, 150, 400, 40);

         JButton b1 = new JButton("Submit"); 
        //  types of contrustor for JButton -> no text , text , image , image+text 
        JButton b2 = new JButton("Reset");
        f.add(b1); f.add(b2);
        
        b1.setBounds(125, 250, 160, 40);
        b2.setBounds(320, 250, 160, 40);
        f.setVisible(true);
    }
}
// if we want to design our own components we will have to use ejp
/*
 * Containers -> JFrame, JPaenl
 * Layout of JFrame is border layout
 * Layout of JPanel is flow layout
 */
/* 
border layout
|---------------------------|
|        north              |
|---------------------------|
|  west  | Center  | East   |
|        |         |         |
|--------------------------- |
|            south           |
|----------------------------|

center is dominatment and occupy other regions if not specified
it always remain rectangle

without specying the border layout of every container, what happens they stack over each other in center region and most last added is visible.


setLayout method changes the by default borderlayout
one method is 
setlayout(null) ans then set positions of each 
for every component you have to setBound after setLayout(null)
setBound(x, )
1 -> from leftmost horizontal border in pixels
2-> vertical
3-> width of component
4-> height of component


13 predefined colours are in Color class
setBackground(Color object)
setForeground(Color object)

Color.Magenta wont work because there are 4 pane in swing. Background colour/image is set on content oane
*/
