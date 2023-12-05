import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AutorTest {

    @Test
    public void testConstrutorPadrao() {
        Autor autor = new Autor();
        assertEquals(null, autor.nome);
        assertEquals(null, autor.sobrenome);
    }

    @Test
    public void testConstrutorComParametros() {
        Autor autor = new Autor("John", "Doe");
        assertEquals("John", autor.nome);
        assertEquals("Doe", autor.sobrenome);
    }

    @Test
    public void testGetNome() {
        Autor autor = new Autor("Jane", "Doe");
        assertEquals("Jane", autor.nome);
    }

    @Test
    public void testGetSobrenome() {
        Autor autor = new Autor("Jane", "Doe");
        assertEquals("Doe", autor.sobrenome);
    }

    @Test
    public void testSetNome() {
        Autor autor = new Autor();
        autor.nome = "Alice";
        assertEquals("Alice", autor.nome);
    }

    @Test
    public void testSetSobrenome() {
        Autor autor = new Autor();
        autor.sobrenome = "Smith";
        assertEquals("Smith", autor.sobrenome);
    }
}
