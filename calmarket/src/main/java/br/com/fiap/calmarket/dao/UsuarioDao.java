package br.com.fiap.calmarket.dao;

import br.com.fiap.calmarket.model.Usuario;

public interface UsuarioDao extends GenericDao<Usuario, Integer> {
    Usuario findByEmail(String email);
}
