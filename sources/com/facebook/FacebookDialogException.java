package com.facebook;

import kotlin.Metadata;
import p.l1d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/FacebookDialogException;", "Lcom/facebook/FacebookException;", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FacebookDialogException extends FacebookException {
    public final int b;
    public final String c;

    public FacebookDialogException(String str, int i, String str2) {
        super(str);
        this.b = i;
        this.c = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder sb = new StringBuilder("{FacebookDialogException: errorCode: ");
        sb.append(this.b);
        sb.append(", message: ");
        sb.append(getMessage());
        sb.append(", url: ");
        return l1d.n(this.c, "}", sb);
    }
}
