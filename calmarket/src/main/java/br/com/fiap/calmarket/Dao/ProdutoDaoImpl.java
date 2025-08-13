package br.com.fiap.calmarket.Dao;

import br.com.fiap.calmarket.Model.Produto;
import org.springframework.stereotype.Repository;

@Repository
public class ProdutoDaoImpl extends GenericDaoImpl<Produto, Integer> implements ProdutoDao {
    public ProdutoDaoImpl() {
        super();
    }
}
