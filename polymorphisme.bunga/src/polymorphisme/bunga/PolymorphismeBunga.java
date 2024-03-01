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
public class PolymorphismeBunga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bunga bunga1 = new bunga("tulip", "merah");
        BungaMawar bunga2 = new BungaMawar("putih",true);
        
        bunga1.infobunga();
        System.out.println("_________________");
        bunga2.infoBungaMawar();
                
    }
    
}
