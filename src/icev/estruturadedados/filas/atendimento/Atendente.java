package icev.estruturadedados.filas.atendimento;

public class Atendente {
    private int idAtendente;
    FilaAtendimento filaAtendimento = new FilaAtendimento();

    public Atendente(int idAtendente) {
        this.idAtendente = idAtendente;
    }

    public int getIdAtendente() {
        return idAtendente;
    }
    public void setIdAtendente(int idAtendente) {
        this.idAtendente = idAtendente;
    }

    public void receberCliente(Cliente cliente){
        filaAtendimento.Enfileirar(cliente);
    }

    public void concluirAtendimento() throws ExcessaoFilaVazia {
        filaAtendimento.desenfileirar();
    }

    public int verificarTamanhoFila(){
        return filaAtendimento.tamanho();
    }

    @Override
    public String toString() {
        return "Fila com Atendente " + getIdAtendente() + ": " + filaAtendimento.toString() + "\n";
    }
}
