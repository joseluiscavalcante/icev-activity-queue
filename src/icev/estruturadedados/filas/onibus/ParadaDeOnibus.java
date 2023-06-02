package icev.estruturadedados.filas.onibus;

public class ParadaDeOnibus {
    private String localizacao;
    FilaOnibus filaPassageiros = new FilaOnibus();

    public ParadaDeOnibus(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void addPassageiroNaFila(Passageiro passageiro){
        filaPassageiros.Enfileirar(passageiro);
    }

    public void removerPassageiroDaFila() throws ExcessaoFilaVazia {
        filaPassageiros.desenfileirar();
    }

    public void mostrarTamanhoFila(){
        filaPassageiros.tamanho();
    }

    public String exibirFila(){
        return "Parada " + localizacao + ": " + filaPassageiros.toString();
    }
}
