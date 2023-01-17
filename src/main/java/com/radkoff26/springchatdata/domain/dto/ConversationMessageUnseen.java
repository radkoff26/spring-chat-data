package com.radkoff26.springchatdata.domain.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(catalog = "chat", schema = "public", name = "conversation_message_unseen")
public class ConversationMessageUnseen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "sender_id")
    private long senderId;
    @Column(name = "receiver_id")
    private long receiverId;
    @Column(name = "message_id")
    private long messageId;
}
