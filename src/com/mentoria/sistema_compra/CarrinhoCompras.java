package com.mentoria.sistema_compra;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

	Estoque estoque = Teste.getEstoque();

	private List<Produto> carrinhoUsuario = new ArrayList();

	public boolean addCarrinho(String produto, int quantidade) {
		for (Produto produtoCarrinho : this.carrinhoUsuario) {
			if (produtoCarrinho.nome.equals(produto)) {
				if (estoque.removeQuantidade(new Produto(produto, produtoCarrinho.preco, quantidade))) {
					produtoCarrinho.quantidade += quantidade;
					return true;
				}
			}
		}
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

	public boolean removeCarrinho(String produto, int quantidade) {
		for (Produto produtoCarrinho : this.carrinhoUsuario) {
			if (produtoCarrinho.nome.equals(produto)) {
				int quantCarrinho = produtoCarrinho.quantidade;
				if (quantCarrinho < quantidade) {
					System.out.println("Quantidade Insuficiente no Carrinho");
					return false;
				} else {
					for (Produto produtos : estoque.dbProdutos.getProdutos()) {
						if (produtos.nome.equals(produto)) {
							if (quantCarrinho == quantidade) {
								this.carrinhoUsuario.remove(produtoCarrinho);
							} else {
								produtoCarrinho.quantidade -= quantidade;
							}
							estoque.addQuantidade(new Produto(produto, produtos.preco, quantidade));
							return true;

						}
					}
				}
			}
		}
		return false;
	}

	public void visualizarCarrinho() {
		if (this.carrinhoUsuario.size() == 0) {
			System.out.println("\nCarrinho vazio.\n");
		} else {
			System.out.println("\n***********************************************************************");
			System.out.println("Produto     ||   Quantidade || Valor individual ||  Valor Total\n");
			for (Produto produtos : carrinhoUsuario) {
				double total = produtos.preco * produtos.quantidade;
				System.out.printf(produtos.nome + "      ||      " + produtos.quantidade + "     ||      "
						+ "R$ %.2f" + "      ||      " + " %.2f " + " \n ", produtos.preco, total);
			}
		}
	}

	public List<Produto> getCarrinho() {
		return carrinhoUsuario;
	}

	public void setCarrinho(List<Produto> historico) {
		this.carrinhoUsuario = historico;
	}

}