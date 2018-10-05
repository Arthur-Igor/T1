/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author Artu
 */
public class Taxista extends Pessoa {

    public Taxista(int numero, String nome, double casa, double carro) {
        super(numero, nome, casa, carro);
    }
    private int numDePassageiros;
    private int kmPercorridos;

    public int getNumDePassageiros() {
        return numDePassageiros;
    }

    public void setNumDePassageiros(int numDePassageiros) {
        this.numDePassageiros = numDePassageiros;
    }

    public int getKmPercorridos() {
        return kmPercorridos;
    }

    public void setKmPercorridos(int kmPercorridos) {
        this.kmPercorridos = kmPercorridos;
    }

    public double calculaImpostos() {
        return numDePassageiros * 0.5;
    }

    public double calculaDescontos() {
        return kmPercorridos * 0.01;
    }
    public double calculaTributacao() {
        double tributacao = calculaImpostos() - calculaDescontos();//as dispesas sao diretamente os descontos
        if (tributacao <= 0) {
            return 0.0;
        } else {
            return tributacao;
        }

    }
}
