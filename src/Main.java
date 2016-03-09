package praktikum_bab2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        Master_lapangan lap1 = new Master_lapangan(in.nextInt(),in.nextInt());
        Master_mahasiswa mhs[] = new Master_mahasiswa[p];

        mhs[0] = new Master_mahasiswa("1","Firman",3,5);
        mhs[1] = new Master_mahasiswa("2","Budi",7,6);
        mhs[2] = new Master_mahasiswa("3","Safrizal",5,4);
        
        System.out.print(mhs[0].nama+" "+mhs[0].hitungJarak(lap1)+"\n");
        System.out.print(mhs[1].nama+" "+mhs[1].hitungJarak(lap1)+"\n");
        System.out.print(mhs[2].nama+" "+mhs[2].hitungJarak(lap1)+"\n");
        System.out.println(mhs[0].hitungWaktuSatuPutaran());
        System.out.println(mhs[1].hitungWaktuSatuPutaran());
        System.out.println(mhs[2].hitungWaktuSatuPutaran());
        
        mhs[0].cekTercepat(mhs);
    }
}