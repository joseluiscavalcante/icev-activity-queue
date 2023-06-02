package icev.estruturadedados.filas.supermercado;

import java.io.Serial;

public class ExcessaoFilaVazia extends Exception{
    @Serial
    private static final long serialVersionUID = 1L;

    public ExcessaoFilaVazia(String message) {
        super(message);
    }
}
