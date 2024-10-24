package com.dos.portfolio.apirespmodel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Apiresponsemodel {
    @JsonIgnore
    private String status;

    public List<Data> data;
    public List<Data> getData(){
        return data;
    }
}
