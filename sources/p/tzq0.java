package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tzq0 implements vzq0 {
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public tzq0(float f, float f2, float f3, float f4) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            of80.a("Padding must be non-negative");
        }
    }

    public final float a() {
        return this.e;
    }

    public final float b(flb0 flb0Var) {
        return this.b;
    }

    public final float c(flb0 flb0Var) {
        return this.d;
    }

    public final float d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tzq0)) {
            return false;
        }
        tzq0 tzq0Var = (tzq0) obj;
        return p3v.c(this.b, tzq0Var.b) && p3v.c(this.c, tzq0Var.c) && p3v.c(this.d, tzq0Var.d) && p3v.c(this.e, tzq0Var.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + x0d.f(x0d.f(Float.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        String strD = p3v.d(this.b);
        String strD2 = p3v.d(this.c);
        return rjx.o(gvg.n("PaddingValues.Absolute(left=", strD, ", top=", strD2, ", right="), p3v.d(this.d), ", bottom=", p3v.d(this.e), ")");
    }

    public tzq0(int i) {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
