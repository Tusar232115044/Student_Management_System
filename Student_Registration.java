
package Project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Student_Registration extends JFrame {

    private Container b;

    private JLabel jl1, jl2, jl3, jl4, jl5, jl6, jl7, jl8, jl9, jl10;

    private JTextField jt1, jt2, jt3, jt4, jt5, jt6, jt7, jt8, jt9;

    private Font f;

    private JButton jb1, jb2, jb3, jb4,jb5;

    private JTable table;

    private DefaultTableModel model;

    private JScrollPane scroll;

    private String[] columns = {"Name", "Roll/Id", "Department Name", "Batch", "Section", "Phone No.", "Gender", "Date of Birth", "Email"};

    private String[] rows = new String[9];

    private Cursor s;

    Student_Registration() {
        
        registration();
    }

    public void registration() {
        b = this.getContentPane();
        b.setLayout(null);
        b.setBackground(Color.orange);

        f = new Font("Arial", Font.BOLD, 15);

        s = new Cursor(Cursor.HAND_CURSOR);

        jl1 = new JLabel("Student Registration");
        jl1.setBounds(650, 10, 200, 50);
        jl1.setFont(f);
        jl1.setCursor(s);
        b.add(jl1);

        jl2 = new JLabel("Name :");
        jl2.setBounds(30, 80, 50, 50);
        jl2.setFont(f);
        jl2.setCursor(s);
        b.add(jl2);

        jl3 = new JLabel("Roll/Id :");
        jl3.setBounds(480, 80, 60, 50);
        jl3.setFont(f);
        jl3.setCursor(s);
        b.add(jl3);

        jl4 = new JLabel("Department Name :");
        jl4.setBounds(790, 80, 150, 50);
        jl4.setFont(f);
        jl4.setCursor(s);
        b.add(jl4);

        jl5 = new JLabel("Batch :");
        jl5.setBounds(30, 150, 50, 50);
        jl5.setFont(f);
        jl5.setCursor(s);
        b.add(jl5);

        jl6 = new JLabel("Section : ");
        jl6.setBounds(480, 150, 100, 50);
        jl6.setFont(f);
        jl6.setCursor(s);
        b.add(jl6);

        jl7 = new JLabel("Phone No. : ");
        jl7.setBounds(790, 150, 150, 50);
        jl7.setFont(f);
        jl7.setCursor(s);
        b.add(jl7);

        jl8 = new JLabel("Gender : ");
        jl8.setBounds(30, 220, 120, 50);
        jl8.setFont(f);
        jl8.setCursor(s);
        b.add(jl8);

        jl9 = new JLabel("Date of Birth:");;
        jl9.setBounds(450, 220, 130, 50);
        jl9.setFont(f);
        jl9.setCursor(s);
        b.add(jl9);

        jl10 = new JLabel("Email : ");
        jl10.setBounds(790, 220, 100, 50);
        jl10.setFont(f);
        jl10.setCursor(s);
        b.add(jl10);

        jt1 = new JTextField();
        jt1.setBounds(90, 80, 350, 50);
        jt1.setBackground(Color.white);
        jt1.setCursor(s);
        jt1.setToolTipText("Name");
        jt1.setFont(f);
        jt1.setHorizontalAlignment(JTextField.CENTER);
        b.add(jt1);

        jt2 = new JTextField();
        jt2.setBounds(550, 80, 200, 50);
        jt2.setBackground(Color.white);
        jt2.setCursor(s);
        jt2.setToolTipText("Roll/Id");
        jt2.setFont(f);
        jt2.setHorizontalAlignment(JTextField.CENTER);
        b.add(jt2);

        jt3 = new JTextField();
        jt3.setBounds(950, 80, 350, 50);
        jt3.setBackground(Color.white);
        jt3.setCursor(s);
        jt3.setToolTipText("Department Name");
        jt3.setFont(f);
        jt3.setHorizontalAlignment(JTextField.CENTER);
        b.add(jt3);

        jt4 = new JTextField();
        jt4.setBounds(90, 150, 100, 50);
        jt4.setBackground(Color.white);
        jt4.setCursor(s);
        jt4.setToolTipText("Batch");
        jt4.setFont(f);
        jt4.setHorizontalAlignment(JTextField.CENTER);
        b.add(jt4);

        jt5 = new JTextField();
        jt5.setBounds(550, 150, 100, 50);
        jt5.setBackground(Color.white);
        jt5.setCursor(s);
        jt5.setToolTipText("Section");
        jt5.setFont(f);
        jt5.setHorizontalAlignment(JTextField.CENTER);
        b.add(jt5);

        jt6 = new JTextField();
        jt6.setBounds(950, 150, 200, 50);
        jt6.setBackground(Color.white);
        jt6.setCursor(s);
        jt6.setToolTipText("Phone No.");
        jt6.setFont(f);
        jt6.setHorizontalAlignment(JTextField.CENTER);
        b.add(jt6);

        jt7 = new JTextField();
        jt7.setBounds(90, 220, 100, 50);
        jt7.setBackground(Color.white);
        jt7.setCursor(s);
        jt7.setToolTipText("Gender");
        jt7.setFont(f);
        jt7.setHorizontalAlignment(JTextField.CENTER);
        b.add(jt7);

        jt8 = new JTextField();
        jt8.setBounds(550, 220, 130, 50);
        jt8.setBackground(Color.white);
        jt8.setCursor(s);
        jt8.setToolTipText("Date of Birth");
        jt8.setFont(f);
        jt8.setHorizontalAlignment(JTextField.CENTER);
        b.add(jt8);

        jt9 = new JTextField();
        jt9.setBounds(950, 220, 350, 50);
        jt9.setBackground(Color.white);
        jt9.setCursor(s);
        jt9.setToolTipText("Email");
        jt9.setFont(f);
        jt9.setHorizontalAlignment(JTextField.CENTER);
        b.add(jt9);

        jb1 = new JButton("Add");
        jb1.setBounds(300, 310, 150, 50);
        jb1.setForeground(Color.black);
        jb1.setFont(f);
        jb1.setCursor(s);
        b.add(jb1);

        jb2 = new JButton("Update");
        jb2.setBounds(470, 310, 150, 50);
        jb2.setForeground(Color.black);
        jb2.setFont(f);
        jb2.setCursor(s);
        b.add(jb2);

        jb3 = new JButton("Delete");
        jb3.setBounds(640, 310, 150, 50);
        jb3.setForeground(Color.black);
        jb3.setFont(f);
        jb3.setCursor(s);
        b.add(jb3);

        jb4 = new JButton("Clear");
        jb4.setBounds(810, 310, 150, 50);
        jb4.setForeground(Color.black);
        jb4.setFont(f);
        jb4.setCursor(s);
        b.add(jb4);
        
        jb5 = new JButton("Search");
        jb5.setBounds(990, 310, 150, 50);
        jb5.setForeground(Color.black);
        jb5.setFont(f);
        jb5.setCursor(s);
        b.add(jb5);

        table = new JTable();

        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        table.setFont(f);
        table.setCursor(s);
        table.setSelectionBackground(Color.orange);
        table.setBackground(Color.white);
        table.setFont(f);
        table.setRowHeight(30);

        scroll = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(1, 400, 1450, 400);
        scroll.setCursor(s);
        b.add(scroll);

        Hand hand = new Hand();

        jb1.addActionListener(hand);
        jb2.addActionListener(hand);
        jb3.addActionListener(hand);
        jb4.addActionListener(hand);
        jb5.addActionListener(hand);

        table.addMouseListener( new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent me) {

                int numberofrow = table.getSelectedRow();

                String name = model.getValueAt(numberofrow, 0).toString();
                String id = model.getValueAt(numberofrow, 1).toString();
                String department_Name = model.getValueAt(numberofrow, 2).toString();
                String batch = model.getValueAt(numberofrow, 3).toString();
                String section = model.getValueAt(numberofrow, 4).toString();
                String phoneno = model.getValueAt(numberofrow, 5).toString();
                String gender = model.getValueAt(numberofrow, 6).toString();
                String dateofbirth = model.getValueAt(numberofrow, 7).toString();
                String email = model.getValueAt(numberofrow, 8).toString();

                jt1.setText(name);
                jt2.setText(id);
                jt3.setText(department_Name);
                jt4.setText(batch);
                jt5.setText(section);
                jt6.setText(phoneno);
                jt7.setText(gender);
                jt8.setText(dateofbirth);
                jt9.setText(email);

            }

        });

    }

    class Hand implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == jb1) {

                rows[0] = jt1.getText();
                rows[1] = jt2.getText();
                rows[2] = jt3.getText();
                rows[3] = jt4.getText();
                rows[4] = jt5.getText();
                rows[5] = jt6.getText();
                rows[6] = jt7.getText();
                rows[7] = jt8.getText();
                rows[8] = jt9.getText();

                model.addRow(rows);

            } else if (e.getSource() == jb4) {

                jt1.setText("");
                jt2.setText("");
                jt3.setText("");
                jt4.setText("");
                jt5.setText("");
                jt6.setText("");
                jt7.setText("");
                jt8.setText("");
                jt9.setText("");

            } else if (e.getSource() == jb3) {

                int numberofrow = table.getSelectedRow();

                if (numberofrow >= 0) {

                    model.removeRow(numberofrow);
                } else {

                    JOptionPane.showMessageDialog(null, "No row has been selected");
                }
            } else if (e.getSource() == jb2) {

                int numberofrow = table.getSelectedRow();

                String name = jt1.getText();
                String id = jt2.getText();
                String department_Name = jt3.getText();
                String batch = jt4.getText();
                String section = jt5.getText();
                String phoneno = jt6.getText();
                String gender = jt7.getText();
                String dateofbirth = jt8.getText();
                String email = jt9.getText();

                model.setValueAt(name, numberofrow, 0);
                model.setValueAt(id, numberofrow, 1);
                model.setValueAt(department_Name, numberofrow, 2);
                model.setValueAt(batch, numberofrow, 3);
                model.setValueAt(section, numberofrow, 4);
                model.setValueAt(phoneno, numberofrow, 5);
                model.setValueAt(gender, numberofrow, 6);
                model.setValueAt(dateofbirth, numberofrow, 7);
                model.setValueAt(email, numberofrow, 8);

            }
            
            else if(e.getSource() == jb5){
                 String searchTerm = JOptionPane.showInputDialog(null, "Enter Name or Roll/Id or Department or batch or Section or Phone to Search:");

                if (searchTerm != null && !searchTerm.trim().isEmpty()) {
                    boolean found = false;

                    for (int i = 0; i < model.getRowCount(); i++) {
                        String name = model.getValueAt(i, 0).toString();
                        String rollId = model.getValueAt(i, 1).toString();
                        String department = model.getValueAt(i, 2).toString();
                        String batch = model.getValueAt(i, 3).toString();
                        String section = model.getValueAt(i, 4).toString();
                        String phone = model.getValueAt(i, 5).toString();

                        if (name.equalsIgnoreCase(searchTerm) || rollId.equalsIgnoreCase(searchTerm) || department.equalsIgnoreCase(searchTerm) || batch.equalsIgnoreCase(searchTerm) || section.equalsIgnoreCase(searchTerm) || phone.equalsIgnoreCase(searchTerm)) {
                            table.setRowSelectionInterval(i, i);
                            table.scrollRectToVisible(table.getCellRect(i, 0, true));
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        JOptionPane.showMessageDialog(null, "No match found");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        Student_Registration fr = new Student_Registration();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setTitle("New Frame");
        

    }

}

