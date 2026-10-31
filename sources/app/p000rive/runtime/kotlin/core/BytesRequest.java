package app.p000rive.runtime.kotlin.core;

import com.android.volley.ParseError;
import kotlin.Metadata;
import p.h8o0;
import p.iu30;
import p.ky21;
import p.luo1;
import p.mn21;
import p.ty21;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0014"}, d2 = {"Lapp/rive/runtime/kotlin/core/BytesRequest;", "Lp/mn21;", "", "", "url", "Lkotlin/Function1;", "Lp/rih1;", "onResponse", "Lp/ky21;", "errorListener", "<init>", "(Ljava/lang/String;Lp/iu30;Lp/ky21;)V", "response", "deliverResponse", "([B)V", "Lp/h8o0;", "Lp/ty21;", "parseNetworkResponse", "(Lp/h8o0;)Lp/ty21;", "Lp/iu30;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BytesRequest extends mn21 {
    public static final int $stable = 0;
    private final iu30 onResponse;

    public BytesRequest(String str, iu30 iu30Var, ky21 ky21Var) {
        super(str, ky21Var);
        this.onResponse = iu30Var;
    }

    @Override // p.mn21
    public ty21 parseNetworkResponse(h8o0 response) {
        byte[] bArr;
        if (response != null) {
            try {
                bArr = response.a;
            } catch (Exception e) {
                return new ty21(new ParseError(e));
            }
        } else {
            bArr = null;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        return new ty21(bArr, luo1.v(response));
    }

    @Override // p.mn21
    public void deliverResponse(byte[] response) {
        this.onResponse.invoke(response);
    }
}
