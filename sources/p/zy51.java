package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zy51 implements mfv0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public final int f;
    public final qg6 g;
    public final r9y0 h;

    public zy51(float f, float f2, float f3, float f4, int i, int i2, qg6 qg6Var, r9y0 r9y0Var) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = i;
        this.f = i2;
        this.g = qg6Var;
        this.h = r9y0Var;
    }

    public final long a(ur80 ur80Var, long j, flb0 flb0Var, long j2) {
        float f = ur80Var.b;
        float f2 = (this.a + f) - ((int) (j2 & 4294967295L));
        float f3 = this.e;
        int iU = jch0.U(f2 - f3);
        int i = this.f;
        boolean z = iU >= i;
        this.h.invoke(Boolean.valueOf(z));
        float f4 = ur80Var.a + (z ? this.c : this.d);
        int i2 = (int) (j2 >> 32);
        int iU2 = jch0.U(f4 - (i2 / 2.0f));
        int i3 = (((int) (j >> 32)) - i2) - i;
        if (i3 < i) {
            i3 = i;
        }
        int iP = yoi1.p(iU2, i, i3);
        this.g.invoke(Float.valueOf(f4 - iP));
        if (!z) {
            iU = jch0.U(f + this.b + f3);
        }
        return (((long) iP) << 32) | (((long) iU) & 4294967295L);
    }
}
