package p;

import android.net.http.BidirectionalStream$Callback;
import android.net.http.HeaderBlock;
import android.net.http.HttpException;
import android.net.http.UrlResponseInfo;
import java.nio.ByteBuffer;
import java.util.Objects;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r74 implements BidirectionalStream$Callback {
    public final BidirectionalStream.Callback a;
    public s74 b;

    public r74(BidirectionalStream.Callback callback) {
        Objects.requireNonNull(callback, "Callback is required.");
        this.a = callback;
    }

    public final void onCanceled(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        o65 o65VarA = o65.a(urlResponseInfo);
        try {
            this.a.onCanceled(this.b, o65VarA);
        } finally {
            this.b.a(2, o65VarA, null);
        }
    }

    public final void onFailed(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, HttpException httpException) {
        o65 o65VarA = o65.a(urlResponseInfo);
        CronetException cronetExceptionT = sf.T(httpException);
        try {
            this.a.onFailed(this.b, o65VarA, cronetExceptionT);
        } finally {
            this.b.a(1, o65VarA, cronetExceptionT);
        }
    }

    public final void onReadCompleted(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        this.a.onReadCompleted(this.b, o65.a(urlResponseInfo), byteBuffer, z);
    }

    public final void onResponseHeadersReceived(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        this.a.onResponseHeadersReceived(this.b, o65.a(urlResponseInfo));
    }

    public final void onResponseTrailersReceived(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, HeaderBlock headerBlock) {
        this.a.onResponseTrailersReceived(this.b, o65.a(urlResponseInfo), new qk4(headerBlock));
    }

    public final void onStreamReady(android.net.http.BidirectionalStream bidirectionalStream) {
        this.a.onStreamReady(this.b);
    }

    public final void onSucceeded(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        o65 o65VarA = o65.a(urlResponseInfo);
        try {
            this.a.onSucceeded(this.b, o65VarA);
        } finally {
            this.b.a(0, o65VarA, null);
        }
    }

    public final void onWriteCompleted(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        this.a.onWriteCompleted(this.b, o65.a(urlResponseInfo), byteBuffer, z);
    }
}
