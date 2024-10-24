package com.dos.portfolio.apirespmodel;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class USD {
    private double price;

    @JsonIgnore
    private double volume_24h;
    @JsonIgnore
    private double volume_change_24h;
    @JsonIgnore
    private double percent_change_1h;
    @JsonIgnore
    private double percent_change_24h;
    @JsonIgnore
    private double percent_change_7d;
    @JsonIgnore
    private double percent_change_30d;
    @JsonIgnore
    private double percent_change_60d;
    @JsonIgnore
    private double percent_change_90d;
    @JsonIgnore
    private double market_cap;
    @JsonIgnore
    private double market_cap_dominance;
    @JsonIgnore
    private double fully_diluted_market_cap;
    @JsonIgnore
    private double tvl;
    @JsonIgnore
    private String last_updated;
}
