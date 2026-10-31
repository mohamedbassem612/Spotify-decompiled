package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zg3 implements hsw {
    public final /* synthetic */ byte a;
    public final yd91 b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final mr20 f;

    public zg3(Context context, koc0 koc0Var, o241 o241Var, c8c0 c8c0Var, hzo hzoVar) {
        this.a = (byte) 0;
        this.c = context;
        this.d = c8c0Var;
        this.e = hzoVar;
        this.f = new gk(new x010(((roc0) koc0Var).d(), yoi1.g(((p241) o241Var).a), xg3.h, (byte) 1), this, (byte) 25);
        this.b = new yd91(3, new g82(this, (byte) 15));
    }

    @Override // p.xe91
    public final yd91 d() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    @Override // p.hsw, p.xe91
    public final mr20 getShow() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.f;
    }

    public zg3(String str, koc0 koc0Var, jtp jtpVar, lzn0 lzn0Var) {
        this.a = (byte) 1;
        this.c = str;
        this.d = jtpVar;
        this.e = lzn0Var;
        this.f = rqt0.u(new j5b0(((roc0) koc0Var).d(), (byte) 7));
        this.b = new yd91(3, new zem0(this, (byte) 11));
    }
}
