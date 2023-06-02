package icev.estruturadedados.filas.onibus;

public class Main {
    public static void main(String[] args) throws ExcessaoFilaVazia {
        GerenciamentoOnibus go = new GerenciamentoOnibus();

        ParadaDeOnibus parada1 = new ParadaDeOnibus("A");

        Onibus onibus1 = new Onibus("B", 3);

        Passageiro passageiro1 = new Passageiro("Amanda", "B");
        Passageiro passageiro2 = new Passageiro("Bruno", "B");
        Passageiro passageiro3 = new Passageiro("Carlos", "B");
        Passageiro passageiro4 = new Passageiro("Daniel", "B");
        Passageiro passageiro5 = new Passageiro("Edvaldo", "B");

        go.addPassageiroParada(parada1, passageiro1);
        go.addPassageiroParada(parada1, passageiro2);
        go.addPassageiroParada(parada1, passageiro3);
        go.addPassageiroParada(parada1, passageiro4);
        go.addPassageiroParada(parada1, passageiro5);

        go.mostrarFilaParada(parada1);

        go.embarcarPassageiros(onibus1, parada1);

        go.mostrarFilaParada(parada1);
    }
}
