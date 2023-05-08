package com.mentoria.sistema_compra;

public class Sessao {

	Usuario usuarioLogado;
	public DBUsuarios dbUsuario;

	public Sessao() {
		this.dbUsuario = new DBUsuarios();
		
	}

	public boolean realizarLogin(Usuario usuario) {
		for (Usuario usuarioLogin : dbUsuario.getList()) {
				if (usuarioLogin.getUsuario().equals(usuario.getUsuario())
						&& usuarioLogin.getSenha().equals(usuario.getSenha())) {
					usuarioLogado = new Usuario (usuarioLogin.getNome(), usuarioLogin.getUsuario(), usuarioLogin.getSenha(), usuarioLogin.getHistorico());
					if(usuarioLogado.getHistorico() == false) {
					System.out.println("Seja Bem-Vindo " + usuarioLogin.getNome());
					}else {
						System.out.println("Seja Bem-Vindo Novamente " + usuarioLogado.getNome());
					}
					return true;
				}
			}
				return false;			
			}
		}


