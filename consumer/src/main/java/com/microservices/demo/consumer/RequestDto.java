package com.microservices.demo.consumer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestDto {
    private String replyChannel;
    private Long id;
    private String item;
    private Double amount;
    private Double price;

    public RequestDto(Long id, String item, Double amount, Double price) {
        this.id = id;
        this.item = item;
        this.amount = amount;
        this.price = price;
    }

}
