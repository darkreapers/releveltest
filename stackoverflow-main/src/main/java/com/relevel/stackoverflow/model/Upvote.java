package com.relevel.stackoverflow.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Upvote {

    @Id
    private long upvote_id;
}
