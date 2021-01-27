/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgvoid;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class a {
    //Scanner
    Scanner input = new Scanner(System.in);
    //Deklarasi
    int barang1, barang2, totalHarga;
    //Input User
    void input(){
        System.out.println("Silahkan masukkan harga barang : ");
        System.out.print("Harga barang pertama  : ");
        barang1 = input.nextInt();
        System.out.print("Harga barang kedua    : ");
        barang2 = input.nextInt();
    }
    //Proses Hitung
    void hitung(){
        totalHarga = barang1 + barang2;
    }
    //Percabangan
    void percabangan(){
        if (totalHarga >= 50000){
            System.out.println("Total Harga: "+totalHarga);
            System.out.println("\nMendapatkan potongan harga 20%");
            totalHarga -= (totalHarga*20/100);
            System.out.println("Total Harga: "+totalHarga);
        }else
            System.out.println("Total Harga: "+totalHarga);
    }
}
