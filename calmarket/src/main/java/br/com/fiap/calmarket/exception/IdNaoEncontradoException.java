package br.com.fiap.calmarket.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class IdNaoEncontradoException extends RuntimeException {
    public IdNaoEncontradoException(String message) {
        super(message);
    }
}
