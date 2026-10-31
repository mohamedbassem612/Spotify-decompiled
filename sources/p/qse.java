package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qse implements kvn0 {
    public final mwn0 a;
    public final c9n b;
    public final bp9 c;
    public final p9m d = hm5.P(xay.e(2, irn1.o0(100, 0, (dlv) null, 6)), xay.f(2, irn1.o0(100, 50, (dlv) null, 4)));

    public qse(mwn0 mwn0Var, c9n c9nVar, bp9 bp9Var) {
        this.a = mwn0Var;
        this.b = c9nVar;
        this.c = bp9Var;
    }

    public final void a(String str, tv80 tv80Var, Bundle bundle) {
        lsn0 lsn0Var = tv80Var != null ? new lsn0(str, tv80Var.a) : jsn0.a;
        mwn0 mwn0Var = this.a;
        mwn0Var.e(lsn0Var);
        mwn0Var.f(lsn0Var);
        fn31.T(this.b, (o8n) null, 0, new pid(this, str, (lnm) null, (byte) 4), 3);
    }

    public final void h(String str) {
        if (str.length() <= 0) {
            str = null;
        }
        yrn0 yrn0Var = str != null ? new yrn0(new ou80(str)) : new yrn0((ou80) null);
        mwn0 mwn0Var = this.a;
        mwn0Var.e(yrn0Var);
        mwn0Var.f(yrn0Var);
        fn31.T(this.b, (o8n) null, 0, new hzb(this, (lnm) null, (byte) 4), 3);
    }
}
