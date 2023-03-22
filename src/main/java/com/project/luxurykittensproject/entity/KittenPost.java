package com.project.luxurykittensproject.entity;

import com.project.luxurykittensproject.enums.Breed;
import com.project.luxurykittensproject.enums.Gender;
import com.project.luxurykittensproject.enums.KittenStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class KittenPost {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated
    private Breed breed;

    private String dob;
    private String color;

    @Enumerated
    private Gender gender;

    @Enumerated
    private KittenStatus status;

    private String description;
    private int price;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    //to upload images of kittens and store url addresses of the images
    @ElementCollection
    private List<String> images;

    //to add video for the kitten
    @URL  // to make sure that url is valid (hibernate validation library)
    private String videoUrl;

    // Constructor without ID and User and videoUrl
    public KittenPost(Breed breed, String dob, String color, Gender gender, KittenStatus status, String description, int price, List<String> images) {
        this.breed = breed;
        this.dob = dob;
        this.color = color;
        this.gender = gender;
        this.status = status;
        this.description = description;
        this.price = price;
        this.images = images;
    }

    //Constructor without ID and User

    public KittenPost(Breed breed, String dob, String color, Gender gender, KittenStatus status, String description, int price, List<String> images, String videoUrl) {
        this.breed = breed;
        this.dob = dob;
        this.color = color;
        this.gender = gender;
        this.status = status;
        this.description = description;
        this.price = price;
        this.images = images;
        this.videoUrl = videoUrl;
    }
}