package Gui07302;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class RegisterGui07302 extends JFrame {
    protected JButton btnregister = new JButton ("REGISTRASI");
    protected JButton btnback = new JButton("<<BACK");
    protected JLabel labelregister = new JLabel("REGISTER");
    protected JLabel labelnama = new JLabel("NAMA");
    protected JLabel labelnip = new JLabel("NIP");
    protected JLabel labelpassword = new JLabel("PASSWORD");
    protected JLabel labelnotelp = new JLabel("NO TELP");
    protected JLabel labelalamat = new JLabel("ALAMAT");
    protected JTextField fieldnama  = new JTextField();
    protected JTextField fieldnip = new JTextField();
    protected JTextField fieldpassword  = new JTextField();
    protected JTextField fieldnoTelp  = new JTextField();
    protected JTextField fieldalamat  = new JTextField();
    public RegisterGui07302(){
        initComponent();
    }

    void initComponent() {
        setTitle("Registrasi");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320,480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        labelregister.setBounds(120, 50, 70, 30);add(labelregister);
        labelnip.setBounds(35, 100, 70, 25);add(labelnip);
        labelnama.setBounds(35, 160, 70, 25);add(labelnama);
        labelalamat.setBounds(35, 220, 70, 25);add(labelalamat);
        labelpassword.setBounds(35, 280, 70, 25);add(labelpassword);
        labelnotelp.setBounds(35, 340, 70, 25);add(labelnotelp);
        fieldnip.setBounds(130,100,130,25);
        add(fieldnip);
        fieldnama.setBounds(130,160,130,25);
        add(fieldnama);
        fieldalamat.setBounds(130,220,130,25);
        add(fieldalamat);
        fieldpassword.setBounds(130,280,130,25);
        add(fieldpassword);
        fieldnoTelp.setBounds(130,340,130,25);
        add(fieldnoTelp);
        btnregister.setBounds(80,400,150,25);
        btnregister.setBackground (Color.black);
        btnregister. setForeground (Color.white);btnregister.setBorder(null);
        add(btnregister);
        btnback.setBounds(35,20,90,20);
        add(btnback);

        btnback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new LoginGui07302().setVisible(true);
            }
        });
    }
}
