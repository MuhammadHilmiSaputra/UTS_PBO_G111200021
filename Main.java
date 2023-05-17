import pengguna.User;
import pengguna.Mhs;

class Main {
    public static void main(String[] args) {

        Mhs mhs = new Mhs("username", "password");

        mhs.setNama("Muhammad Hilmi Saputra");
        mhs.setNim("G.111.20.0021");
        mhs.setSmt(6);

        System.out.println("Nama Mahasiswa: " + mhs.getNama());
        System.out.println("Nim Mhs: " + mhs.getNim());
        System.out.println("Smt Mhs: " + mhs.getSmt());


        User sepeda = new User("tortor15", "qwe123");

    System.out.println("Username :" + sepeda.getUsername());
    System.out.println("Password :" + sepeda.getPassword());
    }
}