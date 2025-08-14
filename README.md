# $CALMARKET$

#### Exercício de Revisão Spring com Persistência, Lombok, HATEOAS e Deploy

## **Objetivo**

Construir um programa para um mercado express em java, com base no framework spring boot, configurado para o tipo maven, incluindo o Lombok e aplicando o nível de maturidade 3 com HATEOAS.

## **Inicialização com Spring Initializr**

![SpringIo](./img/springinitializr.png)

Dependências selecionadas:

- Spring Web
- Spring Data JPA
- MySQL Driver
- Lombok
- Spring Boot DevTools
- Spring Validation
- Spring HATEOAS

## **Estrutura**

A aplicação "calmarket" está dividida em:

- Model
- Dao
- Controller
- Exception
- resources

### _Model_

Responsável por armazenar as entidades da aplicação, neste caso, a entidade `Produto`.

#### _Classe Produto_

A classe `Produto` representa os dados persistidos no banco de dados. Fizemos uso das seguintes bibliotecas para facilitar sua construção:

#### _Lombok_

Utilizamos anotações Lombok para reduzir o código e torna-lo mais limpo:

- @Getter / @Setter – gera automaticamente os métodos getters e setters.
- @ToString – gera o método toString() para exibição legível.
- @AllArgsConstructor / @NoArgsConstructor – construtores com e sem argumentos.

#### _Jakarta_

As anotações Jakarta são utilizadas para mapear a entidade para o banco de dados e aplicar validações:

- _@Entity_ – indica que a classe representa uma entidade JPA.
- _@Table_ – define o nome da tabela.
- _@Id_ / _@GeneratedValue_ – identifica a chave primária.
- _@Column_ – define as propriedades da coluna.
- _@NotBlank_, _@NotNull_ – validações de dados antes da persistência.

> Por padrão, o MySQL auto incrementa a primary key. Não precisamos informar um valor ao cadastrar, ele será gerado automaticamente.

<details>
  <summary><b>Produto</b></summary>

```java
package br.com.fiap.calmarket.Model;

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

```

</details>

#### **Enum Setor**

A enumeração _Setor_ representa os possíveis setores de um produto.

Utilizar um _enum_ traz vantagens:

- Garante integridade dos dados (evita erro de digitação)
- Facilita a manutenção e crescimento futuro
- Facilita a validação e exibição no front-end

<details>
  <summary><b>Setor</b></summary>

```java
package br.com.fiap.calmarket.Model;

public enum Setor {
    LIMPEZA, HORTIFRUTI, PANIFICADORA, ALIMENTOS, UTENSILIOS, BEBIDAS
}
```

</details>
