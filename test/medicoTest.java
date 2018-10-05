/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Data.Medico;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Artu
 */
public class medicoTest {

    Medico m1 = new Medico(0, "nome", 0, 0);
    Medico m2 = new Medico(0, "nome", 0, 0);

    public medicoTest() {
    }

    @Before
    public void setUp() {
        m1.setNumeroPacientes(100);
        m1.setDispesasCongressos(100);
        m2.setDescontos(100);
        m2.setImpostos(1000);
    }

    @Test
    public void calculaImpostosTest() {
        Assert.assertEquals(100 * 10, m1.calculaImpostos(), 0.1);
    }

    @Test
    public void calculaImpostosTestEx() {
        Assert.assertNotEquals(00.00, m1.calculaImpostos(), 0.1);
    }

    @Test
    public void calculaDescontosTest() {
        Assert.assertEquals(100, m1.calculaDescontos(), 0.1);
    }

    @Test
    public void calculaDescontosTestEx() {
        Assert.assertNotEquals(10, m1.calculaDescontos(), 0.1);
    }

    @Test
    public void getNumeroPacientesTest() {
        Assert.assertEquals(100.00, m1.getNumeroPacientes(), 0.1);
    }

    @Test
    public void getDispesasCongresos() {
        Assert.assertEquals(100, m1.getDispesasCongressos(), 0.1);
    }

    @Test
    public void calculaTributacaoTest() {
        Assert.assertEquals(900.0, m1.calculaTributacao(), 0.1);
    }

    @Test
    public void calculaTributacaoTest2() {
        Assert.assertEquals(0.0, m2.calculaTributacao(), 0.1);
    }

    @After
    public void tearDown() {
        m1 = m2 = null;
        System.gc();//coleta de lixo (garbage colector)
    }

}
