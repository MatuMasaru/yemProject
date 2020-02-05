package modelo;

import modelo.interfaces.EstadoVisitaConPremio;

import static modelo.Constantes.*;

public class PrimeraVisita implements EstadoVisitaConPremio {

    @Override
    public void nuevaVisita(Jugador unJugador) {

        unJugador.cambioDeVisita(new SegundaVisita());

    }

    @Override
    public void premioDeVisita(Jugador unJugador) {

        unJugador.incrementoCapital(PRIMER_PREMIO_QUINISEIS);

    }
}
