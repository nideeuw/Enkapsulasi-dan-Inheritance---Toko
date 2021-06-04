/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toko;

/**
 *
 * @author MOKLET-2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // pemanggilan class Toko
        // inisialisasi objek pada class Toko
        Toko nota = new Toko();
        // memanggil method Display pada class Toko
        nota.Display();
        // memanggil method setAdmin pada class Toko
        nota.setAdmin("Naswa Nida");
        // memanggil method getAdmin pada class Toko
        System.out.println("Cashier Admin: "+nota.getAdmin()+"      04/06/2021");
        System.out.println("=========================================");
        
        // pemanggilan class SmartPhone
        // inisialisasi objek pada class SmarPhone
        SmartPhone hp = new SmartPhone();
        // memanggil method Display pada class SmartPhone
        hp.Display();
        // memanggil method setMerk pada class SmartPhone
        hp.setMerk("iPhone 12 Pro");
        // memanggil method getMerk pada class SmartPhone
        System.out.println("Merk                    : "+hp.getMerk());
        // memanggil method setjmlKamera pada class SmartPhone
        hp.setjmlKamera(3);
        // memanggil method getjmlKamera pada class SmartPhone
        System.out.println("Jumlah Kamera Belakang  : "+hp.getjmlKamera());
        // memanggil method setTotal pada class SmartPhone
        hp.setTotal(1);
        // memanggil method getTotal pada class SmartPhone
        System.out.println("Total Barang            : "+hp.getTotal());
        // memanggil method setHarga pada class SmartPhone
        hp.setHarga(23999000);
        // memanggil method getHarga pada class SmartPhone
        System.out.println("Harga                   : Rp "+hp.getHarga());
        
        // pemanggilan class TV
        // inisialisasi objek pada class TV
        TV barang = new TV();
        // memanggil method Display pada class TV
        barang.Display();
        // memanggil method setMerk pada class TV
        barang.setMerk("Samsung");
        // memanggil method getMerk pada class TV
        System.out.println("Merk                    : "+barang.getMerk());
        // memanggil method setJenis pada class TV
        barang.setJenis("QN800A Neo QLED 8K Smart TV (2021)");
        // memanggil method getJenis pada class TV
        System.out.println("Jenis                   : "+barang.getJenis());
        // memanggil method setTotal pada class TV
        barang.setTotal(1);
        // memanggil method getTotal pada class TV
        System.out.println("Total Barang            : "+barang.getTotal());
        // memanggil method setHarga pada class TV
        barang.setHarga(71999000);
        // memanggil method getHarga pada class TV
        System.out.println("Harga                   : Rp "+barang.getHarga());
        
        // pemanggilan class KipasAngin
        // inisialisasi objek pada class KipasAngin
        KipasAngin produk = new KipasAngin();
        // memanggil method Display pada class KipasAngin
        produk.Display();
        // memanggil method setMerk pada class KipasAngin
        produk.setMerk("Maspion");
        // memanggil method getMerk pada class KipasAngin
        System.out.println("Merk                    : "+produk.getMerk());
        // memanggil method setUkuran pada class KipasAngin
        produk.setUkuran(30);
        // memanggil method getUkuran pada class KipasAngin
        System.out.println("Ukuran Diameter Kipas   : "+produk.getUkuran()+"cm");
        // memanggil method setTotal pada class KipasAngin
        produk.setTotal(1);
        // memanggil method getTotal pada class KipasAngin
        System.out.println("Total Barang            : "+produk.getTotal());
        // memanggil method setHarga pada class KipasAngin
        produk.setHarga(119000);
        // memanggil method getHarga pada class KipasAngin
        System.out.println("Harga                   : Rp "+produk.getHarga());
        
        //penutup
        System.out.println("\n================================================");
        System.out.println("          TERIMAKASIH TELAH BERBELANJA \n   BARANG YANG DIBELI TIDAK DAPAT DIKEMBALIKAN");
        System.out.println("================================================");
    }
    
}
