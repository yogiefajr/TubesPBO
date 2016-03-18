/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author tinodau
 */
public class Mahasiswa {
    private Kelas pilihan[];
    private String username;
    private String password;
    private String id;
    private int semester;
    private int nMax;
    private int n = 0;
    
    /*public Mahasiswa (String username, String password, int semester, int nMax, String id) {
        this.username = username;
        this.password = password;
        this.semester = semester;
        this.pilihan = new Kelas[nMax];
        this.nMax = nMax;
        this.id = id;
    }*/

    public Mahasiswa(Kelas[] pilihan, String username, String password, String id, int semester, int nMax) {
        this.pilihan = pilihan;
        this.username = username;
        this.password = password;
        this.id = id;
        this.semester = semester;
        this.nMax = nMax;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    

    public void setIdMahasiswa (String id) {
        this.id = id;
    }
    
    public String getIdMahasiswa () {
        return id;
    }
        
    public void setPilihan(Kelas pil) {
        if (n == nMax) {
            System.out.println("Penuh");
        }
        else {
            pilihan[n] = pil;
            n++ ;
        }
    }
    public Kelas getPilihan(int i) {
        return pilihan[i];
    }
    
    public void removePilihan (int idx){
        pilihan.remove(idx);
    }    
}
