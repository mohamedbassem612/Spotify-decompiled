package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class eb5 implements xa5 {
    public final mhg1 a;
    public tl3 b;
    public flb0 c;
    public final hrr0 d = xto.t(new yr80(0));
    public final nen0 e;
    public ygg1 f;

    public eb5(mhg1 mhg1Var, tl3 tl3Var, flb0 flb0Var) {
        this.a = mhg1Var;
        this.b = tl3Var;
        this.c = flb0Var;
        long[] jArr = hj41.a;
        this.e = new nen0();
    }

    public final p9m a(p9m p9mVar, c391 c391Var) {
        p9mVar.d = c391Var;
        return p9mVar;
    }

    public final Object b() {
        return this.a.f().b();
    }

    public final ln00 c(int i, ni20 ni20Var) {
        if (j(i)) {
            return xay.q(ni20Var, new db5(this, (byte) 4));
        }
        if (k(i)) {
            return xay.q(ni20Var, new db5(this, (byte) 5));
        }
        if (mqn1.n(i, 2)) {
            return xay.s(ni20Var, new db5(this, (byte) 6));
        }
        if (mqn1.n(i, 3)) {
            return xay.s(ni20Var, new db5(this, (byte) 7));
        }
        ln00 ln00Var = ln00.b;
        fza.d();
        return ln00.b;
    }

    public final Object e() {
        return this.a.f().e();
    }

    public final bby g(int i, ni20 ni20Var) {
        if (j(i)) {
            return xay.m(ni20Var, new db5(this, (byte) 0));
        }
        if (k(i)) {
            return xay.m(ni20Var, new db5(this, (byte) 1));
        }
        if (mqn1.n(i, 2)) {
            return xay.o(ni20Var, new db5(this, (byte) 2));
        }
        if (mqn1.n(i, 3)) {
            return xay.o(ni20Var, new db5(this, (byte) 3));
        }
        bby bbyVar = bby.b;
        d9y0.s();
        return bby.b;
    }

    public final long h(long j, long j2) {
        return this.b.a(j, j2, flb0.a);
    }

    public final long i() {
        ygg1 ygg1Var = this.f;
        return ygg1Var != null ? ((yr80) ygg1Var.getValue()).a : ((yr80) this.d.getValue()).a;
    }

    public final boolean j(int i) {
        if (mqn1.n(i, 0)) {
            return true;
        }
        if (mqn1.n(i, 4) && this.c == flb0.a) {
            return true;
        }
        return mqn1.n(i, 5) && this.c == flb0.b;
    }

    public final boolean k(int i) {
        return mqn1.n(i, 1) || (mqn1.n(i, 4) && this.c == flb0.b) || (mqn1.n(i, 5) && this.c == flb0.a);
    }
}
