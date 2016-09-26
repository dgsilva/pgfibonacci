/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriefibonacci;

/**
 *
 * @author Diego Bizerra
 */
public class SerieFibonacci {

    
    public static void main(String[] args) {
 int x=0 ,y=1, z;
 
 System.out.print(" 0,1,");
 for(int i=0; i<50; i++){
     System.out.print(" " + (x+y));
     z=x;
     x=y;
     y= y+z;
 }
   }
    
}
