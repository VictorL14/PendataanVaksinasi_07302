package Gui07302;
import Controller07302.AllObjectController07302;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AddDataGui07302 extends JFrame{
    protected JButton btnadd = new JButton("ADD");
    protected JButton btnback = new JButton("Back");
    protected JLabel labeladd = new JLabel("TAMBAH DATA");
    protected JLabel labelnama = new JLabel("NAMA");
    protected JLabel labelnik = new JLabel("NIK");
    protected JLabel labeldosis = new JLabel("DOSIS");
    protected JLabel labelnotelp = new JLabel("NO TELP");
    protected JLabel labelalamat = new JLabel("ALAMAT");
    protected JLabel labelvaksin = new JLabel("JENIS VAKSIN");
    protected JTextField fieldnama  = new JTextField();
    protected JTextField fieldnik = new JTextField();
    protected JTextField fielddosis  = new JTextField();
    protected JTextField fieldnoTelp  = new JTextField();
    protected JTextField fieldalamat  = new JTextField();
    protected JTextField fieldvaksin  = new JTextField();
    public AddDataGui07302(){
        initComponent();
    }

    void initComponent() {
        setTitle("TAMBAH DATA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320,480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        labeladd.setBounds(120, 20, 90, 30);add(labeladd);
        labelnik.setBounds(35, 70, 70, 25);add(labelnik);
        labelnama.setBounds(35, 120, 70, 25);add(labelnama);
        labelalamat.setBounds(35, 170, 90, 25);add(labelalamat);
        labelnotelp.setBounds(35, 220, 90, 25);add(labelnotelp);
        labeldosis.setBounds(35, 270, 90, 25);add(labeldosis);
        labelvaksin.setBounds(35, 320, 90, 25);add(labelvaksin);
        fieldnik.setBounds(130,70,130,25);
        add(fieldnik);
        fieldnama.setBounds(130,120,130,25);
        add(fieldnama);
        fieldalamat.setBounds(130,170,130,25);
        add(fieldalamat);
        fieldnoTelp.setBounds(130,220,130,25);
        add(fieldnoTelp);
        fielddosis.setBounds(130,270,130,25);
        add(fielddosis);
        fieldvaksin.setBounds(130,320,130,25);
        add(fieldvaksin);

        btnback.setBounds(35, 25,40,25);
        add(btnback);
        btnadd.setBounds(110,380,150,25);
        btnadd.setBackground (Color.black);
        btnadd. setForeground (Color.white);btnadd.setBorder(null);
        add(btnadd);

        btnback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdminGui07302 fitur =new AdminGui07302();
                fitur.setVisible(true);
                dispose();
            }
        });

        btnadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nik = fieldnik.getText();
                String nama = fieldnama.getText();
                String alamat = fieldalamat.getText();
                String notelp = fieldnoTelp.getText();
                String dosis = fielddosis.getText();
                String vaksin = fieldvaksin.getText();
                if(nik.length() != 0 && nama.length() != 0 && alamat.length() != 0 && notelp.length() != 0 && dosis.length() != 0 && vaksin.length() != 0){
                    AllObjectController07302.pendudukcontroller.insertData(nik, nama, alamat, notelp, dosis, vaksin);
                    JOptionPane.showMessageDialog(null, "DATA sudah ditambahkan");
                    dispose();
                    new DataGui07302().setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                }
            }
        });
    }
}
