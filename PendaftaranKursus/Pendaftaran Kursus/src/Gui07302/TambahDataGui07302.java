package Gui07302;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TambahDataGui07302 extends JFrame {
    public TambahDataGui07302() { initComponent07302();}
    JLabel jlblnama07302 = new JLabel("NAMA");
    JLabel jlblkelas07302 = new JLabel("KELAS");
    JLabel jlblinduk07302 = new JLabel("NoInduk");

    JTextField jtfnama07302 = new JTextField();
    JTextField jtfkelas07302 = new JTextField();
    JTextField jtfinduk07302 = new JTextField();

    JButton buttambah07302 = new JButton("ADD");
    JButton butback07302 = new JButton("BACK");

    void initComponent07302(){
        setTitle("Tambah Data Siswa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.lightGray);
        setLayout(null);
        setVisible(true);

        butback07302.setBounds(80,280,80,25);
        butback07302.setBackground (Color.yellow);
        butback07302.setFocusPainted(false);
        butback07302.setBorder(null);
        add(butback07302);

        jlblnama07302.setBounds(35, 95, 40, 25);
        add(jlblnama07302);
        jtfnama07302.setBounds(130, 95, 130, 25);
        add(jtfnama07302);

        jlblkelas07302.setBounds(35, 140, 80, 25);
        add(jlblkelas07302);
        jtfkelas07302.setBounds(130, 140, 130, 25);
        add(jtfkelas07302);

        jlblinduk07302.setBounds(35, 185, 80, 25);
        add(jlblinduk07302);
        jtfinduk07302.setBounds(130, 185, 130, 25);
        add(jtfinduk07302);

        buttambah07302.setBounds(80, 250, 140, 25);
        buttambah07302.setBorder(null);
        buttambah07302.setBackground(Color.black);
        buttambah07302.setForeground(Color.yellow);
        buttambah07302.setFocusPainted(false);
        add(buttambah07302);

        buttambah07302.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String nama07302 = jtfnama07302.getText();
                String kelas07302 = jtfkelas07302.getText();
                String induk07302 = jtfinduk07302.getText();
                if(nama07302.length() != 0 && kelas07302.length() != 0 && induk07302.length() != 0){
                    AllObjectController07302.siswa07302.insertData0730(nama07302, kelas07302, induk07302);
                    JOptionPane.showMessageDialog(null, "DATA sudah ditambahkan");
                    dispose();
                    new ViewSiswa07302().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                }
            }
        });

        butback07302.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewSiswa07302 viewsiswa07302 = new ViewSiswa07302();
                viewsiswa07302.setVisible(true);
                dispose();
            }
        });
    }
}
