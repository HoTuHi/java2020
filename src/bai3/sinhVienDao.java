package bai3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class sinhVienDao {
    private static final String inFile = "SV.TXT";
    public void write(List<sinhVien> stdList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(new File(inFile));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(stdList);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch ( IOException e){
            e.printStackTrace();
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }

    public  List<sinhVien> read(){
        List<sinhVien> stdList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(inFile));
            ois = new ObjectInputStream(fis);
            stdList = (List<sinhVien>) ois.readObject();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return stdList;
    }

    private void closeStream(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        sinhVienDao sv = new sinhVienDao();
        List<sinhVien> stdList = new ArrayList<>();
        sinhVien std = new sinhVien("hi","asd","asd",3.0);
        stdList.add(std);
        stdList.add(std);
        stdList.add(std);
        stdList.add(std);
//        System.out.println(stdList);
        System.out.println(stdList.get(1).getDtb());
        sv.write(stdList);
        System.out.println(sv.read());
    }
}
