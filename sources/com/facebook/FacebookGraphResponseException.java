package com.facebook;

import kotlin.Metadata;
import p.lf10;
import p.pd50;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/FacebookGraphResponseException;", "Lcom/facebook/FacebookException;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FacebookGraphResponseException extends FacebookException {
    public final pd50 b;

    public FacebookGraphResponseException(pd50 pd50Var, String str) {
        super(str);
        this.b = pd50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        lf10 lf10Var = this.b.c;
        StringBuilder sb = new StringBuilder("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (lf10Var != null) {
            sb.append("httpResponseCode: ");
            sb.append(lf10Var.a);
            sb.append(", facebookErrorCode: ");
            sb.append(lf10Var.b);
            sb.append(", facebookErrorType: ");
            sb.append(lf10Var.d);
            sb.append(", message: ");
            sb.append(lf10Var.a());
            sb.append("}");
        }
        return sb.toString();
    }
}
