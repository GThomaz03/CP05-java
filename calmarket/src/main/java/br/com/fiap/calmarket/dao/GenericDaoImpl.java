package br.com.fiap.calmarket.dao;

import br.com.fiap.calmarket.Exception.IdNaoEncontradoException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.ParameterizedType;
import java.util.List;

public class GenericDaoImpl<T, K> implements GenericDao<T, K> {

    @PersistenceContext
    protected EntityManager em;

    private final Class<T> clazz;

    @SuppressWarnings("unchecked")
    public GenericDaoImpl() {
        this.clazz = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Override
    @Transactional
    public T cadastrar(T entidade) {
        return em.merge(entidade); // ou persist se for novo
    }

    @Override
    @Transactional
    public void remover(K id) {
        T entidade = buscar(id);
        em.remove(entidade);
    }

    @Override
    @Transactional(readOnly = true)
    public T buscar(K id) {
        T entidade = em.find(clazz, id);
        if (entidade == null)
            throw new IdNaoEncontradoException("ID NÃO ENCONTRADO");
        return entidade;
    }

    @Override
    @Transactional
    public T atualizar(T entidade, K id) {
        T object = em.find(clazz, id);
        if (object == null)
            throw new IdNaoEncontradoException("ID NÃO ENCONTRADO");
        return em.merge(entidade);
    }

    @Override
    @Transactional(readOnly = true)
    public List<T> listar() {
        return em.createQuery("FROM " + clazz.getSimpleName(), clazz).getResultList();
    }
}
