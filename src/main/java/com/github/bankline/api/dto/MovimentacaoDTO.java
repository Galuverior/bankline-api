package com.github.bankline.api.dto;

import com.github.bankline.api.model.MovimentacaoTipo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class MovimentacaoDTO {

    private String descricao;

    private Double valor;

    private MovimentacaoTipo tipo;

    private Long idConta;

}
