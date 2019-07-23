package com.demo.agile.model;

import lombok.Data;

import java.util.Date;

@Data
public class AgileOrder {

    private static final long serialVersionUID = 1L;

    private String orderId;

    private String clientId;

    private Date orderDate;

    private Integer quantity;

    private String commont;
}
