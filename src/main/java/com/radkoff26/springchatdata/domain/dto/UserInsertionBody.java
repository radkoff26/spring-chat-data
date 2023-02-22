package com.radkoff26.springchatdata.domain.dto;

import jakarta.annotation.Nullable;

public record UserInsertionBody(
        String login, String password, String email, String firstName, String lastName, @Nullable String avatarSlug
) {
}
