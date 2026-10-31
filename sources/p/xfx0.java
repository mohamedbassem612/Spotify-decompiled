package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xfx0 {
    public final long a;
    public final long b;
    public final float c;

    public xfx0(float f, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfx0)) {
            return false;
        }
        xfx0 xfx0Var = (xfx0) obj;
        return this.a == xfx0Var.a && this.b == xfx0Var.b && Float.compare(this.c, xfx0Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + cy30.f(Long.hashCode(this.a) * 31, this.b, 31);
    }
}
