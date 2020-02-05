package modelo;

import modelo.interfaces.*;

import static modelo.Constantes.*;

public class Jugador {

    private Integer capital;
    private EstadoVisitaConPremio visita;
    private Integer ultimoAumentoCapital;

    public Jugador(){

        this.capital = CAPITAL_INICIAL_JUGADOR;
        this.visita = new SinVisita();
        this.ultimoAumentoCapital = 0;

    }

    public Boolean verificarUltimoAumentoDeCapital(Integer unCapitalAComparar){

        return (this.ultimoAumentoCapital.equals(unCapitalAComparar));

    }

    public void incrementoCapital(Integer unCapital) {

        this.ultimoAumentoCapital = unCapital;
        this.capital += unCapital;

    }

    public void visitaConPremio() {

        this.visita.nuevaVisita(this);
        this.visita.premioDeVisita(this);

    }

    public void cambioDeVisita(EstadoVisitaConPremio unaVisita) {

        this.visita = unaVisita;

    }
}
