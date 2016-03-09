package praktikum_bab2;
public class Mahasiswa{
    String nim, nama;
    double jum_putaran, jum_waktu;
    
    public Mahasiswa(String nim, String nama, double jum_putaran, double jum_waktu){
        this.nim = nim;
        this.nama = nama;
        this.jum_putaran = jum_putaran;
        this.jum_waktu = jum_waktu;
    }
    public double hitungJarak(Lapangan a){
        return jum_putaran * a.hitungKeliling();
    }
    public double hitungWaktuSatuPutaran(){
        return jum_waktu / jum_putaran;
    }
    public void cekTercepat(Mahasiswa a[]){
        double min;
        int count = 0;
        min = a[0].hitungWaktuSatuPutaran();
        for(int i=0;i<a.length;i++){
           if(min > a[i].hitungWaktuSatuPutaran()) {
               min = a[i].hitungWaktuSatuPutaran();
               count++;
           }
        }
        System.out.println(a[count].nama);
    }
}