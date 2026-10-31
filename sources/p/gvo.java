package p;

import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gvo implements kvn0 {
    public final mwn0 a;
    public final ham b;
    public final lzn0 c;
    public final c9n d;
    public final hnf e;
    public final p9m f = hm5.P(xay.e(2, irn1.o0(100, 0, (dlv) null, 6)), xay.f(2, irn1.o0(100, 50, (dlv) null, 4)));

    public gvo(mwn0 mwn0Var, ham hamVar, lzn0 lzn0Var, c9n c9nVar, hnf hnfVar) {
        this.a = mwn0Var;
        this.b = hamVar;
        this.c = lzn0Var;
        this.d = c9nVar;
        this.e = hnfVar;
    }

    public final void a(String str, tv80 tv80Var, Bundle bundle) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        Set set2 = (Set) this.b.b;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                if (((acr0) it.next()).a().contains(s4b1VarX.c)) {
                    lsn0 lsn0Var = tv80Var != null ? new lsn0(str, tv80Var.a) : jsn0.a;
                    mwn0 mwn0Var = this.a;
                    mwn0Var.e(lsn0Var);
                    mwn0Var.f(lsn0Var);
                    fn31.T(this.d, (o8n) null, 0, new gke(this, str, bundle, null, (byte) 20), 3);
                    return;
                }
            }
        }
        lzn0 lzn0Var = this.c;
        if (tv80Var != null) {
            lzn0Var.a(str, tv80Var, bundle);
        } else if (bundle != null) {
            lzn0Var.g(bundle, str);
        } else {
            lzn0Var.h(str);
        }
    }

    public final void h(String str) {
        if (str.length() <= 0) {
            str = null;
        }
        yrn0 yrn0Var = str != null ? new yrn0(new ou80(str)) : new yrn0((ou80) null);
        mwn0 mwn0Var = this.a;
        mwn0Var.e(yrn0Var);
        mwn0Var.f(yrn0Var);
        fn31.T(this.d, (o8n) null, 0, new hzb(this, (lnm) null, (byte) 28), 3);
    }
}
