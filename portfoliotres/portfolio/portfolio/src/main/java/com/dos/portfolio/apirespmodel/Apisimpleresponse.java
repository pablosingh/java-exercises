package com.dos.portfolio.apirespmodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apisimpleresponse {
    private String name;
    private String symbol;
    private Double price;
}
