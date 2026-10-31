package com.spotify.superconnect.pairingkit;

import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/spotify/superconnect/pairingkit/SuperConnectHmacException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "src_main_java_com_spotify_superconnect_pairingkit-pairingkit"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public final class SuperConnectHmacException extends Exception {
    public SuperConnectHmacException() {
        super("HMAC unavailable");
    }
}
