package br.com.matheus.gestao_vagas.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //Criação de construtor com argumentos
public class ErrorMessageDTO {
    
    private String message;
    private String field;
}
