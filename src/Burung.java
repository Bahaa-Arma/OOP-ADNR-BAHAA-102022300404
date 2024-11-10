public class Burung {
    String nama;
    private int umur;
    private String warnaBulu;

    public Burung(String nama, int umur, String warnaBulu) {
        this.nama = nama;
        this.umur = umur;
        this.warnaBulu = warnaBulu;
    }

    public void suara() {
        System.out.println(nama + " berkicau.");
    }

    public void makan() {
        System.out.println(nama + " sedang makan.");
    }

    public void makan(String makanan) {
        System.out.println(nama + " sedang makan " + makanan + ".");
    }

    public void infoHewan() {
        System.out.println("Nama: " + nama + ", Umur: " + umur + " tahun.");
        System.out.println("Warna bulu: " + warnaBulu);
    }
}