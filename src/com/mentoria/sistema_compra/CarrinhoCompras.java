package com.mentoria.sistema_compra;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
	
	Estoque estoque = Teste.getEstoque();
	
	private List<Produto> carrinhoUsuario = new ArrayList();

	public boolean addCarrinho(String produto, int quantidade) {
		for (Produto produtos : estoque.dbProdutos.getProdutos()) {
			if (produtos.nome.equals(produto)) {
				if (estoque.removeQuantidade(new Produto(produto, produtos.preco, quantidade))) {
					this.carrinhoUsuario.add(new Produto(produto, produtos.preco, quantidade));
					return true;
				}
			}
		}
		System.out.println("Produto não Localizado");
		return false;
	}

	public void removeCarrinho(String produto, int quantidade) {
		int quantCarrinho = 0;
		for (Produto produtoCarrinho : this.carrinhoUsuario) {
			if (produtoCarrinho.nome.equals(produto)) {
				quantCarrinho = produtoCarrinho.quantidade;

				if (quantCarrinho < quantidade) {
					System.out.println("Quantidade Insuficiente no Carrinho");
				} else {
					for (Produto produtos : estoque.dbProdutos.getProdutos()) {
						if (produtos.nome.equals(produto)) {
							if (quantCarrinho == quantidade) {
								this.carrinhoUsuario.remove(produtoCarrinho);
							} else {
								produtoCarrinho.quantidade -= quantidade;
							}
							;
							estoque.addQuantidade(new Produto(produto, produtos.preco, quantidade));
						}
					}
				}
			}
		}

	}

	public void visualizarCarrinho() {
		if (this.carrinhoUsuario.size() == 0) {
			System.out.println("\nCarrinho vazio.\n");
		} else {
			System.out.println("Produto     ||   Quantidade || Valor individual ||  Valor Total");
			for (Produto produtos : carrinhoUsuario) {
				System.out.println(produtos.nome + "      ||      " + produtos.quantidade + "     ||      "
						+ produtos.preco + "      ||      " + (produtos.preco * produtos.quantidade + " \n "));
			}
			System.out.println("\n\n");
		}
	}

	public List<Produto> getCarrinho() {
		return carrinhoUsuario;
	}

	public void setCarrinho(List<Produto> historico) {
		this.carrinhoUsuario = historico;
	}

}