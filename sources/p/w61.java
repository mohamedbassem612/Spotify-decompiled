package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class w61 {
    public final float a;
    public final float b;

    public w61(float f, float f2) {
        this.a = f;
        this.b = f2;
        if (p3v.b(f, f2) <= 0) {
            return;
        }
        hhg1.f(cy30.p("shrinkFloor (", p3v.d(f), ") must be <= target (", p3v.d(f2), ")"));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w61)) {
            return false;
        }
        w61 w61Var = (w61) obj;
        return p3v.c(this.a, w61Var.a) && p3v.c(this.b, w61Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
