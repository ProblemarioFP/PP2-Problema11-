/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema11;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class PP2Problema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String dato;    // Declaracion de variables
    
    dato = pedirDato();  //Declaracion de metodos
    mostrarResultados(dato);
    
    }
    
    public static String pedirDato() { //Metodo para pedir numero para convertir a romano
        String dato;
        Scanner entrada= new Scanner(System.in); 
        System.out.println("Introducir número");
        dato= entrada.next();
        return dato;
    }
    
    public static void mostrarResultados(String d){ //Metodo para convertir y mostrar la conversion
        String var = d;    //declaracion de variable y de vector
        char cad [];
        
        cad = var.toCharArray();
        int length = cad.length-1;
        String m="",n="",o="",p="";
    for ( int  i=length; i>=0;--i){
            
            int x;
            
            x = Integer.parseInt(String.valueOf(cad[i]));
            
            
            if (i==2){
            if(x==1){o="X";}
            if(x==2){o="XX";}
            if(x==3){o="XXX";}
            if(x==4){o="XL";}
            if(x==5){o="L";}
            if(x==6){o="LX";}
            if(x==7){o="LXX";}
            if(x==8){o="LXXX";}
            if(x==9){o="XC";}}
            
            if (i==3){
            if(x==1){p="I";}
            if(x==2){p="II";}
            if(x==3){p="III";}
            if(x==4){p="IV";}
            if(x==5){p="V";}
            if(x==6){p="VI";}
            if(x==7){p="VII";}
            if(x==8){p="VIII";}
            if(x==9){p="IX";}}
            
            if (i==1){
            if(x==1){n="C";}
            if(x==2){n="CC";}
            if(x==3){n="CCC";}
            if(x==4){n="CD";}
            if(x==5){n="D";}
            if(x==6){n="DC";}
            if(x==7){n="DCC";}
            if(x==8){n="DCCC";}
            if(x==9){n="CM";}}
            
            if (i==0){
            if(x==1){m ="M";}
            if(x==2){m= "MM";}
            if(x==3){m= "MMM";}
            if(x==4){m = "MMMM";}
            if(x==5){m="MMMMM";}
            if(x==6){m= "MMMMMM";}
            if(x==7){m= "MMMMMMM";}
            if(x==8){m= "MMMMMMMM";}
            if(x==9){m= "MMMMMMMMM";}}
            
            
            }
            System.out.println(m+n+o+p);
            
    }}