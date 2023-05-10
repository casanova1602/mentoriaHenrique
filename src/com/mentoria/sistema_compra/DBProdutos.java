package com.mentoria.sistema_compra;

import java.util.ArrayList;
import java.util.List;

public class DBProdutos {

	private List<Produto> listaProduto = new ArrayList();

	public void addProduto(Produto produto) {
		listaProduto.add(produto);
	}
	
	public void removeProduto(Produto produto) {
		listaProduto.remove(produto);
	}
	
	public List<Produto> getProdutos() {
		return listaProduto;
	}
}
