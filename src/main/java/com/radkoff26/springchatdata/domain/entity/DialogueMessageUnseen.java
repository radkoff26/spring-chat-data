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
@Table(catalog = "chat", schema = "public", name = "dialogue_message_unseen")
@IdClass(DialogueMessageUnseenId.class)
public class DialogueMessageUnseen {
    @Id
    @Column(name = "receiver_id")
    private long receiverId;
    @Id
    @Column(name = "dialogue_message_id")
    private long dialogueMessageId;
}
