package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {

    public static void main(String[] args) {
        //Comando SOUT -> Cria: System.out.println("Lojinha");
        String joias= "brinco";
        int idade=39;
        double salario=29500.99;
        boolean resposta= false;

        System.out.println(joias);
        System.out.println(idade);
        System.out.println(salario);
        System.out.println(resposta);

        //criando um novo produto com o atributo obrigatório marca
        Produto meuProduto= new Produto("Sony",Tamanho.GRANDE);

        //se eu chamar o método SOUT logo após a instanciação vai exibir o valor vindo direto do contrutor
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getTamanho());

        //Atribuindo valores aos atributos
        meuProduto.setNome("Play Station 4");
        // se eu chamar o método set pasando um novo valor o construtor é sobrescrito
        meuProduto.setMarca("JL");
        meuProduto.setValor(170.00);//atribuição do valor
        meuProduto.setTamanho(Tamanho.PEQUENO); // atribui o valor do enum Tamanho

        //Criando uma lista de Itens
        List<ItemIncluso> itensInclusos = new ArrayList<ItemIncluso>();

        //Crinado o primeiro Item adicional
        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controles",2);
        //adicionando o primeiro item na lista
        itensInclusos.add(primeiroItemIncluso);//0

        //Criando o segundo item
        ItemIncluso segundoItemIncluso = new ItemIncluso("Cabos de energia",2);
        //adicionando o segundo item na lista
        itensInclusos.add(segundoItemIncluso);//1

        //Criando o terceiro item
        ItemIncluso terceiroItemIncluso = new ItemIncluso("Jogos",3);
        //adicionando o segundo item na lista
        itensInclusos.add(terceiroItemIncluso);//2

        //adicionando a lista de itens inclusos ao produto
        meuProduto.setItensInclusos(itensInclusos);

        //Imprimir produto
        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getMarca());//aqui está exibindo o valor atualizado via método set na linha 31
        System.out.println(meuProduto.getValor());

        /**mostra todos os itens da lista
        System.out.println(meuProduto.getItensInclusos().get(0).getNome());
        System.out.println(meuProduto.getItensInclusos().get(0).getQuantidade());**/

        //AQUI NAVEGA PELA LISTA MOSTRANDO OS ITENS
        System.out.println("Começando a exibir os itens");
        for (ItemIncluso itemAtual: meuProduto.getItensInclusos()) {
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }


        /**mostra o tamanho da lista
        System.out.println(meuProduto.getItensInclusos().size());
        //mostra índice 2 da lista
        System.out.println(meuProduto.getItensInclusos().get(2));
        System.out.println(meuProduto.getTamanho());**/

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Nestle",Tamanho.MEDIO);
        meuProdutoNacional.setImpostoNacional(0.55789);
        System.out.println(meuProdutoNacional.getMarca());
        System.out.println(meuProdutoNacional.getImpostoNacional());

        meuProdutoNacional.setValor(30.00);

        ProdutoInternacional meuProdutoIntenacional = new ProdutoInternacional("Nike", Tamanho.MEDIO);
        meuProdutoIntenacional.setTaxaDeImportação(10.773);
        System.out.println(meuProdutoIntenacional.getMarca());
        System.out.println(meuProdutoIntenacional.getTaxaDeImportação());

        meuProdutoIntenacional.setValor(0);
    }
}
