package br.com.fiap.calmarket.controller;

import br.com.fiap.calmarket.dao.ProdutoDaoImpl;
import br.com.fiap.calmarket.model.Produto;
import br.com.fiap.calmarket.model.Setor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/produtos/view")
public class ProdutoViewController {

    private final ProdutoDaoImpl produtoDao;

    public ProdutoViewController(ProdutoDaoImpl produtoDao) {
        this.produtoDao = produtoDao;
    }

    // Lista todos os produtos
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("produtos", produtoDao.listar());
        return "produtos";
    }

    // --- CADASTRO ---
    // GET para exibir o formulário
    @GetMapping("/cadastrar")
    public String formCadastrar(Model model) {
        model.addAttribute("produto", new Produto());
        model.addAttribute("setores", Setor.values());
        return "cadastro-produto";
    }

    // POST para salvar o produto
    @PostMapping("/cadastrar")
    public String cadastrar(@ModelAttribute @Valid Produto produto, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("setores", Setor.values());
            return "cadastro-produto";
        }
        produtoDao.cadastrar(produto);
        return "redirect:/produtos/view";
    }

    // --- EDIÇÃO ---
    // GET para exibir o formulário de edição
    @GetMapping("/editar/{id}")
    public String formEditar(@PathVariable int id, Model model) {
        model.addAttribute("produto", produtoDao.buscar(id));
        model.addAttribute("setores", Setor.values());
        return "editar-produto";
    }

    // POST para atualizar o produto
    @PostMapping("/editar/{id}")
    public String editar(@PathVariable int id, @ModelAttribute @Valid Produto produto, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("setores", Setor.values());
            return "editar-produto";
        }
        produtoDao.atualizar(produto, id);
        return "redirect:/produtos/view";
    }

    // --- EXCLUSÃO ---
    // GET para confirmar exclusão
    @GetMapping("/excluir/{id}")
    public String confirmarExclusao(@PathVariable int id, Model model) {
        model.addAttribute("produto", produtoDao.buscar(id));
        return "confirmar-exclusao";
    }

    // POST para remover o produto
    @PostMapping("/excluir/{id}")
    public String excluir(@PathVariable int id) {
        produtoDao.remover(id);
        return "redirect:/produtos/view";
    }
}
