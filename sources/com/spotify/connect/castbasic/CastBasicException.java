package com.spotify.connect.castbasic;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/spotify/connect/castbasic/CastBasicException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "src_main_java_com_spotify_connect_castbasic-castbasic"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class CastBasicException extends RuntimeException {
    public final int a;
    public final Throwable b;

    public CastBasicException(int i, Exception exc, String str) {
        super(str);
        this.a = i;
        this.b = exc;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message;
        Throwable th = this.b;
        return (th == null || (message = th.getMessage()) == null) ? super.getMessage() : message;
    }
}
