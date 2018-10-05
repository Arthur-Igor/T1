/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Artu
 */
public class MeuSistemaSimplesDeTributacao {

    public ArrayList<Caminhoneiro> caminhoneirosCadastrados = new ArrayList<>();
    public ArrayList<Medico> medicosCadastrados = new ArrayList<>();
    public ArrayList<Professor> professoresCadastrados = new ArrayList<>();
    public ArrayList<Taxista> taxistasCadastrados = new ArrayList<>();
    private Scanner ler;

    private int id = 0;

    public void idd() {//incrementa o id
        id++;
    }

    //caminhoneiro
    public void cadastrarCaminhoneiro() {
        ler = new Scanner(System.in);
        System.err.println("Digite o nome do caminhoneiro\n");
        String nome = ler.next();
        System.err.println("O caminhoneiro possui casa propia? Se sim digite o valor do bem!\n");
        double casa = verifica();
        System.err.println("O caminhoneiro possui carro propio?Se sim digite o valor do bem! \n");
        double carro = verifica();
        idd();
        int ind = id;
        Caminhoneiro caminhoneiro = new Caminhoneiro(ind, nome, casa, carro);
        System.err.println("Digite a quantidade de toneladas transportadas no ultimo ano!\n");
        int toneladas = verifica();
        System.err.println("Digite a Quilometragem percorrida no ultimo ano!\n");
        int quilometragem = verifica();
        caminhoneiro.setKmPercorridos(quilometragem);
        caminhoneiro.setToneladas(toneladas);
        caminhoneirosCadastrados.add(caminhoneiro);
        System.out.println("CADASTRO CONCLUIDO! \n");
    }

    public void listarCaminhoneiros() { //funcao para listar

        if (caminhoneirosCadastrados.isEmpty()) {
            System.err.println("Não existem caminhoneiros cadastrados");
        } else {
            System.out.println("Caminhoneiros: \n");
            String esta = caminhoneirosCadastrados.toString();
            System.out.println(esta);

        }

    }

    public double riquezaCaminhoneiros() {
        double valor = 0;
        if (caminhoneirosCadastrados.isEmpty()) {
            System.err.println("Nao existem caminhoneiros cadastrados!\n");
            return 0;
        } else {
            for (int i = 0; i < caminhoneirosCadastrados.size(); i++) {
                valor = valor + (caminhoneirosCadastrados.get(i).getCarro()) + (caminhoneirosCadastrados.get(i).getCasa());
            }
            return valor / caminhoneirosCadastrados.size();
        }

    }

    public void infoCaminhoneiro(int numero) {
        int a = 0;
        if (caminhoneirosCadastrados.isEmpty()) {
        } else {
            for (int i = 0; i < caminhoneirosCadastrados.size(); i++) {
                if (caminhoneirosCadastrados.get(i).getId() == numero) {
                    System.err.println("Impostos: " + caminhoneirosCadastrados.get(i).calculaImpostos() + "R$");
                    System.err.println("Descontos: " + caminhoneirosCadastrados.get(i).calculaDescontos() + "R$");
                    System.err.println("Tributacao final: " + caminhoneirosCadastrados.get(i).calculaTributacao() + "R$");
                    a = 1;

                }
            }
            if (a == 0) {
                System.err.println("Nao existem caminhoneiros cadastrados com esse id!");
            }

        }
    }

    public void mostrarLimiarDeRiquezaCaminhoneiro() {
        if (caminhoneirosCadastrados.isEmpty()) {
            System.err.println("Nao existem caminhoneiros cadastrados");
        } else {
            System.err.println("A media do valor dos bens dos caminhoneiros é: " + riquezaCaminhoneiros() + "R$");
            System.err.println("Excessivos:");
            for (int i = 0; i < caminhoneirosCadastrados.size(); i++) {
                if ((caminhoneirosCadastrados.get(i).getCarro() + caminhoneirosCadastrados.get(i).getCasa()) > riquezaCaminhoneiros()) {
                    //verifica se o valor dos bens do cadastrado atual é maior que o total/

                    System.err.println(caminhoneirosCadastrados.get(i).getNome() + ", " + (caminhoneirosCadastrados.get(i).getCarro() + caminhoneirosCadastrados.get(i).getCasa()) + "R$");
                }
            }
            System.err.println("Menores ou na media:");
            for (int i = 0; i < caminhoneirosCadastrados.size(); i++) {
                if ((caminhoneirosCadastrados.get(i).getCarro() + caminhoneirosCadastrados.get(i).getCasa()) <= riquezaCaminhoneiros()) {
                    //verifica se o valor dos bens do cadastrado atual é menos/igual que o total/

                    System.err.println(caminhoneirosCadastrados.get(i).getNome() + ", " + (caminhoneirosCadastrados.get(i).getCarro() + caminhoneirosCadastrados.get(i).getCasa()) + "R$");
                }

            }

        }
    }

