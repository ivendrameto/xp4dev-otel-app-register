package dev.xp4.article.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterDTO implements Serializable {

    private Long id;
    private Long clientId;
    private Long carId;
    private LocalDateTime registerDateTime;

}
