/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119912.latihan62.livingthing;

/**
 *
 * @author 
 * NAMA  : Rezki Ramadhan
 * KELAS : IF10K
 * NIM  `: 10119912
 */ 
public abstract class LivingThing {
    public abstract void walk(String nama);
    
    public void Breath(String nama){
        System.out.println(nama + " Bernafas ");
    }
     public void eat(String nama){
         System.out.println(nama + " Makan ");
     }   
}
