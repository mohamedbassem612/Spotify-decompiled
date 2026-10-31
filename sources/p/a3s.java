package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a3s implements afh0 {
    public final afh0 a;
    public final int b;
    public final int c;

    public a3s(afh0 afh0Var, int i, int i2) {
        this.a = afh0Var;
        this.b = i;
        this.c = i2;
    }

    @Override // p.afh0
    public final int C(int i) {
        return this.a.C(i);
    }

    @Override // p.afh0
    public final q5t0 H(long j) {
        afh0 afh0Var = this.a;
        int i = this.c;
        int i2 = this.b;
        if (i == 1) {
            return new rn20(i2 == 2 ? afh0Var.C(hjl.h(j)) : afh0Var.w(hjl.h(j)), hjl.d(j) ? hjl.h(j) : 32767);
        }
        return new rn20(hjl.e(j) ? hjl.i(j) : 32767, i2 == 2 ? afh0Var.d(hjl.i(j)) : afh0Var.n(hjl.i(j)));
    }

    @Override // p.afh0
    public final int d(int i) {
        return this.a.d(i);
    }

    @Override // p.afh0
    public final Object g() {
        return this.a.g();
    }

    @Override // p.afh0
    public final int n(int i) {
        return this.a.n(i);
    }

    @Override // p.afh0
    public final int w(int i) {
        return this.a.w(i);
    }
}
