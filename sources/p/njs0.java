package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class njs0 {
    public final long a;
    public final long b;
    public final float c;

    public njs0(float f, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njs0)) {
            return false;
        }
        njs0 njs0Var = (njs0) obj;
        long j = njs0Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, njs0Var.b) && Float.compare(this.c, njs0Var.c) == 0 && Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        int i = u7h.l;
        return Float.hashCode(1.0f) + x0d.f(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), 31, this.c);
    }
}
