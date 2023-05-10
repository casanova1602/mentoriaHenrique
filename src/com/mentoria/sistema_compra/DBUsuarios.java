package com.mentoria.sistema_compra;

import java.util.ArrayList;
import java.util.List;

public class DBUsuarios {

	private List<Usuario> listaUsuario = new ArrayList();
	
	public void addUser(Usuario usuario) {
		listaUsuario.add(usuario);
	}
	
	public void removeUser(Usuario usuario) {
		listaUsuario.remove(usuario);
	}
	
	public List<Usuario> getList() {
		return listaUsuario;
	}
}