package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f210 {
    public final rzq a;
    public final o3r b;

    public f210(rzq rzqVar) {
        this.a = rzqVar;
        jd11 jd11Var = rc11.a;
        this.b = q3p1.n(p7h.M(new o3r[]{w3p1.j(new l4r(new xv00(jd11Var.b(va81.class)), 3, d210.b1, new j4r(zy00.Z0), d210.d1), new l4r(new xv00(jd11Var.b(iam.class)), 3, d210.e1, new j4r(zy00.a1), e210.b), new l4r(new xv00(jd11Var.b(zoy0.class)), 3, e210.c, new j4r(zy00.b1), e210.d), new l4r(new xv00(jd11Var.b(w281.class)), 3, e210.e, new j4r(zy00.c1), e210.f), new l4r(new xv00(jd11Var.b(att0.class)), 3, e210.g, new j4r(zy00.d1), d210.R0), new l4r(new xv00(jd11Var.b(ma8.class)), 3, d210.S0, new j4r(zy00.e1), d210.T0), mcm.f), w3p1.l(new l4r(new wlu(jd11Var.b(jo70.class)), 3, d210.U0, new j4r(zy00.Z), d210.V0), new l4r(new xv00(jd11Var.b(r9v0.class)), 3, d210.W0, new j4r(zy00.N0), d210.X0), new l4r(new wlu(jd11Var.b(hll.class)), 3, d210.Y0, new j4r(zy00.O0), d210.Z0), new l4r(new xv00(jd11Var.b(xlw0.class)), 3, d210.a1, new j4r(zy00.P0), d210.c1), jq00.Y), w3p1.h(new l4r(new xv00(jd11Var.b(v6v0.class)), 2, d210.i, new j4r(zy00.Q0), d210.t), new l4r(new xv00(jd11Var.b(cd8.class)), 2, d210.X, new j4r(zy00.R0), d210.Y), new l4r(new xv00(jd11Var.b(s78.class)), 2, d210.Z, new j4r(zy00.S0), d210.N0), new l4r(new xv00(jd11Var.b(zc8.class)), 2, d210.O0, new j4r(zy00.T0), d210.P0), new l4r(new wlu(jd11Var.b(xkk1.class)), 2, d210.Q0, new j4r(zy00.U0), d210.b), new l4r(new xv00(jd11Var.b(f7l1.class)), 2, d210.c, new j4r(zy00.V0), d210.d), new l4r(new xv00(jd11Var.b(tlr0.class)), 2, d210.e, new j4r(zy00.W0), d210.f), new l4r(new xv00(jd11Var.b(v740.class)), 2, d210.g, new j4r(zy00.X0), d210.h), m1.c)}), new jrf(new ac8((Object) this, (byte) 10), (byte) 1));
    }

    public static x110 b(w481 w481Var, iam iamVar, a210 a210Var, u110 u110Var, v110 v110Var) {
        jo70 jo70Var = (jo70) u890.G(u110Var.a);
        zc8 zc8Var = v110Var.a;
        return new x110(new x481(iamVar, w481Var, jo70Var, (ma8) u890.G(a210Var.f), (att0) u890.G(a210Var.e), (hll) u890.G(u110Var.c), zc8Var, (w281) u890.G(a210Var.d), (r9v0) u890.G(u110Var.b), v110Var.b, (xlw0) u890.G(u110Var.d)));
    }

    public static z110 c(iam iamVar, a210 a210Var, u110 u110Var, v110 v110Var) {
        w481 t481Var;
        jo70 jo70Var = (jo70) u890.G(u110Var.a);
        va81 va81Var = (va81) u890.G(a210Var.a);
        zoy0 zoy0Var = (zoy0) u890.G(a210Var.c);
        if (jo70Var != null) {
            t481Var = new u481(jo70Var, va81Var, zoy0Var);
        } else {
            if (va81Var == null) {
                return new w110(zy00.Y0);
            }
            t481Var = new t481(zoy0Var, va81Var);
        }
        return b(t481Var, iamVar, a210Var, u110Var, v110Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        b210 b210Var;
        if (onmVar instanceof b210) {
            b210Var = (b210) onmVar;
            int i = b210Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                b210Var.d = i - Integer.MIN_VALUE;
            } else {
                b210Var = new b210(this, onmVar);
            }
        } else {
            b210Var = new b210(this, onmVar);
        }
        Object objI = b210Var.b;
        int i2 = b210Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objI);
                rzq rzqVar = this.a;
                o3r o3rVar = this.b;
                z110 z110Var = (z110) u890.G(x2p1.n(rzqVar, o3rVar, str));
                if (z110Var instanceof x110) {
                    return ((x110) z110Var).a;
                }
                this = x2p1.f(rzqVar, o3rVar, str);
                ld2 ld2Var = new ld2(this.a().a, str, (byte) 13);
                b210Var.a = this;
                b210Var.d = 1;
                objI = b5p1.i(ld2Var, b210Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = b210Var.a;
                hm5.M(objI);
            }
            Object obj = ((e331) objI).a;
            this.dispose();
            return obj;
        } catch (Throwable th) {
            this.dispose();
            throw th;
        }
    }
}
