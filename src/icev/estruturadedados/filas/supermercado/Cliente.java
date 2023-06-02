package icev.estruturadedados.filas.supermercado;

public class Cliente {
    private String nome;
    private int quantidadeItensCarrinho;
    //tempoIndividual: Tempo (min) necessário para o cliente ser atendido de acordo com a quantidade de itens no carrinho
    private int tempoIndividual;

    public Cliente(String nome, int quantidadeItensCarrinho) {
        this.nome = nome;
        this.quantidadeItensCarrinho = quantidadeItensCarrinho;
        calcularTempoIndividual();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidadeItensCarrinho() {
        return quantidadeItensCarrinho;
    }
    public void setQuantidadeItensCarrinho(int quantidadeItensCarrinho) {
        this.quantidadeItensCarrinho = quantidadeItensCarrinho;
    }
    public int getTempoIndividual() {
        return tempoIndividual;
    }
    public void setTempoIndividual(int tempoIndividual) {
        this.tempoIndividual = tempoIndividual;
    }

    public void calcularTempoIndividual(){
        double tempo = quantidadeItensCarrinho / 10.0;
        setTempoIndividual((int) Math.round(tempo));
    }

    @Override
    public String toString() {
        return nome;
    }
}
