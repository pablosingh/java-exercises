package com.dos.portfolio.opspack;

import com.dos.portfolio.holpack.Holdings;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Basic;
// import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Operations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // id date amount price total buy exchange comment HoldingId
    @Basic
    private String ticker;
    private String dateStr;
    private double amount;
    private double price;
    private double total;
    private boolean buy;
    private String exchange;
    private String comment;

    // public String getTicker(){
    //     return this.ticker;
    // }

    // @ManyToOne
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "holding_id")
    @JsonBackReference
    private Holdings holding;
}
