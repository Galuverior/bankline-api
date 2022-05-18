package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "Movimentacao")
@Table(name = "tab_movimentacao")
public class Movimentacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_hora")
    private LocalDateTime dataHora;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "valor")
    private Long valor;

    @Enumerated(EnumType.STRING)
    private MovimentacaoTipo tipo;

    @Column(name = "id_conta")
    private Long idConta;
}