    //medico
    public void cadastrarMedico() {
        ler = new Scanner(System.in);
        System.err.println("Digite o nome do medico\n");
        String nome = ler.next();
        System.err.println("O medico possui casa propia? Se sim digite o valor do bem!\n");
        double casa = verifica();
        System.err.println("O medico possui carro propio? Se sim digite o valor do bem!\n");
        double carro = verifica();
        idd();
        int ind = id;
        Medico medico = new Medico(ind, nome, casa, carro);
        System.err.println("Digite a quantidade de pacientes atendidos no ultimo ano!\n");
        int pacientes = verifica();
        System.err.println("Digite os gastos em congressos no ultimo ano!\n");
        double congressos = ler.nextDouble();
        medico.setDispesasCongressos(congressos);
        medico.setNumeroPacientes(pacientes);
        medicosCadastrados.add(medico);
        System.out.println("CADASTRO CONCLUIDO! \n");
    }

    public void listarMedicos() { //funcao para listar

        if (medicosCadastrados.isEmpty()) {
            System.err.println("Não existem medicos cadastrados");
        } else {
            System.out.println("Medicos: \n");
            String esta = medicosCadastrados.toString();
            System.out.println(esta);

        }

    }

    public double riquezaMedicos() {
        double valor = 0;
        if (medicosCadastrados.isEmpty()) {
            System.err.println("Nao existem medicos cadastrados!\n");
            return 0;
        } else {
            for (int i = 0; i < medicosCadastrados.size(); i++) {
                valor = valor + (medicosCadastrados.get(i).getCarro()) + (medicosCadastrados.get(i).getCasa());

            }
            return valor / medicosCadastrados.size();
        }

    }

    public void infoMedico(int numero) {
        int a = 0;
        if (medicosCadastrados.isEmpty()) {

        } else {
            for (int i = 0; i < medicosCadastrados.size(); i++) {
                if (medicosCadastrados.get(i).getId() == numero) {
                    System.err.println("Impostos: " + medicosCadastrados.get(i).calculaImpostos() + "R$");
                    System.err.println("Descontos: " + medicosCadastrados.get(i).calculaDescontos() + "R$");
                    System.err.println("Tributacao final: " + medicosCadastrados.get(i).calculaTributacao() + "R$");
                    a = 1;

                }
            }
            if (a == 0) {
                System.err.println("Nao existem medicos cadastrados com esse id!");
            }

        }
    }

    public void mostrarLimiarDeRiquezaMedico() {
        if (medicosCadastrados.isEmpty()) {
            System.err.println("Nao existem medicos cadastrados");
        } else {
            System.err.println("A media do valor dos bens dos medicos é: " + riquezaMedicos() + "R$");
            System.err.println("Excessivos:");
            for (int i = 0; i < medicosCadastrados.size(); i++) {
                if ((medicosCadastrados.get(i).getCarro() + medicosCadastrados.get(i).getCasa()) > riquezaMedicos()) {
                    //verifica se o valor dos bens do cadastrado atual é maior que o total/

                    System.err.println(medicosCadastrados.get(i).getNome() + ", " + (medicosCadastrados.get(i).getCarro() + medicosCadastrados.get(i).getCasa()) + "R$");
                }
            }
            System.err.println("Menores ou na media:");
            for (int i = 0; i < medicosCadastrados.size(); i++) {
                if ((medicosCadastrados.get(i).getCarro() + medicosCadastrados.get(i).getCasa()) <= riquezaMedicos()) {
                    //verifica se o valor dos bens do cadastrado atual é menos/igual que o total/

                    System.err.println(medicosCadastrados.get(i).getNome() + ", " + (medicosCadastrados.get(i).getCarro() + medicosCadastrados.get(i).getCasa()) + "R$");
                }

            }

        }
    }
    //professores

