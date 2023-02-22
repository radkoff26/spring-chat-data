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
@Table(catalog = "chat", schema = "public", name = "chat_message_unseen")
@IdClass(ChatMessageUnseenId.class)
public class ChatMessageUnseen {
    @Id
    @Column(name = "receiver_id")
    private long receiverId;
    @Id
    @Column(name = "chat_message_id")
    private long chatMessageId;
}
