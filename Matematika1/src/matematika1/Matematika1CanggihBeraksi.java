/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika1;

/**
 *
 * @author Xylo
 */
public class Matematika1CanggihBeraksi {
    public static void main(String[] args) {
        Matematika1Canggih mtkmodulus = new Matematika1Canggih();
        
        mtkmodulus.setPertambahan(10, 9);
        System.out.println("Hasil dari Pertambahan = " + mtkmodulus.getPertambahan());
   
        mtkmodulus.setPengurangan(20, 9);
        System.out.println("Hasil dari Pengurangan = " + mtkmodulus.getPengurangan());

        mtkmodulus.setPerkalian(200, 10);
        System.out.println("Hasil dari Perkalian = " + mtkmodulus.getPerkalian());

        mtkmodulus.setPembagian(100, 20);
        System.out.println("hasil dari Pembagian = " + mtkmodulus.getPembagian());
        
        mtkmodulus.setModulus(2038, 2019);
        System.out.println("Hasil dari Modulus = " + mtkmodulus.getModulus());
        
      
        

        
        
    }
    
}
