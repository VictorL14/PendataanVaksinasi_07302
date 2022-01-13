package Gui07302;
import Controller07302.AllObjectController07302;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DataGui07302 extends JFrame {
    protected JTable tabeldata = new JTable();
    protected JScrollPane spdata = new JScrollPane(tabeldata);
    protected JButton butdelete = new JButton("DELETE DATA");
    protected JButton butcek = new JButton("CEK");
    protected JTextField textcek = new JTextField();
    protected JLabel labelcek = new JLabel("CEK DATA");
    protected JLabel labelnik = new JLabel("Masukkan NIK");
    protected JTextField textpilih07302 = new JTextField();
    String nik;
    int kode;
    public DataGui07302(){
        initComponent07302();
    }

    void initComponent07302(){
        setTitle("PENDATAAN VAKSINASI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,600);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.red);
        setLayout(null);
        setVisible(true);
        spdata.setBounds(20, 20, 650,350);
        tabeldata.setModel(AllObjectController07302.pendudukcontroller.daftarPenduduk());
        add(spdata);

        butcek.setBounds(560, 420, 90,70);
        butcek.setFocusPainted(false);
        butcek.setBorder(null);
        butcek.setBackground(Color.BLUE);
        butcek.setForeground(Color.white);
        add(butcek);
        labelnik.setBounds(430,410,100,50);
        add(labelnik);
        labelcek.setBounds(420,380,100,70);
        add(labelcek);
        textcek.setBounds(420, 460, 100,25);
        add(textcek);
        butdelete.setBounds(140, 420, 90,70);
        butdelete.setFocusPainted(false);
        butdelete.setBorder(null);
        butdelete.setBackground(Color.black);
        butdelete.setForeground(Color.white);
        add(butdelete);

        butcek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nik = textcek.getText();
                DataOrangGui07302 cek = new DataOrangGui07302(AllObjectController07302.pendudukcontroller.CekData(nik));
                cek.setVisible(true);
                dispose();
            }
        });

        butdelete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                kode = Integer.parseInt(textpilih07302.getText());
                AllObjectController07302.pendudukcontroller.delete07302(kode);
                tabeldata.setModel(AllObjectController07302.pendudukcontroller.daftarPenduduk());
                JOptionPane.showMessageDialog(null, "Berhasil HAPUS DATA");
            }
        });
    }
}

