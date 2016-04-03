/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tinodau
 */
public class Aplikasi {
    private List<Orang> daftarOrang = new ArrayList<>();
    private List<Kelas> daftarKelas = new ArrayList<>();
    private List<Matakuliah> daftarMatakuliah = new ArrayList<>();
    private List<Dosen> daftarDosen = new ArrayList<>();
    private List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    
    
    

    
    
    /*************** MATAKULIAH *****************/
    
    
    public Matakuliah getMatakuliah(int id) {
        return getListMatkulFromFile().get(id);
    }
    
    public ArrayList<Matakuliah> addMatakuliah(Matakuliah mk) {
        ArrayList<Matakuliah> matakuliah = getListMatkulFromFile();
        matakuliah.add(mk);
        return matakuliah;
    }
    
    public ArrayList<Matakuliah> getListMatkulFromFile() {
        try {
            FileInputStream fis = new FileInputStream("matakuliah.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            ArrayList<Matakuliah> matkul = (ArrayList<Matakuliah>)ois.readObject();
            return matkul;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public void deleteMatakuliah(int id) {
        daftarMatakuliah.remove(id);
    }
    
    /************** KELAS *************/
    
    
    public Kelas getKelas(int id) {
        return getListKelasFromFile().get(id);
    }
    
    public ArrayList<Kelas> addKelas(Kelas k) {
        ArrayList<Kelas> kelas = getListKelasFromFile();
        kelas.add(k);
        return kelas;
    }
    
     public ArrayList<Kelas> getListKelasFromFile() {
        try {
            FileInputStream fis = new FileInputStream("kelas.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            ArrayList<Kelas> kelas = (ArrayList<Kelas>)ois.readObject();
            return kelas;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
     
     
    public void deleteKelas(int id) {
        daftarKelas.remove(id);
    }
    
    
    
    
    /************** DOSEN ****************/
    
    public void addDosen (Dosen newDosen) {
        daftarOrang.add(newDosen);
    }
    
    
    public Dosen getDosen(int id) {
        return getListDosenFromFile().get(id);
    }
    
     public void deleteDosen(int id) {
        daftarDosen.remove(id);
    }
    
    public ArrayList<Dosen> getListDosenFromFile() {
        try {
            FileInputStream fis = new FileInputStream("dosen.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            ArrayList<Dosen> dosen = (ArrayList<Dosen>)ois.readObject();
            return dosen;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    
    
    /****************** MAHASISWA *********************/
    
    
    public void addMhasiswa (Mahasiswa newMhs) {
        daftarOrang.add(newMhs);
    }
    
    public Mahasiswa getMahasiswa(int id) {
        return getListMahasiswaFromFile().get(id);
    }
    
    public void deleteMahasiswa(int id) {
        daftarMahasiswa.remove(id);
    }
    
    public ArrayList<Mahasiswa> getListMahasiswaFromFile() {
        try {
            FileInputStream fis = new FileInputStream("mahasiswa.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            ArrayList<Mahasiswa> m = (ArrayList<Mahasiswa>)ois.readObject();
            return m;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
     public void saveListMahasiswaToFile(ArrayList<Mahasiswa> mahasiswa) {
        try {
            FileOutputStream fos = new FileOutputStream("mahasiswa.txt", false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(mahasiswa);
            oos.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    /******************** ADD ****************/
    
    public void addMatkulToKelas(Kelas kls, Matakuliah matkul) {
        kls.setMatakuliah(matkul);
    }
    
    public void addKelasToMahasiswa(Mahasiswa mhs, Kelas kls) {
        mhs.addKelas(kls);
    }
    
    public void addDosenToKelas(Kelas kls, Dosen dsn) {
        kls.setDosen(dsn);
    }
    
    
    /**************** REMOVE ***********/
    
    public void removeKelasFromMahasiswa(Mahasiswa m, Kelas k) {
        String namaKelas = k.getKelasnya();
        m.removeKelas(k);
    }
    
    /***************** VIEW *****************/
    
    public ArrayList<Kelas> viewAllKelasByMahasiswa(Mahasiswa m) {
        return m.getKelasSemua();
    }
    
    public void viewListNamaKelas() {
        for (int i = 0; i < getListKelasFromFile().size(); i++) {
            try {
                System.out.println((i+1) + ". " + getListKelasFromFile().get(i).getKelasnya());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    
    public void viewListKelas() {
        for (int i = 0; i < getListKelasFromFile().size(); i++) {
            System.out.println((i+1) + ". Nama Kelas : " + getListKelasFromFile().get(i).getKelasnya());
            if ((getListKelasFromFile().get(i).getDosen()) != null) {
                System.out.println("   Nama Dosen : " + getListKelasFromFile().get(i).getDosen().getNama());
            }
            else {
                System.out.println("   Nama Dosen : ");
            }
            if ((getListKelasFromFile().get(i).getMatakuliah()) != null) {
                System.out.println("   Nama Matakuliah : " + getListKelasFromFile().get(i).getMatakuliah().getNamaMK());
            }
            else {
                System.out.println("   Nama Matakuliah : ");
            }
            System.out.println();
        }
        if (getListKelasFromFile().size() == 0) {
            System.out.println("Kelas Kosong");
        }
    }
    
    public void viewListMatkul() {
        for (int i = 0; i < getListMatkulFromFile().size(); i++) {
            System.out.println((i+1) + ". " + getListMatkulFromFile().get(i).getNamaMK());
        }
    }
    
    public void viewListDosen() {
        for (int i = 0; i < getListDosenFromFile().size(); i++) {
            System.out.println((i+1) + ". " + getListDosenFromFile().get(i).getNama());
        }
    }
    
    /************* DUMMY ***************/
    
    public void createFile() {
        try {
            Mahasiswa mhs1 = new Mahasiswa("mhs1","abcde1","Mahasiswa 1","000001",4,1);
            Mahasiswa mhs2 = new Mahasiswa("mhs1","abcde2","Mahasiswa 1","000002",4,2);
            Mahasiswa mhs3 = new Mahasiswa("mhs1","abcde3","Mahasiswa 1","000003",4,3);
            Mahasiswa mhs4 = new Mahasiswa("mhs1","abcde4","Mahasiswa 1","000004",4,4);
            Mahasiswa mhs5 = new Mahasiswa("mhs1","abcde5","Mahasiswa 1","000005",4,5);
            daftarMahasiswa.add(mhs1);
            daftarMahasiswa.add(mhs2);
            daftarMahasiswa.add(mhs3);
            daftarMahasiswa.add(mhs4);
            daftarMahasiswa.add(mhs5);
            
            Dosen dsn1 = new Dosen("Dosen 1","0001");
            Dosen dsn2 = new Dosen("Dosen 2","0002");
            Dosen dsn3 = new Dosen("Dosen 3","0003");
            Dosen dsn4 = new Dosen("Dosen 4","0004");
            Dosen dsn5 = new Dosen("Dosen 5","0005");
            daftarDosen.add(dsn1);
            daftarDosen.add(dsn2);
            daftarDosen.add(dsn3);
            daftarDosen.add(dsn4);
            daftarDosen.add(dsn5);
            
            Admin admin = new Admin("Dani","ADM1");
            admin.setUserAdmin("adminadmin");
            admin.setPassAdmin("passwordadmin");
            
            FileOutputStream fos1 = new FileOutputStream("mahasiswa.txt");
            ObjectOutputStream obj1 = new ObjectOutputStream(fos1);

            FileOutputStream fos2 = new FileOutputStream("dosen.txt");
            ObjectOutputStream obj2 = new ObjectOutputStream(fos2);
            
            FileOutputStream fos3 = new FileOutputStream("admin.txt");
            ObjectOutputStream obj3 = new ObjectOutputStream(fos3);
            
            FileOutputStream fos4 = new FileOutputStream("kelas.txt");
            ObjectOutputStream obj4 = new ObjectOutputStream(fos4);
            
            FileOutputStream fos5 = new FileOutputStream("matakuliah.txt");
            ObjectOutputStream obj5 = new ObjectOutputStream(fos5);

            obj1.writeObject(daftarMahasiswa);
            obj2.writeObject(daftarDosen);
            obj3.writeObject(admin);
            obj4.writeObject(daftarKelas);
            obj5.writeObject(daftarMatakuliah);

            obj1.flush();
            obj2.flush();
            obj3.flush();
            obj4.flush();
            obj5.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    /******************* SAVE ******************/
    public void simpanMahasiswa(ArrayList<Mahasiswa> mahasiswa) {
        try {
            FileOutputStream file = new FileOutputStream("Mahasiswa.txt", false);
            ObjectOutputStream objek = new ObjectOutputStream(file);
            objek.writeObject(mahasiswa);
            objek.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void simpanKelas(ArrayList<Kelas> kelas) {
        try {
            FileOutputStream file = new FileOutputStream("Kelas.txt", false);
            ObjectOutputStream objek = new ObjectOutputStream(file);
            objek.writeObject(kelas);
            objek.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void simpanMK(ArrayList<Matakuliah> matakuliah) {
        try {
            FileOutputStream file = new FileOutputStream("Matkul.txt", false);
            ObjectOutputStream objek = new ObjectOutputStream(file);

            objek.writeObject(matakuliah);
            objek.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**public Mahasiswa getMahasiswa (String id) {
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
    }**/
    
}
