package br.com.fiap.calmarket.controller;

import br.com.fiap.calmarket.dao.UsuarioDao;
import br.com.fiap.calmarket.model.Role;
import br.com.fiap.calmarket.model.Usuario;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    private final UsuarioDao usuarioDao;
    private final PasswordEncoder passwordEncoder;

    public AuthController(UsuarioDao usuarioDao, PasswordEncoder passwordEncoder) {
        this.usuarioDao = usuarioDao;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/signup")
    public String signupForm(Usuario usuario) {
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(@ModelAttribute Usuario usuario) {
        usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
        usuario.setRole(Role.CLIENTE);

        // Usando DAO em vez do repository
        usuarioDao.cadastrar(usuario); // ou insert/update dependendo da sua implementação DAO

        return "redirect:/login";
    }
}
