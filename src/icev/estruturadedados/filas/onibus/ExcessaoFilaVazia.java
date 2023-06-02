package icev.estruturadedados.filas.onibus;

import java.io.Serial;

public class ExcessaoFilaVazia extends Exception{
    @Serial
    private static final long serialVersionUID = 1L;

    public ExcessaoFilaVazia(String message) {
        super(message);
    }
}
