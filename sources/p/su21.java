package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class su21 {
    public final long a;
    public final m61 b;

    public su21(long j, m61 m61Var) {
        this.a = j;
        this.b = m61Var;
    }

    public final m61 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su21)) {
            return false;
        }
        su21 su21Var = (su21) obj;
        return hjl.c(this.a, su21Var.a) && u890.j(this.b, su21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }
}
