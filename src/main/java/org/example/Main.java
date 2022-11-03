package org.example;

import org.example.clasesHalloween.Fiesta;
import org.example.clasesHalloween.Invitado;
import org.example.clasesHalloween.Lugar;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner entradaPorTeclado=new Scanner(System.in);
        Invitado objetoInvitado = new Invitado();
        Lugar objetoLugar = new Lugar();
        Fiesta objetoFiesta = new Fiesta();

        //Definiendo costos de la fiesta
        System.out.println("******** GRAN FIESTA GRUPO URIBE********");
        System.out.println("****************************************");

        System.out.println("1. Digita el costo de la comida: ");
        double costoAlimentos=entradaPorTeclado.nextDouble();
        if (costoAlimentos>0){
            objetoFiesta.costosAlimento=costoAlimentos;

        }else {
            System.out.println("Ingresa un valor valido, rata");
        }
        System.out.println("el costo de alimentos fue: "+objetoFiesta.costosAlimento);



        System.out.println("2. Digita el costo de las bebidas: ");
        double costoBebidas=entradaPorTeclado.nextDouble();
        if (costoBebidas>0){
            objetoFiesta.costosBebidas=costoBebidas;

        }else {
            System.out.println("Ingresa un valor valido, rata");
        }
        System.out.println("el costo de la bebida fue: "+objetoFiesta.costosBebidas);



        System.out.println("3. Digita el costo de la lugar: ");
        double costoLugar=entradaPorTeclado.nextDouble();
        if (costoLugar>0){
            objetoFiesta.costosLugar=costoLugar;

        }else {
            System.out.println("Ingresa un valor valido, rata");
        }
       System.out.println("el costo del lugar fue: "+objetoFiesta.costosLugar);



        System.out.println("4. Digita el costo de los equipos: ");
        double costoEquipo=entradaPorTeclado.nextDouble();
        if (costoEquipo>0){
            objetoFiesta.costosEquipo=costoEquipo;

        }else {
            System.out.println("Ingresa un valor valido, rata");
        }
        System.out.println("el costo del equipo fue: "+objetoFiesta.costosEquipo);





    }
}