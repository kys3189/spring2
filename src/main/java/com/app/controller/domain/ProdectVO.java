package com.app.controller.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ProdectVO {
    private String prodectName;
    private int prodectPrice;
}
