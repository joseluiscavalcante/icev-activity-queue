package icev.estruturadedados.filas.atendimento;

public class GerenciadorAtendimentos {
    private int quantidadeAtendentes;
    private int quantidadeAtendentesPrioritarios;
    private int quantidadeAtendentesComuns;
    Atendente[] atendentesComuns;
    Atendente[] atendentesPrioritarios;

    public GerenciadorAtendimentos(int quantidadeAtendentes) {
        this.quantidadeAtendentes = quantidadeAtendentes;
        organizarAtendentes(quantidadeAtendentes);
    }

    public int getQuantidadeAtendentes() {
        return quantidadeAtendentes;
    }
    public void setQuantidadeAtendentes(int quantidadeAtendentes) {
        this.quantidadeAtendentes = quantidadeAtendentes;
    }

    public int getQuantidadeAtendentesPrioritarios() {
        return quantidadeAtendentesPrioritarios;
    }
    public void setQuantidadeAtendentesPrioritarios(int quantidadeAtendentesPrioritarios) {
        this.quantidadeAtendentesPrioritarios = quantidadeAtendentesPrioritarios;
    }
    public int getQuantidadeAtendentesComuns() {
        return quantidadeAtendentesComuns;
    }
    public void setQuantidadeAtendentesComuns(int quantidadeAtendentesComuns) {
        this.quantidadeAtendentesComuns = quantidadeAtendentesComuns;
    }

    public void organizarAtendentes(int quantidadeAtendentes){
        if(quantidadeAtendentes % 2 == 0){
            setQuantidadeAtendentesPrioritarios(quantidadeAtendentes / 2);
            setQuantidadeAtendentesComuns(quantidadeAtendentes / 2);
            atendentesPrioritarios = new Atendente[quantidadeAtendentesPrioritarios];
            atendentesComuns = new Atendente[quantidadeAtendentesComuns];
            inserirAtendentes();
        }
        else{
            setQuantidadeAtendentesPrioritarios(quantidadeAtendentes / 2);
            setQuantidadeAtendentesComuns((quantidadeAtendentes / 2) + 1);
            atendentesPrioritarios = new Atendente[quantidadeAtendentesPrioritarios];
            atendentesComuns = new Atendente[quantidadeAtendentesComuns];
            inserirAtendentes();
        }
    }

    private void inserirAtendentes(){
        for (int i = 0; i < quantidadeAtendentesPrioritarios; i++){
            Atendente atendente = new Atendente(100 + (i + 1));
            atendentesPrioritarios[i] = atendente;
        }
        for (int i = 0; i < quantidadeAtendentesComuns; i++){
            Atendente atendente = new Atendente(i + 1);
            atendentesComuns[i] = atendente;
        }
    }

    private void verificarTipoAtendimento(Cliente cliente){
        int opcaoAtendimento = ChatBot.iniciarAtendimentoBot(cliente);
        cliente.setPrioritario(opcaoAtendimento == 1);
    }

    public void encaminharParaFila(Cliente cliente){
        verificarTipoAtendimento(cliente);
        Atendente atendenteMenorFila = null;
        if(cliente.ehPrioritario()){
            for (int i = 0; i < atendentesPrioritarios.length; i++){
                atendenteMenorFila = atendentesPrioritarios[0];
                if(i != 0 && atendentesPrioritarios[i].verificarTamanhoFila() < atendenteMenorFila.verificarTamanhoFila()){
                    atendenteMenorFila = atendentesPrioritarios[i];
                }
            }
            assert atendenteMenorFila != null;
            atendenteMenorFila.receberCliente(cliente);
        }
        else{
            for (int i = 0; i < atendentesComuns.length; i++){
                atendenteMenorFila = atendentesComuns[0];
                if(i != 0 && atendentesComuns[i].verificarTamanhoFila() < atendenteMenorFila.verificarTamanhoFila()){
                    atendenteMenorFila = atendentesComuns[i];
                }
            }
            assert atendenteMenorFila != null;
            atendenteMenorFila.receberCliente(cliente);
        }
    }

    public void mostrarFilas(){
        for (Atendente ap : atendentesPrioritarios) {
            System.out.print(ap.toString());
        }
        for (Atendente ac : atendentesComuns) {
            System.out.print(ac.toString());
        }
        System.out.println();
    }
}
