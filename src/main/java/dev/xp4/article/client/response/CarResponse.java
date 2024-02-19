package dev.xp4.article.client.response;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarResponse implements Serializable {

    private Long id;
    private String identification;
    private Boolean active;

}
