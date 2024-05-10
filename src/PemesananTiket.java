import java.util.Scanner;

class PemesananTiket {
  // Do your magic here...
  static void tampilkanMenu() {
    Scanner input = new Scanner(System.in);
    System.out.println("Selamat datang di Pemesanan Tiket!");
    System.out.print("Masukkan nama pemesan: ");
    String namaPemesan = input.nextLine();
    System.out.println("Pilih Jenis tiket:");
    System.out.println("1. CAT8");
    System.out.println("2. CAT1");
    System.out.println("3. FESTIVAL");
    System.out.println("4. VIP");
    System.out.println("5. UNLIMITED EXPERIENCE");
    System.out.print("Masukkan Pilihan: ");
    int pilihan = input.nextInt();
    switch (pilihan) {
      case 1:
        new CAT8(namaPemesan).pesanTiket();
        break;
      case 2:
        new CAT1(namaPemesan).pesanTiket();
        break;
      case 3:
        new FESTIVAL(namaPemesan).pesanTiket();
        break;
      case 4:
        new VIP(namaPemesan).pesanTiket();
        break;
      case 5:
        new VVIP(namaPemesan).pesanTiket();
        break;
      default:
        System.out.println("Pilihan tidak valid!");
    }
  }
}
