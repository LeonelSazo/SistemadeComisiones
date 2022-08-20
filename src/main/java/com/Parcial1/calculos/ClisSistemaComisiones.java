/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Parcial1.calculos;

import com.mycompany.parcial1.ClsVendedores;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author Leonel
 */
//Creasion de la matriz unidimencional y asignacion de valores
public class ClisSistemaComisiones {
    public static void main(String[] args){
        
        double mayorven=0; double mayorven6m=0;
        double menorven=60000; double menorven6m=60000;
        int posimayor=0; int posimenor =0; int opcion=0;
        int posima6m =0;
        int posime6m =0;
        boolean salir=false;
        
        Scanner Ls = new Scanner(System.in);
        //Establecer 2 decimales
        DecimalFormat La = new DecimalFormat("#.00");
        

        ClsVendedores[] l = new ClsVendedores[5];
        l[0]=new ClsVendedores("Leonel");
        l[0].setEnero(520);l[0].setFebrero(480);l[0].setMarzo(350);
        l[0].setAbril(900);l[0].setMayo(200);
        l[0].setJunio(350);l[0].setJulio(220);l[0].setAgosto(333);l[0].setSeptiembre(111);
        l[0].setOctubre(250);l[0].setNoviembre(154);l[0].setDiciembre(274);
        
        l[1]= new ClsVendedores("Alex");
        l[1].setEnero(650);l[1].setFebrero(341);l[1].setMarzo(210);l[1].setAbril(200);
        l[1].setMayo(440);l[1].setJunio(350);l[1].setJulio(230);l[1].setAgosto(223);
        l[1].setSeptiembre(111);l[1].setOctubre(150);l[1].setNoviembre(204);l[1].setDiciembre(274);
        
        l[2]= new ClsVendedores("Laura");
        l[2].setEnero(550);l[2].setFebrero(175);l[2].setMarzo(258);
        l[2].setAbril(400); l[2].setMayo(200); l[2].setJunio(350); l[2].setJulio(220);l[2].setAgosto(333);l[2].setSeptiembre(111);
        l[2].setOctubre(250);l[2].setNoviembre(154);l[2].setDiciembre(274);
        
        l[3]= new ClsVendedores("Jonh");
        l[3].setEnero(264);
        l[3].setFebrero(389);
        l[3].setMarzo(196);
        l[3].setAbril(820);l[3].setMayo(231);l[3].setJunio(530);l[3].setJulio(110);
        l[3].setAgosto(343);l[3].setSeptiembre(151);l[3].setOctubre(210);l[3].setNoviembre(134);l[3].setDiciembre(294);
        
        l[4]= new ClsVendedores("Alexa");
        l[4].setEnero(800);
        l[4].setFebrero(265);l[4].setMarzo(367);l[4].setAbril(160);l[4].setMayo(600);
        l[4].setJunio(291);l[4].setJulio(270);l[4].setAgosto(393);l[4].setSeptiembre(119);l[4].setOctubre(280);
        l[4].setNoviembre(174);l[4].setDiciembre(214);
        
        //recorrido para hacer las operaciones de totales, comi, ISR, liquido a recibir
         for(int i = 0; i < l.length; i++){
             l[i].setTotVentas(l[i].getEnero()+l[i].getFebrero()+l[i].getMarzo()+l[i].getAbril()+l[i].getMayo()+l[i].getJunio()
             +l[i].getJulio()+l[i].getAgosto()+l[i].getSeptiembre()+l[i].getOctubre()+l[i].getNoviembre()+l[i].getDiciembre());
                          
             //if determinar que comision le corresponde en 12 meses
             if(l[i].getTotVentas()<=2000){
                 l[i].setCom20(l[i].getTotVentas()*0.2); 
             }
             else{
                 l[i].setCom35(l[i].getTotVentas()*0.35);
                 //La.format(l[i].getCom35());
             }
             //Ventas mas comisiones
             l[i].setTotVentascomi(l[i].getTotVentas()+l[i].getCom20()+l[i].getCom35());
             
             
             //Calculo ISR
             l[i].setISR(l[i].getTotVentascomi()*0.05);
             
             // Liquido a recibir
             l[i].setLiquido(l[i].getTotVentascomi() - l[i].getISR());
             
             //Total venta en 6 meses
             l[i].setVent6mese(l[i].getEnero()+l[i].getFebrero()+l[i].getMarzo()+l[i].getAbril()+l[i].getMayo()+l[i].getJunio());
             
             //Calculos 6 meses
             if(l[i].getVent6mese()<=2000){
                 l[i].setCom206m(l[i].getVent6mese()*0.2); 
             }
             else{
                 l[i].setCom356m(l[i].getVent6mese()*0.35);
             }
             //Ventas mas comisiones
             l[i].setTotVentascomi6m(l[i].getVent6mese()+l[i].getCom206m()+l[i].getCom356m());
             
             
             //Calculo ISR
             l[i].setISR6m(l[i].getTotVentascomi6m()*0.05);
             
             // Liquido a recibir
             l[i].setLiquido6m(l[i].getTotVentascomi6m() - l[i].getISR6m());
                          
         }
        //recorrido para saber el mayor
        for(int i =0; i < l.length; i++){
            if (l[i].getLiquido()>mayorven){
                mayorven= l[i].getLiquido();
                posimayor = i;
            }
            else if(l[i].getLiquido()<menorven){
                menorven=l[i].getLiquido();
                posimenor=i;
            }       
            if (l[i].getLiquido6m()>mayorven6m){
                mayorven6m= l[i].getLiquido6m();
                posima6m = i;
            }
            else if(l[i].getLiquido6m()<menorven6m){
                menorven6m=l[i].getLiquido6m();
                posime6m=i;
            }  
            
        }
        
        
        //Se crea el menu
        while(!salir){
        System.out.println("________Menu________");
        System.out.println("1.  Dezplegar Matriz");
        System.out.println("2. Vendedor con mas ventas y vendedor con menos ventas 12 meses");
        System.out.println("3. Vendedor con mas ventas y vendedor con menos ventas 6 meses");
        System.out.println("4. Salir");
        System.out.println("Elige lo que deseas ver");
        opcion = Ls.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("NOMBRE\tENERO\tFEBRERO\tMARZO\tABRIL\tMAYO\tJUNIO\tJULIO\tAGOSTO\tSEPTIEMBRE\tOCTUBRE\t"
                        + "\tNOVIEMBRE\tDICIEMBRE\tTOTAL VENTAS\t20%COMISIONES35%\tTOTALVEN YCOMI\tISR\t  \tLIQUIDO A RECIBIR");
                
                for(int i =0; i <l.length; i++){
                    System.out.println(l[i].getNombre()+"\t"+l[i].getEnero()+"\t"+l[i].getFebrero()+"\t"+l[i].getMarzo()+"\t"+l[i].getAbril()+"\t"+l[i].getMayo()+"\t"+l[i].getJunio()+"\t"+l[i].getJulio()+"\t"+l[i].getAgosto()+"\t"+l[i].getSeptiembre()+"\t"+"\t"+l[i].getOctubre()+"\t"+"\t"+l[i].getNoviembre()+"\t"+"\t"+l[i].getDiciembre()+"\t"+"\t"+l[i].getTotVentas()+"\t"+"\t"+l[i].getCom20()+"\t"+La.format(l[i].getCom35())+"\t"+"\t"+La.format(l[i].getTotVentascomi())+"\t"+"\t"+La.format(l[i].getISR())+"\t"+"\t"+La.format(l[i].getLiquido()));
                }
                break;
            case 2:
                System.out.println("Vendedor con Mayor venta 12 meses:"+l[posimayor].getNombre()+"\t"+"Monto: "+La.format(mayorven));
                System.out.println("Vendedor con Menor venta 12 meses:"+l[posimenor].getNombre()+"\t"+"Monto: "+La.format(menorven));
                break;
            case 3:
                System.out.println("Vendedor con Mayor venta 6 meses:"+l[posima6m].getNombre()+"\t"+"Monto: "+La.format(mayorven6m));
                System.out.println("Vendedor con Menor venta 6 meses:"+l[posime6m].getNombre()+"\t"+"Monto: "+ La.format(menorven6m));
                break;
            case 4:
                salir=true;
            default:
                System.out.println("La opcion no es valida");break;
                
        }
        
     }
        System.out.println("------FIN-----");

        
        
    }
    
}
