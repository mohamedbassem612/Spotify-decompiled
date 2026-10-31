package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.Timestamp;
import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface EventCaptureOrBuilder extends v2j0 {
    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getEventId();

    phc getEventIdBytes();

    EventType getEventType();

    int getEventTypeValue();

    Timestamp getOccurredAt();

    boolean hasOccurredAt();

    /* synthetic */ boolean isInitialized();
}
