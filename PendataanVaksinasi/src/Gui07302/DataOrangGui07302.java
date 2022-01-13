package Gui07302;
import Controller07302.AllObjectController07302;
import Entity07302.PendudukEntity07302;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DataOrangGui07302 extends JFrame{
    int id;
    String nik, nama, alamat, notelp, dosis, vaksin;
    protected JButton btnback = new JButton("<<BACK");
    protected JButton btneditnotelp = new JButton("EDIT");
    protected JButton btneditdosis = new JButton("EDIT");
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

    public DataOrangGui07302(int cek07302){
        initComponent(cek07302);
    }


    void initComponent(final int cek07302) {
        for(PendudukEntity07302 penduduk07302 : AllObjectController07302.pendudukcontroller.getDataPenduduk(cek07302)){
            this.id = penduduk07302.getId();
            this.nik = penduduk07302.getNik();
            this.nama = penduduk07302.getNama();
            this.alamat = penduduk07302.getAlamat();
            this.notelp = penduduk07302.getNoTelp();
            this.dosis = penduduk07302.getDosis();
            this.vaksin = penduduk07302.getJns_vaksin();
        }
        setTitle("DATA PERORANG");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        btnback.setBounds(35,20,90,20);
        add(btnback);
        btneditnotelp.setBounds(280, 220, 70, 25);
        add(btneditnotelp);
        btneditdosis.setBounds(280, 270, 70, 25);
        add(btneditdosis);
        labelnik.setBounds(35, 70, 70, 25);add(labelnik);
        labelnama.setBounds(35, 120, 70, 25);add(labelnama);
        labelalamat.setBounds(35, 170, 90, 25);add(labelalamat);
        labelnotelp.setBounds(35, 220, 90, 25);add(labelnotelp);
        labeldosis.setBounds(35, 270, 90, 25);add(labeldosis);
        labelvaksin.setBounds(35, 320, 90, 25);add(labelvaksin);
        fieldnik.setBounds(130,70,130,25);
        fieldnik.setText(nik);
        fieldnik.setEditable(false);
        add(fieldnik);

        fieldnama.setBounds(130,120,130,25);
        fieldnama.setText(nama);
        fieldnama.setEditable(false);
        add(fieldnama);

        fieldalamat.setBounds(130,170,130,25);
        fieldalamat.setText(alamat);
        fieldalamat.setEditable(false);
        add(fieldalamat);

        fieldnoTelp.setBounds(130,220,130,25);
        fieldnoTelp.setText(notelp);
        fieldnoTelp.setEditable(false);
        add(fieldnoTelp);

        fielddosis.setBounds(130,270,130,25);
        fielddosis.setText(dosis);
        fielddosis.setEditable(false);
        add(fielddosis);

        fieldvaksin.setBounds(130,320,130,25);
        fieldvaksin.setText(vaksin);
        fieldvaksin.setEditable(false);
        add(fieldvaksin);

        btnback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new DataGui07302().setVisible(true);
            }
        });

        btneditdosis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String inputdosis = JOptionPane.showInputDialog("Masukkan Dosis Baru");
                    if(inputdosis.length() >0){
                        AllObjectController07302.pendudukcontroller.updateDosis(1, inputdosis, cek07302);
                        JOptionPane.showMessageDialog(null, "Berhasil Ubah Dosis");
                        fielddosis.setText(inputdosis);
                    }else{
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });

        btneditnotelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String inputnotelp = JOptionPane.showInputDialog("Masukkan NoTelp Baru");
                    if(inputnotelp.length() >0){
                        AllObjectController07302.pendudukcontroller.updateNoTelp(inputnotelp, cek07302);
                        JOptionPane.showMessageDialog(null, "Berhasil Ubah NoTelp");
                        fielddosis.setText(inputnotelp);
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
