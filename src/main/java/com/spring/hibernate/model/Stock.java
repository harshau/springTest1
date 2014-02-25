package com.spring.hibernate.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Stock")
public class Stock implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column (name = "STOCK_ID")
    private Long stockId;

    @Column (name = "STOCK_CODE")
    private String stockCode;
    @Column (name = "STOCK_NAME")
    private String stockName;

    public Stock() {
    }

    public Stock(String stockCode, String stockName) {
        this.stockCode = stockCode;
        this.stockName = stockName;
    }

    public Long getStockId() {
        return this.stockId;
    }

    public void setStockId(Long stockId) {
        this.stockId = stockId;
    }

    public String getStockCode() {
        return this.stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return this.stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    @Override
    public String toString() {
        return "Stock [stockCode=" + stockCode + ", stockId=" + stockId
                + ", stockName=" + stockName + "]";
    }


}
