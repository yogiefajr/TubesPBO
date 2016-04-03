/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tinodau
 */
public class Mahasiswa extends Orang implements Serializable  {
    private ArrayList<Kelas> daftarKelas = new ArrayList<Kelas>();
    private String username;
    private String password;
    private int semester;
    private int nMax;
    private int n = 0;
    
    
    public Mahasiswa(String username, String password,String namanya, String id, int semester, int nMax) {
        super(namanya,id);
        this.username = username;
        this.password = password;
        this.semester = semester;
        this.nMax = nMax;
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
        
    public void setPilihan(Kelas pilihan) {
        daftarKelas.add(pilihan);
    }
    public Kelas getPilihan(int i) {
        return daftarKelas.get(i);
    }
    
    public void removePilihan (int idx){
        daftarKelas.remove(idx);
    }
    
    public void addKelas (Kelas k) {
        daftarKelas.add(k);
    }
    
    public void removeKelas (Kelas k) {
        daftarKelas.remove(k);
    }
    
    public void removeKelas(String namaKelas) {
        for (int i = 0; i < daftarKelas.size(); i++) {
            if ( daftarKelas.get(i).getKelasnya().equals(namaKelas) ) {
                daftarKelas.remove(i);
            }
        }
    }
    
    public Kelas getKelas(String namaKelas) {
        Kelas kelas = null;
        for (int i = 0; i < daftarKelas.size(); i++) {
            if ( daftarKelas.get(i).getKelasnya().equals(namaKelas) ) {
                kelas = daftarKelas.get(i);
            }
        }
        return kelas;
    }
    
    public Kelas getKelas(int index) {
        return daftarKelas.get(index);
    }
    
    public ArrayList<Kelas> getKelasSemua() {
        return daftarKelas;
    }
    
    public int getTotalKelas() {
        return daftarKelas.size();
    }
}
