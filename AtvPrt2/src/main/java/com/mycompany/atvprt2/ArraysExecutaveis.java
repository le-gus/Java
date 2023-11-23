/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atvprt2;
import java.util.Random;

/**
 *
 * @author gusta
 */
public class ArraysExecutaveis {
        int trocas;
        Random rand = new Random();

        int[] arr10 = new int[10];
        int[] arr50 = new int[50];
        int[] arr20000 = new int[20000];

        public void GerarEntradasAleatorias(int[] arr, int qtd){
            for (int i = 0; i < qtd; i++) {
                arr[i] = rand.nextInt(20000);  
            }
        }
        public void selectionSort(int[] array){
            for(int atual = 0; atual < array.length; atual++){
            int menor = buscarMenorValor(array,atual,array.length);
            int valorAtual = array[atual];
            int valorMenor = array[menor];
            array[atual] = valorMenor;
            array[menor] = valorAtual;
            trocas++;
            }
        }

        public static int buscarMenorValor(int[] array, int inicio, int fim){
        int menorValor = inicio;
        for(int atual = inicio; atual < fim; atual++){
            if(array[atual]<array[menorValor]){
                menorValor = atual;
            }
        }
        return menorValor;
    }
        
       public void insertionSort(int[] array){ 
           for(int atual=0; atual < array.length; atual++){
            int analise = atual;
            while(analise > 0 && array[analise] < array[analise-1]){
                int valorAnalise = array[analise];
                int valorAnaliseMenos1 = array[analise-1];
                array[analise] = valorAnaliseMenos1;
                array[analise-1] = valorAnalise;
                analise--;
                trocas++;
        }
    }
}
       
    void merge(int array[], int inicio, int meio, int fim) {
    int tamanhoEsquerda = meio - inicio + 1;
    int tamanhoDireita = fim - meio;

    int arrayEsquerda[] = new int[tamanhoEsquerda];
    int arrayDireita[] = new int[tamanhoDireita];

    for (int i = 0; i < tamanhoEsquerda; ++i)
        arrayEsquerda[i] = array[inicio + i];
    for (int j = 0; j < tamanhoDireita; ++j)
        arrayDireita[j] = array[meio + 1 + j];

    int indiceEsquerda = 0, indiceDireita = 0;

    int indiceArray = inicio;
    while (indiceEsquerda < tamanhoEsquerda && indiceDireita < tamanhoDireita) {
        if (arrayEsquerda[indiceEsquerda] <= arrayDireita[indiceDireita]) {
            array[indiceArray] = arrayEsquerda[indiceEsquerda];
            indiceEsquerda++;
        } else {
            array[indiceArray] = arrayDireita[indiceDireita];
            indiceDireita++;
            trocas += tamanhoEsquerda - indiceEsquerda;
        }
        indiceArray++;
        trocas++;  
    }

    while (indiceEsquerda < tamanhoEsquerda) {
        array[indiceArray] = arrayEsquerda[indiceEsquerda];
        indiceEsquerda++;
        indiceArray++;
        trocas++;  
    }

    while (indiceDireita < tamanhoDireita) {
        array[indiceArray] = arrayDireita[indiceDireita];
        indiceDireita++;
        indiceArray++;
    }
}

    void mSort(int array[], int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;

            mSort(array, inicio, meio);
            mSort(array, meio + 1, fim);

            merge(array, inicio, meio, fim);
        }
    }

    /*
     int particionar(int array[], int inicio, int fim) {
        int pivo = array[fim]; 
        int i = (inicio - 1); 

        for (int j = inicio; j < fim; j++) {
            if (array[j] <= pivo) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                trocas++;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[fim];
        array[fim] = temp;
        trocas++;

        return i + 1;
    }

     
    void quickSort(int array[], int inicio, int fim) {
        if (inicio < fim) {
            int indicePivo = particionar(array, inicio, fim);

            quickSort(array, inicio, indicePivo - 1);
            quickSort(array, indicePivo + 1, fim);
        }
    }
   */
     
void quickSort(int array[], int inicio, int fim) {
    while (inicio < fim) {
        int indicePivo = particionar(array, inicio, fim);
        if (indicePivo - inicio < fim - indicePivo) {
            quickSort(array, inicio, indicePivo - 1);
            inicio = indicePivo + 1;
        } else {
            quickSort(array, indicePivo + 1, fim);
            fim = indicePivo - 1;
        }
    }
}

