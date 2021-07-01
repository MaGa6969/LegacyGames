package org.factoriaf5.legacygames.models;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "games")
public class Game implements Serializable {
    @Id
    @GeneratedValue(strategy = SEQUENCE)
    private Long id;
    private String title;
    private String platform;
    private String year;
    private String price;
    private String tag;
    private String priceDiscount;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    private String publisher;
    private String pegi;
    private String photo;

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price='" + price + '\'' +
                ", category='" + category + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }


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
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTag() {
        return tag;
    }
    public void setTag(String tag) {
        this.tag = tag;
    }
    public String getPriceDiscount(){
        return priceDiscount;
    }
    public void setPriceDiscount(String priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public String getPegi() {
        return pegi;
    }
    public void setPegi(String pegi) {
        this.pegi = pegi;
    }

    public String getPhotoImagePath() {
        if (photo == null || id == null) return null;
        return "/game-photo/" + id + "/" + photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

}
