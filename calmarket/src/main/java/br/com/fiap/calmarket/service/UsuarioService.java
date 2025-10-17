package br.com.fiap.calmarket.service;

import br.com.fiap.calmarket.dao.UsuarioDao;
import br.com.fiap.calmarket.model.Role;
import br.com.fiap.calmarket.model.Usuario;
import jakarta.annotation.PostConstruct;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements UserDetailsService {

    private final UsuarioDao usuarioDao;
    private final PasswordEncoder passwordEncoder;

    public UsuarioService(UsuarioDao usuarioDao, PasswordEncoder passwordEncoder) {
        this.usuarioDao = usuarioDao;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = usuarioDao.findByEmail(email); // usando DAO
        if (usuario == null) {
            throw new UsernameNotFoundException("Usuário não encontrado");
        }

        return User.builder()
                .username(usuario.getEmail())
                .password(usuario.getSenha())
                .roles(usuario.getRole().name())
                .build();
    }

    // Método para criar o admin na inicialização
    @PostConstruct
    public void criarAdmin() {
        if (usuarioDao.findByEmail("admin@calmarket.com") == null) {
            Usuario admin = new Usuario();
            admin.setNome("Administrador");
            admin.setEmail("admin@calmarket.com");
            admin.setSenha(passwordEncoder.encode("admin123")); // senha inicial
            admin.setRole(Role.ADMIN);
            usuarioDao.cadastrar(admin); // ou usuarioDao.cadastrar(admin)
            System.out.println("Admin criado: admin@calmarket.com / admin123");
        }
    }
}
