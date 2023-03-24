package com.project.luxurykittensproject.entity;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.project.luxurykittensproject.enums.Breed;
import com.project.luxurykittensproject.enums.Gender;
import com.project.luxurykittensproject.enums.KittenStatus;
import com.project.luxurykittensproject.enums.States;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class KittenPost extends BaseEntity {

    @Enumerated
    private Breed breed;

    private LocalDate dob;
    private String color;

    @Enumerated
    private Gender gender;

    @Enumerated
    private KittenStatus status;

    private String description;
    private int price;

    @Enumerated
    private States states;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "flagged")
    private boolean flagged;

    @Column(name = "approved")
    private boolean approved;

    //to upload images of kittens and store url addresses of the images
    @ElementCollection
    private List<String> images;

    //to add video for the kitten
    @URL  // to make sure that url is valid (hibernate validation library)
    private String videoUrl;

    public boolean isFlagged() {
        return flagged;
    }

    public void setFlagged(boolean flagged) {
        this.flagged = flagged;
    }

    // Constructor without ID and User and videoUrl
    public KittenPost(Breed breed, LocalDate dob, String color, Gender gender, KittenStatus status, String description, int price, List<String> images, boolean approved) {
        this.breed = breed;
        this.dob = dob;
        this.color = color;
        this.gender = gender;
        this.status = status;
        this.description = description;
        this.price = price;
        this.images = images;
        this.createdAt = LocalDateTime.now();
        this.approved = approved;
    }

    //Constructor without ID and User

    public KittenPost(Breed breed, LocalDate dob, String color, Gender gender, KittenStatus status, String description, int price, List<String> images, String videoUrl,boolean approved ) {
        this.breed = breed;
        this.dob = dob;
        this.color = color;
        this.gender = gender;
        this.status = status;
        this.description = description;
        this.price = price;
        this.images = images;
        this.videoUrl = videoUrl;
        this.createdAt = LocalDateTime.now();
        this.approved = approved;
    }
}
