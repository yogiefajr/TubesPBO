package tubespbo;

public class Matakuliah {
    private String nama;
    
    public void setNama (String nama) {
        this.nama = nama;
    }
    
    public String getNama () {
        return nama;
    }
    
    public void display () {
        System.out.println("Nama Matakuliah");
        System.out.println(getNama());
    }
}