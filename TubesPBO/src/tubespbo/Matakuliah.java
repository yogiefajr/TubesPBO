package tubespbo;

public class Matakuliah {
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