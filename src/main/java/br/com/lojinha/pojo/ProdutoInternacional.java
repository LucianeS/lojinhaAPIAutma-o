package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoInternacional extends Produto implements Favorito {

    private double taxaDeImportação;

    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public double getTaxaDeImportação() {
        return taxaDeImportação;
    }

    public void setTaxaDeImportação(double taxaDeImportação) {
        this.taxaDeImportação = taxaDeImportação;
    }

    public void setValor(double valor) {
        if (valor>-100) {
            this.valor = valor;
        }else{
            throw new IllegalArgumentException("Valores devem ser maiores do que -100");
        }

    }

    @Override
    public String getDadosFavoritos() {
        //PS4, Sony e 30
        return this.getNome() + "," +this.getMarca() + "e"  +this.getValor(); //concatenando strings
    }
}
