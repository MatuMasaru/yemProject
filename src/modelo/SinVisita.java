package modelo;

import modelo.interfaces.*;

public class SinVisita implements EstadoVisitaConPremio {

    @Override
    public void nuevaVisita(Jugador unJugador) {

        unJugador.cambioDeVisita(new PrimeraVisita());

    }

    @Override
    public void premioDeVisita(Jugador unJugador) {}

}