    public void cadastrarProfessor() {
        ler = new Scanner(System.in);
        System.err.println("Digite o nome do professor\n");
        String nome = ler.next();
        System.err.println("O professor possui casa propia? Se sim digite o valor do bem!\n");
        double casa = verifica();
        System.err.println("O professor possui carro propio? Se sim digite o valor do bem!\n");
        double carro = verifica();
        idd();
        int ind = id;
        Professor professor = new Professor(ind, nome, casa, carro);
        System.err.println("Digite o salario atual do professor!\n");
        double salario = verifica();
        System.err.println("Digite os gastos com material didatico no ultimo ano!\n");
        double gastosMaterial = verifica();
        professor.setGastosMaterial(gastosMaterial);
        professor.setFaixaDeSalario(salario);
        professoresCadastrados.add(professor);
        System.out.println("CADASTRO CONCLUIDO! \n");
    }

    public void listarProfessores() { //funcao para listar

        if (professoresCadastrados.isEmpty()) {
            System.err.println("Não existem professores cadastrados");
        } else {
            System.out.println("Professores: \n");
            String esta = professoresCadastrados.toString();
            System.out.println(esta);

        }

    }

    public double riquezaProfesores() {
        double valor = 0;
        if (professoresCadastrados.isEmpty()) {
            System.err.println("Nao existem professores cadastrados!\n");
            return 0;
        } else {
            for (int i = 0; i < professoresCadastrados.size(); i++) {
                valor = valor + (professoresCadastrados.get(i).getCarro()) + (professoresCadastrados.get(i).getCasa());

            }
            return valor / professoresCadastrados.size();
        }

    }

    public void infoProfessor(int numero) {
        int a = 0;

        if (professoresCadastrados.isEmpty()) {
        } else {
            for (int i = 0; i < professoresCadastrados.size(); i++) {
                if (professoresCadastrados.get(i).getId() == numero) {
                    System.err.println("Impostos: " + professoresCadastrados.get(i).calculaImpostos() + "R$");
                    System.err.println("Descontos: " + professoresCadastrados.get(i).calculaDescontos() + "R$");
                    System.err.println("Tributacao final: " + professoresCadastrados.get(i).calculaTributacao() + "R$");
                    a = 1;

                }
            }
            if (a == 0) {
                System.err.println("Nao existem professores cadastrados com esse id!");
            }

        }
    }

    public void mostrarLimiarDeRiquezaProfessor() {
        if (professoresCadastrados.isEmpty()) {
            System.err.println("Nao existem professores cadastrados");
        } else {
            System.err.println("A media do valor dos bens dos professores é: " + riquezaProfesores() + "R$");
            System.err.println("Excessivos:");
            for (int i = 0; i < professoresCadastrados.size(); i++) {
                if ((professoresCadastrados.get(i).getCarro() + professoresCadastrados.get(i).getCasa()) > riquezaProfesores()) {
                    //verifica se o valor dos bens do cadastrado atual é maior que o total/

                    System.err.println(professoresCadastrados.get(i).getNome() + ", " + (professoresCadastrados.get(i).getCarro() + professoresCadastrados.get(i).getCasa()) + "R$");
                }
            }
            System.err.println("Menores ou na media:");
            for (int i = 0; i < professoresCadastrados.size(); i++) {
                if ((professoresCadastrados.get(i).getCarro() + professoresCadastrados.get(i).getCasa()) <= riquezaProfesores()) {
                    //verifica se o valor dos bens do cadastrado atual é menos/igual que o total/

                    System.err.println(professoresCadastrados.get(i).getNome() + ", " + (professoresCadastrados.get(i).getCarro() + professoresCadastrados.get(i).getCasa()) + "R$");
                }

            }

        }
    }

