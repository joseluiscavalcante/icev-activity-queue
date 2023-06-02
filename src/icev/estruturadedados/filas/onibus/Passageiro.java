package icev.estruturadedados.filas.onibus;

public class Passageiro {
    private String nome;
    private String destino;

    public Passageiro(String nome, String destino) {
        this.nome = nome;
        this.destino = destino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return nome + ", " + destino;
    }
}
