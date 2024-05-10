abstract class TiketKonser implements HargaTiket {
    // Do your magic here...
    String namaPemesan;

    TiketKonser(String namaPemesan) {
        this.namaPemesan = namaPemesan;
    }

    abstract void pesanTiket();

}
