/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Aplikasi {
    private List<Orang> daftarOrang = new ArrayList<>();
    private List<Kelas> daftarKelas = new ArrayList<>();
    private List<Matakuliah> daftarMatakuliah = new ArrayList<>();
    
    public void addDosen (Dosen newDosen) {
        daftarOrang.add(newDosen);
    }
    
    public void addMhasiswa (Mahasiswa newMhs) {
        daftarOrang.add(newMhs);
    }
    
    public Mahasiswa getMahasiswa (String id) {
        for ( int i = 1 ; i <= daftarOrang.size() ; i++ ) {
            if ( daftarOrang.get(i).getId() == id ) {
                return (Mahasiswa) daftarOrang.get(i);
            }
        }
        return null;
    }
    
    public void deleteMahasiswa (String id) {
        for ( int i = 1 ; i <= daftarOrang.size() ; i++ ) {
            if ( daftarOrang.get(i).getId() == id ) {
                daftarOrang.remove(i);
            }
        }
    }
    
    public void menuSatu () {
        
    }
    
    public void menuDua () {
        
    }
    
    public void mainMenu () {
        
    }
}
