package modelo;

public class QuiniSeis extends Casilla {

    @Override
    public void accion(Jugador unJugador) {

        unJugador.visitaConPremio();

    }

}
