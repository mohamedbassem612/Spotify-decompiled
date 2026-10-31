package p;

import android.graphics.Bitmap;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kar implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ohd b;

    public /* synthetic */ kar(ohd ohdVar, byte b) {
        this.a = b;
        this.b = ohdVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        ohd ohdVar = this.b;
        switch (b) {
            case 0:
                w2u0 w2u0Var = (x2u0) obj;
                if (w2u0Var instanceof w2u0) {
                    ohdVar.resumeWith(w2u0Var.a);
                } else if (!(w2u0Var instanceof v2u0)) {
                    eg.o();
                } else {
                    ohdVar.resumeWith(new i1z("", (String) null, "", new cen(), new cen(), "", "", "", (String) null, false, false, false, false, false, false, 1, false, 0, (Integer) null, false, false, false, false, (Long) null, false, 0, (g281) null, rwp0.a, d1z.d, g1z.d, tu00.a));
                }
                break;
            case 1:
                ohdVar.resumeWith((wkj0) obj);
                break;
            case 2:
                ohdVar.resumeWith(wkj0.b);
                break;
            case 3:
                ohdVar.resumeWith((Bitmap) obj);
                break;
            default:
                ohdVar.resumeWith(new m231((Throwable) obj));
                break;
        }
    }
}
