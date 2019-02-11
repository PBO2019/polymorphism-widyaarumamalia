public class Gaji{
    private int hasil;

    public void menghitungGaji(int tarifp){
        this.hasil = 30*tarifp;
        System.out.println ( "Anda menerima gaji sejumlah" + "" +hasil);
    }
}