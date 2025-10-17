package br.com.fiap.calmarket.controller;

import br.com.fiap.calmarket.dao.ProdutoDaoImpl;
import br.com.fiap.calmarket.model.Produto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoDaoImpl produtoDao;

    @Autowired
    public ProdutoController(ProdutoDaoImpl produtoDao) {
        this.produtoDao = produtoDao;
    }

    @GetMapping("/index")
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("Produtos");
    }

    @GetMapping()
    public List<Produto> listar() {
        return produtoDao.listar();
    }

    @GetMapping("/{id}")
    public EntityModel<Produto> procurarPorId(@PathVariable int id) {
        Produto produto = produtoDao.buscar(id);
        return EntityModel.of(produto,
                linkTo(methodOn(ProdutoController.class).procurarPorId(id)).withSelfRel(),
                linkTo(methodOn(ProdutoController.class).listar()).withRel("lista"),
                linkTo(methodOn(ProdutoController.class).removerPorId(id)).withRel("delete"),
                linkTo(methodOn(ProdutoController.class).atualizar(id, produto)).withRel("update")
        );
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<EntityModel<Produto>> cadastrar(@RequestBody @Valid Produto produto) {
        Produto novo = produtoDao.cadastrar(produto);

        EntityModel<Produto> model = EntityModel.of(novo,
                linkTo(methodOn(ProdutoController.class).procurarPorId(novo.getId())).withSelfRel(),
                linkTo(methodOn(ProdutoController.class).listar()).withRel("lista"),
                linkTo(methodOn(ProdutoController.class).atualizar(novo.getId(), novo)).withRel("update"),
                linkTo(methodOn(ProdutoController.class).removerPorId(novo.getId())).withRel("delete")
        );

        return ResponseEntity
                .created(linkTo(methodOn(ProdutoController.class).procurarPorId(novo.getId())).toUri())
                .body(model);
    }


    @PutMapping("/{id}")
    public EntityModel<Produto> atualizar(@PathVariable int id, @Valid @RequestBody Produto produto) {
        Produto atualizado = produtoDao.atualizar(produto, id);

        return EntityModel.of(atualizado,
                linkTo(methodOn(ProdutoController.class).procurarPorId(id)).withSelfRel(),
                linkTo(methodOn(ProdutoController.class).listar()).withRel("lista"),
                linkTo(methodOn(ProdutoController.class).removerPorId(id)).withRel("delete")
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerPorId(@PathVariable int id) {
        produtoDao.remover(id);
        return ResponseEntity.noContent().build(); // 204
    }


}
