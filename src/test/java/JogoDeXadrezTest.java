import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class JogoDeXadrezTest {

    @Test
    void verificarPecas() {
        Bispo bispo = new Bispo();
        assertEquals(1,  bispo.mover());

        Cavalo cavalo = new Cavalo();
        assertEquals(1,  cavalo.mover());

        Peao peao = new Peao();
        assertEquals(1,  peao.mover());

        Rainha rainha = new Rainha();
        assertEquals(1,  rainha.mover());

        Rei rei = new Rei();
        assertEquals(1,  rei.mover());

        Torre torre = new Torre();
        assertEquals(1,  torre.mover());
    }

    @Test
    void verificarTabuleiro() {
        Tabuleiro tabuleiro = new Tabuleiro();
        assertFalse(tabuleiro.acabouOJogo());
    }
}
