package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ix9 {
    public final boolean a;
    public final gx9 b;
    public final long c;

    public ix9(boolean z, gx9 gx9Var, long j) {
        this.a = z;
        this.b = gx9Var;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix9)) {
            return false;
        }
        ix9 ix9Var = (ix9) obj;
        if (this.a != ix9Var.a || !u890.j(this.b, ix9Var.b)) {
            return false;
        }
        long j = ix9Var.c;
        int i = u7h.l;
        return z4h1.b(this.c, j);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        int i = u7h.l;
        return Long.hashCode(this.c) + iHashCode;
    }
}
