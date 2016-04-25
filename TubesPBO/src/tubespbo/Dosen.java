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
 * @author Yogie fajar
 */
public class Dosen extends Orang implements Serializable{
    
    public Dosen(String nama, String id) {
        super(nama,id);
    }
    /*private String namaDosen;
    private String idDosen;
    private List<Kelas> daftarKelas = new ArrayList<>();
    
    public Dosen (String namaDosen, String idDosen){
        this.namaDosen = namaDosen;
        this.idDosen = idDosen;
    }
    
    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public String getIdDosen() {
        return idDosen;
    }

    public void setIdDosen(String idDosen) {
        this.idDosen = idDosen;
    }*/

    @Override
    public String show() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
