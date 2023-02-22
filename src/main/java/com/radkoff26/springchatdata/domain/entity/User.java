package com.radkoff26.springchatdata.domain.entity;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import org.hibernate.Hibernate;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(catalog = "chat", schema = "public")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NonNull
    private String login;
    @NonNull
    private String password;
    @NonNull
    private String email;
    @Column(name = "first_name")
    @NonNull
    private String firstName;
    @Column(name = "last_name")
    @NonNull
    private String lastName;
    @Nullable
    private String description;
    @Column(name = "avatar_slug")
    @Nullable
    private String avatarSlug;
    @Column(name = "is_online")
    private boolean isOnline;
    @Column(name = "last_online")
    @Nullable
    private Timestamp lastOnline;
    @Column(name = "created_at")
    @NonNull
    private Timestamp createdAt;
    @ManyToMany(mappedBy = "users")
    @ToString.Exclude
    private List<Chat> chats;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
