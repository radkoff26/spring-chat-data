package com.radkoff26.springchatdata.domain.entity;

import java.io.Serializable;

public record DialogueMessageUnseenId(long receiverId, long dialogueMessageId) implements Serializable {
}
