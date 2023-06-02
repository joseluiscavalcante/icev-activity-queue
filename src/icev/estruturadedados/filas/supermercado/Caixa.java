package icev.estruturadedados.filas.supermercado;

public class Caixa {
    private int idCaixa;
    FilaCaixa filaClientes = new FilaCaixa();
    // Representa o tempo necessário para a última pessoa ser atendida.
    private int tempoAtendimentoTotal;

    public Caixa(int idCaixa) {
        this.idCaixa = idCaixa;
    }

    public int getIdCaixa() {
        return idCaixa;
    }

    public void setIdCaixa(int idCaixa) {
        this.idCaixa = idCaixa;
    }

    public int getTempoAtendimentoTotal() {
        return tempoAtendimentoTotal;
    }

    public void setTempoAtendimentoTotal(int tempoAtendimentoTotal) {
        this.tempoAtendimentoTotal = tempoAtendimentoTotal;
    }

    public void receberCliente(Cliente cliente){
        filaClientes.Enfileirar(cliente);
        calcularTempoAtendimentoTotal();
    }

    public void concluirAtendimento() throws ExcessaoFilaVazia {
        filaClientes.desenfileirar();
    }

    public void calcularTempoAtendimentoTotal(){
        int somatorio = 0;
        No noIterador = filaClientes.getCabeca();

        while (noIterador != null){
            somatorio += noIterador.getDado().getTempoIndividual();
            noIterador = noIterador.getProximo();
        }

        setTempoAtendimentoTotal(somatorio);
    }

    @Override
    public String toString() {
        return "[" + getTempoAtendimentoTotal() + " min]" + "\n" +
                "Fila do Caixa " + getIdCaixa() + ": " + filaClientes.toString() + "\n";
    }
}
