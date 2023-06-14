package br.com.devsgeeknerd.classes;

import br.com.devsgeeknerd.interfaces.CalculadorMatematico;

public abstract class CalculoMatematico implements CalculadorMatematico {
    private int numero1;
    private int numero2;

    public CalculoMatematico(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    @Override
    public Boolean validar() {
        return numero1 >= 0 && numero2 >= 0;
    }

    @Override
    public final int calcular() {
        if (validar()) {
            return doCalcular();
        } else {
            return -1;
        }
    }

    protected abstract int doCalcular();
}
