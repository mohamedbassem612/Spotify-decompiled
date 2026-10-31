package com.spotify.boombox.audiosinkesperanto;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/spotify/boombox/audiosinkesperanto/NoOpTransportException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "src_main_java_com_spotify_boombox_audiosinkesperanto-audiosinkesperanto"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NoOpTransportException extends RuntimeException {
    public NoOpTransportException() {
        super("AudioSinkChainWrapperServiceClient custom transport is not set");
    }
}
