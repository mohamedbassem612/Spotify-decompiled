package com.spotify.playlist.ai.creation.v2;

import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public interface SubmitMessageResponseOrBuilder extends v2j0 {
    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getMessageId();

    phc getMessageIdBytes();

    int getRetryAfterMs();

    String getSessionId();

    phc getSessionIdBytes();

    Status getStatus();

    long getSubmitTimestampMs();

    boolean hasStatus();

    /* synthetic */ boolean isInitialized();
}
