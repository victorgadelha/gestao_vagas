package br.com.victorgadelha.gestao_vagas.exceptions;

public class UserFoundException extends RuntimeException {
    public UserFoundException() {
        super("Uuário já existe");
    }
}
