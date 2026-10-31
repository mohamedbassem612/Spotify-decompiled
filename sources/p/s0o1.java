package p;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s0o1 extends kz40 {
    public final adm1 l;

    public s0o1(Context context, jz40 jz40Var) {
        super(context, (Activity) null, thl1.a, shl1.a, jz40Var);
        this.l = new adm1();
    }

    public final hfp1 f(Uri uri) {
        adm1 adm1Var = this.l;
        adm1Var.getClass();
        if (uri == null) {
            hhg1.n("uri must not be null");
            return null;
        }
        j8n1 j8n1Var = ((kz40) this).i;
        cxn1 cxn1Var = new cxn1(adm1Var, j8n1Var, uri, 0, (byte) 0);
        j8n1Var.a.d(0, cxn1Var);
        return ezn1.u(cxn1Var, enm1.c);
    }
}
