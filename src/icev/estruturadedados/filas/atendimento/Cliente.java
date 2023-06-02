package icev.estruturadedados.filas.atendimento;

public class Cliente {
    private String nome;
    private boolean prioritario = false;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean ehPrioritario() {
        return prioritario;
    }
    public void setPrioritario(boolean prioritario) {
        this.prioritario = prioritario;
    }

    @Override
    public String toString() {
        return nome;
    }
}
