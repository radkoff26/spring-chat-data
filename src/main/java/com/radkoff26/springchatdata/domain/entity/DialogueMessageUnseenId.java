package com.radkoff26.springchatdata.domain.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class DialogueMessageUnseenId implements Serializable {
    private long receiverId;
    private long dialogueMessageId;
}
