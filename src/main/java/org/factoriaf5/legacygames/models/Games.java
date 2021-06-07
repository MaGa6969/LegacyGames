package org.factoriaf5.legacygames.models;

public class Games {
    private Long id;
    private String title;
    private Character platform;
    private int year;
    private Double price;
    private String etiqueta;
    private int discount;
    private Double priceDiscount;
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

    public Character getPlatform() {
        return platform;
    }

    public void setPlatform(Character platform) {
        this.platform = platform;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
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
    public Double getPriceDiscount(){
        return priceDiscount;
    }
    public void setPriceDiscount(Double priceDiscount) {
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
