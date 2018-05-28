/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasteles;

/**
 *
 * @author Margarita
 */
public class main {
    public static void main(String args[]){
        
        
    }
    public Pasteles getPasteles(){
            return new Pasteles.pastelesBuilder("Vinilla", 4)
           .frutas("manzana").cobertura("fresa").relleno("chocolate")
            .build();
        }
}
