package com.relevel.stackoverflow.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Question {

    @Id
    private long question_id;
}
