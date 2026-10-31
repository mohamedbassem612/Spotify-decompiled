package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lww0 {
    public final err0 a = new err0(0);
    public final err0 b = new err0(0);
    public final drr0 c = new drr0(0.0f);
    public final ygr0 d = new ygr0(yv91.a(new z6v0(this, (byte) 18)), 6);
    public final nzg e = new nzg(this, (byte) 1);

    public final float a() {
        int iS = this.a.s() - this.b.s();
        if (iS < 0) {
            iS = 0;
        }
        return iS;
    }

    public final void b(int i, int i2) {
        err0 err0Var = this.a;
        int iS = err0Var.s();
        err0 err0Var2 = this.b;
        if (iS == i && err0Var2.s() == i2) {
            return;
        }
        float fA = a();
        drr0 drr0Var = this.c;
        float fO = fA != 0.0f ? yoi1.o((-drr0Var.s()) / a(), 0.0f, 1.0f) : 0.0f;
        err0Var.t(i);
        err0Var2.t(i2);
        drr0Var.t((-a()) * fO);
    }
}
