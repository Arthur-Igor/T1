/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Data.Caminhoneiro;
import Data.Medico;
import Data.MeuSistemaSimplesDeTributacao;
import Data.Professor;
import Data.Taxista;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Artu
 */
public class SistemaTest {

    MeuSistemaSimplesDeTributacao m = new MeuSistemaSimplesDeTributacao();

    public SistemaTest() {

    }

    @Before
    public void setUp() {
        Caminhoneiro caminhoneiro = new Caminhoneiro(0, "nome", 100, 100);
        m.caminhoneirosCadastrados.add(caminhoneiro);
        Medico medico = new Medico(0, "nome", 100, 100);
        m.medicosCadastrados.add(medico);
        Professor professor = new Professor(0, "nome", 100, 100);
        m.professoresCadastrados.add(professor);
        Taxista taxista = new Taxista(0, "nome", 100, 100);
        m.taxistasCadastrados.add(taxista);
    }

    @Test
    public void getRiquezaCaminhoneirosTest() {
        Assert.assertEquals(200, m.riquezaCaminhoneiros(), 0.1);
    }

    @Test
    public void getRiquezaCaminhoneirosTestEx() {
        Assert.assertNotEquals(00, m.riquezaCaminhoneiros(), 0.1);
    }

    @Test
    public void getRiquezaMedicosTest() {
        Assert.assertEquals(200, m.riquezaMedicos(), 0.1);
    }

    @Test
    public void getRiquezaMedicosTestEx() {
        Assert.assertNotEquals(00, m.riquezaMedicos(), 0.1);
    }

    @Test
    public void getRiquezaProfessoresTest() {
        Assert.assertEquals(200, m.riquezaProfesores(), 0.1);
    }

    @Test
    public void getRiquezaProfessoresTestEx() {
        Assert.assertNotEquals(00, m.riquezaProfesores(), 0.1);
    }

    @Test
    public void getRiquezaTaxistasTest() {
        Assert.assertEquals(200, m.riquezaTaxistas(), 0.1);
    }

    @Test
    public void getRiquezaTaxistasTestEx() {
        Assert.assertNotEquals(00, m.riquezaTaxistas(), 0.1);
    }

    @After
    public void tearDown() {
        m = null;
        System.gc();//coleta de lixo (garbage colector)
    }

}
