package br.com.fiap.model;

public class Candidato {

	//final (atributo nao muda o valor, classe nao herda, metodo nao sobrescreve)
	//static -> o objeto não é necessário para utilizar o método ou atributo
	//Modificadores de acesso:
	//public -> todos
	//protected -> a classe, as classes do mesmo pacote e filhas
	//private -> somente a classe
	//default/package -> as classes do mesmo pacote
	
	//Atributos
	private String nome;
	//Tipos primitivos: int, boolean, char, double, float, byte, short, long
	private int idade;

	//Construtores: nao possuem retorno (nem void) e tem mesmo nome da Classe
	//Construtor que recebe o nome do Candidato
	public Candidato(String nome) {
		this.nome = nome;
	}
	
	//Criar um construtro que recebe o nome e idade
	public Candidato(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	//Getters e Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome; 
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
