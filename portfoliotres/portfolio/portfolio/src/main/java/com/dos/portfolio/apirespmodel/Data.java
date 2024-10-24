package com.dos.portfolio.apirespmodel;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
// import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
// @Data
public class Data {
    @JsonIgnore
    private long id;

    private String name;
    private String symbol;
    @JsonProperty("quote")
    private Quote quote;

    public String getName(){
        return this.name;
    }
    public String getSymbol(){
        return this.symbol;
    }
    public Quote getQuote(){
        return this.quote;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSymbol(String symbol){
        this.symbol = symbol;
    }
    public void setQuote(Quote quote){
        this.quote = quote;
    }
    @JsonIgnore
    private String slug;
    @JsonIgnore
    private String num_market_pairs;
    @JsonIgnore
    private String date_added;
    @JsonIgnore
    private String tags;
    @JsonIgnore
    private String max_supply;
    @JsonIgnore
    private String circulating_supply;
    @JsonIgnore
    private String total_supply;
    @JsonIgnore
    private String infinite_supply;
    @JsonIgnore
    private String platform;
    @JsonIgnore
    private String cmc_rank;
    @JsonIgnore
    private String self_reported_circulating_supply;
    @JsonIgnore
    private String self_reported_market_cap;
    @JsonIgnore
    private String tvl_ratio;
    @JsonIgnore
    private String last_updated;


}
