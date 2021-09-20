package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoNacional extends Produto implements Favorito {

    private double impostoNacional;

    public ProdutoNacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    @Override
    public void setValor(double valor) {
        super.setValor(valor);
    }

    public double getImpostoNacional() {
        return impostoNacional;
    }

    public void setImpostoNacional(double impostoNacional) {
        this.impostoNacional = impostoNacional;
    }

    @Override
    public String getDadosFavoritos() {
        return this.getNome() + "," +getMarca()+ "," +getValor(); //concatenando strings
    }
}
