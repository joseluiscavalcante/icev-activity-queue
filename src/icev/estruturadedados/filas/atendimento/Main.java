package icev.estruturadedados.filas.atendimento;

public class Main {
    public static void main(String[] args) {
        GerenciadorAtendimentos ga = new GerenciadorAtendimentos(5);

        Cliente c1 = new Cliente("Amanda");
        Cliente c2 = new Cliente("Bruno");
        Cliente c3 = new Cliente("Carlos");
        Cliente c4 = new Cliente("Daniel");

        ga.encaminharParaFila(c1);
        ga.mostrarFilas();
        ga.encaminharParaFila(c2);
        ga.mostrarFilas();
        ga.encaminharParaFila(c3);
        ga.mostrarFilas();
        ga.encaminharParaFila(c4);
        ga.mostrarFilas();
    }
}
