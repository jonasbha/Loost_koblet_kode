package org.hiof.chatroom.fakes;

import org.hiof.chatroom.core.ChatMessage;
import org.hiof.chatroom.persistence.ChatMessageRepository;

import java.util.*;
import java.util.stream.Stream;

public class FakeChatMessageRepository implements ChatMessageRepository {
    Set<ChatMessage> messages = new HashSet<>();

    @Override
    public void add(ChatMessage message) {
        messages.add(message);
    }

    @Override
    public Stream<ChatMessage> query() {
        return messages.stream();
    }

    @Override
    public ChatMessage get(String id) {
        return messages.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    }
}