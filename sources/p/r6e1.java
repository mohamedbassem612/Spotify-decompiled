package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r6e1 {
    public static final df41 g = kyo1.t(new p5e1((byte) 6), new f6f0(23));
    public final drr0 a;
    public final drr0 b = new drr0(0.0f);
    public final err0 c = new err0(0);
    public n511 d = n511.e;
    public long e = nbe1.b;
    public final hrr0 f;

    public r6e1(qqq0 qqq0Var, float f) {
        this.a = new drr0(f);
        this.f = new hrr0(qqq0Var, kcx0.R0);
    }

    public final void a(qqq0 qqq0Var, n511 n511Var, int i, int i2) {
        float f;
        float f2 = i2 - i;
        this.b.t(f2);
        float f3 = n511Var.a;
        float f4 = n511Var.b;
        n511 n511Var2 = this.d;
        float f5 = n511Var2.a;
        drr0 drr0Var = this.a;
        if (f3 != f5 || f4 != n511Var2.b) {
            boolean z = qqq0Var == qqq0.a;
            if (z) {
                f3 = f4;
            }
            float f6 = z ? n511Var.d : n511Var.c;
            float fS = drr0Var.s();
            float f7 = i;
            float f8 = fS + f7;
            if (f6 <= f8 && (f3 >= fS || f6 - f3 <= f7)) {
                f = (f3 >= fS || f6 - f3 > f7) ? 0.0f : f3 - fS;
            } else {
                f = f6 - f8;
            }
            drr0Var.t(drr0Var.s() + f);
            this.d = n511Var;
        }
        drr0Var.t(yoi1.o(drr0Var.s(), 0.0f, f2));
        this.c.t(i);
    }
}
