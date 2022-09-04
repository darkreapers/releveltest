package com.relevel.stackoverflow.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {

    @Id
    private long answer_id;
}
