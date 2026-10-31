package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dtj0 {
    public final ctj0 a;
    public final long b;

    public dtj0(ctj0 ctj0Var, long j) {
        this.a = ctj0Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dtj0) {
            dtj0 dtj0Var = (dtj0) obj;
            if (this.a != dtj0Var.a) {
                return false;
            }
            long j = dtj0Var.b;
            int i = u7h.l;
            if (z4h1.b(this.b, j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = u7h.l;
        return Long.hashCode(this.b) + iHashCode;
    }
}
