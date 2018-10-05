/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio07;

import Data.MeuSistemaSimplesDeTributacao;

/**
 *
 * @author Artu
 */
public class Laboratorio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MeuSistemaSimplesDeTributacao oxe = new MeuSistemaSimplesDeTributacao();
        boolean contador = true;
        System.err.println("Bem vindo!");
        while (contador) {
            System.err.println("!=======================!Menu principal:!=======================!");
            System.err.println("(1) P/ Cadastrar\n(2) P/ Calcular e mostrar impostos e descontos\n(3) P/ Listar os contribuintes em função de Riquezas");
            int m1 = oxe.verifica();
            switch (m1) {
                case 1://Menu para cadastros
                    System.err.println("!=======================!Cadastros!=======================!");
                    System.err.println("(1) P/ Cadastrar Caminhoneiros\n(2) P/ Cadastrar Medicos\n(3) P/ Cadastrar Professores\n(4)  P/ Cadastrar Taxistas");
                    int m2 = oxe.verifica();
                    switch (m2) {//
                        case 1://para caminhoneiros
                            oxe.cadastrarCaminhoneiro();
                            break;
                        case 2://para medicos
                            oxe.cadastrarMedico();
                            break;
                        case 3:// para professoes
                            oxe.cadastrarProfessor();
                            break;
                        case 4://para taxistas
                            oxe.cadastrarTaxista();
                            break;

                    }
                    break;
                case 2://Menu para impostos e descontos    
                    System.err.println("!=======================!Impostos e descontos!=======================!");
                    System.err.println("(1) P/  Caminhoneiros\n(2) P/  Medicos\n(3) P/ Professores\n(4)  P/ Taxistas");
                    int m3 = oxe.verifica();
                    switch (m3) {//
                        case 1://para caminhoneiros
                            oxe.listarCaminhoneiros();
                            System.err.println("\nDigite o id do caminhoneiro!");
                            int id = oxe.verifica();
                            oxe.infoCaminhoneiro(id);

                            break;
                        case 2://para medicos
                            oxe.listarMedicos();
                            System.err.println("\nDigite o id do medico!");
                            id = oxe.verifica();
                            oxe.infoMedico(id);
                            break;
                        case 3:// para professoes
                            oxe.listarProfessores();
                            System.err.println("\nDigite o id do professor!");
                            id = oxe.verifica();
                            oxe.infoProfessor(id);
                            break;
                        case 4://para taxistas
                            oxe.listarTaxistas();
                            System.err.println("\nDigite o id do taxista!");
                            id = oxe.verifica();
                            oxe.infoTaxista(id);

                            break;

                    }

                    break;
                case 3://Menu para contribuintes
                    System.err.println("!=======================!Sinais exteriores de riqueza!=======================!");
                    System.err.println("(1) P/ Caminhoneiros\n(2) P/  Medicos\n(3) P/  Professoresz\n(4)  P/ Taxistas");
                    int m4 = oxe.verifica();
                    switch (m4) {//
                        case 1://para caminhoneiros
                            oxe.mostrarLimiarDeRiquezaCaminhoneiro();
                            break;
                        case 2://para medicos
                            oxe.mostrarLimiarDeRiquezaMedico();
                            break;
                        case 3:// para professoes
                            oxe.mostrarLimiarDeRiquezaProfessor();
                            break;
                        case 4://para taxistas
                            oxe.mostrarLimiarDeRiquezaTaxista();
                            break;

                    }

                    break;
            }

        }

    }

}
