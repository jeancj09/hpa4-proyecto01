package com.jeanj.hpa4_proyecto01;


import java.util.ArrayList;

public class Datos {
    //Aquí se definirán unas variables que se utilizarán en todas las clases.
    public static int pos,tot=0;
    public static int numvoto;
    public static String cedval;
    public static String cand1="Vivian Valenzuela";
    public static String cand2="Omar Aizpurua";
    public static  String cand3="Martín Candanedo";
    public static double vot1,vot2,vot3, vot4;

    public static int cont1 =0, cont2 =0, cont3 =0, cont4 = 0;

    //El orden del array es: 0: cédula, 1: Nombre, 2: Votación
    public static ArrayList<String> listacedula = new ArrayList<String>();
    public static ArrayList<String> listanombres = new ArrayList<String>();
    public static ArrayList<String> voto;

    static {
        voto = new ArrayList<String>();
    }

}
