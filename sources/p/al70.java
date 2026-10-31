package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class al70 {
    public final hux a;
    public final long b;

    public al70(long j, hux huxVar) {
        this.a = huxVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al70)) {
            return false;
        }
        al70 al70Var = (al70) obj;
        if (!u890.j(this.a, al70Var.a)) {
            return false;
        }
        long j = al70Var.b;
        int i = u7h.l;
        return z4h1.b(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = u7h.l;
        return Long.hashCode(this.b) + iHashCode;
    }
}
