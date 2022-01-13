package Gui07302;
import Controller07302.AllObjectController07302;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AdminGui07302 extends JFrame {
    int id;
    String password, notelp;
    protected JButton btnback = new JButton("<<BACK");
    protected JButton btnadddata = new JButton("ADD DATA");
    protected JButton btndata = new JButton("DATA");
    protected JButton btnubahpass = new JButton("UBAH PASSWORD");
    protected JButton btnubahnotelp = new JButton("UBAH NO TELP");
    protected JTextField fieldnoTelp  = new JTextField();
    protected JTextField fieldpass  = new JTextField();
    public AdminGui07302(int cek) {
        initComponent(cek);
    }
    public AdminGui07302() {}
    void initComponent(final int cek) {
        setTitle("ADMIN");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(480,480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        btnback.setBounds(35,20,90,20);
        add(btnback);
        btnadddata.setBounds(100,100,130,130);
        btnadddata.setBackground (Color.black);
        btnadddata.setForeground (Color.white);btnadddata.setBorder(null);
        add(btnadddata);
        btnubahpass.setBounds(100,200,130,130);
        btnubahpass.setBackground (Color.black);
        btnubahpass.setForeground (Color.white);btnubahpass.setBorder(null);
        add(btnubahpass);
        btnubahpass.setBounds(100,250,130,130);
        btnubahpass.setBackground (Color.black);
        btnubahpass.setForeground (Color.white);btnubahpass.setBorder(null);
        add(btnubahpass);
        btndata.setBounds(250,100,130,130);
        btndata.setBackground (Color.black);
        btndata.setForeground (Color.white);btndata.setBorder(null);
        add(btndata);
        btnubahnotelp.setBounds(250,250,130,130);
        btnubahnotelp.setBackground (Color.black);
        btnubahnotelp.setForeground (Color.white);btnubahnotelp.setBorder(null);
        add(btnubahnotelp);

        btnadddata.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new AddDataGui07302().setVisible(true);
            }
        });

        btndata.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new DataGui07302().setVisible(true);
            }
        });

        btnback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new LoginGui07302().setVisible(true);
            }
        });

        btnubahpass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String inputpass = JOptionPane.showInputDialog("Masukkan Password Baru");
                    if(inputpass.length() >0){
                        AllObjectController07302.admincontroller.updatePassword(inputpass, cek);
                        JOptionPane.showMessageDialog(null, "Berhasil Ubah Password");
                        fieldpass.setText(inputpass);
                    }else{
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });

        btnubahnotelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String inputnotelp = JOptionPane.showInputDialog("Masukkan NoTelp Baru");
                    if(inputnotelp.length() >0){
                        AllObjectController07302.admincontroller.updateNoTelp(inputnotelp, cek);
                        JOptionPane.showMessageDialog(null, "Berhasil Ubah NoTelp");
                        fieldnoTelp.setText(inputnotelp);
                    }else{
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });
    }
}
