package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ra2 implements kvn0 {
    public final mwn0 a;
    public final ycc1 b;
    public final c9n c;
    public final ma0 d;
    public final ma0 e;
    public final p9m f = hm5.P(xay.e(2, irn1.o0(100, 0, (dlv) null, 6)), xay.f(2, irn1.o0(100, 50, (dlv) null, 4)));

    public ra2(mwn0 mwn0Var, ycc1 ycc1Var, c9n c9nVar, ma0 ma0Var, ma0 ma0Var2) {
        this.a = mwn0Var;
        this.b = ycc1Var;
        this.c = c9nVar;
        this.d = ma0Var;
        this.e = ma0Var2;
    }

    public final void a(String str, tv80 tv80Var, Bundle bundle) {
        lsn0 lsn0Var = tv80Var != null ? new lsn0(str, tv80Var.a) : jsn0.a;
        mwn0 mwn0Var = this.a;
        mwn0Var.e(lsn0Var);
        mwn0Var.f(lsn0Var);
        fn31.T(this.c, (o8n) null, 0, new hb1(str, bundle, this, null, (byte) 7), 3);
    }

    public final void h(String str) {
        if (str.length() <= 0) {
            str = null;
        }
        yrn0 yrn0Var = str != null ? new yrn0(new ou80(str)) : new yrn0((ou80) null);
        mwn0 mwn0Var = this.a;
        mwn0Var.e(yrn0Var);
        mwn0Var.f(yrn0Var);
        fn31.T(this.c, (o8n) null, 0, new kk(this, null, (byte) 5), 3);
    }
}
