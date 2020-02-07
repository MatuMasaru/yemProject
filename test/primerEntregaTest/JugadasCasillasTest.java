package primerEntregaTest;

import modelo.*;
import org.junit.jupiter.api.Test;

import static modelo.Constantes.*;
import static org.junit.jupiter.api.Assertions.*;

public class JugadasCasillasTest {

    @Test
    public void testIncrementoDeCapitalDelJugadorEnCincuentaMilAlCaerEnCasillaQuiniSeisPorPrimeraVez(){

        Jugador steve = new Jugador();
        /*steve entra a una casilla que el controlador sabe como mandarle el mensaje que está en quiniSeis.*/

        steve.visitaConPremio();

        assertTrue(steve.verificarUltimoAumentoDeCapital( PRIMER_PREMIO_QUINISEIS ));

    }

    @Test
    public void testIncrementoDeCapitalDelJugadorEnTreintaMilAlCaerEnCasillaQuiniSeisPorSegundaVez(){

        Jugador alex = new Jugador();
        /*steve entra a una casilla que el controlador sabe como mandarle el mensaje que está en quiniSeis.*/

        alex.visitaConPremio();
        alex.visitaConPremio();

        assertTrue(alex.verificarUltimoAumentoDeCapital( SEGUNDO_PREMIO_QUINISEIS ));

    }

    @Test
    public void testSinIncrementoDeCapitalDelJugadorAlCaerEnCasillaQuiniSeisPorMasDeDosVeces(){

        Jugador jack = new Jugador();
        /*steve entra a una casilla que el controlador sabe como mandarle el mensaje que está en quiniSeis.*/

        jack.visitaConPremio();
        jack.visitaConPremio();
        jack.visitaConPremio();

        assertTrue(jack.verificarUltimoAumentoDeCapital( SIGUIENTES_PREMIOS_QUINISEIS ));

    }

}
