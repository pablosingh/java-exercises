package com.dos.portfolio.holpack;

import java.util.List;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import opspack.Operations;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Holdings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String dateStr;
    private String ticker;
    private double amount;
    private double initialPrice;
    private double initialCapital;
    private String comment;
    @OneToMany(mappedBy = "holding", cascade = CascadeType.ALL)
    private List<Operations> operations;  
}
