package bai3;

import java.util.Comparator;

public class sortByDtb implements Comparator<sinhVien> {

    @Override
    public int compare(sinhVien o1, sinhVien o2) {
        if(o1.getDtb()>o2.getDtb())
            return 1;
        else return -1;
    }
}
