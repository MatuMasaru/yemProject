package modelo;

import static modelo.Constantes.*;

public class Jugador {

    Integer capital;

    public Jugador(){

        this.capital = CAPITAL_INICIAL_JUGADOR;

    }

    public Boolean verificacionCapital(Integer unCapitalAComparar){

        return (capital.equals(unCapitalAComparar));

    }

    public void incrementoCapital(Integer unCapital) {

        this.capital += unCapital;

    }
}
