package com.mentoria.sistema_compra;

public class Usuario {

	private String nomeNome;
	private String nomeUsuario;
	private String senhaUsuario;
	private boolean historicoUsuario;
	CarrinhoCompras carrinho;

	public Usuario(String nome, String usuario, String senha, boolean historico) {
		this.nomeNome = nome;
		this.nomeUsuario = usuario;
		this.senhaUsuario = senha;
		this.historicoUsuario = historico;
		this.carrinho = new CarrinhoCompras();
	}	

	public Usuario(String usuario, String senha) {
		this.nomeUsuario = usuario;
		this.senhaUsuario = senha;
	}
	
	public String getUsuario() {
		return this.nomeUsuario;
	}
	
	public String getSenha() {
		return this.senhaUsuario;
	}
	
	public String getNome() {
		return this.nomeNome;
	}
	
	public boolean getHistorico() {
		return this.historicoUsuario;
	}
	
	public void setHistorico(boolean historico) {
		this.historicoUsuario = historico;
	}
	
}
