package com.radkoff26.springchatdata.domain.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserBlockedId implements Serializable {
    private long blockerId;
    private long blockedId;
}
