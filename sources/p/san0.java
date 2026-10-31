package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class san0 implements cvl1, tyq {
    public final ynb0 a;
    public final ynb0 b;
    public final ytp0 c;
    public final d0r d;
    public final o3r e;
    public final js20 f;
    public final hy00 g;
    public final psw h;

    public san0(ynb0 ynb0Var, ynb0 ynb0Var2, ytp0 ytp0Var, d0r d0rVar) {
        this.a = ynb0Var;
        this.b = ynb0Var2;
        this.c = ytp0Var;
        this.d = d0rVar;
        jd11 jd11Var = rc11.a;
        this.e = w3p1.m(new l4r(new xv00(jd11Var.b(jo70.class)), 1, l9n0.R0, new j4r(l9n0.O0), l9n0.S0), new l4r(new xv00(jd11Var.b(xkk1.class)), 1, l9n0.T0, new j4r(l9n0.P0), l9n0.U0), new l4r(new xv00(jd11Var.b(hll.class)), 1, l9n0.V0, new j4r(l9n0.Q0), l9n0.W0), gce0.c1);
        this.f = x3p1.n(new ran0(this, (byte) 0), l9n0.N0, b5n0.O0, (o8n) null, new ran0(this, (byte) 1), 8);
        this.g = n3o1.r(this).c(fmk0.U0, fmk0.V0);
        j2i j2iVar = z2j.a;
        ien0 ien0Var = qsw.a;
        this.h = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.g;
    }

    public final jsw c() {
        return this.h;
    }

    public final d0r e() {
        return this.d;
    }

    public final void f(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1379145136);
        int i2 = i & 1;
        if (x340Var.Y(i2, i2 != 0)) {
            z1a1.d(x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b7e(this, i);
        }
    }

    public final mqw getBehavior() {
        return this.f;
    }

    public final f4r getData() {
        return this.e;
    }
}
