package Project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginSystem extends JFrame {

    private Container c;

    private Font f;

    private JLabel jlabel1, jlabel2;

    private JTextField jtextfield;

    private JPasswordField jpasswordfield;

    private JButton jbutton1, jbutton2, jbutton3;

    private Cursor cursor;
    

    LoginSystem() {

        login();

    }

    public void login() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);

        f = new Font("Arial", Font.BOLD, 18);

        cursor = new Cursor(Cursor.HAND_CURSOR);

        jlabel1 = new JLabel("USERNAME : ");
        jlabel1.setBounds(490, 300, 130, 50);
        jlabel1.setFont(f);
        jlabel1.setCursor(cursor);
        jlabel1.setToolTipText("USERNAME");
        c.add(jlabel1);

        jlabel2 = new JLabel("PASSWORD : ");
        jlabel2.setBounds(490, 380, 130, 50);
        jlabel2.setFont(f);
        jlabel2.setCursor(cursor);
        jlabel2.setToolTipText("PASSWORD");
        c.add(jlabel2);
        
        

        jtextfield = new JTextField();
        jtextfield.setBounds(620, 300, 320, 50);
        jtextfield.setCursor(cursor);
        c.add(jtextfield);

        jpasswordfield = new JPasswordField();
        jpasswordfield.setBounds(620, 380, 320, 50);
        jpasswordfield.setCursor(cursor);
        c.add(jpasswordfield);

        jbutton1 = new JButton("LOGIN");
        jbutton1.setBounds(620, 450, 100, 50);
        jbutton1.setFont(f);
        jbutton1.setCursor(cursor);
        jbutton1.setToolTipText("LOGIN");
        c.add(jbutton1);

        jbutton2 = new JButton("CLEAR");
        jbutton2.setBounds(730, 450, 100, 50);
        jbutton2.setFont(f);
        jbutton2.setCursor(cursor);
        jbutton2.setToolTipText("CLEAR");
        c.add(jbutton2);

        jbutton3 = new JButton("CANCEL");
        jbutton3.setBounds(840, 450, 100, 50);
        jbutton3.setFont(f);
        jbutton3.setCursor(cursor);
        jbutton3.setToolTipText("CANCEL");
        c.add(jbutton3);
        
        Handle handle = new Handle();

        jbutton1.addActionListener(handle);
        jbutton2.addActionListener(handle);
        jbutton3.addActionListener(handle);

    }

    class Handle implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

            if (ae.getSource() == jbutton1) {

                String username = jtextfield.getText();
                String password = jpasswordfield.getText();

                if (username.equals("t") && password.equals("1")) {

                  
                    Student_Registration fr = new Student_Registration();
                    fr.setVisible(true);
                    fr.setBounds(0, 0, 1440, 1000);
                    dispose();
                } else if (username.equals("t") && !password.equals("1")) {

                    JOptionPane.showMessageDialog(null, "Invalid Password");
                } else if (!username.equals("t") && !password.equals("1")) {

                    JOptionPane.showMessageDialog(null, "Invalid Username & Password");
                } else {

                    JOptionPane.showMessageDialog(null, "Invalid Username");
                }

            } else if (ae.getSource() == jbutton2) {

                jtextfield.setText("");
                jpasswordfield.setText("");
            } else {

                System.exit(0);
            }

        }
    }

    public static void main(String[] args) {

        LoginSystem frame = new LoginSystem();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 1440, 1000);
        frame.setTitle("Login System");
        
    }

}
