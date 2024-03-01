/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphisme.bunga;

/**
 *
 * @author User
 */
public class bunga {
String nama;
String warna;

bunga(String nama,String warna){
this.nama = nama;
this.warna = warna;

}
void infobunga(){
    System.out.println("nama bunga:"+nama);
    System.out.println("warna:"+warna);
}
}

//kelas anak subclass yang mewarisi dari kelas bunga




