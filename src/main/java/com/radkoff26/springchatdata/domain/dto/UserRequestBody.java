package com.radkoff26.springchatdata.domain.dto;

public record UserRequestBody(long id, String login, String password, String email, Boolean isEmailVerified) {
}
