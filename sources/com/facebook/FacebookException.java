package com.facebook;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.security.SecureRandom;
import kotlin.Metadata;
import p.czh;
import p.kn10;
import p.mn10;
import p.wf10;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/FacebookException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public class FacebookException extends RuntimeException {
    public static final SecureRandom a = new SecureRandom();

    public FacebookException(String str) {
        super(str);
        if (str == null || !wf10.q.get() || a.nextInt(100) <= 50) {
            return;
        }
        mn10.a(new czh(str, (byte) 3), kn10.ErrorReport);
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }

    public FacebookException() {
    }
}
