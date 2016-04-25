/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.io.Serializable;

/**
 *
 * @author Yogie fajar
 */
public abstract class Orang implements Serializable {
    private String nama;
    private String id;

    public Orang(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }

    
    public abstract String show();
}