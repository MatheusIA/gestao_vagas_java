package br.com.matheus.gestao_vagas.modules.company.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //Significa que está criando um novo construtor com os argumentos da classe abaixo
public class AuthCompanyDTO {
    
    private String password;
    private String username;
}
