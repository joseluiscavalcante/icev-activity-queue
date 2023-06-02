package icev.estruturadedados.filas.onibus;

public class Onibus {
    private int capacidadeMaxima;
    private int assentosDisponiveis;
    private String destino;
    private boolean disponivel;

    public Onibus(String destino, int capacidadeMaxima) {
        this.destino = destino;
        this.capacidadeMaxima = capacidadeMaxima;
        this.disponivel = true;
        this.assentosDisponiveis = capacidadeMaxima;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public int getAssentosDisponiveis() {
        return assentosDisponiveis;
    }

    public void setAssentosDisponiveis(int assentosDisponiveis) {
        this.assentosDisponiveis = assentosDisponiveis;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
