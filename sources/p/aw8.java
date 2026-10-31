package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aw8 implements fv50 {
    public final String a;
    public final rwj b;
    public final bw8 c;
    public final jbk0 d;
    public final yd91 e = new yd91(3, new vv8((Object) this, (byte) 0));
    public final x010 f;
    public final o3r g;
    public final km3 h;

    public aw8(String str, rwj rwjVar, d520 d520Var, bw8 bw8Var, koc0 koc0Var, jbk0 jbk0Var) {
        this.a = str;
        this.b = rwjVar;
        this.c = bw8Var;
        this.d = jbk0Var;
        this.f = new x010(new yv8(d520Var.V(str), (byte) 0), rqt0.u(new x72(((roc0) koc0Var).d(), (byte) 8)), new cq2(this, (lnm) null, (byte) 1), (byte) 1);
        l4r l4rVar = new l4r(pwc0.b, 1, zv8.c, new j4r(new uv8(this, (byte) 0)), zv8.d);
        hvm hvmVar = hvm.d;
        this.g = w3p1.m(l4rVar, new l4r(hvmVar, 2, oc8.c1, new j4r(oc8.Z0), oc8.d1), new l4r(hvmVar, 2, oc8.e1, new j4r(oc8.a1), zv8.b), o40.b1);
        this.h = new km3(this);
    }

    public final l381 c() {
        return this.h;
    }

    public final yd91 d() {
        return this.e;
    }

    public final mr20 getShow() {
        return this.f;
    }

    public final int w() {
        return 2;
    }
}
