package p;

import android.net.http.UrlRequest;
import java.nio.ByteBuffer;
import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n65 extends ExperimentalUrlRequest {
    public final UrlRequest a;
    public final vk4 b;
    public final String c;
    public final Collection d;
    public final z3j1 e;

    public n65(UrlRequest urlRequest, vk4 vk4Var, String str, Collection collection, RequestFinishedInfo.Listener listener) {
        this.a = urlRequest;
        this.b = vk4Var;
        this.c = str;
        this.d = collection;
        this.e = listener == null ? null : new z3j1(listener);
    }

    public final void a(int i, o65 o65Var, CronetException cronetException) {
        o05.a(this.b, this.c, this.d, this.e, i, o65Var, cronetException);
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        this.a.cancel();
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        this.a.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(org.chromium.net.UrlRequest.StatusListener statusListener) {
        this.a.getStatus(new m65(statusListener));
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(ByteBuffer byteBuffer) {
        this.a.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.a.start();
    }
}
