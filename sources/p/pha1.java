package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pha1 implements r2g {
    public final String a;
    public final in8 b;
    public final grq c;
    public final d2f1 d;
    public final me30 e;
    public final yd91 f;
    public final mr20 g;
    public final o3r h;
    public final l381 i;

    public pha1(koc0 koc0Var, String str, in8 in8Var, jbt jbtVar, grq grqVar, d2f1 d2f1Var, me30 me30Var) {
        ke71 hp91Var;
        this.a = str;
        this.b = in8Var;
        this.c = grqVar;
        this.d = d2f1Var;
        this.e = me30Var;
        boolean z = jbtVar.c;
        this.f = new yd91(3, new k7a1(this, koc0Var, (byte) 2));
        this.g = !z ? new huz(Boolean.FALSE, (byte) 10) : rqt0.u(new zo51(((roc0) koc0Var).d(), this, (byte) 25));
        this.h = w3p1.o(new l4r(pwc0.b, 1, hea1.R0, new j4r(new dr91(this, (byte) 21)), hea1.S0), hea1.P0);
        if (z) {
            hp91Var = new hp91(this);
        } else {
            gr81 gr81Var = gr81.V0;
            ke71 ke71Var = o381.a;
            hp91Var = new ke71(gr81Var);
        }
        this.i = hp91Var;
    }

    @Override // p.xe91
    public final l381 c() {
        return this.i;
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.f;
    }

    @Override // p.xe91
    public final mr20 getShow() {
        return this.g;
    }

    @Override // p.r2g
    public final int getType() {
        return 2;
    }
}
