/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;
import java.io.Serializable;

/**
 *
 * @author tinodau
 */
public class Admin extends Orang implements Serializable {
    private String userAdmin;
    private String passAdmin;
	
	public Admin (String nama, String id) {
		super(nama,id);
	}
	
        /*public String userNamaAdmin() {
		return userAdmin;
	}*/
	        
	public void setUserAdmin (String userAdmin) {
		this.userAdmin = userAdmin;
	}
	
        public String getUserAdmin() {
            return userAdmin;
        }
        
	public void setPassAdmin (String passAdmin) {
            this.passAdmin = passAdmin;
	}
	
	public String getPassAdmin () {
            return passAdmin;
	}

    @Override
    public String show() {
        return ("Selamat datang !");
    }

}
