package modelo;

import modelo.interfaces.EstadoVisitaConPremio;

import static modelo.Constantes.*;

public class SegundaVisita implements EstadoVisitaConPremio {

    @Override
    public void nuevaVisita(Jugador unJugador) {

        unJugador.cambioDeVisita(new ConVisita());

    }

    @Override
    public void premioDeVisita(Jugador unJugador) {

        unJugador.incrementoCapital(SEGUNDO_PREMIO_QUINISEIS);

    }

}
