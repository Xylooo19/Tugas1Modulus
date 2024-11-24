/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika1;

/**
 *
 * @author Xylo
 */
public class Matematika1Beraksi {
    
   public static void main(String[] args) {
       Matematika1 hasil = new Matematika1();
       hasil.setPertambahan(7, 5);
       System.out.println("Hasil dari Pertambahan = " + hasil.getPertambahan());
       
       hasil.setPengurangan(15, 12);
       System.out.println("Hasil dari Pembagian = " + hasil.getPengurangan());
       
       hasil.setPerkalian(7, 4);
       System.out.println("Hasil dari perkalian = " + hasil.getPerkalian());
       
       hasil.setPembagian(64, 8);
       System.out.println("Hasil dari pembagian = " + hasil.getPembagian());
       
       
   }
      
}
