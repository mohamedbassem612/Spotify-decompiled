package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t9b0 {
    public final String a;
    public final long b;

    public t9b0(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9b0)) {
            return false;
        }
        t9b0 t9b0Var = (t9b0) obj;
        if (!this.a.equals(t9b0Var.a)) {
            return false;
        }
        long j = t9b0Var.b;
        int i = u7h.l;
        return z4h1.b(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = u7h.l;
        return Long.hashCode(this.b) + iHashCode;
    }
}
