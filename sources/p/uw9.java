package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uw9 {
    public final long a;
    public final int b;

    public uw9(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw9)) {
            return false;
        }
        uw9 uw9Var = (uw9) obj;
        long j = uw9Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && this.b == uw9Var.b;
    }

    public final int hashCode() {
        int i = u7h.l;
        return l1d.C(this.b) + (Long.hashCode(this.a) * 961);
    }
}
