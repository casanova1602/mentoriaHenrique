package com.mentoria.sistema_compra;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Teste {
	
	static Estoque estoque = new Estoque();
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		Sessao sessao = new Sessao();
		Integer comando = 0;
		String usuarioLogin = "login";

		sessao.dbUsuario.addUser(new Usuario("André", "andre", "1234", false));
		sessao.dbUsuario.addUser(new Usuario("Walker", "walker", "5678", false));
		estoque.dbProdutos.addProduto(new Produto("morango", 2.00, 100));
		estoque.dbProdutos.addProduto(new Produto("cenoura", 0.39, 50));
		estoque.dbProdutos.addProduto(new Produto("tomate", 2.00, 500));
		estoque.dbProdutos.addProduto(new Produto("alface", 4.50, 50));
		estoque.dbProdutos.addProduto(new Produto("uva roxa", 8.00, 30));
		estoque.dbProdutos.addProduto(new Produto("uva verde", 10.00, 70));
		Map<String, List<Produto>> historicoCarrinho = new HashMap<String, List<Produto>>();

		while (usuarioLogin.toUpperCase() != "ENCERRAR") {
		boolean usuarioFezLogin = false;
			try {
				if (comando != 7) {
					comando = 0;

					do {
						System.out.println("Insira seu Usuário: ");
						usuarioLogin = scr.nextLine();
						System.out.println("Insira a senha: ");
						String senhaLogin = scr.next();
						if (sessao.realizarLogin(new Usuario(usuarioLogin, senhaLogin)) == false) {
							System.out.println("Usuário não Localizado ou senha Inválida. Tente Novamente");
							scr.nextLine();
						}else{
							usuarioFezLogin = true;
						};
					} while (usuarioFezLogin == false);
					if (historicoCarrinho.containsKey(sessao.usuarioLogado.getUsuario())) {
						sessao.usuarioLogado.carrinho
								.setCarrinho(historicoCarrinho.get(sessao.usuarioLogado.getUsuario()));
					}
				}

				while (comando != 5) {
					System.out.println("O que gostaria de fazer?\n 1 - Localizar Produto \n 2 - Adicionar Produto \n"
							+ " 3 - Remover Produto \n 4 - Visualizar Carrinho de Compras \n 5 - Sair do Usuário \n 6 - Encerrar Sistema");
					scr.nextLine();
					comando = scr.nextInt();
					switch (comando) {
					case 1:
						System.out.println("Digite o nome do produto");
						String localizaNome = scr.next().toLowerCase();
						estoque.localizaProduto(localizaNome);
						break;
					case 2:
						System.out.println("Digite o produto que gostaria de adicionar: ");
						scr.nextLine();
						String produtoCliente = scr.nextLine().toLowerCase();
						System.out.println("Digite a quantidade: ");
						int quantidadeCliente = scr.nextInt();
						sessao.usuarioLogado.carrinho.addCarrinho(produtoCliente, quantidadeCliente);
						break;
					case 3:
						System.out.println("Digite o produto que gostaria de remover: ");
						String produtoRemoverCliente = scr.next().toLowerCase();
						System.out.println("Digite a quantidade: ");
						int quantidadeRemoverCliente = scr.nextInt();
						sessao.usuarioLogado.carrinho.removeCarrinho(produtoRemoverCliente, quantidadeRemoverCliente);
						break;
					case 4:
						sessao.usuarioLogado.carrinho.visualizarCarrinho();
						break;
					case 5:
						if (sessao.usuarioLogado.carrinho.getCarrinho().size() > 0) {
							for (Usuario user : sessao.dbUsuario.getList()) {
								if (sessao.usuarioLogado.getNome().equals(user.getNome())) {
									user.setHistorico(true);
								}
							}
							historicoCarrinho.put(sessao.usuarioLogado.getUsuario(),
									sessao.usuarioLogado.carrinho.getCarrinho());
						}
						System.out.println("Volte Sempre!");
						scr.nextLine();
						break;
					case 6:
						comando = 5;
						usuarioLogin = "ENCERRAR";
					default: 
						System.out.println("Comando Inválido!");
						break;
					}

				}
			} catch (InputMismatchException e) {
				System.out.println("\nVocê inseriu caracteres inválidos. Tente novamente\n");
				comando = 7;
				scr.nextLine();
			} catch (ConcurrentModificationException e) {
				System.out.println(e.getMessage());
				scr.nextLine();
			}
		}
		System.out.println("############# Sistema Encerrado! ######################");
		scr.close();
	}
	public static Estoque getEstoque() {
		return estoque;
	}
}
