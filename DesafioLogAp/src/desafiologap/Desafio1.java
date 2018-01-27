package desafiologap;

import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Erick
 */
class Desafio1 {

    //Variavel que armazena Array de variáveis aleatórias.
    private ArrayList<Integer> arrayAleatorio = new ArrayList< Integer>();

    //Variável que armazena o maior subconjunto do array.
    private ArrayList<Integer> maior_subconjunto_s = new ArrayList< Integer>();

    public Desafio1(int tamanho) {
        this.gerarArrayAleatorio(tamanho);
        
        this.print();
    }

    /* 
        Função que gera um array de valores aleatorios não repetidos de acordo
        com o tamanho especificado.
     */
    public void gerarArrayAleatorio(int tamanho) {
        Random random = new Random();
        int temp_random;
        while (arrayAleatorio.size() < tamanho) {
            temp_random = random.nextInt(tamanho);
            if (!arrayAleatorio.contains(temp_random)) {
                arrayAleatorio.add(temp_random);
            }
        }
    }
    /*
        Função que calcula o maior subconjunto.
    */ 
    public void calcularMaiorSubconjuntoS() {

        //Subconjunto temporario gerado a cada elemnto para se identificar qual o maior subconjunto.
        ArrayList<Integer> subconjunto_s = new ArrayList();

        for (int i = 0; i < arrayAleatorio.size(); i++) {
            boolean flag = true;
            int iterador = i;
            while (flag) {
                if (!subconjunto_s.contains(arrayAleatorio.get(iterador))) {
                    subconjunto_s.add(arrayAleatorio.get(iterador));
                    iterador = arrayAleatorio.get(iterador);
                } else {
                    //Checamos se o subconjunto gerado na sequencia e o maior, caso positivo o tornamos o maior entre os arrais.
                    if (subconjunto_s.size() > maior_subconjunto_s.size()) {
                        maior_subconjunto_s.clear();
                        for (int k = 0; k < subconjunto_s.size(); k++) {
                            maior_subconjunto_s.add(subconjunto_s.get(k));
                        }
                    }
                    System.out.print("Subconjunto de indice:"+i+"->");
                    System.out.println(subconjunto_s);
                    subconjunto_s.clear();
                    flag = false;

                }
            }
        }
    }

    /*
        Função que imprime informações geradas.
    */    
    public void print() {
        System.out.println("Desafio 1.");
        System.out.println("Tamanho do array aleatorio " + arrayAleatorio.size());
        System.out.println("Array Aleatorio " + arrayAleatorio);
        this.calcularMaiorSubconjuntoS();
        System.out.println("Maior Subconjunto " + maior_subconjunto_s);
        System.out.println("Tamanho maior Subconjunto = Saída = " + maior_subconjunto_s.size());

    }

}
