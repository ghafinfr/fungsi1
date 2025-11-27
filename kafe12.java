import java.util.Scanner;

public class kafe12 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Menu("andi", true, "DISKON50");
        scanner.close();
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {

        System.out.println("selamat datang " + namaPelanggan + " !");

        if (isMember) {
            System.out.println("anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 50%!");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 30%!");
        } else {
            System.out.println("Kode promo invalid!");
        }

        System.out.println("====MENU RESTO KAFE===");
        System.out.println("1. KOPI HITAM - RP 15,000");
        System.out.println("2. CAPPUCINO - RP 20,000");
        System.out.println("3. LATTE - RP 22,000");
        System.out.println("4. TEH TARIK - RP 12,000");
        System.out.println("5. ROTI GORENG - RP 10,000");
        System.out.println("6. MIE GORENG - RP 18,000");
        System.out.println("===========================");
        System.out.println("SILAHKAN PILIH MENU ANDA INGINKAN.");

        System.out.println("Masukan nomor menu yang ingin dipesan:");
        int pilihMenu = scanner.nextInt();
        System.out.println("Masukan jumlah item yang ingin dipesan:");
        int banyakitem = scanner.nextInt();
        int totalHarga = hitungTotalHarga(pilihMenu, banyakitem);
        System.out.println("Total harga untuk pesanan anda: RP " + totalHarga);
    }

    public static int hitungTotalHarga(int pilihMenu, int banyakitem) {
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItem[pilihMenu - 1] * banyakitem;
        return hargaTotal;
    }
}
