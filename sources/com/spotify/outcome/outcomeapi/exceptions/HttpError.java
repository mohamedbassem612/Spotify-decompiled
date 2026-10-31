package com.spotify.outcome.outcomeapi.exceptions;

import kotlin.Metadata;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/spotify/outcome/outcomeapi/exceptions/HttpError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "src_main_java_com_spotify_outcome_outcomeapi-outcomeapi"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class HttpError extends Exception {
    public final int a;
    public final String b;

    public HttpError(int i, String str) {
        super(str);
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpError)) {
            return false;
        }
        HttpError httpError = (HttpError) obj;
        return this.a == httpError.a && u890.j(this.b, httpError.b);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
