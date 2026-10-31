package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y5e1 {
    public static final lfb g = new lfb((byte) 27);
    public final ifh0 a;
    public final flb0 b;
    public final f930 c;
    public final long d;
    public final float e;
    public final float f;

    public y5e1(ifh0 ifh0Var, flb0 flb0Var, f930 f930Var, long j) {
        this.a = ifh0Var;
        this.b = flb0Var;
        this.c = f930Var;
        this.d = j;
        this.e = ifh0Var.h();
        this.f = ifh0Var.U0();
    }

    public final String toString() {
        return "MeasureInputs(density=" + this.a + ", densityValue=" + this.e + ", fontScale=" + this.f + ", layoutDirection=" + this.b + ", fontFamilyResolver=" + this.c + ", constraints=" + hjl.m(this.d) + ")";
    }
}
