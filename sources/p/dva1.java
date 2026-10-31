package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dva1 extends fmv {
    public final float e1;
    public final int f1;

    public dva1(float f, int i) {
        super((byte) 0);
        this.e1 = f;
        this.f1 = i;
    }

    @Override // p.fmv
    public final void a(float f, float f2, float f3, bx61 bx61Var) {
        float f4 = f2 - this.f1;
        float f5 = this.e1;
        float f6 = f5 * f3;
        bx61Var.c(f4 - f6, 0.0f);
        bx61Var.c(f4, (-f5) * f3);
        bx61Var.c(f6 + f4, 0.0f);
        bx61Var.c(f, 0.0f);
    }
}