int particionar(int array[], int inicio, int fim) {
    int pivo = array[fim];  
    int i = (inicio - 1); 
    for (int j = inicio; j < fim; j++) {
        if (array[j] <= pivo) {
            i++;
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            trocas++;
        }
    }
    int temp = array[i + 1];
    array[i + 1] = array[fim];
    array[fim] = temp;
    trocas++;
    return (i + 1);
}   

    
    //MÉTODOS DE ORDENAÇÃO DECRESCENTE
    
public void selectionSortDecrescente(int[] array){
    for(int atual = 0; atual < array.length; atual++){
        int maior = buscarMaiorValor(array,atual,array.length);
        if (atual != maior) {
            int valorAtual = array[atual];
            int valorMaior = array[maior];
            array[atual] = valorMaior;
            array[maior] = valorAtual;
            trocas++;
        }
    }
}

public static int buscarMaiorValor(int[] array, int inicio, int fim){
    int maiorValor = inicio;
    for(int atual = inicio; atual < fim; atual++){
        if(array[atual]>array[maiorValor]){
            maiorValor = atual;
        }
    }
    return maiorValor;
}

    public void insertionSortDecrescente(int[] array){
        for(int atual=0; atual < array.length; atual++){
        int analise = atual;
        int valorAnalise = array[analise];
        while(analise > 0 && valorAnalise > array[analise-1]){
            array[analise] = array[analise-1];
            analise--;
        }
        array[analise] = valorAnalise;
        if (analise != atual) {
            trocas++;
        }
    }
}
/*
    int particionarDecrescente(int array[], int inicio, int fim) {
        int pivo = array[fim]; 
        int i = (inicio - 1);

        for (int j = inicio; j < fim; j++) {
            if (array[j] >= pivo) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                trocas++;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[fim];
        array[fim] = temp;
        trocas++;

        return i + 1;
    }

    void quickSortDecrescente(int array[], int inicio, int fim) {
        if (inicio < fim) {
            int indicePivo = particionarDecrescente(array, inicio, fim);

            quickSortDecrescente(array, inicio, indicePivo - 1);
            quickSortDecrescente(array, indicePivo + 1, fim);
        }
    }*/
    
void quickSortDecrescente(int array[], int inicio, int fim) {
    while (inicio < fim) {
        int indicePivo = particionarDecrescente(array, inicio, fim);
        if (indicePivo - inicio < fim - indicePivo) {
            quickSortDecrescente(array, inicio, indicePivo - 1);
            inicio = indicePivo + 1;
        } else {
            quickSortDecrescente(array, indicePivo + 1, fim);
            fim = indicePivo - 1;
        }
    }
}

int particionarDecrescente(int array[], int inicio, int fim) {
    int pivo = array[fim];  
    int i = (inicio - 1); 
    for (int j = inicio; j < fim; j++) {
        if (array[j] >= pivo) {
            i++;
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            trocas++;
        }
    }
    int temp = array[i + 1];
    array[i + 1] = array[fim];
    array[fim] = temp;
    trocas++;
    return (i + 1);
}

    void mergeDecrescente(int array[], int inicio, int meio, int fim) {
    int tamanhoEsquerda = meio - inicio + 1;
    int tamanhoDireita = fim - meio;

    int arrayEsquerda[] = new int[tamanhoEsquerda];
    int arrayDireita[] = new int[tamanhoDireita];

    for (int i = 0; i < tamanhoEsquerda; ++i)
        arrayEsquerda[i] = array[inicio + i];
    for (int j = 0; j < tamanhoDireita; ++j)
        arrayDireita[j] = array[meio + 1 + j];

    int indiceEsquerda = 0, indiceDireita = 0;

    int indiceArray = inicio;
    while (indiceEsquerda < tamanhoEsquerda && indiceDireita < tamanhoDireita) {
        if (arrayEsquerda[indiceEsquerda] >= arrayDireita[indiceDireita]) {
            array[indiceArray] = arrayEsquerda[indiceEsquerda];
            indiceEsquerda++;
        } else {
            array[indiceArray] = arrayDireita[indiceDireita];
            indiceDireita++;
            trocas += tamanhoEsquerda - indiceEsquerda;  
        }
        indiceArray++;
        trocas++;  
    }

    while (indiceEsquerda < tamanhoEsquerda) {
        array[indiceArray] = arrayEsquerda[indiceEsquerda];
        indiceEsquerda++;
        indiceArray++;
    }

    while (indiceDireita < tamanhoDireita) {
        array[indiceArray] = arrayDireita[indiceDireita];
        indiceDireita++;
        indiceArray++;
        trocas++;
    }
}

    void mSortDecrescente(int array[], int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;

            mSortDecrescente(array, inicio, meio);
            mSortDecrescente(array, meio + 1, fim);

            mergeDecrescente(array, inicio, meio, fim);
        }
    }
    
    
}
