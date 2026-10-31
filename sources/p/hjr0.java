package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hjr0 implements p5c {
    public final jkr0 b;
    public final p5c c;
    public final flb0 d;

    public hjr0(jkr0 jkr0Var, p5c p5cVar, flb0 flb0Var) {
        this.b = jkr0Var;
        this.c = p5cVar;
        this.d = flb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0012  */
    @Override // p.p5c
    public final float a(float f, float f2, float f3) {
        int iN;
        int iN2;
        int iN3;
        float fA = this.c.a(f, f2, f3);
        boolean z = false;
        if (f <= 0.0f) {
            float f4 = f + f2;
            n511 n511Var = ckk1.a;
            if (f4 <= 1.0f) {
                z = true;
            }
        } else if (f + f2 > f3) {
            z = true;
        }
        float fAbs = Math.abs(fA);
        flb0 flb0Var = flb0.b;
        qqq0 qqq0Var = qqq0.b;
        flb0 flb0Var2 = this.d;
        jkr0 jkr0Var = this.b;
        if (fAbs != 0.0f && z) {
            if (flb0Var2 == flb0Var && jkr0Var.k().e == qqq0Var) {
                iN3 = jkr0Var.n() + (-jkr0Var.f);
            } else {
                iN3 = jkr0Var.f;
            }
            float fN = iN3 * (-1.0f);
            while (fA > 0.0f && fN < fA) {
                fN += jkr0Var.n();
            }
            while (fA < 0.0f && fN > fA) {
                fN -= jkr0Var.n();
            }
            return fN;
        }
        int i = jkr0Var.f;
        hrr0 hrr0Var = jkr0Var.F;
        if (Math.abs(i) < 1.0E-6d) {
            return 0.0f;
        }
        if (flb0Var2 == flb0Var && jkr0Var.k().e == qqq0Var) {
            iN = jkr0Var.n() + (-jkr0Var.f);
        } else {
            iN = jkr0Var.f;
        }
        float f5 = iN * (-1.0f);
        if (flb0Var2 == flb0Var && jkr0Var.k().e == qqq0Var) {
            if (!((Boolean) hrr0Var.getValue()).booleanValue()) {
                iN2 = jkr0Var.n();
                f5 += iN2;
            }
        } else if (((Boolean) hrr0Var.getValue()).booleanValue()) {
            iN2 = jkr0Var.n();
            f5 += iN2;
        }
        return yoi1.o(f5, -f3, f3);
    }
}
