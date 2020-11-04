/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek.jualbarang;
import java.util.Scanner;
/**
 *
 * @author Intan
 */
public class PROJEKJualBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat Scanner dan data
        Scanner input = new Scanner(System.in);
        int pilihan, jumlah, total, hasil, bayar, kembali;
        String jawab;
        //Judul
        System.out.print("\n        SELAMAT DATANG DI NOIKI CAFE \n");
        System.out.println("---------------------------------------------");
        //Nama Pembeli
        System.out.print("Nama anda : ");
        String nama = input.nextLine();
        System.out.println("---------------------------------------------");
        //Menu Makanan
        String[] menu = {" ","Espresso Frappucino", "Americano", "Caramel Macchiato", "Cappucino", "Hazelnut Mocha", "Affopato", "Latte Machiato", "Choco Latte"};
        String[] deskripsi = {" ","Ekstrak biji kopi murni tanpa campuran", "Single 1 Double Espresso + Air Panas", "Single Espresso + Buih susu caramel", "Single Espresso + Susu + Buih Susu", "Single Espresso + Coklat + Susu", "Single 1 double Espresso + Es krim Vanilla", "Espresso + Coklat + Buih Susu", "Espresso susu + Buih susu"};
        int[] harga = {0, 15000, 15000, 20000, 17000, 20000, 15000, 20000, 17000};
        //pilihan
        boolean b = true;
        hasil = 0;
        while(b){
            System.out.println("              << DAFTAR MENU >>");
            for(int a=1;a<menu.length;a++){
                System.out.println(a+". "+menu[a]);
                System.out.println("   "+deskripsi[a]);
                System.out.println("   HARGA : "+harga[a]);}
                System.out.println("---------------------------------------------");
                System.out.print("ANDA PESAN NOMOR : ");
                pilihan = input.nextInt();
                System.out.print("JUMLAH           : ");
                jumlah = input.nextInt();
                total = harga[pilihan]*jumlah;
                System.out.println("TOTAL            : "+total);
                hasil += total;
                System.out.println("---------------------------------------------");
                //apakah mau menambah pesanan
            System.out.println("Apakah anda ingin memesan lagi ? (ya/tidak)");
            jawab = input.next();
            if(jawab.equalsIgnoreCase("ya")){
                b = true;
            }else if(jawab.equalsIgnoreCase("tidak")){
                b = false;}
            System.out.println("---------------------------------------------");
        }
        //total pembayaran
        System.out.println("TOTAL PEMBAYARAN : "+hasil);
        boolean c = true;
        while(c){
        System.out.print("BAYAR            : ");
        bayar = input.nextInt();
            if(bayar==hasil){
                System.out.println("---------------------------------------------");
                System.out.println("Silahkan Ambil Pesanan Anda, Uang Anda Pas");
                c = false;
            }else if(bayar>hasil){
                kembali = bayar-hasil;
                System.out.println("---------------------------------------------");
                System.out.println("Silahkan Ambil Pesanan Anda dan Kembalian Sebesar "+kembali);
                c = false;
            }else if(bayar<hasil){
                System.out.println("UANG ANDA KURANG, SILAHKAN MASUKKAN ULANG UANG ANDA");
                c = true;}
        }
        System.out.println("Terima kasih telah memesan "+nama);
    }
}
