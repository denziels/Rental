public class Penyewa {
    private String nama;
    private Kendaraan kendaraanDisewa;

    public Penyewa(String nama, Kendaraan kendaraanDisewa) {
        this.nama = nama;
        this.kendaraanDisewa = kendaraanDisewa;
    }

    public void displayPenyewa() {
        System.out.println("Nama Penyewa: " + nama);
        System.out.println("Kendaraan yang disewa:");
        kendaraanDisewa.displayInfo();
        System.out.println("----------------------");
    }
}
