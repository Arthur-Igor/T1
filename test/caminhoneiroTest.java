/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Data.Caminhoneiro;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Artu
 */
public class caminhoneiroTest {

    Caminhoneiro c1 = new Caminhoneiro(0, "nome", 0, 0);
    Caminhoneiro c2 = new Caminhoneiro(0, "nome", 0, 0);

    public caminhoneiroTest() {

    }

    @Before
    public void setUp() {
        c1.setId(1);
        c1.setDescontos(100.00);
        c1.setImpostos(100);
        c1.setKmPercorridos(100);
        c1.setToneladas(10);

        c1.setDescontos(100.00);
        c1.setImpostos(1000.00);

    }

    @Test
    public void getToneladasTest() {
        Assert.assertEquals(10, c1.getToneladas(), 0.1);
    }

    @Test
    public void getToneladasTestEx() {
        Assert.assertNotEquals(0, c1.getToneladas(), 0.1);
    }

    @Test
    public void getKmPercorridosTest() {
        Assert.assertEquals(100, c1.getKmPercorridos(), 0.1);
    }

    @Test
    public void getKmPercorridosTestEx() {
        Assert.assertNotEquals(1, c1.getKmPercorridos(), 0.1);
    }

    @Test
    public void calculaImpostosTest() {
        Assert.assertEquals(500.00, c1.calculaImpostos(), 0.1);
    }

    @Test
    public void calculaImpostosTestEx() {
        Assert.assertNotEquals(00.00, c1.calculaImpostos(), 0.1);
    }

    @Test
    public void calculaDescontosTest() {
        Assert.assertEquals(100 * 0.01, c1.calculaDescontos(), 0.1);
    }

    @Test
    public void calculaDescontosTestEx() {
        Assert.assertNotEquals(100 * 0.02, c1.calculaDescontos(), 0.1);
    }

    @Test
    public void calculaTributacaoTest() {
        Assert.assertEquals(00, c1.calculaTributacao(), 0.1);
    }

    @Test
    public void calculaTributacaoTest2() {
        Assert.assertEquals(900, c2.calculaTributacao(), 0.1);
    }

    @After
    public void tearDown() {
        c1 = c2 = null;
        System.gc();//coleta de lixo (garbage colector)
    }

}
