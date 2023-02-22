package com.radkoff26.springchatdata.domain.entity;

import java.io.Serializable;

public record UserBlockedId(long blockerId, long blockedId) implements Serializable {
}
