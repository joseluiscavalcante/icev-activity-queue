package icev.estruturadedados.filas.onibus;

public class No {
    private Passageiro dado;
    private No proximo;

    public No(Passageiro dado) {
        this.dado = dado;
        this.proximo = null;
    }

    public Passageiro getDado() {
        return dado;
    }

    public void setDado(Passageiro dado) {
        this.dado = dado;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
