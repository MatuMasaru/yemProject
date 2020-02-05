package modelo;

import static modelo.Constantes.*;

public class QuiniSeis extends Casilla {

    @Override
    public void accion(Jugador unJugador) {

        unJugador.incrementoCapital(PREMIO_INICIAL_QUINISEIS);

    }
}
