/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119026.muhammadkhatami.no2;

import java.util.Scanner;

/**
 *
 * @author Asus
 * NAMA     : Muhammad Khatami
 * KELAS    : IF-1
 * NIM      : 10119026
 * Deskripsi : progam ini menampilkan hasil hitung sisa saldo anda
 */
public class UTSIF110119026MUHAMMADKHATAMINo2 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan tabungan = new Tabungan(scanner.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        System.out.print("Saldo Anda Sekarang : " + tabungan.ambilUang(scanner.nextInt()));
    }
    
}
