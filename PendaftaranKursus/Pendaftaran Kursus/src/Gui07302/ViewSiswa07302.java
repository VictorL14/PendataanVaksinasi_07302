package Gui07302;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class ViewSiswa07302 extends JFrame{
    JTable tabelsiswa07302 = new JTable();
    JScrollPane spsiswa = new JScrollPane(tabelsiswa07302);
    JTextField textpilih07302 = new JTextField();
    JButton butdelete07302 = new JButton("DELETE DATA");
    JButton buttambahdata07302 = new JButton("ADD DATA");
    JButton butedit07302 = new JButton("EDIT DATA");
    int kode07302;

    public ViewSiswa07302(){
        initComponent07302();
    }
    void initComponent07302(){
        setTitle("DATA SISWA KURSUS BAHASA INGGRIS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,500);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.green);
        setLayout(null);
        setVisible(true);
        spsiswa.setBounds(20, 50, 500, 350);
        tabelsiswa07302.setModel(AllObjectController07302.siswa07302.daftarSiswa07302());
        add(spsiswa);

        buttambahdata07302.setBounds(540, 45, 110, 25);
        buttambahdata07302.setFocusPainted(false);
        buttambahdata07302.setBorder(null);
        buttambahdata07302.setBackground(Color.blue);
        buttambahdata07302.setForeground(Color.white);
        add(buttambahdata07302);

        butedit07302.setBounds(540, 85, 110, 25);
        butedit07302.setFocusPainted(false);
        butedit07302.setBorder(null);
        butedit07302.setBackground(Color.blue);
        butedit07302.setForeground(Color.white);
        add(butedit07302);

        butdelete07302.setBounds(540, 125, 110, 25);
        butdelete07302.setFocusPainted(false);
        butdelete07302.setBorder(null);
        butdelete07302.setBackground(Color.blue);
        butdelete07302.setForeground(Color.white);
        add(butdelete07302);


        butedit07302.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    kode07302 = Integer.parseInt(textpilih07302.getText());
                    EditDataGui07302 edit07302 = new EditDataGui07302(kode07302);
                    edit07302.setVisible(true);
                    dispose();
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "SILIAHKAN PILIH DATA TERLEBIH DAHULU!!");
                }
            }
        });

        tabelsiswa07302.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int i07302 = tabelsiswa07302.getSelectedRow();
                textpilih07302.setText(AllObjectController07302.siswa07302.daftarSiswa07302().getValueAt(i07302, 0).toString());
            }
        });

        butdelete07302.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                kode07302 = Integer.parseInt(textpilih07302.getText());
                AllObjectController07302.siswa07302.delete07302(kode07302);
                tabelsiswa07302.setModel(AllObjectController07302.siswa07302.daftarSiswa07302());
                JOptionPane.showMessageDialog(null, "Berhasil HAPUS DATA");
            }
        });

        buttambahdata07302.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                TambahDataGui07302 tambahdata07302 = new TambahDataGui07302();
                tambahdata07302.setVisible(true);
                dispose();
            }
        });
    }
}

