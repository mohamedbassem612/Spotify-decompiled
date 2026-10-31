package com.spotify.campfire.datasource.impl.proto;

import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface ActivityPayloadOrBuilder extends v2j0 {
    Ack getAck();

    ActivityPayload.CapCase getCapCase();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    Reaction getReaction();

    Receipt getReceipt();

    boolean hasAck();

    boolean hasReaction();

    boolean hasReceipt();

    /* synthetic */ boolean isInitialized();
}
