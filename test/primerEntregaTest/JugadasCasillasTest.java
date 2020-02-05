package primerEntregaTest;

import modelo.*;
import org.junit.jupiter.api.Test;

import static modelo.Constantes.*;
import static org.junit.jupiter.api.Assertions.*;

public class JugadasCasillasTest {

    @Test
    public void incrementoDeCapitalDelJugadorEnCincuentaMilAlCaerEnCasillaQuiniSeisPorPrimeraVez(){

        Jugador steve = new Jugador();
        Casilla quiniSeis = new QuiniSeis();

        quiniSeis.accion(steve);

        assertTrue(steve.verificarUltimoAumentoDeCapital( PRIMER_PREMIO_QUINISEIS ));

    }

    @Test
    public void incrementoDeCapitalDelJugadorEnTreintaMilAlCaerEnCasillaQuiniSeisPorSegundaVez(){

        Jugador alex = new Jugador();
        Casilla quiniSeis = new QuiniSeis();

        quiniSeis.accion(alex);
        quiniSeis.accion(alex);

        assertTrue(alex.verificarUltimoAumentoDeCapital( SEGUNDO_PREMIO_QUINISEIS ));

    }

}
