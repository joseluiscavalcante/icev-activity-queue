package icev.estruturadedados.filas.onibus;

import java.util.Objects;

public class GerenciamentoOnibus {
    public boolean horarioDePico;

    public void addPassageiroParada(ParadaDeOnibus parada, Passageiro passageiro){
        parada.addPassageiroNaFila(passageiro);
    }

    public void embarcarPassageiros(Onibus onibus, ParadaDeOnibus parada) throws ExcessaoFilaVazia {
        No passageiroAtual = parada.filaPassageiros.primeiro();
        while (passageiroAtual != null){
            if(Objects.equals(onibus.getDestino(), passageiroAtual.getDado().getDestino())){
                if(onibus.getAssentosDisponiveis() > parada.filaPassageiros.tamanho()){
                    for (int i = 0; i < parada.filaPassageiros.tamanho(); i++){
                        parada.removerPassageiroDaFila();
                    }
                    onibus.setAssentosDisponiveis(onibus.getAssentosDisponiveis() - parada.filaPassageiros.tamanho());
                    System.out.println("O ônibus levou " + parada.filaPassageiros.tamanho() + "passageiros");
                }
                else {
                    for (int i = 0; i < onibus.getAssentosDisponiveis(); i++){
                        parada.removerPassageiroDaFila();
                    }
                    onibus.setAssentosDisponiveis(0);
                }
            }
            passageiroAtual = passageiroAtual.getProximo();
        }
    }

    public void mostrarFilaParada(ParadaDeOnibus paradaDeOnibus){
        System.out.println(paradaDeOnibus.exibirFila());
    }
}
