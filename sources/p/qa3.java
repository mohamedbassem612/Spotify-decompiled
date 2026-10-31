package p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qa3 implements s160 {
    public final yzc0 a;
    public final String b;
    public final jyo c;
    public final c8c0 d;
    public final t740 e;
    public final smc0 f;
    public final AtomicReference g;
    public final yd91 h;
    public final o3r i;
    public final ycc1 t;

    public qa3(yzc0 yzc0Var, String str, jyo jyoVar, c8c0 c8c0Var, t740 t740Var) {
        this.a = yzc0Var;
        this.b = str;
        this.c = jyoVar;
        this.d = c8c0Var;
        this.e = t740Var;
        smc0 smc0VarN = k4p1.n();
        smc0VarN.add(dlc0.d);
        this.f = k4p1.k(smc0VarN);
        this.g = new AtomicReference(null);
        this.h = new yd91(3, new g82(this, (byte) 10));
        this.i = w3p1.n(new l4r(pwc0.b, 1, q83.b1, new j4r(new ma3(this, (byte) 0)), q83.c1), new l4r(jd0.x, 2, q83.Z0, new j4r(q83.Y0), q83.a1), p83.S0);
        this.t = new ycc1(this);
    }

    public final l381 c() {
        return this.t;
    }

    public final yd91 d() {
        return this.h;
    }
}
