package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hd00 implements dwo, o5s {
    public final bzm0 a;
    public final r0z0 b;
    public final y2g0 c;
    public final boolean d;
    public final tac0 e;

    public hd00(thg0 thg0Var, bzm0 bzm0Var, mc00 mc00Var, r0z0 r0z0Var, y2g0 y2g0Var) {
        this.a = bzm0Var;
        this.b = r0z0Var;
        this.c = y2g0Var;
        krw0 krw0Var = krw0.i;
        this.e = u7n0.w().f;
        ((ezm0) bzm0Var).b(thg0Var.b, azm0.a);
        lc00 lc00Var = (lc00) mc00Var.a;
        boolean z = lc00Var.c().d;
        this.d = z;
        if (z) {
            y2g0Var.a(new gd00(this, (byte) 0));
        }
        if (!lc00Var.c().c || z) {
            r0z0Var.cancel();
        } else {
            r0z0Var.a();
        }
    }

    @Override // p.o5s
    public final void onStart(iac0 iac0Var) {
        if (this.d) {
            this.b.cancel();
        }
    }

    @Override // p.o5s
    public final void onStop(iac0 iac0Var) {
        if (this.d) {
            this.b.a();
        }
    }

    public final void shutdown() {
        if (this.d) {
            this.c.a(new gd00(this, (byte) 1));
        }
        ((ezm0) this.a).c(azm0.a);
    }
}
