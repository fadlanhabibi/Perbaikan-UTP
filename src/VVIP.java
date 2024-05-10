class VVIP extends TiketKonser {
  VVIP(String namaPemesan) {
    super(namaPemesan);
  }

  @Override
  void pesanTiket() {
    String kodeBooking = Main.generateKodeBooking();
    String tanggalPemesanan = Main.getCurrentDate();
    int harga = this.getHarga();
    System.out.println("\n------- Detail Pemesanan -------");
    System.out.println("Nama Pemesan: " + namaPemesan);
    System.out.println("Kode Booking: " + kodeBooking);
    System.out.println("Tanggal Pemesanan: " + tanggalPemesanan);
    System.out.println("Tiket yang dipesan: UNLIMITED EXPERIENCE");
    System.out.println("TOTAL HARGA: " + harga + " USD");
  }

  @Override
  public int getHarga() {
    return 1100;
  }
}