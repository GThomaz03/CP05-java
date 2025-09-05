package br.com.fiap.calmarket.Controller;

import br.com.fiap.calmarket.Dao.ProdutoDaoImpl;
import br.com.fiap.calmarket.Model.Produto;
import br.com.fiap.calmarket.Model.Setor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/produtos/view")
public class ProdutoViewController {

    private final ProdutoDaoImpl produtoDao;

    public ProdutoViewController(ProdutoDaoImpl produtoDao) {
        this.produtoDao = produtoDao;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("produtos", produtoDao.listar());
        return "produtos";
    }

    @GetMapping("/cadastrar")
    public String formCadastrar(Model model) {
        model.addAttribute("produto", new Produto());
        model.addAttribute("setores", Setor.values()); // envia todos os valores do enum
        return "cadastro-produto";
    }


    @PostMapping("/cadastrar")
    public String cadastrar(@ModelAttribute Produto produto) {
        produtoDao.cadastrar(produto);
        return "redirect:/produtos/view";
    }

    @GetMapping("/editar/{id}")
    public String formEditar(@PathVariable int id, Model model) {
        model.addAttribute("produto", produtoDao.buscar(id));
        return "editar-produto";
    }

    @PostMapping("/editar/{id}")
    public String editar(@PathVariable int id, @ModelAttribute Produto produto) {
        produtoDao.atualizar(produto, id);
        return "redirect:/produtos/view";
    }

    @GetMapping("/excluir/{id}")
    public String confirmarExclusao(@PathVariable int id, Model model) {
        model.addAttribute("produto", produtoDao.buscar(id));
        return "confirmar-exclusao";
    }

    @PostMapping("/excluir/{id}")
    public String excluir(@PathVariable int id) {
        produtoDao.remover(id);
        return "redirect:/produtos/view";
    }
}
