package tubespbo;

public class Kelas {
    private Matakuliah matakuliah;
    private Dosen dosen;
    
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
    
    public void display () {
        System.out.println("Mata Kuliah");
        System.out.println(getMatakuliah());
        System.out.println("Dosen");
        System.out.println(getDosen());
    }
}