package praktikum_bab2;
public class Mahasiswa{
    String nim, nama;
    int jum_putaran, jum_waktu;
    
    public Mahasiswa(String nim, String nama, int jum_putaran, int jum_waktu){
        this.nim = nim;
        this.nama = nama;
        this.jum_putaran = jum_putaran;
        this.jum_waktu = jum_waktu;
    }
    public int hitungJarak(Master_lapangan a){
        return jum_putaran * a.hitungKeliling();
    }
    public double hitungWaktuSatuPutaran(){
        return (double)jum_waktu / (double)jum_putaran;
    }
}