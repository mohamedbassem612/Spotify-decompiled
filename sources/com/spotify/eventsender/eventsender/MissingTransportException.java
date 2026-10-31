package com.spotify.eventsender.eventsender;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/eventsender/eventsender/MissingTransportException;", "Ljava/io/IOException;", "<init>", "()V", "src_main_java_com_spotify_eventsender_eventsender-eventsender"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class MissingTransportException extends IOException {
    public MissingTransportException() {
        super("No HTTP transport available.");
    }
}
