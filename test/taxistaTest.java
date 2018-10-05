/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class taxistaTest {

    Taxista t1 = new Taxista(0, "nome", 0, 0);
    Taxista t2 = new Taxista(0, "nome", 0, 0);

    public taxistaTest() {

    }

    @Before
    public void setUp() {
        t1.setDescontos(100);
        t1.setKmPercorridos(100);
        t1.setImpostos(100);
        t1.setNumDePassageiros(100);
        t2.setNumDePassageiros(2);
        t2.setKmPercorridos(2000);
    }



    @Test
    public void getKmPercorridosTest() {
        Assert.assertEquals(100, t1.getKmPercorridos(), 0.1);
    }

    @Test
    public void getNumDePassageirosTest() {
        Assert.assertEquals(100, t1.getNumDePassageiros(), 0.1);
    }

    @Test
    public void calculaImpostosTest() {
        Assert.assertEquals(100 * 0.5, t1.calculaImpostos(), 0.1);
    }

    @Test
    public void calculaDescontosTest() {
        Assert.assertEquals(100 * 0.01, t1.calculaDescontos(), 0.1);
    }

    @Test
    public void calculaTributacao1Test() {
        Assert.assertEquals(t1.calculaImpostos() - t1.calculaDescontos(), t1.calculaTributacao(), 0.1);
    }

    @Test
    public void calculaTributacao2Test() {
        Assert.assertEquals(00, t2.calculaTributacao(), 0.1);

        System.err.println(t2.calculaImpostos() - t2.calculaDescontos());
        System.err.println(t2.calculaImpostos());
        System.err.println(t2.calculaDescontos());
    }
        @After
    public void tearDown() {
        t1 = t2 = null;
        System.gc();//coleta de lixo (garbage colector)
    }

}
