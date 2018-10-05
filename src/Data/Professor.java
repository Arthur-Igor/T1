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
public class Professor extends Pessoa{
    public Professor(int numero, String nome, double casa, double carro) {
        super(numero, nome, casa, carro);
    }
    private double faixaDeSalario;
    private double gastosMaterial;



    public double getFaixaDeSalario() {
        return faixaDeSalario;
    }

    public void setFaixaDeSalario(double faixaDeSalario) {
        this.faixaDeSalario = faixaDeSalario;
    }

    public double getGastosMaterial() {
        return gastosMaterial;
    }

    public void setGastosMaterial(double gastosMaterial) {
        this.gastosMaterial = gastosMaterial;
    }
    
    public double calculaImpostos(){
        if(faixaDeSalario<=954)//um salario minimo
            return faixaDeSalario*0.05;

        else if((faixaDeSalario>954)&&(faixaDeSalario<=4770))//de 1 salario minimo a 5 salarios
            return faixaDeSalario*0.10;
        else
            return faixaDeSalario*0.20;
        
    }
    public double calculaDescontos(){
        return gastosMaterial /2;
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
