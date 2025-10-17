package br.com.fiap.calmarket.dao;

import br.com.fiap.calmarket.model.Usuario;
import org.springframework.stereotype.Repository;
import jakarta.persistence.NoResultException;


@Repository
public class UsuarioDaoImpl extends GenericDaoImpl<Usuario, Integer> implements UsuarioDao {
    public UsuarioDaoImpl() {
        super();
    }

    @Override
    public Usuario findByEmail(String email) {
        try {
            return em.createQuery("SELECT u FROM Usuario u WHERE u.email = :email", Usuario.class)
                    .setParameter("email", email)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

}
