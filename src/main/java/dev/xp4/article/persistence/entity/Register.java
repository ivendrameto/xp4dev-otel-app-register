package dev.xp4.article.persistence.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "registers")
public class Register implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "register_id")
    @SequenceGenerator(name = "register_id", sequenceName = "register_id", allocationSize = 1)
    @Column(name = "register_id")
    private Long id;

    private Long clientId;
    private Long carId;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime registerDateTime;

}
