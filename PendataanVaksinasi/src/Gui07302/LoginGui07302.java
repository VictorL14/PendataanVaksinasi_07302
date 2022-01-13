package Gui07302;
import Controller07302.AllObjectController07302;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LoginGui07302 extends JFrame {
    protected JButton btnlogin = new JButton("LOGIN");
    protected JButton btnregister = new JButton ("REGISTRASI ADMIN");
    protected JLabel labelnip = new JLabel("NIP");
    protected JLabel labelpassword = new JLabel("PASSWORD");
    protected JTextField fieldnip = new JTextField();
    protected JPasswordField fieldpassword  = new JPasswordField();
    public LoginGui07302(){
        initComponent();
    }
    void initComponent() {
        setTitle("Login Admin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320,480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.yellow);
        setLayout(null);
        setVisible(true);
        labelnip.setBounds (35,250,40,25);
        add(labelnip);
        fieldnip.setBounds(130,250,130,25);
        add(fieldnip);
        labelpassword.setBounds (35, 290,80, 25);
        add(labelpassword);
        fieldpassword.setBounds (130, 290, 130,25);
        add(fieldpassword);
        btnlogin.setBounds (110,350,100,25);
        btnlogin.setBackground (Color.black);
        btnlogin. setForeground (Color.white);btnlogin.setBorder(null);
        add(btnlogin);

        btnregister.setBounds(80,400,150,25);
        btnregister.setBackground (Color.black);
        btnregister. setForeground (Color.white);btnregister.setBorder(null);
        add(btnregister);
        btnregister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new RegisterGui07302().setVisible(true);
            }
        });


        btnlogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                String nip = fieldnip.getText();
                String password = fieldpassword.getText();
                int cek = AllObjectController07302.admincontroller.cekLogin(nip, password);
                if (cek>0){
                    dispose();
                    AdminGui07302 adminGui = new AdminGui07302(cek);
                    adminGui.setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null, "GAGAL LOGIN");
                }
            }
        });
    }
}
