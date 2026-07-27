package br.com.alura.adopet.api.exception;

public class PetNaoEncontradoException extends RuntimeException{
    public PetNaoEncontradoException(String message) {
        super(message);
    }
}
