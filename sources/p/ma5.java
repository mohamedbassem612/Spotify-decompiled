package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ma5 {
    public final float a;
    public final float b;
    public final boolean c;

    public ma5(float f, float f2, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma5)) {
            return false;
        }
        ma5 ma5Var = (ma5) obj;
        return Float.compare(this.a, ma5Var.a) == 0 && p3v.c(this.b, ma5Var.b) && this.c == ma5Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + x0d.f(Float.hashCode(this.a) * 31, 31, this.b);
    }
}
