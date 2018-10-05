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
public class Pessoa {

    private int id;
    private String nome;
    private double casa;
    private double carro;
  //  private double valorBens;
    private double impostos;
    private double descontos;

    public Pessoa(int id, String nome, double casa, double carro) {
        this.id = id;
        this.nome = nome;
        this.casa = casa;
        this.carro = carro;
        //this.valorBens = valorBens;
    }

    public double getImpostos() {
        return impostos;
    }

    public void setImpostos(double impostos) {
        this.impostos = impostos;
    }

    public double getDescontos() {
        return descontos;
    }

    public void setDescontos(double descontos) {
        this.descontos = descontos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCasa() {
        return casa;
    }

    public void setCasa(double casa) {
        this.casa = casa;
    }

    public double getCarro() {
        return carro;
    }

    public void setCarro(double carro) {
        this.carro = carro;
    }



//    public double getValorBens() {
//        return valorBens;
//    }
//
//    public void setValorBens(double valorBens) {
//        this.valorBens = valorBens;
//    }

    @Override
    public String toString() {
        return "\nPessoa{" + "numero=" + id + ", nome=" + nome + ", casa=" + casa + ", carro=" + carro +'}';
    }
}
