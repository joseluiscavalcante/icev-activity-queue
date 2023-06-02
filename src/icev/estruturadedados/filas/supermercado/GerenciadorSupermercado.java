package icev.estruturadedados.filas.supermercado;

public class GerenciadorSupermercado {
    Caixa[] caixasSupermercado;
    private int quantidadeCaixas;

    public GerenciadorSupermercado(int quantidadeCaixas) {
        this.quantidadeCaixas = quantidadeCaixas;
        this.caixasSupermercado = new Caixa[quantidadeCaixas];
        inserirCaixas();
    }

    public int getQuantidadeCaixas() {
        return quantidadeCaixas;
    }
    public void setQuantidadeCaixas(int quantidadeCaixas) {
        this.quantidadeCaixas = quantidadeCaixas;
    }

    public void inserirCaixas(){
        for(int i = 0; i < quantidadeCaixas; i++){
            Caixa caixa = new Caixa(i + 1);
            caixasSupermercado[i] = caixa;
        }
    }

    public void encaminharParaFila(Cliente cliente){
        Caixa caixaMenorTempo = null;
        for(int i = 0; i < quantidadeCaixas; i++){
            if(i == 0){
                caixaMenorTempo = caixasSupermercado[0];
            }
            else{
                if(caixaMenorTempo.getTempoAtendimentoTotal() > caixasSupermercado[i].getTempoAtendimentoTotal()){
                    caixaMenorTempo = caixasSupermercado[i];
                }
            }
        }

        assert caixaMenorTempo != null;
        caixaMenorTempo.receberCliente(cliente);
    }

    public void concluirAtendimento(int idCaixa) throws ExcessaoFilaVazia {
        for(int i = 0; i < quantidadeCaixas; i++){
            if(caixasSupermercado[i].getIdCaixa() == idCaixa){
                caixasSupermercado[i].concluirAtendimento();
            }
        }
    }

    public void mostrarFilas(){
        for(Caixa c : caixasSupermercado){
            System.out.println(c.toString());
        }
    }
}
