package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a310 {
    public final d310 a;
    public final long b;

    public a310(d310 d310Var, long j) {
        this.a = d310Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a310)) {
            return false;
        }
        a310 a310Var = (a310) obj;
        return this.a.equals(a310Var.a) && this.b == a310Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
