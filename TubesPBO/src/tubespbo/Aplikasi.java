/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import java.util.Scanner;

/**
 *
 * @author tinodau
 */
public class Aplikasi {
    private ArrayList<Orang> daftarOrang = new ArrayList<Orang>();
    private ArrayList<Kelas> daftarKelas = new ArrayList<Kelas>();
    private ArrayList<Matakuliah> daftarMatakuliah = new ArrayList<Matakuliah>();
    private ArrayList<Dosen> daftarDosen = new ArrayList<Dosen>();
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<Mahasiswa>();
    
    
    /*************** MATAKULIAH *****************/
    
    
    public Matakuliah getMK(int id) {
        return getFileMK().get(id);
    }
    
    public ArrayList<Matakuliah> addMK(Matakuliah mk) {
        ArrayList<Matakuliah> matakuliah = getFileMK();
        matakuliah.add(mk);
        return matakuliah;
    }
    
    public ArrayList<Matakuliah> getFileMK() {
        try {
            FileInputStream fis = new FileInputStream("Matakuliah.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            ArrayList<Matakuliah> matkul = (ArrayList<Matakuliah>)ois.readObject();
            return matkul;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public void deleteMK(int id) {
        daftarMatakuliah.remove(id);
    }
    
    /************** KELAS *************/
    
    
    public Kelas getKelas(int id) {
        return getFileKelas().get(id);
    }
    
    public ArrayList<Kelas> addKelas(Kelas k) {
        ArrayList<Kelas> kelas = getFileKelas();
        kelas.add(k);
        return kelas;
    }
    
     public ArrayList<Kelas> getFileKelas() {
        try {
            FileInputStream fis = new FileInputStream("Kelas.txt");
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
        return getFileDosen().get(id);
    }
    
     public void deleteDosen(int id) {
        daftarDosen.remove(id);
    }
    
    public ArrayList<Dosen> getFileDosen() {
        try {
            FileInputStream fis = new FileInputStream("Dosen.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            ArrayList<Dosen> dosen = (ArrayList<Dosen>)ois.readObject();
            return dosen;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    
    
    /****************** MAHASISWA *********************/
    
    
    public void addMahasiswa (Mahasiswa newMhs) {
        daftarOrang.add(newMhs);
    }
    
    public Mahasiswa getMahasiswa(int id) {
        return getFileMahasiswa().get(id);
    }
    
    public void deleteMahasiswa(int id) {
        daftarMahasiswa.remove(id);
    }
    
    public ArrayList<Mahasiswa> getFileMahasiswa() {
        try {
            FileInputStream fis = new FileInputStream("Mahasiswa.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            ArrayList<Mahasiswa> m = (ArrayList<Mahasiswa>)ois.readObject();
            return m;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
     public void saveFileMahasiswa(ArrayList<Mahasiswa> mahasiswa) {
        try {
            FileOutputStream fos = new FileOutputStream("Mahasiswa.txt", false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(mahasiswa);
            oos.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    /******************** ADD ****************/
    
    public void addMKKelas(Kelas kls, Matakuliah matkul) {
        kls.setMK(matkul);
    }
    
    public void addKelasMahasiswa(Mahasiswa mhs, Kelas kls) {
        mhs.addKelas(kls);
    }
    
    public void addDosenKelas(Kelas kls, Dosen dsn) {
        kls.setDosen(dsn);
    }
    
    
    /**************** REMOVE ***********/
    
    public void removeKelasMahasiswa(Mahasiswa m, Kelas k) {
        String namaKelas = k.getKelasnya();
        m.removeKelas(namaKelas);
    }
    
    /***************** VIEW *****************/
    
    public ArrayList<Kelas> viewKelasMahasiswa(Mahasiswa m) {
        return m.getKelasSemua();
    }
    
    public void viewListNamaKelas() {
        for (int i = 0; i < getFileKelas().size(); i++) {
            try {
                System.out.println((i+1) + ". " + getFileKelas().get(i).getKelasnya());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    
    public void viewListKelas() {
        for (int i = 0; i < getFileKelas().size(); i++) {
            System.out.println((i+1) + ". Nama Kelas : " + getFileKelas().get(i).getKelasnya());
            if ((getFileKelas().get(i).getDosen()) != null) {
                System.out.println("   Nama Dosen : " + getFileKelas().get(i).getDosen().getNama());
            }
            else {
                System.out.println("   Nama Dosen : ");
            }
            if ((getFileKelas().get(i).getMK()) != null) {
                System.out.println("   Nama Matakuliah : " + getFileKelas().get(i).getMK().getMKnya());
            }
            else {
                System.out.println("   Nama Matakuliah : ");
            }
            System.out.println();
        }
        if (getFileKelas().size() == 0) {
            System.out.println("Kelas Kosong");
        }
    }
    
    
    public void viewListMK() {
        for (int i = 0; i < getFileMK().size(); i++) {
            System.out.println((i+1) + ". " + getFileMK().get(i).getMKnya());
        }
    }
    
    public void viewListDosen() {
        for (int i = 0; i < getFileDosen().size(); i++) {
            System.out.println((i+1) + ". " + getFileDosen().get(i).getNama());
        }
    }
    
    /************* DUMMY ***************/
    
    public void toFile() {
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
            
            Admin admin = new Admin("IF3808","Admin99");
            admin.setUserAdmin("adminadmin");
            admin.setPassAdmin("passwordadmin");
            
            FileOutputStream fos1 = new FileOutputStream("Mahasiswa.txt");
            ObjectOutputStream obj1 = new ObjectOutputStream(fos1);

            FileOutputStream fos2 = new FileOutputStream("Dosen.txt");
            ObjectOutputStream obj2 = new ObjectOutputStream(fos2);
            
            FileOutputStream fos3 = new FileOutputStream("Admin.txt");
            ObjectOutputStream obj3 = new ObjectOutputStream(fos3);
            
            FileOutputStream fos4 = new FileOutputStream("Kelas.txt");
            ObjectOutputStream obj4 = new ObjectOutputStream(fos4);
            
            FileOutputStream fos5 = new FileOutputStream("Matakuliah.txt");
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
            FileOutputStream file = new FileOutputStream("Matakuliah.txt", false);
            ObjectOutputStream objek = new ObjectOutputStream(file);

            objek.writeObject(matakuliah);
            objek.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public Mahasiswa getMahasiswa (String user, String pass) {
        for (int i = 0; i < getFileMahasiswa().size(); i++) {
            if ((getFileMahasiswa().get(i).getUsername().equals(user)) && 
                    getFileMahasiswa().get(i).getPassword().equals(pass)) {
                return getFileMahasiswa().get(i);
            }
        }
        return null;
    }
    
    public Admin getFileAdmin() {
        try {
            FileInputStream fis = new FileInputStream("Admin.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Admin adm = (Admin)ois.readObject();
            return adm;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    /************** CHECKING **************/
    
    public boolean isMahasiswa(String user, String pass) {
        for (int i = 0; i < getFileMahasiswa().size(); i++) {
            if ((getFileMahasiswa().get(i).getUsername().equals(user)) && 
                    getFileMahasiswa().get(i).getPassword().equals(pass)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isSameKelas(String namaKelas) {
        int jumlah = 0;
        for (int i = 0; i < getFileKelas().size(); i++) {
            if (getFileKelas().get(i).getKelasnya().equals(namaKelas)) {
                jumlah++;
            }
        }
        if (jumlah == 0) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public boolean isSameMK(String namaMK) {
        int jumlah = 0;
        for (int i = 0; i < getFileMK().size(); i++) {
            if (getFileMK().get(i).getMKnya().equals(namaMK)) {
                jumlah++;
            }
        }
        if (jumlah == 0) {
            return false;
        }
        else {
            return true;
        }
    }
    
    
    /****************** MENUNYA ****************/
    
    
    
    public void mainMenu() {
        File mhsnya = new File("Mahasiswa.txt");
        File dosennya = new File("Dosen.txt");
        File adminnya = new File("Admin.txt");
        File kelasnya = new File("Kelas.txt");
        File mknya = new File("Matakuliah.txt");
        if ((mhsnya.exists()) && (dosennya.exists()) && (adminnya.exists()) && (kelasnya.exists())  && (mknya.exists())) {
            
        }
        else {
            toFile();
        }
        
        int pilihan1 = 1;
        while (pilihan1 != 0) {
            Scanner angka = new Scanner(System.in);
            Scanner huruf = new Scanner(System.in);
            
            System.out.println("                    APLIKASI REGISTRASI MATA KULIAH");
            System.out.println();
            System.out.println("1. Login Admin");
            System.out.println("2. Login Mahasiswa");
            System.out.println("0. Keluar Aplikasi");
            System.out.print("Pilih Menu : ");
            
            try {
                int menuAplikasi = angka.nextInt();
                String username;
                String password;
                switch (menuAplikasi) {
                    case 1 :
                        System.out.print("Masukkan Username Admin : ");
                        username = huruf.nextLine();
                        System.out.print("Masukkan Password Admin : ");
                        password = huruf.nextLine();
                        
                        if ((getFileAdmin().getUserAdmin().equals(username)) &&
                                (getFileAdmin().getPassAdmin().equals(password))) {
                            System.out.println("                    SELAMAT DATANG ADMIN");
                            int pilihan2 = 1;
                            
                            while (pilihan2 != 0) {
                                System.out.println("MENU ADMIN : ");
                                System.out.println("1. Tambah Kelas Baru");
                                System.out.println("2. Tambah Matakuliah Baru");
                                System.out.println("3. Tambah Matakuliah ke Kelas");
                                System.out.println("4. Tambah Dosen ke Kelas");
                                System.out.println("5. View Kelas");
                                System.out.println("0. Logout");
                                System.out.print("Masukkan Menu : ");
                                
                                try {
                                    int menuAdmin = angka.nextInt();
                                    switch (menuAdmin) {
                                        case 1 :
                                            System.out.print("Masukkan Nama Kelas : ");String namaKelas = huruf.nextLine();
                                            if ((isSameKelas(namaKelas)) == false) {
                                                Kelas k = new Kelas(namaKelas);
                                                simpanKelas(addKelas(k));
                                                System.out.println("Kelas Berhasil Ditambahkan");
                                            }
                                            else {
                                                System.out.println("Kelas Sudah Tersedia");
                                            }
                                            break;

                                        case 2 :
                                            System.out.print("Masukkan Nama Matakuliah : ");String namaMatkul = huruf.nextLine();
                                            if ((isSameMK(namaMatkul)) == false) {
                                                Matakuliah matkul = new Matakuliah();
                                                matkul.setNamaMK(namaMatkul);
                                                simpanMK(addMK(matkul));
                                                System.out.println("Matakuliah Berhasil Ditambahkan");
                                            }
                                            else {
                                                System.out.println("Matakuliah Sudah Tersedia");
                                            }
                                            break;

                                        case 3 :
                                            viewListNamaKelas();
                                            System.out.print("Pilih Kelas : "); int kelasPilih = angka.nextInt();
                                            viewListMK();
                                            System.out.print("Pilih Matakuliah : "); int matkulPilih = angka.nextInt();
                                            ArrayList<Kelas> kelas = getFileKelas();
                                            kelas.get(kelasPilih-1).setMK(getMK(matkulPilih-1));
                                            simpanKelas(kelas);
                                            System.out.println("Matakuliah Telah Berhasil Ditambahkan");

                                            break;

                                        case 4 :
                                            viewListNamaKelas();
                                            System.out.print("Pilih Kelas : "); kelasPilih = angka.nextInt();
                                            viewListDosen();
                                            System.out.print("Pilih Dosen : "); int dosenPilih = angka.nextInt();
                                            kelas = getFileKelas();
                                            kelas.get(kelasPilih-1).setDosen(getDosen(dosenPilih-1));
                                            simpanKelas(kelas);
                                            System.out.println("Dosen Telah Berhasil Ditambahkan");
                                            break;

                                        case 5 :
                                            viewListKelas();
                                            System.out.println();
                                            break;
                                            
                                        case 0 :
                                            pilihan2 = 0;
                                            break;
                                            
                                        default :
                                            System.out.println("Menu tidak ada");
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("Menu Salah");
                                }
                            }
                        }
                        else {
                            System.out.println("USERNAME ATAU PASSWORD SALAH");
                        }
                        break;
                        
                    case 2 :
                        System.out.print("Masukkan Username Mahasiswa : ");
                        username = huruf.nextLine();
                        System.out.print("Masukkan Password Mahasiswa : ");
                        password = huruf.nextLine();
                        
                        if (isMahasiswa(username, password) == true) {
                            Mahasiswa mahasiswa = getMahasiswa(username, password);
                            System.out.println("                    Selamat Datang " + mahasiswa.getNama());
                            
                            int pilihan3 = 1;
                            
                            while (pilihan3 != 0) {
                                System.out.println("MENU MAHASISWA : ");
                                System.out.println("1. Tambah Kelas");
                                System.out.println("2. Hapus Kelas");
                                System.out.println("3. View Kelas Yang Telah Diambil");
                                System.out.println("0. Logout");
                                System.out.print("Masukkan Pilihan : "); int menu = angka.nextInt();
                                
                                switch (menu) {
                                    case 1 : 
                                        viewListKelas();
                                        System.out.print("Pilih Kelas : "); int pilihKelas = angka.nextInt();
                                        
                                        int index = 0;
                                        for (int i = 0; i < getFileMahasiswa().size(); i++) {
                                            if ((getFileMahasiswa().get(i).getUsername().equals(username)) && 
                                                    getFileMahasiswa().get(i).getPassword().equals(password)) {
                                                index = i;
                                            }
                                        }
                                        ArrayList<Mahasiswa> mhs = getFileMahasiswa();
                                        
                                        String namaKelas = getFileKelas().get(pilihKelas-1).getKelasnya();
                                        boolean cek = true;
                                        for (int i = 0; i < mhs.get(index).getKelasSemua().size(); i++) {
                                            if (mhs.get(index).getKelasSemua().get(i).getKelasnya().equals(namaKelas)) {
                                                cek = false;
                                            }
                                        }
                                        
                                        if (cek == true) {
                                            mhs.get(index).addKelas(getKelas(pilihKelas-1));
                                            saveFileMahasiswa(mhs);
                                            System.out.println("Kelas Berhasil Ditambahkan");
                                            break;
                                        }
                                        else {
                                            System.out.println("Kelas Sudah Diambil");
                                        }
                                        break;
                                        
                                    case 2 :
                                        ArrayList<Kelas> kelas = viewKelasMahasiswa(getMahasiswa(username, password));
                                        for (int i = 0; i < kelas.size(); i++) {
                                            System.out.println((i+1) + ". Nama Kelas : " + kelas.get(i).getKelasnya());
                                            if (kelas.get(i).getDosen() != null) {
                                                System.out.println("   Nama Dosen : " + kelas.get(i).getDosen().getNama());
                                            }
                                            else {
                                                System.out.println("   Nama Dosen : ");
                                            }
                                            if (kelas.get(i).getMK() != null) {
                                                System.out.println("   Nama Matakuliah : " + kelas.get(i).getMK().getMKnya());
                                            }
                                            else {
                                                System.out.println("   Nama Matakuliah : ");
                                            }
                                            System.out.println();
                                        }
                                        
                                        System.out.print("Pilih Kelas Yang Akan Dihapus : "); pilihKelas = angka.nextInt();
                                        
                                        index = 0;
                                        for (int i = 0; i < getFileMahasiswa().size(); i++) {
                                            if ((getFileMahasiswa().get(i).getUsername().equals(username)) && 
                                                    getFileMahasiswa().get(i).getPassword().equals(password)) {
                                                index = i;
                                            }
                                        }
                                        mhs = getFileMahasiswa();
                                        
                                        namaKelas = getFileMahasiswa().get(pilihKelas-1).getKelas(); // masih salah
                                        
                                        cek = false;
                                        for (int i = 0; i < mhs.get(index).getKelasSemua().size(); i++) {
                                            if (mhs.get(index).getKelasSemua().get(i).getKelasnya().equals(namaKelas)) {
                                                cek = true;
                                            }
                                        }
                                        
                                        if (cek == true) {
                                            mhs.get(index).removeKelas(namaKelas);
                                            saveFileMahasiswa(mhs);
                                            System.out.println("Kelas Berhasil Dihapus");
                                            break;
                                        }
                                        else {
                                            System.out.println("Kelas Tidak Ada");
                                        }
                                        
                                        break;
                                        
                                    case 3 : 
                                        ArrayList<Kelas> k = viewKelasMahasiswa(getMahasiswa(username, password));
                                        for (int i = 0; i < k.size(); i++) {
                                            System.out.println((i+1) + ". Nama Kelas : " + k.get(i).getKelasnya());
                                            if (k.get(i).getDosen() != null) {
                                                System.out.println("   Nama Dosen : " + k.get(i).getDosen().getNama());
                                            }
                                            else {
                                                System.out.println("   Nama Dosen : ");
                                            }
                                            if (k.get(i).getMK() != null) {
                                                System.out.println("   Nama Matakuliah : " + k.get(i).getMK().getMKnya());
                                            }
                                            else {
                                                System.out.println("   Nama Matakuliah : ");
                                            }
                                            System.out.println();
                                        }
                                        if (k.size() == 0) {
                                            System.out.println("Kelas Kosong");
                                        }
                                        System.out.println();
                                        break;
                                        
                                    case 0 :
                                        pilihan3 = 0;
                                        break;
                                }
                            }
                        }
                        else {
                            System.out.println("USERNAME ATAU PASSWORD SALAH");
                        }
                        break;
                        
                    case 0 :
                        System.out.println("TERIMA KASIH");
                        pilihan1 = 0;
                        break;
                        
                    default :
                        System.out.println("Menu tidak ada");
                }
            } catch (InputMismatchException e) {
                System.out.println("Menu Salah");
            }
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
