package icev.estruturadedados.filas.supermercado;

public class Main {
    public static void main(String[] args) {
        GerenciadorSupermercado gerenciador = new GerenciadorSupermercado(3);

        Cliente cliente1 = new Cliente("A", 100);
        Cliente cliente2 = new Cliente("B", 75);
        Cliente cliente3 = new Cliente("C", 42);
        Cliente cliente4 = new Cliente("D", 15);

        gerenciador.encaminharParaFila(cliente1);
        gerenciador.mostrarFilas();
        System.out.println("------------------");
        gerenciador.encaminharParaFila(cliente2);
        gerenciador.mostrarFilas();
        System.out.println("------------------");
        gerenciador.encaminharParaFila(cliente3);
        gerenciador.mostrarFilas();
        System.out.println("------------------");
        gerenciador.encaminharParaFila(cliente4);
        gerenciador.mostrarFilas();
    }
}
