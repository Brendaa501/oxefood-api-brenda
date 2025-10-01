package br.com.ifpe.oxefood.modelo.produto;


import java.time.LocalDate;

import org.hibernate.annotations.SQLRestriction;
import jakarta.persistence.Table;
import br.com.ifpe.oxefood.util.entity.EntidadeAuditavel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name = "CategoriaProduto") // sera criado uma tabela msm nome da classe
@SQLRestriction("habilitado = true") // serve para filtrar o registro da entidade
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaProduto extends EntidadeAuditavel {

    @Column
    private String descricao;
}