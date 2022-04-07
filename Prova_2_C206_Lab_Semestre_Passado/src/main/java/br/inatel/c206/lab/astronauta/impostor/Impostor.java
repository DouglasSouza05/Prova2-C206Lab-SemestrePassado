package br.inatel.c206.lab.astronauta.impostor;

import br.inatel.c206.lab.astronauta.Astronauta;
import br.inatel.c206.lab.astronauta.Executar;
import br.inatel.c206.lab.astronauta.Missão;
import br.inatel.c206.lab.astronauta.Sabotar;

public class Impostor extends Astronauta implements Missão, Sabotar, Executar {

    private static int qtdMortes = 0;

    public Impostor(String nome, String cor)
    {
        super(nome, cor);
    }

    public void usarVentoinha()
    {
        System.out.println("O impostor " + this.getNome() + " se escondeu na Ventilação!");
    }

    public void trancarPortas(String local)
    {
        System.out.println("O impostor " + this.getNome() + " trancou as Portas do(a) " + local);
    }

    @Override
    public void reportar()
    {
        System.out.println(this.getNome() + " fez um Self Report!");
    }

    @Override
    public void reparar()
    {
        System.out.println(this.getNome() + " fingiu que fez um Reparo!");
    }

    @Override
    public void fazerMissao()
    {
        System.out.println(this.getNome() + " fez uma Tarefa falsa!");
    }

    @Override
    public void executar()
    {
        System.out.println(this.getNome() + " matou um Tripulante!");
        qtdMortes += 1;
    }

    @Override
    public void sabotarLuz()
    {
        System.out.println("O impostor " + this.getNome() + " sabotou a Luz!");
    }

    @Override
    public void sabotarOxigenio()
    {
        System.out.println("O impostor " + this.getNome() + " sabotou o Oxigenio!");
    }

    @Override
    public void sabotarReator()
    {
        System.out.println("O impostor " + this.getNome() + " sabotou o Reator!");
    }

    @Override
    public void sabotarComunicacao()
    {
        System.out.println("O impostor " + this.getNome() + " sabotou a Comunicacao!");
    }

    public int getQtdMortes() {
        return qtdMortes;
    }
}
