package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ddm1 {
    public final long a;
    public final float b;

    public ddm1(long j, float f) {
        this.a = j;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddm1)) {
            return false;
        }
        ddm1 ddm1Var = (ddm1) obj;
        long j = ddm1Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && Float.compare(this.b, ddm1Var.b) == 0;
    }

    public final int hashCode() {
        int i = u7h.l;
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
