package com.relevel.stackoverflow.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comment {

    @Id
    private long comment_id;
}
