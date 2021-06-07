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
}
