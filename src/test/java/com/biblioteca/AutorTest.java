package com.biblioteca;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Assert;

@RunWith(JUnit4.class)
public class AutorTest {

    @Test
    public void testConstrutorPadrao() {
        Autor autor = new Autor();
        Assert.assertEquals(null, autor.nome);
        Assert.assertEquals(null, autor.sobrenome);
    }

    @Test
    public void testConstrutorComParametros() {
        Autor autor = new Autor("John", "Doe");
        Assert.assertEquals("John", autor.nome);
        Assert.assertEquals("Doe", autor.sobrenome);
    }

    @Test
    public void testGetNome() {
        Autor autor = new Autor("Jane", "Doe");
        Assert.assertEquals("Jane", autor.nome);
    }

    @Test
    public void testGetSobrenome() {
        Autor autor = new Autor("Jane", "Doe");
        Assert.assertEquals("Doe", autor.sobrenome);
    }

    @Test
    public void testSetNome() {
        Autor autor = new Autor();
        autor.nome = "Alice";
        Assert.assertEquals("Alice", autor.nome);
    }

    @Test
    public void testSetSobrenome() {
        Autor autor = new Autor();
        autor.sobrenome = "Smith";
        Assert.assertEquals("Smith", autor.sobrenome);
    }
}
