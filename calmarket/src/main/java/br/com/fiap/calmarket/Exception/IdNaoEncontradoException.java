package br.com.fiap.calmarket.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "ID NÃO ENCONTRADO")
public class IdNaoEncontradoException extends RuntimeException {
    public IdNaoEncontradoException(String message) {
        super(message);
    }
}
