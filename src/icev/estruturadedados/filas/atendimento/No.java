package icev.estruturadedados.filas.atendimento;

public class No {
    private Cliente dado;
    private No proximo;

    public No(Cliente dado) {
        this.dado = dado;
        this.proximo = null;
    }

    public Cliente getDado() {
        return dado;
    }

    public void setDado(Cliente dado) {
        this.dado = dado;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
