package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t7y0 implements r2g {
    public static final Set h = f46.S0(new h4d0[]{h4d0.h, h4d0.f, h4d0.e, h4d0.d, h4d0.c});
    public final String a;
    public final uyp b;
    public final mr20 d;
    public final yd91 c = new yd91(3, new h2y0(this, (byte) 9));
    public final o3r e = w3p1.o(new l4r(pwc0.b, 1, e6y0.Y, new j4r(new hox0(this, 15)), e6y0.Z), e6y0.t);
    public final b82 f = new b82(this);
    public final boolean g = true;

    public t7y0(String str, uyp uypVar, koc0 koc0Var) {
        this.a = str;
        this.b = uypVar;
        this.d = rqt0.u(new j5b0(((roc0) koc0Var).d(), (byte) 26));
    }

    @Override // p.xe91
    public final l381 c() {
        return this.f;
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.c;
    }

    @Override // p.xe91
    public final mr20 getShow() {
        return this.d;
    }

    @Override // p.r2g
    public final Integer i() {
        return Integer.valueOf(this.g ? 1 : 0);
    }
}
