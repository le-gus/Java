/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atvprt2;

import java.util.Arrays;

/**
 *
 * @author gusta
 */
public class AtvPrt2 {

    public static void main(String[] args) {
        ArraysExecutaveis array = new ArraysExecutaveis();
        
        
        int[] array10 = array.arr10;
        int[] array50 = array.arr50;
        int[] array20000 = array.arr20000;
        array.GerarEntradasAleatorias(array10, 10);
        array.GerarEntradasAleatorias(array50, 50);
        array.GerarEntradasAleatorias(array20000, 20000);
        
        array.selectionSortDecrescente(array50);
        
        System.out.println("Trocas após selectionSortDecrescente: " + array.trocas);  

        System.out.println(Arrays.toString(array50));
    }
}
