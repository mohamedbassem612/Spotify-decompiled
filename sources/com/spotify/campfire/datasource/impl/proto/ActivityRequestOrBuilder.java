package com.spotify.campfire.datasource.impl.proto;

import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface ActivityRequestOrBuilder extends v2j0 {
    AckType getAckType();

    int getAckTypeValue();

    ActivityRequest.ArCase getArCase();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    EmojiReaction getEmojiReaction();

    ReactionEmoti getReactionEmoti();

    int getReactionEmotiValue();

    ReceiptType getReceiptType();

    int getReceiptTypeValue();

    boolean hasAckType();

    boolean hasEmojiReaction();

    boolean hasReactionEmoti();

    boolean hasReceiptType();

    /* synthetic */ boolean isInitialized();
}
