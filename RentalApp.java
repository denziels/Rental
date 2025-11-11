import java.util.ArrayList;

public class RentalApp {
    public static void main(String[] args) {
        // Daftar kendaraan
        ArrayList<Kendaraan> kendaraanList = new ArrayList<Kendaraan>();
        kendaraanList.add(new Mobil("Toyota", "Avanza", 2020, 4));
        kendaraanList.add(new Motor("Yamaha", "NMAX", 2022, 2));
        kendaraanList.add(new Sepeda("Polygon", "Helios", 2023, "Balap"));

        System.out.println("=== Daftar Kendaraan Tersedia ===");
        for (Kendaraan k : kendaraanList) {
            k.displayInfo();
            System.out.println("----------------------");
        }

        // Daftar penyewa
        ArrayList<Penyewa> penyewaList = new ArrayList<Penyewa>();
        penyewaList.add(new Penyewa("Denzel", kendaraanList.get(0)));
        penyewaList.add(new Penyewa("Alicia", kendaraanList.get(2)));

        System.out.println("\n=== Daftar Penyewa ===");
        for (Penyewa p : penyewaList) {
            p.displayPenyewa();
        }
    }
}
