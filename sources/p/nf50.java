package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nf50 {
    public final float a;
    public final int b;
    public final int c;
    public final boolean d;

    public nf50(float f, int i, int i2, boolean z) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf50)) {
            return false;
        }
        nf50 nf50Var = (nf50) obj;
        return p3v.c(this.a, nf50Var.a) && this.b == nf50Var.b && this.c == nf50Var.c && this.d == nf50Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + kaa0.f(this.c, kaa0.f(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }
}
