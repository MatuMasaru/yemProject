package modelo;

import modelo.interfaces.EstadoVisitaConPremio;

import static modelo.Constantes.*;

public class ConVisita implements EstadoVisitaConPremio {

    @Override
    public void nuevaVisita(Jugador unJugador) {}

    @Override
    public void premioDeVisita(Jugador unJugador) {

        unJugador.incrementoCapital(SIGUIENTES_PREMIOS_QUINISEIS);

    }

}
