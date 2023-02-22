package com.radkoff26.springchatdata.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(catalog = "chat", schema = "public", name = "user_blocked")
@IdClass(UserBlockedId.class)
public class UserBlocked {
    @Id
    @Column(name = "blocker_id")
    private long blockerId;
    @Id
    @Column(name = "blocked_id")
    private long blockedId;
}
