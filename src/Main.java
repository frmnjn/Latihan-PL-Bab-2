//Nama  : Firman Budi Safrizal
//Nim   : 155150201111147
//Kelas : TIF-H
package praktikum_bab2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        Lapangan lap1 = new Lapangan(in.nextInt(),in.nextInt());
        Mahasiswa mhs[] = new Mahasiswa[p];

        for(int i=0;i<mhs.length;i++){
            mhs[i] = new Mahasiswa(in.next(),in.next(),in.nextDouble(),in.nextDouble());
        }
        for(int i=0;i<mhs.length;i++){
            System.out.println(mhs[i].nama+" "+(int)mhs[i].hitungJarak(lap1));
        }
        mhs[0].cekTercepat(mhs);
    }
}