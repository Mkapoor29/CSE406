import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// class MyListener implements ActionListener
// {
//     public void actionPerformed(ActionEvent e)
//     {
//         System.out.println("Button Clicked");

//         if(e.getSource() == b1) // b1 is not defined in this class. It is defined in the main class. Hence it is not accessible here. so either we have to make local class or make button global
//         {
//             System.out.println("Submit Button Clicked");
//         }
//         // else if(e.getSource() == b2)
//         // {
//         //     System.out.println("Reset Button Clicked");
//         // }
//         else if(e.getActionCommand().equalsIgnoreCase("Reset"))
//         {
//             System.out.println("Reset Button Clicked");
//         }
//     }
// }
class LogIn {
    // local class

    public static void main(String[] args) {
        JFrame f = new JFrame("Login Form");
        f.setSize(600, 800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

        f.setLayout(null);
        f.setBackground(Color.LIGHT_GRAY);
        f.setBackground(null);

        JTextField t1 = new JTextField("Username");
        f.add(t1);
        t1.setBounds(100, 50, 400, 40);

        JPasswordField pwd = new JPasswordField(20);
        f.add(pwd);
        pwd.setBounds(100, 150, 400, 40);

        JButton b1 = new JButton("Submit");

        JButton b2 = new JButton("Reset");
        f.add(b1);
        f.add(b2);

        f.setVisible(true);

        class MyListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                // System.out.println("Button Clicked");

                if (e.getSource() == b1) 
                {
                    // System.out.println("Submit Button Clicked");
                    JOptionPane
                            // .showMessageDialog(f, "Username: " + t1.getText() + "\nPassword: " + new String(pwd.getPassword()));
                            .showMessageDialog(null, "Completed"); 
                            // if parent is null, then the dialog will be shown in the center of the screen.
                }
                // else if(e.getSource() == b2)
                // {
                // System.out.println("Reset Button Clicked");
                // }
                else if (e.getActionCommand().equalsIgnoreCase("Reset")) {
                    System.out.println("Reset Button Clicked");
                }
            }
        }
        b1.setBounds(125, 250, 160, 40);
        b1.addActionListener(new MyListener());


        b2.setBounds(320, 250, 160, 40);
        b1.addActionListener(new MyListener());

    }
}

/*
 * JVM will automatically identify any event happedning and genertaes
 * corresponding events's object and pass it to the listener.
 * Types of listeners:
 * 1. ActionListener
 * 2. MouseListener
 * 3. MouseMotionListener
 * 4. KeyListener -> keyPressed, keyReleased, keyTyped(this method works only
 * for printable characters. Keys like shift, ctrl, alt,arrows etc are not
 * printable)
 * 5. FocusListener
 * 6. WindowListener
 * 7. ItemListener
 * 8. TextListener
 * these are interfaces and we have to implement these interfaces method's in
 * our class.
 * 
 * 
 * There was a problem. Since the interferaces were abstract all methods were
 * abstract and we had to implement all the methods of the interface in our
 * class.
 * Adapter classes are there for every listener interfaxe having more than one
 * method.
 * Adapter classes are the classes which implements the listener interface and
 * provides the default implementation of all the methods of the listener
 * interface.
 * Adapter classes covert the abstract methods of the listener interface into
 * concrete methods.
 * Adapter classe provide blank implementation of all the methods of the
 * listener interface.
 * Adapter class are abstract classes.
 * 
 * 
 * Abstract class has everything that nirmal class has except object creation/
 * instanstiation.
 * Abstract class can have abstract methods and concrete methods.
 * Abstract class can have constructor.
 * Abstract class can have data members. static and non static.
 * Abstract class can have non abstract methods but vice cerca is not true.
 * 
 * Consider using abstract classes if any of these statements apply to your
 * situation:
 * You want to share code among several closely related classes.
 * You expect that classes that extend your abstract class have many common
 * methods or fields, or require access modifiers other than public (such as
 * protected and private).
 * You want to declare non-static or non-final fields. This enables you to
 * define methods that can access and modify the state of the object to which
 * they belong.
 * When we create an object of a class, the class is responsible for every
 * thing.
 * when inherit a class, the subclass is responsible for everything and has to
 * overwrite methods as per need.
 * 
 * Event Handling java.awt.event package
 * Event
 * Event Source
 * Event Listener
 * interfaces => adapter classes
 * method hiding and overriding
 * difference between static method of class and static method of interfeace
 * Constructor of a class can be overlaoaded but not overridden. and inheritted
 * 
 * While overriding three things can be changes: access modifier(not decreasig
 * the modifier), return type, and exception thrown using throws keyword(It can
 * be canged or reduce the exception scope but cant be introudced in child
 * methid).
 * Static method can not be overridden. It can be hidden. meaning when a same
 * static method is defined in child class, it hides the parent class method.
 * 
 * main()
 * {
 * A a = new B();
 * // * compile time binding is done for A and run time polymorphism/dynamic
 * method dispatch is done for B
 * a.test();
 * }
 * A
 * {
 * // * void test(print a) removing this gives error as Compile time binding
 * will check for the method in the parent class and it is not there.
 * }
 * B extends A
 * {
 * 
 * @override
 * void test(print b)
 * }
 * static method test() in A and B will print A
 * static method does not have dynamic method dispatch and is resolved at
 * compile time.
 * two methods cant have same name unless they are overloaded or overridden.
 * hence static test() in A and test() B isnt possible.
 * 
 * anonymous class, lambda expression, local class, nested class, normal class
 * 
 * 
 * funactional interface has effectively only one abstract method. and lamba
 * expression is used to implement the abstract method of the functional
 * interface.
 * 
 * 
 * getSoirce is a method of the event object which returns the reference of the
 * object which has generated the event.
 * getActionCommand is a method of the event object which returns the label of
 * the button which has generated the event.or string assosiated with the event
 * sorce.
 * Local class's object can be created only after the class is defined.
 */
