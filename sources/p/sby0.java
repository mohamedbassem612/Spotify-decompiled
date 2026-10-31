package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sby0 implements r2g {
    public static final Set h = f46.S0(new h4d0[]{h4d0.h, h4d0.f, h4d0.e, h4d0.d, h4d0.c});
    public final String a;
    public final i5y0 b;
    public final uyp c;
    public final yd91 d = new yd91(3, new h2y0(this, (byte) 14));
    public final mr20 e;
    public final ke71 f;
    public final boolean g;

    public sby0(String str, i5y0 i5y0Var, uyp uypVar, koc0 koc0Var) {
        this.a = str;
        this.b = i5y0Var;
        this.c = uypVar;
        this.e = rqt0.u(new x010(new ht20(i5y0Var.b.i() ? new h5y0(i5y0Var.b().a(), (byte) 0) : new huz(Boolean.valueOf(i5y0Var.c.a()), (byte) 10), new b5y0(i5y0Var, (lnm) null, (byte) 1)), new j5b0(((roc0) koc0Var).d(), (byte) 28), new irp0(3, null, (byte) 12), (byte) 1));
        h0x0 h0x0Var = h0x0.Q0;
        ke71 ke71Var = o381.a;
        this.f = new ke71(h0x0Var);
        this.g = true;
    }

    @Override // p.xe91
    public final l381 c() {
        return this.f;
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.d;
    }

    @Override // p.xe91
    public final mr20 getShow() {
        return this.e;
    }

    @Override // p.r2g
    public final Integer i() {
        return Integer.valueOf(this.g ? 1 : 0);
    }
}
