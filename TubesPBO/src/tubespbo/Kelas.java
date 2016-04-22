package tubespbo;

public class Kelas {
    private Matakuliah matakuliah;
    private Dosen dosen;
    private String kelasnya;
    
    public Kelas(String kelasnya, Dosen dosen, Matakuliah matakuliah) {
        this.kelasnya = kelasnya;
        this.dosen = dosen;
        this.matakuliah = matakuliah;
    }

    public Kelas(String kelasnya) {
        this.kelasnya = kelasnya;
    }
    
    public void setMK (Matakuliah m) {
        this.matakuliah = m;
    }
    
    public Matakuliah getMK  () {
        return matakuliah;
    }
    
    public void setDosen (Dosen d) {
        this.dosen = d;
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
}