package com.project.luxurykittensproject.dto;

import com.project.luxurykittensproject.entity.User;
import com.project.luxurykittensproject.enums.Breed;
import com.project.luxurykittensproject.enums.Gender;
import com.project.luxurykittensproject.enums.KittenStatus;
import com.project.luxurykittensproject.enums.States;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KittenPostDTO {

    private Breed breed;
    private LocalDate dob;
    private String color;
    private Gender gender;
    private KittenStatus status;
    private String description;
    private int price;
    private States states;
    private LocalDateTime createdAt;
    private LocalDateTime deletedAt;
    private User user;
    private boolean flagged;
    private List<String> images;
    private String videoUrl;
    private boolean approved;

    //constructor with images only
    public KittenPostDTO(Breed breed, LocalDate dob, String color, Gender gender, KittenStatus status, String description, int price, States states, LocalDateTime createdAt, List<String> images) {
        this.breed = breed;
        this.dob = dob;
        this.color = color;
        this.gender = gender;
        this.status = status;
        this.description = description;
        this.price = price;
        this.states = states;
        this.createdAt = createdAt;
        this.images = images;
    }

    //constructor with images and video
    public KittenPostDTO(Breed breed, LocalDate dob, String color, Gender gender, KittenStatus status, String description, int price, States states, LocalDateTime createdAt, List<String> images, String videoUrl) {
        this.breed = breed;
        this.dob = dob;
        this.color = color;
        this.gender = gender;
        this.status = status;
        this.description = description;
        this.price = price;
        this.states = states;
        this.createdAt = createdAt;
        this.images = images;
        this.videoUrl = videoUrl;
    }
}
