import br.inatel.c206.lab.astronauta.Astronauta;
import br.inatel.c206.lab.astronauta.impostor.Impostor;
import br.inatel.c206.lab.astronauta.tripulante.Tripulante;

public class Main {

    public static void main(String[] args) {

        Astronauta[] astronautas = new Astronauta[10];

        Impostor impostor1 = new Impostor("Zézin, o Carrasco", "Black");

        Impostor impostor2 = new Impostor("Robsu, o Idiota", "Yellow");
        Impostor impostor3 = new Impostor("BRUH, o pagodeiro", "Orange");

        Tripulante tripulante1 = new Tripulante("Cleitin, o Bom de Guerra", "Red");
        Tripulante tripulante2 = new Tripulante("Tauz, THE RAP GOD", "Blue");
        Tripulante tripulante3 = new Tripulante("RAIVA, the Tester", "Purple");

        astronautas[0] = impostor1;

        astronautas[2] = impostor2;
        astronautas[3] = tripulante1;
        astronautas[4] = tripulante2;
        astronautas[5] = impostor3;

        int aux = 0;

        for (int i = 0; i < astronautas.length; i++)
        {
            if (astronautas[i] != null)
            {
                Astronauta.cont++;
            }
        }

        for (int i = 0; i < astronautas.length; i++)
        {
            if (astronautas[i] != null)
            {
                System.out.println("Mostrando as informações do Astronauta: " + aux);
                System.out.println();

                if (astronautas[i] instanceof Impostor)
                {
                    Impostor imp = (Impostor) astronautas[i];
                    System.out.println("Esse Astronauta é um Impostor");
                    System.out.println();
                    imp.mostraInfo();
                    System.out.println();
                    imp.fazerMissao();
                    System.out.println();
                    imp.sabotarOxigenio();
                    System.out.println();
                    System.out.println("OH NOUS!!! Um Astronauto foi MORTO!");
                    imp.executar();
                    System.out.println();
                    System.out.println("Quantidade de Astronautas diminuiu. Numero atual: " + (Astronauta.cont -= 1));
                    System.out.println("Quantidade de mortes aumentou. Numero atual: " + imp.getQtdMortes());
                    System.out.println();
                    imp.usarVentoinha();
                    System.out.println();
                }
                else if (astronautas[i] instanceof Tripulante)
                {
                    Tripulante trip = (Tripulante) astronautas[i];
                    System.out.println("Esse Astronauta é um Tripulante");
                    System.out.println();
                    trip.mostraInfo();
                    System.out.println();
                    trip.reparar();
                    System.out.println();
                    trip.fazerMissao();
                    System.out.println();
                    trip.reportar();
                    System.out.println();
                }
                else
                {
                    break;
                }

                aux += 1;
            }
        }
    }
}
