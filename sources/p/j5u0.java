package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j5u0 {
    public final boolean a;
    public final long b;
    public final long c;
    public final float d;

    public j5u0(boolean z, long j, long j2, float f) {
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5u0)) {
            return false;
        }
        j5u0 j5u0Var = (j5u0) obj;
        return this.a == j5u0Var.a && this.b == j5u0Var.b && this.c == j5u0Var.c && Float.compare(this.d, j5u0Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + cy30.f(cy30.f(Boolean.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
