package com.facebook;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import p.lf10;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/FacebookServiceException;", "Lcom/facebook/FacebookException;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class FacebookServiceException extends FacebookException {
    public final lf10 b;

    public FacebookServiceException(lf10 lf10Var, String str) {
        super(str);
        this.b = lf10Var;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("{FacebookServiceException: httpResponseCode: ");
        lf10 lf10Var = this.b;
        sb.append(lf10Var.a);
        sb.append(", facebookErrorCode: ");
        sb.append(lf10Var.b);
        sb.append(", facebookErrorType: ");
        sb.append(lf10Var.d);
        sb.append(", message: ");
        sb.append(lf10Var.a());
        sb.append("}");
        return sb.toString();
    }
}
