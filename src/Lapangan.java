package praktikum_bab2;
public class Lapangan{
    int panjang_lap;
    int lebar_lap;
    
    public Lapangan(int panjang_lap, int lebar_lap){
    this.panjang_lap = panjang_lap;
    this.lebar_lap = lebar_lap;
    }
    public int hitungKeliling(){
        return 2 * (panjang_lap + lebar_lap);
    }
}