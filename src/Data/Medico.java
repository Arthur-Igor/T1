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
public class Medico extends Pessoa {

    public Medico(int numero, String nome, double casa, double carro) {
        super(numero, nome, casa, carro);
    }
    private int numeroPacientes;
    private double dispesasCongressos;

    public int getNumeroPacientes() {
        return numeroPacientes;
    }

    public void setNumeroPacientes(int numeroPacientes) {
        this.numeroPacientes = numeroPacientes;
    }

    public double calculaImpostos() {
        double impostos = numeroPacientes * 10;
        return impostos;
    }

    public double getDispesasCongressos() {
        return dispesasCongressos;
    }

    public void setDispesasCongressos(double dispesasCongressos) {
        this.dispesasCongressos = dispesasCongressos;
    }
    public double calculaDescontos(){
        double descontos = dispesasCongressos;

        return descontos;
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
