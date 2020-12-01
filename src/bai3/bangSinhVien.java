package bai3;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class bangSinhVien extends JFrame {
    sinhVienDao sv = new sinhVienDao();
    Vector datas = new Vector();
    ArrayList<sinhVien> svList= new ArrayList<>();
    public bangSinhVien(){
        initUI();
    }
    public void initUI(){
        JPanel tableP = new JPanel();

        Vector headers = new Vector();

        headers.add("maSV");
        headers.add("ten");
        headers.add("lop");
        headers.add("dtb");

        JTable table = new JTable();

        // init data
        for(sinhVien s: sv.read()){
            svList.add(s);
            Vector row = new Vector();
            row.add(s.getMaSV());
            row.add(s.getTen());
            row.add(s.getLop());
            row.add(s.getDtb());
            datas.add(row);
        }
        tableP.add(new JScrollPane(table));
        table.setModel(new DefaultTableModel(datas,headers));


        JPanel sdP = new JPanel();
        JLabel label1 = new JLabel("maSV : ");
        label1.setBounds(20,20,100,25);
        JLabel label2 = new JLabel("ten :");
        label2.setBounds(20,50,100,25);
        JLabel label3 = new JLabel("lop :");
        label3.setBounds(20,80,100,25);
        JLabel label4 = new JLabel("dtb :");
        label4.setBounds(20,110,100,25);


        JTextField entry1 = new JTextField();
        entry1.setBounds(80,20,300,25);
        JTextField entry2 = new JTextField();
        entry2.setBounds(80,50,300,25);
        JTextField entry3 = new JTextField();
        entry3.setBounds(80,80,300,25);
        JTextField entry4 = new JTextField();
        entry4.setBounds(80,110,300,25);

        JButton save = new JButton("add");
        save.setBounds(50,140,90,25);
        JButton delete = new JButton("delete");
        delete.setBounds(150,140,90,25);
        JButton saveF = new JButton("saveFile");
        saveF.setBounds(260,140,90,25);
        JButton sortList = new JButton("sort");
        sortList.setBounds(360,140,90,25);

        sdP.add(label1);sdP.add(entry1);
        sdP.add(label2);sdP.add(entry2);
        sdP.add(label3);sdP.add(entry3);
        sdP.add(label4);sdP.add(entry4);
        sdP.add(save);sdP.add(delete);sdP.add(saveF);sdP.add(sortList);
        sdP.setLayout(null);

        sdP.setBounds(0,0,500,200);
        tableP.setBounds(0,200,500,600);
        this.add(sdP);
        this.add(tableP);

        this.setLayout(null);


        //save file
        saveF.addActionListener(e -> {
            sv.write(svList);
            JOptionPane.showMessageDialog(null,"save !");
        });
        // add obj
        save.addActionListener(e -> {
            String maSv = entry1.getText();
            String ten = entry2.getText();
            String lop = entry3.getText();
            String dtb = entry4.getText();
            if(maSv.isEmpty() || ten.isEmpty()|| lop.isEmpty() || dtb.isEmpty())
                JOptionPane.showMessageDialog(null,"nhap day du!");
            else{
                System.out.println(entry1.getText()+" "+ entry2.getText()+" " +entry3.getText()+" "+entry4.getText());

                Double n;
                try {
                    n = Double.parseDouble(entry4.getText());
                    sinhVien s = new sinhVien(entry1.getText(),entry2.getText(),entry3.getText(),n);
                    svList.add(s);
                    Vector row = new Vector();
                    row.add(s.getMaSV());
                    row.add(s.getTen());
                    row.add(s.getLop());
                    row.add(String.valueOf(s.getDtb()));
                    datas.add(row);
                    table.setModel(new DefaultTableModel(datas,headers));
                }
                catch (NumberFormatException exc){
                    JOptionPane.showMessageDialog(null,"sai dinh dang!");
                }

            }
        });
        delete.addActionListener(e -> {
            entry1.setText("");
            entry2.setText("");
            entry3.setText("");
            entry4.setText("");
        });

        // sort
        sortList.addActionListener(e -> {
            Collections.sort(svList,new sortByDtb());
            datas =  new Vector();
            for(sinhVien s: svList){

                Vector row = new Vector();
                row.add(s.getMaSV());
                row.add(s.getTen());
                row.add(s.getLop());
                row.add(s.getDtb());
                datas.add(row);
            }
            table.setModel(new DefaultTableModel(datas,headers));


        });

        this.setSize(500,800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }


    public static void main(String[] args) {
        new bangSinhVien();
    }
}
