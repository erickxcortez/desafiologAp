package desafiologap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Erick
 */
class Desafio2 {

    private int numero_movimentos;
    
    public Desafio2(int valor) {
        this.numero_movimentos=valor;
        this.print();
    }

    public int imprimeMovimentos(int valor) {
        if (valor == 1) {
            System.out.println(valor);
            return 1;
        } else if ((valor % 2) == 0) {
            System.out.print(valor + "->");
            return( 1 + imprimeMovimentos(valor / 2));
        } else if (calculaNumeroMovimentos(valor + 1) < calculaNumeroMovimentos(valor - 1)) {
            System.out.print(valor + "->");
            return 1 + imprimeMovimentos(valor + 1);
        } else {
            System.out.print(valor + "->");
            return 1 + imprimeMovimentos(valor - 1);
        }
    }

    public int calculaNumeroMovimentos(int valor) {
        if (valor == 1) {
            return 1;
        } else if ((valor % 2) == 0) {
            return 1 + calculaNumeroMovimentos(valor / 2);
        } else if (calculaNumeroMovimentos(valor + 1) < calculaNumeroMovimentos(valor - 1)) {
            return 1 + calculaNumeroMovimentos(valor + 1);
        } else {
            return 1 + calculaNumeroMovimentos(valor - 1);
        }
    }

    public void print(){
        System.out.println("Desafio 2");
        System.out.println("Valor: "+this.numero_movimentos);
        this.imprimeMovimentos(this.numero_movimentos);
        System.out.println("Total de movimentos = Saida = "+this.calculaNumeroMovimentos(this.numero_movimentos));
    }
    
}
