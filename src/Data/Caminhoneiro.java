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
public class Caminhoneiro extends Pessoa {

    public Caminhoneiro(int numero, String nome, double casa, double carro) {
        super(numero, nome, casa, carro);
    }
    private double toneladas;
    private double kmPercorridos;

    public double getToneladas() {
        return toneladas;
    }

    public void setToneladas(double toneladas) {
        this.toneladas = toneladas;
    }

    public double getKmPercorridos() {
        return kmPercorridos;
    }

    public void setKmPercorridos(double kmPercorridos) {
        this.kmPercorridos = kmPercorridos;
    }

    public double calculaImpostos() {
        if (toneladas <= 10) {
            return 500.00;
        } else {
            return 500 + (toneladas * 100);
        }

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
