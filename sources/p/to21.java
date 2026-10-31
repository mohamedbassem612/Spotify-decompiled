package p;

import java.util.Collection;
import java.util.Collections;
import org.chromium.net.CronetException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class to21 extends RequestFinishedInfo {
    public final String a;
    public final Collection b;
    public final d8o c;
    public final byte d;
    public final UrlResponseInfo e;
    public final CronetException f;

    /* JADX WARN: Multi-variable type inference failed */
    public to21(String str, Collection collection, d8o d8oVar, int i, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.a = str;
        this.b = collection;
        this.c = d8oVar;
        this.d = i;
        this.e = urlResponseInfo;
        this.f = cronetException;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final Collection getAnnotations() {
        Collection collection = this.b;
        return collection == null ? Collections.EMPTY_LIST : collection;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final CronetException getException() {
        return this.f;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final int getFinishedReason() {
        return this.d;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final UrlResponseInfo getResponseInfo() {
        return this.e;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final String getUrl() {
        return this.a;
    }
}
