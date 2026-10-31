package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zzq0 implements vzq0 {
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public zzq0(float f, float f2, float f3, float f4) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            of80.a("Padding must be non-negative");
        }
    }

    @Override // p.vzq0
    public final float a() {
        return this.e;
    }

    @Override // p.vzq0
    public final float b(flb0 flb0Var) {
        return flb0Var == flb0.a ? this.b : this.d;
    }

    @Override // p.vzq0
    public final float c(flb0 flb0Var) {
        return flb0Var == flb0.a ? this.d : this.b;
    }

    @Override // p.vzq0
    public final float d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzq0)) {
            return false;
        }
        zzq0 zzq0Var = (zzq0) obj;
        return p3v.c(this.b, zzq0Var.b) && p3v.c(this.c, zzq0Var.c) && p3v.c(this.d, zzq0Var.d) && p3v.c(this.e, zzq0Var.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + x0d.f(x0d.f(Float.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        String strD = p3v.d(this.b);
        String strD2 = p3v.d(this.c);
        return rjx.o(gvg.n("PaddingValues(start=", strD, ", top=", strD2, ", end="), p3v.d(this.d), ", bottom=", p3v.d(this.e), ")");
    }
}
