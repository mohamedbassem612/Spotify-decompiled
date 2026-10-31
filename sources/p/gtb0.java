package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gtb0 implements srb0 {
    public final xtb0 a;

    public gtb0(xtb0 xtb0Var) {
        this.a = xtb0Var;
    }

    @Override // p.srb0
    public final int a() {
        return this.a.h().o;
    }

    @Override // p.srb0
    public final int b() {
        int i;
        xtb0 xtb0Var = this.a;
        if (xtb0Var.h().l.isEmpty()) {
            return 0;
        }
        int iD = pno1.d(xtb0Var.h());
        int iN = fno1.n(xtb0Var.h());
        if (iN != 0 && (i = iD / iN) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // p.srb0
    public final boolean c() {
        return !this.a.h().l.isEmpty();
    }

    @Override // p.srb0
    public final int d() {
        return Math.max(0, ((err0) this.a.e.b).s());
    }

    @Override // p.srb0
    public final int e() {
        return Math.min(a() - 1, ((qtb0) o7h.A0(this.a.h().l)).a);
    }
}
