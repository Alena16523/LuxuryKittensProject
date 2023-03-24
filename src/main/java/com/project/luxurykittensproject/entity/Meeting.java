package com.project.luxurykittensproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Future;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Meeting extends BaseEntity{

    @Future
    private LocalDateTime startTime;

    @Future
    private LocalDateTime finishTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    // Constructor without ID
    public Meeting(LocalDateTime startTime, LocalDateTime finishTime) {
        this.startTime = startTime;
        this.finishTime = finishTime;
    }
}
