package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hx9 {
    public final String a;
    public final long b;

    public hx9(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx9)) {
            return false;
        }
        hx9 hx9Var = (hx9) obj;
        if (!this.a.equals(hx9Var.a)) {
            return false;
        }
        long j = hx9Var.b;
        int i = u7h.l;
        return z4h1.b(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = u7h.l;
        return Long.hashCode(this.b) + iHashCode;
    }
}
