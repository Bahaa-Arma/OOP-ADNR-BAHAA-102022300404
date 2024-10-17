// Don't delete any comments below!!!
// Todo: Import Scanner

public class Main {
    public static void main(String[] args) {
        // Todo : Create ManajemenInventaris Object and Scanner
        ManajemenInventaris manajemen = new ManajemenInventaris();
        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;
        // Todo : Create Loop list menu
        while (pilihan != 4) {
            System.out.println("1. Tambah Makanan Kering");
            System.err.println("2. Tambah Makanan Basah");
            System.out.println("3. Tampilkan Semua Makanan");
            System.out.println("4. Keluar");
        }
    }
}