package br.com.fiap.calmarket.Dao;

import java.util.List;

public interface GenericDao<T,K> {
    T cadastrar (T entidade);

    void remover(K id);

    T buscar(K id);

    T atualizar(T entidade, K id);

    List<T> listar();
}
