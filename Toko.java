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
public class Toko {
    //mendefinisikan variabel
    private String Admin;
    int harga;
    int total;
    String merk;
    
    //menerapkan method Display
    public void Display(){
        System.out.println("    Welcome To Meteor Electronic Shop   ");
        System.out.println("           Suhat, Malang 623118         ");
        System.out.println("    =================================");
    }
    //menerapkan method setAdmin
    public void setAdmin(String Admin){
        this.Admin = Admin;
    }
    //menerapkan method getAdmin
    public String getAdmin(){
        return Admin;
    }
}
