package br.inatel.c206.lab.astronauta.tripulante;

import br.inatel.c206.lab.astronauta.Astronauta;
import br.inatel.c206.lab.astronauta.Missão;

public class Tripulante extends Astronauta implements Missão {

    private int qtdMissoes = 8;

    public Tripulante(String nome, String cor)
    {
        super(nome, cor);
    }

    @Override
    public void reportar()
    {
        System.out.println(this.getNome() + " reportou um corpo!");
    }

    @Override
    public void reparar()
    {
        System.out.println(this.getNome() + " fez um reparo!");
    }

    @Override
    public void fazerMissao()
    {
        System.out.println(this.getNome() + " fez uma missão!");
        qtdMissoes -= 1;
    }
}
