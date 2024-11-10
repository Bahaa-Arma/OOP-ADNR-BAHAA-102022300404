public class Kucing {
    String nama;
    private int umur;
    private String ras;

    public Kucing(String nama, int umur, String ras) {
        this.nama = nama;
        this.umur = umur;
        this.ras = ras;
    }

    public void suara() {
        System.out.println(nama + " mengeong.");
    }

    public void makan() {
        System.out.println(nama + " sedang makan.");
    }

    public void makan(String makanan) {
        System.out.println(nama + " sedang makan " + makanan + ".");
    }

    public void infoHewan() {
        System.out.println("Nama: " + nama + ", Umur: " + umur + " tahun.");
        System.out.println("Ras: " + ras);
    }
}