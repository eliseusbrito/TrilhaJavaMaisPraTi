package com.eliseu.maisprati.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Bike implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private String model;
    private Double price;
//    @JsonFormat(pattern = "YYYY-MM-dd")
    private LocalDate purchaseDate;
    private String buyerName;
    private String store;

    public Bike() {
    }

    public Bike(String description, String model, Double price, LocalDate purchaseDate, String buyerName, String store) {
        this.description = description;
        this.model = model;
        this.price = price;
        this.purchaseDate = purchaseDate;
        this.buyerName = buyerName;
        this.store = store;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return "Bikes{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", purchaseDate=" + purchaseDate +
                ", buyerName='" + buyerName + '\'' +
                ", store='" + store + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bike bike = (Bike) o;
        return Objects.equals(id, bike.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
