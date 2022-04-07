package br.inatel.c206.lab.astronauta;

import br.inatel.c206.lab.astronauta.pet.Pet;
import br.inatel.c206.lab.astronauta.skin.Skin;

public abstract class Astronauta {

    public static int cont;
    private String cor;
    private String nome;
    public Skin skin;
    public Pet pet;

    public Astronauta(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public void mostraInfo()
    {
        System.out.println("Nome do Astronauta: " + this.nome);
        System.out.println("Cor do Astronauta: " + this.cor);

        if (this.skin.getTipo() != null)
        {
            System.out.println("Skin do Astronauta: " + this.skin);
        }
        else
        {
            System.out.println("Esse Astronauto não possui Skin!");
        }
        if (this.pet.getNome() != null)
        {
            System.out.println("Pet do Astronauta: " + this.pet);
        }
        else
        {
            System.out.println("Esse Astronauto não possui Pet!");
        }
    }

    public void verCameras()
    {
        System.out.println(this.nome + " olhou as cameras!");
    }

    public abstract void reportar();

    public abstract void reparar();

    public String getNome() {
        return nome;
    }
}
