package p;

import android.net.http.HttpException;
import android.net.http.UrlRequest$Callback;
import android.net.http.UrlResponseInfo;
import java.nio.ByteBuffer;
import java.util.Objects;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l65 implements UrlRequest$Callback {
    public final UrlRequest.Callback a;
    public n65 b;

    public l65(UrlRequest.Callback callback) {
        Objects.requireNonNull(callback, "Callback is required.");
        this.a = callback;
    }

    public final void onCanceled(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        o65 o65VarB = o65.b(urlResponseInfo);
        try {
            this.a.onCanceled(this.b, o65VarB);
        } finally {
            this.b.a(2, o65VarB, null);
        }
    }

    public final void onFailed(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, HttpException httpException) {
        o65 o65VarB = o65.b(urlResponseInfo);
        CronetException cronetExceptionT = sf.T(httpException);
        try {
            this.a.onFailed(this.b, o65VarB, cronetExceptionT);
        } finally {
            this.b.a(1, o65VarB, cronetExceptionT);
        }
    }

    public final void onReadCompleted(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        sf.h(new k65(this, urlResponseInfo, byteBuffer, (byte) 0), Exception.class);
    }

    public final void onRedirectReceived(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        sf.h(new k65(this, urlResponseInfo, str, (byte) 1), Exception.class);
    }

    public final void onResponseStarted(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        sf.h(new uk4(this, urlResponseInfo, (byte) 1), Exception.class);
    }

    public final void onSucceeded(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        o65 o65VarB = o65.b(urlResponseInfo);
        try {
            this.a.onSucceeded(this.b, o65VarB);
        } finally {
            this.b.a(0, o65VarB, null);
        }
    }
}
