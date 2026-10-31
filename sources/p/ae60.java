package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ae60 {
    public final long a;
    public final tr80 b;

    public ae60(long j, tr80 tr80Var) {
        this.a = j;
        this.b = tr80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae60)) {
            return false;
        }
        ae60 ae60Var = (ae60) obj;
        long j = ae60Var.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && this.b.equals(ae60Var.b);
    }

    public final int hashCode() {
        int i = u7h.l;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }
}
