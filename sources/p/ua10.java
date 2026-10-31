package p;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ua10 implements g50 {
    public final /* synthetic */ byte a;
    public final dg30 b;
    public final ldj0 c;
    public final kqi0 d;

    public /* synthetic */ ua10(dg30 dg30Var, ldj0 ldj0Var, kqi0 kqi0Var, byte b) {
        this.a = b;
        this.b = dg30Var;
        this.c = ldj0Var;
        this.d = kqi0Var;
    }

    @Override // p.g50
    public final void a(String str, String str2, Bundle bundle, w1q0 w1q0Var) {
        byte b = this.a;
        dg30 dg30Var = this.b;
        switch (b) {
            case 0:
                w1q0Var.invoke(Boolean.FALSE);
                tv80 serializable = bundle.getSerializable("UBI_INTERACTION_LOGGING_RESULT");
                fn31.T(cto1.q(dg30Var), (o8n) null, 0, new rzu(Uri.parse(str2), this, serializable instanceof tv80 ? serializable : null, str2, (lnm) null, (byte) 11), 3);
                break;
            default:
                w1q0Var.invoke(Boolean.TRUE);
                tv80 serializable2 = bundle.getSerializable("UBI_INTERACTION_LOGGING_RESULT");
                fn31.T(cto1.q(dg30Var), (o8n) null, 0, new l3g1(Uri.parse(str2), this, serializable2 instanceof tv80 ? serializable2 : null, str2, (lnm) null, (byte) 8), 3);
                break;
        }
    }
}
