package com.br.primeiroProjeto.demo.model;

import lombok.Data;

@Data
public class Order {
    private Integer code;
    private Double basic;
    private Double discount;
}
