package icev.estruturadedados.filas.atendimento;

public class FilaAtendimento {
    private No cabeca;
    private No cauda;
    private int tamanho;

    public FilaAtendimento() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanho = 0;
    }

    public No getCabeca() {
        return cabeca;
    }

    public No getCauda() {
        return cauda;
    }

    public int tamanho(){
        return tamanho;
    }

    public boolean vazio(){
        return tamanho == 0;
    }

    public Cliente primeiro() throws ExcessaoFilaVazia {
        if(vazio()) {
            throw new ExcessaoFilaVazia("A fila está vazia!");
        }
        return getCabeca().getDado();
    }

    public void Enfileirar(Cliente cliente){
        No no = new No(cliente);
        if(vazio()){
            cabeca = no;
        }
        else{
            cauda.setProximo(no);
        }

        cauda = no;
        tamanho++;
    }

    public void desenfileirar() throws ExcessaoFilaVazia {
        if(vazio()){
            throw new ExcessaoFilaVazia("A fila está vazia!");
        }

        cabeca = cabeca.getProximo();
        tamanho--;

        if(vazio()) {
            cauda = null;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        No no = cabeca;
        sb.append("(");
        if(no == null){
            sb.append(" )");
        }
        while(no != null) {
            sb.append(String.format("%s", no.getDado().toString()));
            if(no.getProximo() == null){
                sb.append(")");
            }
            else{
                sb.append(", ");
            }
            no = no.getProximo();
        }

        return sb.toString();
    }
}
