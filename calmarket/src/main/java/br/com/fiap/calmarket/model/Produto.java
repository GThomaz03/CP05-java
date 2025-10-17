package br.com.fiap.calmarket.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CM_TB_PRODUTO")
public class Produto {

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NOME", nullable = false)
    @NotBlank(message = "Campo de 'NOME' é obrigatório")
    private String nome;

    @Column(name = "TIPO", nullable = false)
    @NotBlank(message = "Campo de 'TIPO' é obrigatório")
    private String tipo;

    @Column(name = "SETOR", nullable = false)
    @Enumerated(EnumType.STRING)
    private Setor setor;

    @Column(name = "TAMANHO", nullable = false)
    @NotBlank(message = "Campo de 'TAMANHO' é obrigatório")
    private String tamanho;

    @Column(name = "PRECO", nullable = false, precision = 10, scale = 2)
    @DecimalMin(value = "0.0", inclusive = false, message = "O preço deve ser maior que zero")
    private BigDecimal preco;
}
