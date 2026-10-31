package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gjr0 implements srb0 {
    public final jkr0 a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public gjr0(jkr0 jkr0Var, int i) {
        this.a = jkr0Var;
        this.b = i;
    }

    @Override // p.srb0
    public final int a() {
        return this.a.l();
    }

    @Override // p.srb0
    public final int b() {
        int i;
        jkr0 jkr0Var = this.a;
        if (jkr0Var.k().a.size() == 0) {
            return 0;
        }
        int iJ = d1o1.j(jkr0Var.k());
        int i2 = jkr0Var.k().b + jkr0Var.k().c;
        if (i2 != 0 && (i = iJ / i2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // p.srb0
    public final boolean c() {
        return !this.a.k().a.isEmpty();
    }

    @Override // p.srb0
    public final int d() {
        return Math.max(0, this.a.e - this.b);
    }

    @Override // p.srb0
    public final int e() {
        jkr0 jkr0Var = this.a;
        return Math.min(jkr0Var.l() - 1, ((mfh0) o7h.A0(jkr0Var.k().a)).a + this.b);
    }
}
