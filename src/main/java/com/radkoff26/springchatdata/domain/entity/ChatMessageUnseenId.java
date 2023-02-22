package com.radkoff26.springchatdata.domain.entity;

import java.io.Serializable;

public record ChatMessageUnseenId(long receiverId, long chatMessageId) implements Serializable {
}
