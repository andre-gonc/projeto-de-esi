package com.biblioteca;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class VendaTest {
        /**
         * Test do construtor com parâmetros
         */
        @Test
        public void testConstrutorComParametros() {

                Autor autor = new Autor("João", "Gonçalves");,
                Editora editora = new Editora("Minha Editora");
                Livro livro = new Livro(autor, editora, "1234567890", "O Soberano", "633");
                LivroEstoque livroDoEstoque = new LivroEstoque(livro, 10, 100.00);
                LivroVenda livroVenda = new LivroVenda(livroDoEstoque, 3);
                
                Venda venda = new Venda("João", "Crédito", 100.00, livroVenda);
                
                Assert.assertEquals("João", venda.nomeCliente);
                Assert.assertEquals("Crédito", venda.formaPagamento);
                Assert.assertEquals(100.00, venda.valorDado, 0.001);
                Assert.assertEquals(livroVenda, venda.livroVenda)
        }

        /**
         * Test do construtor sem parâmetros
         */
        @Test
        public void testConstrutorSemParametros() {
                Venda venda = new Venda();
                Assert.assertNull(venda.nomeCliente);
                Assert.assertNull(venda.formaPagamento);
                Assert.assertNull(venda.valorDado);
                Assert.assertNull(venda.livros);
        }

}
