package com.mentoria.sistema_compra;

public class Estoque {

	public DBProdutos dbProdutos;

	public Estoque() {
		this.dbProdutos = new DBProdutos();
	}

	public void addQuantidade(Produto produtoParaAcrescentar) {
		for (Produto produto : dbProdutos.getProdutos()) {
			if (produtoParaAcrescentar.nome.equals(produto.nome)) {
				produto.quantidade += produtoParaAcrescentar.quantidade;
			}
		}
	}

	public boolean removeQuantidade(Produto produtoParaRemover) {
		for (Produto produto : dbProdutos.getProdutos()) {
			if (produtoParaRemover.nome.equals(produto.nome)) {
				if (produto.quantidade == 0) {
					System.out.println("Não temos em estoque. :(");
					return false;
				} else if (produtoParaRemover.quantidade <= produto.quantidade) {
					produto.quantidade -= produtoParaRemover.quantidade;
					return true;
				} else {
					System.out.println("Quantidade Insuficiente");
					return false;
				}

			}
		}
		return false;
	}

	public boolean localizaProduto(String nome) {
		for (Produto produto : dbProdutos.getProdutos()) {
			if (produto.nome.contains(nome)) {
				System.out.println("\n*****************************************************");
				System.out.println("Produto(s) Localizado(s):\n");
				System.out
						.printf(produto.nome + " - R$ " + "%.2f" + " Quantidade: " + produto.quantidade + "\n", produto.preco);
				return true;
			}
		}
		return false;
	}
}
