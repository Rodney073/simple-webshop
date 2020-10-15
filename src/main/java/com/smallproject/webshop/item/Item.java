package com.smallproject.webshop.item;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "items")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String description;
    private String photoURL;
    private int startingPrice;
    private int purchasePrice;

    public Item(String name, String description, String photoURL, int startingPrice) {
        this.name= name;
        this.description= description;
        this.photoURL = photoURL;
        this.startingPrice = startingPrice;
        this.purchasePrice = startingPrice;
    }
}

