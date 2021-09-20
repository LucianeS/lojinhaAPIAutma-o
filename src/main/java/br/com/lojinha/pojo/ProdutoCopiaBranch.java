package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

import java.util.List;

public class ProdutoCopiaBranch {
   private String nome;
   private String marca;
   protected double valor;//encapsulado
   // itens era um lista simples do tipo String
   //private List<String> itensInclusos;
   private  List<ItemIncluso> itensInclusos; //Agora virou uma lista de Itens Adicionais
   private Tamanho tamanho; //referente a classe Enum Tamanho

   //Cosntrutor define comandos que serão executados durante a instanciação do objeto
   //Neste caso defini que quando um novo Produto for criado precisa atribuir uma marca inicial
   public ProdutoCopiaBranch(String marcaInicial, Tamanho tamanhoInicial) {
      this.setMarca(marcaInicial);
      //this.setTamanho(tamanhoInicial); inlcuir este comentário só pra subir na branch
   }

   //Encapsulamento
   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getMarca() {
      return marca;
   }

   public void setMarca(String marca) {
      this.marca = marca;
   }

   public double getValor() {
      return valor;
   }

   public void setValor(double valor) {
      if (valor>0) {
         this.valor = valor;
      }else{
         throw new IllegalArgumentException("Valores devem ser maiores do que 0");
      }

   }

   public Tamanho getTamanho() {
      return tamanho;
   }

   public void setTamanho(Tamanho tamanho) {
      this.tamanho = tamanho;
   }

   public List<ItemIncluso> getItensInclusos() {
      return itensInclusos;
   }

   public void setItensInclusos(List<ItemIncluso> itensInclusos) {
      this.itensInclusos = itensInclusos;
   }
}
