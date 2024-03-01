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
public class BungaMawar extends bunga {
boolean berbau;

BungaMawar(String warna,boolean berbau){
super("Mawar", warna);
this.berbau = berbau;
}
void infoBungaMawar(){
super.infobunga();
System.out.println("Berbau: " + (berbau ? "Ya" : "Tidak"));
    
    }

}

