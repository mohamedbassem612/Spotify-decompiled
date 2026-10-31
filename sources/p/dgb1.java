package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dgb1 implements tyq {
    public final psw N0;
    public final ia00 O0;
    public final o3r X = w3p1.m(new l4r(pwc0.r, 2, seb1.d1, new j4r(seb1.a1), seb1.e1), new l4r(jd0.u, 2, cgb1.b, new j4r(seb1.b1), cgb1.c), new l4r(jd0.f, 2, cgb1.d, new j4r(seb1.c1), cgb1.e), xi81.t);
    public final o3r Y = ujo1.t();
    public final js20 Z;
    public final String a;
    public final mta b;
    public final ux3 c;
    public final boolean d;
    public final lc20 e;
    public final a5m f;
    public final d0r g;
    public final vr51 h;
    public final boolean i;
    public final ip7 t;

    public dgb1(yk90 yk90Var, String str, mta mtaVar, ux3 ux3Var, xx4 xx4Var, boolean z, lc20 lc20Var, a5m a5mVar, d0r d0rVar, vr51 vr51Var) {
        this.a = str;
        this.b = mtaVar;
        this.c = ux3Var;
        this.d = z;
        this.e = lc20Var;
        this.f = a5mVar;
        this.g = d0rVar;
        this.h = vr51Var;
        this.i = xx4Var.b();
        this.t = new ip7(yk90Var, this);
        fns fnsVar = igu.a;
        this.Z = a4p1.h(new agb1(this, (byte) 0), new agb1(this, (byte) 1), new wh91(this, (byte) 22), pyf0.a.f, new agb1(this, (byte) 2));
        j2i j2iVar = new j2i(-1866746195, new t20(this, yk90Var, (byte) 27), true);
        ien0 ien0Var = qsw.a;
        this.N0 = new psw(j2iVar, (byte) 0);
        this.O0 = n3o1.q(this).a(vva1.P0, vva1.Q0);
    }

    public static f1r f(xk90 xk90Var, hwq hwqVar) {
        wk90 wk90VarC;
        if (xk90Var == null || (wk90VarC = xk90Var.c(hwqVar, true)) == null) {
            return null;
        }
        return wk90VarC.a.a(hwqVar);
    }

    public final rqw a() {
        return this.O0;
    }

    public final jsw c() {
        return this.N0;
    }

    public final d0r e() {
        return this.g;
    }

    public final mqw getBehavior() {
        return this.Z;
    }

    public final f4r getData() {
        return this.t;
    }
}
