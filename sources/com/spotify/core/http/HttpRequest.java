package com.spotify.core.http;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.util.Arrays;
import kotlin.Metadata;
import p.cy30;
import p.gvg;
import p.ktd;
import p.rjx;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\n\u0010\u0015\u001a\u00020\u0003H\u0096\u0080\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/spotify/core/http/HttpRequest;", "", "url", "", "method", "headers", "", "body", "<init>", "(Ljava/lang/String;Ljava/lang/String;[B[B)V", "getUrl", "()Ljava/lang/String;", "getMethod", "getHeaders", "()[B", "getBody", "equals", "", "other", "hashCode", "", "toString", "src_main_java_com_spotify_connectivity_http-connectivity-http"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class HttpRequest {
    private final byte[] body;
    private final byte[] headers;
    private final String method;
    private final String url;

    public HttpRequest(String str, String str2, byte[] bArr, byte[] bArr2) {
        this.url = str;
        this.method = str2;
        this.headers = bArr;
        this.body = bArr2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!HttpRequest.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) other;
        return u890.j(this.url, httpRequest.url) && u890.j(this.method, httpRequest.method) && Arrays.equals(this.headers, httpRequest.headers) && Arrays.equals(this.body, httpRequest.body);
    }

    public final byte[] getBody() {
        return this.body;
    }

    public final byte[] getHeaders() {
        return this.headers;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Arrays.hashCode(this.body) + ktd.f(cy30.d(this.url.hashCode() * 31, 31, this.method), this.headers, 31);
    }

    public String toString() {
        String str = this.url;
        String str2 = this.method;
        return rjx.o(gvg.n("HttpRequest{url='", str, "', method='", str2, "', mHeaders="), Arrays.toString(this.headers), ", mBody=", Arrays.toString(this.body), "}");
    }
}
