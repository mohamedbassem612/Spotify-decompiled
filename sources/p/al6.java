package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class al6 {
    public final c9 a;
    public final long b;

    public al6(c9 c9Var, long j) {
        this.a = c9Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al6)) {
            return false;
        }
        al6 al6Var = (al6) obj;
        if (!this.a.equals(al6Var.a)) {
            return false;
        }
        long j = al6Var.b;
        int i = u7h.l;
        return z4h1.b(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = u7h.l;
        return Long.hashCode(this.b) + iHashCode;
    }
}
