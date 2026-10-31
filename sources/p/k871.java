package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k871 implements fv50 {
    public final String a;
    public final kls0 b;
    public final hod0 c;
    public final zp4 d;
    public final mr20 e;
    public final o3r f = w3p1.o(new l4r(pwc0.b, 1, s571.N0, new j4r(new q961(this, (byte) 20)), s571.O0), s571.Y);
    public final nt21 g = new nt21(this);
    public final yd91 h = new yd91(3, new qv61(this, (byte) 5));

    public k871(koc0 koc0Var, hd71 hd71Var, String str, kls0 kls0Var, hod0 hod0Var, zp4 zp4Var) {
        this.a = str;
        this.b = kls0Var;
        this.c = hod0Var;
        this.d = zp4Var;
        this.e = rqt0.u(new zo51(((roc0) koc0Var).d(), this, (byte) 12));
    }

    public final boolean a(Map map, x7i1 x7i1Var, wls0 wls0Var) {
        return !(this.d.a() && this.c.c(map)) && hd71.a(x7i1Var, wls0Var, wls0.d);
    }

    @Override // p.xe91
    public final l381 c() {
        return this.g;
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.h;
    }

    @Override // p.xe91
    public final mr20 getShow() {
        return this.e;
    }
}
