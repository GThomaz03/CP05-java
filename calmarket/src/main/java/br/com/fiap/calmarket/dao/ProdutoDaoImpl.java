package br.com.fiap.calmarket.dao;

import br.com.fiap.calmarket.model.Produto;
import org.springframework.stereotype.Repository;

@Repository
public class ProdutoDaoImpl extends GenericDaoImpl<Produto, Integer> implements ProdutoDao {
    public ProdutoDaoImpl() {
        super();
    }
}
