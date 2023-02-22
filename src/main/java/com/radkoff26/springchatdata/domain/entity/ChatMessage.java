package com.radkoff26.springchatdata.domain.entity;

import java.sql.Timestamp;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(catalog = "chat", schema = "public", name = "chat_message")
public class ChatMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "sender_id")
    @NonNull
    private User sender;
    @ManyToOne
    @JoinColumn(name = "chatId")
    @NonNull
    private Chat chat;
    @NonNull
    private String text;
    @ManyToOne
    @JoinColumn(name = "reply_to_message_id")
    @Nullable
    private ChatMessage replyToMessage;
    @Column(name = "is_removed")
    private boolean isRemoved;
    @Column(name = "is_edited")
    private boolean isEdited;
    @Column(name = "sent_at")
    @NonNull
    private Timestamp sentAt;
}
