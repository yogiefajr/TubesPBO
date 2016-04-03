package tubespbo;

public class Kelas {
    private Matakuliah matakuliah;
    private Dosen dosen;
    private String kelasnya;
    
    public void setMatakuliah (Matakuliah m) {
        matakuliah = m;
    }
    
    public Matakuliah getMatakuliah () {
        return matakuliah;
    }
    
    public void setDosen (Dosen d) {
        dosen = d;
    }
    
    public Dosen getDosen () {
        return dosen;
    }
    
    public String getKelasnya() {
        return kelasnya;
    }

    public void setKelasnya(String kelasnya) {
        this.kelasnya = kelasnya;
    }
    
    public void display () {
        System.out.println("Mata Kuliah");
        System.out.println(getMatakuliah());
        System.out.println("Dosen");
        System.out.println(getDosen());
    }
}