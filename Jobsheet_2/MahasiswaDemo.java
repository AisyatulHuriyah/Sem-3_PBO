package Jobsheet_2;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.name = "Yansy Ayuningtyas";
        m1.address = "Nias, Sumatra Barat";
        m1.grade = "2A";

        m1.displayBiodata();

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "023433";
        m2.name = "Aisyatul Huriyah";
        m2.address = "Malang";
        m2.grade = "4B";
        System.out.println();
        m2.displayBiodata();

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "023434";
        m3.name = "Ratih Ramadhani";
        m3.address = "Jombang";
        m3.grade = "5D";
        System.out.println();
        m3.displayBiodata();
    }
}
