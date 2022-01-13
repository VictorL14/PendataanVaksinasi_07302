package Gui07302;
import Entity07302.DataSiswa07302;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditDataGui07302 extends JFrame{
    int id07302;
    String nama07302, kelas07302, induk07302;
    JButton butback07302 = new JButton("BACK");
    JButton butubahnama07302 = new JButton("EDIT");
    JButton butubahkelas07302 = new JButton("EDIT");
    JButton butubahinduk07302 = new JButton("EDIT");

    JLabel jlbnama07302 = new JLabel("NAMA");
    JLabel jlbkelas07302 = new JLabel("KELAS");
    JLabel jlbinduk07302 = new JLabel("NoInduk");

    JTextField fieldnama07302 = new JTextField();
    JTextField fieldkelas07302 = new JTextField();
    JTextField fieldinduk07302 = new JTextField();

    public EditDataGui07302(int cek07302){
        initComponent07302(cek07302);
    }

    void initComponent07302(final int cek07302){
        for (DataSiswa07302 siswaentity : AllObjectController07302.siswa07302.getByid07302(cek07302)) {
            this.id07302 = siswaentity.getId();
            this.nama07302 = siswaentity.getNama();
            this.kelas07302 = siswaentity.getKelas();
            this.induk07302 = siswaentity.getInduk();
        }

        setTitle("EDIT DATA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(380,480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null); setVisible(true);

        butback07302.setBounds(25,20,80,25);
        butback07302.setBackground (Color.yellow);
        butback07302.setFocusPainted(false);
        butback07302.setBorder(null);
        add(butback07302);

        jlbnama07302.setBounds (25,50,40,25);
        add(jlbnama07302);

        fieldnama07302.setBounds (120,50,100,25);
        fieldnama07302.setText(nama07302);
        fieldnama07302.setEditable(false);
        add(fieldnama07302);

        jlbkelas07302.setBounds(25,90,40,25);
        add(jlbkelas07302);

        fieldkelas07302.setBounds(120,90,100,25);
        fieldkelas07302.setText(kelas07302);
        fieldkelas07302.setEditable(false);
        add(fieldkelas07302);

        jlbinduk07302.setBounds(25,135,80,25);
        add(jlbinduk07302);

        fieldinduk07302.setBounds (120,135,100,25);
        fieldinduk07302.setText(induk07302);
        fieldinduk07302.setEditable(false);
        add(fieldinduk07302);

        butubahnama07302.setBounds(245, 50, 80, 25);
        add(butubahnama07302);
        butubahkelas07302.setBounds(245,90,80,25);
        add(butubahkelas07302);
        butubahinduk07302.setBounds(245,135,80,25);
        add(butubahinduk07302);

        butback07302.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewSiswa07302 viewsiswa07302 = new ViewSiswa07302();
                viewsiswa07302.setVisible(true);
                dispose();
            }
        });

        butubahnama07302.addActionListener(new ActionListener() {
            @Override
            public void
            actionPerformed(ActionEvent e) {
                try{
                    String inputnama07302 = JOptionPane.showInputDialog("Masukkan Nama Baru");
                    if(inputnama07302.length() >0){
                        AllObjectController07302.siswa07302.updateData07302(1, inputnama07302,cek07302);
                        JOptionPane.showMessageDialog(null,"Berhasil Update");
                        fieldnama07302.setText(inputnama07302);
                    }else {
                        JOptionPane.showMessageDialog(null,"Data Kosong");
                    }
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Tidak Jadi");
                }
            }
        });

        butubahkelas07302.addActionListener(new ActionListener() {
            @Override
            public void
            actionPerformed(ActionEvent e) {
                try{
                    String inputkelas07302 = JOptionPane.showInputDialog("Masukkan Kelas Baru");
                    if(inputkelas07302.length() >0){
                        AllObjectController07302.siswa07302.updateData07302(2, inputkelas07302,cek07302);
                        JOptionPane.showMessageDialog(null,"Berhasil Update");
                        fieldkelas07302.setText(inputkelas07302);
                    }else {
                        JOptionPane.showMessageDialog(null,"Data Kosong");
                    }
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Tidak Jadi");
                }
            }
        });

        butubahinduk07302.addActionListener(new ActionListener() {
            @Override
            public void
            actionPerformed(ActionEvent e) {
                try{
                    String inputinduk07302 = JOptionPane.showInputDialog("Masukkan NoInduk Baru");
                    if(inputinduk07302.length() >0){
                        AllObjectController07302.siswa07302.updateData07302(3, inputinduk07302,cek07302);
                        JOptionPane.showMessageDialog(null,"Berhasil Update");
                        fieldinduk07302.setText(inputinduk07302);
                    }else {
                        JOptionPane.showMessageDialog(null,"Data Kosong");
                     }
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Tidak Jadi");
                }
            }
        });
    }
}
