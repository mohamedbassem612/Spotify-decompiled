package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class u291 {
    public static final d620 a = rwq0.G(1.0f);
    public static final d620 b = rwq0.y(1.0f);
    public static final d620 c = rwq0.B(1.0f);
    public static final i6m1 d = bpo1.E(een.Q0, false);
    public static final i6m1 e = bpo1.E(een.P0, false);
    public static final i6m1 f = bpo1.x(een.N0, false);
    public static final i6m1 g = bpo1.x(een.Z, false);
    public static final i6m1 h = bpo1.D(een.h, false);
    public static final i6m1 i = bpo1.D(een.d, false);

    public static final qim0 A(qim0 qim0Var, tl3 tl3Var, boolean z) {
        i6m1 i6m1VarD;
        if (!u890.j(tl3Var, een.h) || z) {
            i6m1VarD = (!u890.j(tl3Var, een.d) || z) ? bpo1.D(tl3Var, z) : i;
        } else {
            i6m1VarD = h;
        }
        return qim0Var.then(i6m1VarD);
    }

    public static qim0 B(qim0 qim0Var, gra graVar, int i2) {
        if ((i2 & 1) != 0) {
            graVar = een.h;
        }
        return A(qim0Var, graVar, (i2 & 2) == 0);
    }

    public static final qim0 C(qim0 qim0Var, nl3 nl3Var, boolean z) {
        i6m1 i6m1VarE;
        if (!u890.j(nl3Var, een.Q0) || z) {
            i6m1VarE = (!u890.j(nl3Var, een.P0) || z) ? bpo1.E(nl3Var, z) : e;
        } else {
            i6m1VarE = d;
        }
        return qim0Var.then(i6m1VarE);
    }

    public static qim0 D(qim0 qim0Var, era eraVar, int i2) {
        if ((i2 & 1) != 0) {
            eraVar = een.Q0;
        }
        return C(qim0Var, eraVar, (i2 & 2) == 0);
    }

    public static final qim0 a(qim0 qim0Var, float f2, float f3) {
        return qim0Var.then(new slh1(f2, f3));
    }

    public static /* synthetic */ qim0 b(float f2, float f3, int i2, qim0 qim0Var) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return a(qim0Var, f2, f3);
    }

    public static final qim0 c(qim0 qim0Var, float f2) {
        return qim0Var.then(f2 == 1.0f ? b : rwq0.y(f2));
    }

    public static final qim0 d(qim0 qim0Var, float f2) {
        return qim0Var.then(f2 == 1.0f ? c : rwq0.B(f2));
    }

    public static final qim0 f(qim0 qim0Var, float f2) {
        return qim0Var.then(f2 == 1.0f ? a : rwq0.G(f2));
    }

    public static final qim0 h(qim0 qim0Var, float f2) {
        return qim0Var.then(new s291(0.0f, f2, 0.0f, f2, true, 5));
    }

    public static final qim0 i(qim0 qim0Var, float f2, float f3) {
        return qim0Var.then(new s291(0.0f, f2, 0.0f, f3, true, 5));
    }

    public static /* synthetic */ qim0 j(float f2, float f3, int i2, qim0 qim0Var) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return i(qim0Var, f2, f3);
    }

    public static final qim0 k(qim0 qim0Var, float f2) {
        return qim0Var.then(new s291(0.0f, f2, 0.0f, f2, false, 5));
    }

    public static qim0 l(qim0 qim0Var, float f2) {
        return qim0Var.then(new s291(0.0f, f2, 0.0f, Float.NaN, false, 5));
    }

    public static final qim0 m(qim0 qim0Var, float f2) {
        return qim0Var.then(new s291(f2, f2, f2, f2, false));
    }

    public static final qim0 n(qim0 qim0Var, float f2, float f3) {
        return qim0Var.then(new s291(f2, f3, f2, f3, false));
    }

    public static qim0 o(qim0 qim0Var, float f2, float f3, float f4, float f5, int i2) {
        return qim0Var.then(new s291(f2, (i2 & 2) != 0 ? Float.NaN : f3, (i2 & 4) != 0 ? Float.NaN : f4, (i2 & 8) != 0 ? Float.NaN : f5, false));
    }

    public static final qim0 p(qim0 qim0Var, float f2) {
        return qim0Var.then(new s291(f2, 0.0f, f2, 0.0f, false, 10));
    }

    public static qim0 q(float f2, int i2, qim0 qim0Var) {
        return qim0Var.then(new s291((i2 & 1) != 0 ? Float.NaN : f2, 0.0f, (i2 & 2) == 0 ? 96.0f : Float.NaN, 0.0f, false, 10));
    }

    public static final qim0 r(qim0 qim0Var, float f2) {
        return qim0Var.then(new s291(f2, f2, f2, f2, true));
    }

    public static final qim0 s(qim0 qim0Var, float f2, float f3) {
        return qim0Var.then(new s291(f2, f3, f2, f3, true));
    }

    public static final qim0 t(qim0 qim0Var, float f2, float f3, float f4, float f5) {
        return qim0Var.then(new s291(f2, f3, f4, f5, true));
    }

    public static /* synthetic */ qim0 u(qim0 qim0Var, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            f4 = Float.NaN;
        }
        if ((i2 & 8) != 0) {
            f5 = Float.NaN;
        }
        return t(qim0Var, f2, f3, f4, f5);
    }

    public static final qim0 v(qim0 qim0Var, float f2) {
        return qim0Var.then(new s291(f2, 0.0f, f2, 0.0f, true, 10));
    }

    public static final qim0 w(qim0 qim0Var, float f2, float f3) {
        return qim0Var.then(new s291(f2, 0.0f, f3, 0.0f, true, 10));
    }

    public static /* synthetic */ qim0 x(float f2, float f3, int i2, qim0 qim0Var) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return w(qim0Var, f2, f3);
    }

    public static final qim0 y(qim0 qim0Var, pl3 pl3Var, boolean z) {
        i6m1 i6m1VarX;
        if (!u890.j(pl3Var, een.N0) || z) {
            i6m1VarX = (!u890.j(pl3Var, een.Z) || z) ? bpo1.x(pl3Var, z) : g;
        } else {
            i6m1VarX = f;
        }
        return qim0Var.then(i6m1VarX);
    }

    public static qim0 z(qim0 qim0Var, fra fraVar, int i2) {
        if ((i2 & 1) != 0) {
            fraVar = een.N0;
        }
        return y(qim0Var, fraVar, (i2 & 2) == 0);
    }
}
