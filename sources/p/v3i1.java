package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v3i1 extends UrlResponseInfo {
    public final List a;
    public final int b;
    public final String c;
    public final String d;
    public final String e = "";
    public final AtomicLong f = new AtomicLong(0);
    public final u3i1 g;

    public v3i1(ArrayList arrayList, int i, String str, List list, String str2) {
        this.a = Collections.unmodifiableList(arrayList);
        this.b = i;
        this.c = str;
        this.g = new u3i1(Collections.unmodifiableList(list));
        this.d = str2;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final Map getAllHeaders() {
        return this.g.getAsMap();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List getAllHeadersAsList() {
        return this.g.a;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final int getHttpStatusCode() {
        return this.b;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getHttpStatusText() {
        return this.c;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getNegotiatedProtocol() {
        return this.d;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getProxyServer() {
        return this.e;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final long getReceivedByteCount() {
        return this.f.get();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getUrl() {
        List list = this.a;
        return (String) list.get(list.size() - 1);
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List getUrlChain() {
        return this.a;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String url = getUrl();
        String string = this.a.toString();
        String string2 = this.g.a.toString();
        long j = this.f.get();
        StringBuilder sbN = gvg.n("UrlResponseInfo@[", hexString, "][", url, "]: urlChain = ");
        sbN.append(string);
        sbN.append(", httpStatus = ");
        sbN.append(this.b);
        sbN.append(" ");
        bb00.j(sbN, this.c, ", headers = ", string2, ", wasCached = false, negotiatedProtocol = ");
        bb00.j(sbN, this.d, ", proxyServer= ", this.e, ", receivedByteCount = ");
        sbN.append(j);
        return sbN.toString();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final boolean wasCached() {
        return false;
    }
}
