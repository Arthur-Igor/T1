/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Data.Professor;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Artu
 */
public class professorTest {

    Professor p1 = new Professor(0, "nome", 0, 0);
    Professor p2 = new Professor(0, "nome", 0, 0);
    Professor p3 = new Professor(0, "nome", 0, 0);

    public professorTest() {

    }

    @Before
    public void setUp() {
        p1.setDescontos(100);
        p1.setFaixaDeSalario(100);
        p1.setGastosMaterial(100);
        p1.setImpostos(100);
        p2.setFaixaDeSalario(1000);
        p2.setDescontos(1000);
        p2.setImpostos(1000);
        p3.setFaixaDeSalario(6000);
    }

    @Test
    public void calculaDescontosTest() {
        Assert.assertEquals(50, p1.calculaDescontos(), 0.1);
    }

    @Test
    public void getFaixaDeSalarioTest() {
        Assert.assertEquals(100, p1.getFaixaDeSalario(), 0.1);
    }

    @Test
    public void getGastosMaterialTest() {
        Assert.assertEquals(100, p1.getGastosMaterial(), 0.1);
    }

    @Test
    public void calculaImpostos1Test() {
        Assert.assertEquals(100 * 0.05, p1.calculaImpostos(), 0.1);
    }

    @Test
    public void calculaImpostos2Test() {
        Assert.assertEquals(1000 * 0.10, p2.calculaImpostos(), 0.1);
    }

    @Test
    public void calculaImpostos3Test() {
        Assert.assertEquals(6000 * 0.20, p3.calculaImpostos(), 0.1);
    }

    @Test
    public void calculaTributacaoTest() {
        Assert.assertEquals(00, p1.calculaTributacao(), 0.1);
    }

    @Test
    public void calculaTributacao2Test() {
        Assert.assertEquals(100, p2.calculaTributacao(), 0.1);
    }

    @After
    public void tearDown() {
        p1 = p2 = p3 = null;
        System.gc();//coleta de lixo (garbage colector)

    }

}
