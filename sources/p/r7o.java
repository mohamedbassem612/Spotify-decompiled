package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.core.http.HttpConnection;
import com.spotify.core.http.HttpOptions;
import com.spotify.core.http.HttpRequest;
import com.spotify.core.http.HttpResponse;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r7o extends UrlRequest.Callback {
    public final HttpConnection a;
    public final HttpOptions b;
    public final /* synthetic */ v7o c;

    public r7o(v7o v7oVar, HttpConnection httpConnection, HttpOptions httpOptions) {
        this.c = v7oVar;
        this.a = httpConnection;
        this.b = httpOptions;
    }

    public static String a(UrlResponseInfo urlResponseInfo) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<String>> entry : urlResponseInfo.getAllHeaders().entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            value.getClass();
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                bb00.j(sb, key, ": ", (String) it.next(), "\n");
            }
        }
        sb.append("SPT-Protocol: ");
        sb.append(urlResponseInfo.getNegotiatedProtocol());
        sb.append("\n");
        return sb.toString();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        v7o v7oVar = this.c;
        t7o t7oVarF = v7oVar.f();
        if (t7oVarF == null) {
            return;
        }
        int iOrdinal = t7oVarF.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            Logger.k("CronetHttpConnectionImpl: onCanceled with non-terminal state %s (expected ABORTING/TIMED_OUT)", new Object[]{t7oVarF});
        }
        v7oVar.c(t7oVarF, (CronetException) null);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        v7o v7oVar = this.c;
        HttpRequest httpRequest = v7oVar.p;
        if (httpRequest == null) {
            u890.C("savedHttpRequest");
            throw null;
        }
        if (v7o.u.contains(httpRequest.getMethod()) && (cronetException instanceof NetworkException) && v7o.t.contains(Integer.valueOf(((NetworkException) cronetException).getErrorCode())) && v7oVar.f.get() == t7o.b && v7oVar.i.compareAndSet(false, true)) {
            Logger.g("CronetHttpConnectionImpl: retrying after %s", new Object[]{cronetException.getMessage()});
            v7oVar.e();
            return;
        }
        t7o t7oVarF = v7oVar.f();
        if (t7oVarF == null) {
            return;
        }
        Logger.l(cronetException, "CronetHttpConnectionImpl: request failed", new Object[0]);
        v7oVar.c(t7oVarF, cronetException);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        ScheduledFuture scheduledFuture = this.c.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        byteBuffer.flip();
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr);
        this.a.onBytesAvailable(bArr, iRemaining);
        byteBuffer.clear();
        this.c.d(this.b.getTimeout());
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        this.c.m++;
        this.a.onRedirect();
        if (this.b.isFollowRedirects()) {
            urlRequest.followRedirect();
            return;
        }
        t7o t7oVarF = this.c.f();
        int i = t7oVarF == null ? -1 : q7o.a[t7oVarF.ordinal()];
        if (i != -1) {
            if (i == 1 || i == 2) {
                this.c.c(t7oVarF, (CronetException) null);
            } else {
                this.a.onHeaders(new HttpResponse(urlResponseInfo.getHttpStatusCode(), urlResponseInfo.getUrl(), a(urlResponseInfo)));
                this.c.b();
            }
        }
        urlRequest.cancel();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        AtomicReference atomicReference = this.c.f;
        t7o t7oVar = t7o.b;
        t7o t7oVar2 = t7o.c;
        while (!atomicReference.compareAndSet(t7oVar, t7oVar2) && atomicReference.get() == t7oVar) {
        }
        ScheduledFuture scheduledFuture = this.c.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.c.n = urlResponseInfo.getNegotiatedProtocol();
        this.a.onHeaders(new HttpResponse(urlResponseInfo.getHttpStatusCode(), urlResponseInfo.getUrl(), a(urlResponseInfo)));
        this.c.d(this.b.getTimeout());
        urlRequest.read(ByteBuffer.allocateDirect(8192));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        v7o v7oVar = this.c;
        t7o t7oVarF = v7oVar.f();
        if (t7oVarF == null) {
            return;
        }
        int iOrdinal = t7oVarF.ordinal();
        if (iOrdinal == 3 || iOrdinal == 4) {
            v7oVar.c(t7oVarF, (CronetException) null);
        } else {
            v7oVar.b();
        }
    }
}
