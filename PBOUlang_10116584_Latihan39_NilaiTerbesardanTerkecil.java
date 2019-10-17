/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan39_nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author
 * NIM : 10116584
 * NAMA : Muhammad Syahrun Dalu
 */
public class PBOUlang_10116584_Latihan39_NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    nilai daftarNilai = new nilai();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("====Program Nilai Mahasiswa Terbesar"
                + " dan Terkecil=====");
        System.out.print("Masukan Nama Petugas = ");
        String nama = scan.nextLine();
        
        daftarNilai.inputData();
        for (int i=0; i<daftarNilai.jumlahMhs; i++){
            System.out.print("Masukan Nilai Mahasiswa ke-"+(i+1)+" = ");
            daftarNilai.nilaiMhs[i] = scan.nextInt();
            System.out.println("");
            daftarNilai.nilaiTerbesar(i);
            daftarNilai.nilaiTerkecil(i);            
        }
        
        daftarNilai.hasilNilai();
        System.out.println("");
        System.out.println("Nilai Terbesar adalah = "+daftarNilai.max);
        System.out.println("Nilai terkecil adalah = "+daftarNilai.min);
                
        
        
    }
    
}
