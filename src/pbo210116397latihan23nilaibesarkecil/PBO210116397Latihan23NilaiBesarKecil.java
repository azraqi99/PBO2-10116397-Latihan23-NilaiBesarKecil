/*
@author 
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Program Nilai Besar kecil
 */
package pbo210116397latihan23nilaibesarkecil;

import java.util.Scanner;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan23NilaiBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pts;
        int jumlahMahasiswa;
        int nilai[] = new int[20];
        int i, max, min;
        
        Scanner value = new Scanner(System.in);
        
        System.out.println("===== Program Nilai Terbesar Dan Terkecil =====");
        System.out.print("Masukkan Nama Petugas\t : ");
        pts = value.nextLine();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa\t : ");
        jumlahMahasiswa = value.nextInt();
        System.out.println("");
        
        for (i = 1; i <= jumlahMahasiswa; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + " : ");
            nilai[i] = value.nextInt();
        }
        
        System.out.println("");
        System.out.println("===== Hasil Nilai Mahasiswa =====");
        for (i = 1; i <= jumlahMahasiswa; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " = " + nilai[i]);
        }
    min = nilai[1];
    max = nilai[1];
    
    for (i = 1; i <= jumlahMahasiswa; i++){
        if (nilai[i] > max){
            max = nilai[i];
        } else if (nilai[i] < min) {
            min = nilai[i];
        }
      }
    
        System.out.println("");
        System.out.println("Nilai Terbesar\t : " + max);
        System.out.println("Nilai Terkecil\t : " + min);
        System.out.println("");
        System.out.println("Nama Petugas : " + pts);
    }
    
}