    //taxistas
    public void cadastrarTaxista() {
        ler = new Scanner(System.in);
        System.err.println("Digite o nome do taxista\n");
        String nome = ler.next();
        System.err.println("O taxista possui casa propia? Se sim digite o valor do bem!\n");
        double casa = verifica();
        System.err.println("O taxista possui carro propio? Se sim digite o valor do bem!\n");
        double carro = verifica();
        idd();
        int ind = id;
        Taxista taxista = new Taxista(ind, nome, casa, carro);
        System.err.println("Digite o numero de passageiros transportados no ultimo ano!\n");
        int passageiros = verifica();
        System.err.println("Digite a quilometragem percorrida no ultimo ano!\n");
        int kmPercorridos = verifica();
        taxista.setKmPercorridos(kmPercorridos);
        taxista.setNumDePassageiros(passageiros);
        taxistasCadastrados.add(taxista);
        System.out.println("CADASTRO CONCLUIDO! \n");
    }

    public void listarTaxistas() { //funcao para listar

        if (taxistasCadastrados.isEmpty()) {
            System.err.println("Não existem taxistas cadastrados");
        } else {
            System.out.println("Taxistas: \n");
            String esta = taxistasCadastrados.toString();
            System.out.println(esta);

        }

    }

    public double riquezaTaxistas() {
        double valor = 0;
        if (taxistasCadastrados.isEmpty()) {
            System.err.println("Nao existem taxistas cadastrados!\n");
            return 0;
        } else {
            for (int i = 0; i < taxistasCadastrados.size(); i++) {
                valor = valor + (taxistasCadastrados.get(i).getCarro()) + (taxistasCadastrados.get(i).getCasa());

            }
            return valor / taxistasCadastrados.size();
        }

    }

    public void infoTaxista(int numero) {
        int a = 0;
        if (taxistasCadastrados.isEmpty()) {
        } else {
            for (int i = 0; i < taxistasCadastrados.size(); i++) {
                if (taxistasCadastrados.get(i).getId() == numero) {
                    System.err.println("Impostos: " + taxistasCadastrados.get(i).calculaImpostos() + "R$");
                    System.err.println("Descontos: " + taxistasCadastrados.get(i).calculaDescontos() + "R$");
                    System.err.println("Tributacao final: " + taxistasCadastrados.get(i).calculaTributacao() + "R$");
                    a = 1;

                }
            }
            if (a == 0) {
                System.err.println("Nao existem taxistas cadastrados com esse id!");
            }

        }
    }

    public void mostrarLimiarDeRiquezaTaxista() {
        if (taxistasCadastrados.isEmpty()) {
            System.err.println("Nao existem taxistas cadastrados");
        } else {
            System.err.println("A media do valor dos bens dos taxistas é: " + riquezaTaxistas() + "R$");
            System.err.println("Excessivos:");
            for (int i = 0; i < taxistasCadastrados.size(); i++) {
                if ((taxistasCadastrados.get(i).getCarro() + taxistasCadastrados.get(i).getCasa()) > riquezaTaxistas()) {
                    //verifica se o valor dos bens do cadastrado atual é maior que o total/

                    System.err.println(taxistasCadastrados.get(i).getNome() + ", " + (taxistasCadastrados.get(i).getCarro() + taxistasCadastrados.get(i).getCasa()) + "R$");
                }
            }
            System.err.println("Menores ou na media:");
            for (int i = 0; i < taxistasCadastrados.size(); i++) {
                if ((taxistasCadastrados.get(i).getCarro() + taxistasCadastrados.get(i).getCasa()) <= riquezaTaxistas()) {
                    //verifica se o valor dos bens do cadastrado atual é menos/igual que o total/

                    System.err.println(taxistasCadastrados.get(i).getNome() + ", " + (taxistasCadastrados.get(i).getCarro() + taxistasCadastrados.get(i).getCasa()) + "R$");
                }

            }

        }
    }

    public static int verifica() {//verifica se os dados digitados sao do tipo double
        boolean naoEInt = true;
        int valor = 0;
        while (naoEInt) {
            Scanner leitor = new Scanner(System.in);
            System.out.println("=====================");
            try {
                valor = leitor.nextInt();
                naoEInt = false;
            } catch (Exception e) {
                System.out.println("Os dados digitados não são válidos!");
            }
        }
        return valor;
    }

}
