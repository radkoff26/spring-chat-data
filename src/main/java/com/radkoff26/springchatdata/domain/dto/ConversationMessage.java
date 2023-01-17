package com.radkoff26.springchatdata.domain.dto;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(catalog = "chat", schema = "public", name = "conversation_message")
public class ConversationMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "sender_id")
    private long senderId;
    @Column(name = "receiver_id")
    private long receiverId;
    @NonNull
    private String text;
    @Column(name = "reply_to_message_id")
    private long replyToMessageId;
    @Column(name = "is_removed_for_all")
    private boolean isRemovedForAll;
    @Column(name = "is_removed_for_sender")
    private boolean isRemovedForSender;
    @Column(name = "is_edited")
    private boolean isEdited;
    @NonNull
    @Column(name = "sent_at")
    private Timestamp sentAt;
}
