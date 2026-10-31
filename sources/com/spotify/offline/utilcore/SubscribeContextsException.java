package com.spotify.offline.utilcore;

import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import kotlin.Metadata;
import p.l1d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/spotify/offline/utilcore/SubscribeContextsException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "src_main_java_com_spotify_offline_utilcore-utilcore"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public final class SubscribeContextsException extends Exception {
    public SubscribeContextsException(long j) {
        super(l1d.l(j, "SubscribeContexts error: "));
    }
}
