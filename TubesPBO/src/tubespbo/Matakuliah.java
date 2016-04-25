package tubespbo;

import java.io.Serializable;

public class Matakuliah implements Serializable {
    private String nama;
    
    public void setNamaMK (String nama) {
        this.nama = nama;
    }
    
    public String getMKnya () {
        return nama;
    }
    
    public void display () {
        System.out.println("Nama Matakuliah");
        System.out.println(getMKnya());
    }
}