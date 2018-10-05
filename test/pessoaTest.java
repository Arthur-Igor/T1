/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Data.Pessoa;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Artu
 */
public class pessoaTest {

    Pessoa p1 = new Pessoa(0, "nome", 0, 0);

    public pessoaTest() {
    }

    @Before
    public void setUp() {
        p1.setImpostos(100);
        p1.setCarro(100);
        p1.setCasa(100);
        p1.setDescontos(100);
        p1.setNome("artu");
        p1.setId(1);
    }

    @Test
    public void getImpostosTest() {
        Assert.assertEquals(100, p1.getImpostos(), 0.1);
    }

    @Test
    public void getCarroTest() {
        Assert.assertEquals(100, p1.getCarro(), 0.1);
    }

    @Test
    public void getCasaTest() {
        Assert.assertEquals(100, p1.getCasa(), 0.1);
    }

    @Test
    public void getDescontosTest() {
        Assert.assertEquals(100, p1.getDescontos(), 0.1);
    }

    @Test
    public void getNomeTest() {
        Assert.assertEquals("artu", p1.getNome());
    }

    @Test
    public void getIdTest() {
        Assert.assertEquals(1, p1.getId(), 0.1);
    }

    @After
    public void tearDown() {
        p1 = null;
        System.gc();//coleta de lixo (garbage colector)
    }

}
