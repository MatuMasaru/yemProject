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

        assertTrue(steve.verificacionCapital( CAPITAL_INICIAL_JUGADOR + PREMIO_INICIAL_QUINISEIS ));

    }


}
