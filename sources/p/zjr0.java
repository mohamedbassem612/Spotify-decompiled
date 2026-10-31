package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zjr0 implements vsb0, bs41 {
    public final /* synthetic */ bs41 a;
    public final /* synthetic */ jkr0 b;

    public zjr0(bs41 bs41Var, jkr0 jkr0Var) {
        this.b = jkr0Var;
        this.a = bs41Var;
    }

    public final int a() {
        return this.b.l();
    }

    public final int b() {
        return ((mfh0) o7h.A0(this.b.k().a)).a;
    }

    public final void c(int i, int i2) {
        jkr0 jkr0Var = this.b;
        float fN = jkr0Var.n();
        jkr0Var.t(fN != 0.0f ? i2 / fN : 0.0f, i, true);
    }

    public final int e(int i) {
        jkr0 jkr0Var = this.b;
        return (int) (yoi1.r(q1o1.f(jkr0Var) + ((long) jch0.U(((jkr0Var.n() * (i - jkr0Var.d.p())) - (jkr0Var.d.q() * jkr0Var.n())) + 0.0f)), jkr0Var.h, jkr0Var.g) - q1o1.f(jkr0Var));
    }

    @Override // p.bs41
    public final float f(float f) {
        return this.a.f(f);
    }

    public final int g() {
        return this.b.f;
    }

    public final int h() {
        return this.b.e;
    }
}
