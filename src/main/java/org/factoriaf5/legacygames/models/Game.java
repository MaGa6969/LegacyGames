package org.factoriaf5.legacygames.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity

public class Game{
    @Id
    @GeneratedValue(strategy = SEQUENCE)
    private Long id;
    private String title;
    private String platform;
    private int year;
    private float price;
    private String etiqueta;
    private int discount;
    private float priceDiscount;
    private String category;
    private String publisher;
    private int pegi;
    private String pegiDescriptors;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getEtiqueta() {
        return etiqueta;
    }
    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public float getPriceDiscount(){
        return priceDiscount;
    }
    public void setPriceDiscount(float priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public int getPegi() {
        return pegi;
    }
    public void setPegi(int pegi) {
        this.pegi = pegi;
    }
     public String getPegiDescriptors() {
        return pegiDescriptors;
     }
    public void setPegiDescriptors(String pegiDescriptors) {
        this.pegiDescriptors = pegiDescriptors;
    }

}
