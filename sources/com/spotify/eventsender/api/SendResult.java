package com.spotify.eventsender.api;

import kotlin.Metadata;
import p.r0z;
import p.t0z;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/eventsender/api/SendResult;", "", "<init>", "(Ljava/lang/String;I)V", "EVENT_ACCEPTED", "PROTOBUF_SERIALIZATION_FAILED", "EVENT_REJECTED_MISSING_NAME", "EVENT_REJECTED_MISSING_OWNER", "EVENT_REJECTED_EVENT_DATA_TOO_LARGE", "EVENT_REJECTED_RATE_LIMITED", "OTHER_ERROR", "src_main_java_com_spotify_coreeventsender_eventsender-eventsender"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum SendResult {
    EVENT_ACCEPTED,
    PROTOBUF_SERIALIZATION_FAILED,
    EVENT_REJECTED_MISSING_NAME,
    EVENT_REJECTED_MISSING_OWNER,
    EVENT_REJECTED_EVENT_DATA_TOO_LARGE,
    EVENT_REJECTED_RATE_LIMITED,
    OTHER_ERROR;

    private static final /* synthetic */ r0z $ENTRIES = new t0z(values());

    public static r0z getEntries() {
        return $ENTRIES;
    }
}
