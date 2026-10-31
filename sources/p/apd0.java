package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class apd0 implements hsw {
    public final Context a;
    public final rl1 b;
    public final haa0 c;
    public final me30 d;
    public final yd91 e = new yd91(3, new jgd0(this, (byte) 2));
    public final mr20 f;

    public apd0(Context context, rl1 rl1Var, haa0 haa0Var, y1x0 y1x0Var, me30 me30Var, koc0 koc0Var) {
        this.a = context;
        this.b = rl1Var;
        this.c = haa0Var;
        this.d = me30Var;
        this.f = rqt0.u(new b8d0(((roc0) koc0Var).d(), this, (byte) 8));
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.e;
    }

    @Override // p.hsw, p.xe91
    public final mr20 getShow() {
        return this.f;
    }
}
