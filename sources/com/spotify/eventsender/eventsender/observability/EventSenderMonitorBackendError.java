package com.spotify.eventsender.eventsender.observability;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/spotify/eventsender/eventsender/observability/EventSenderMonitorBackendError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "src_main_java_com_spotify_eventsender_eventsender-eventsender"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EventSenderMonitorBackendError extends Exception {
    public final String a;

    public EventSenderMonitorBackendError(String str) {
        super(str);
        this.a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
