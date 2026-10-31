package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xzb1 extends vmm0 {
    public final yzb1 a;
    public o8b1 b;
    public tzb1 c;

    public xzb1() {
        yzb1 yzb1Var = new yzb1();
        yzb1Var.k = false;
        this.a = yzb1Var;
        this.c = yzb1Var;
    }

    @Override // p.vmm0
    public final float a() {
        return this.c.a();
    }

    public final void b(float f, float f2, float f3, float f4, float f5, float f6) {
        yzb1 yzb1Var = this.a;
        this.c = yzb1Var;
        yzb1Var.l = f;
        boolean z = f > f2;
        yzb1Var.k = z;
        if (z) {
            yzb1Var.d(-f3, f - f2, f5, f6, f4);
        } else {
            yzb1Var.d(f3, f2 - f, f5, f6, f4);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.c.getInterpolation(f);
    }
}
