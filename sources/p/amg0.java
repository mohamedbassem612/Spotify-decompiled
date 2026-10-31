package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class amg0 implements dmg0 {
    public final String a;
    public final long b;

    public amg0(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amg0)) {
            return false;
        }
        amg0 amg0Var = (amg0) obj;
        if (!u890.j(this.a, amg0Var.a)) {
            return false;
        }
        long j = amg0Var.b;
        int i = u7h.l;
        return z4h1.b(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = u7h.l;
        return Long.hashCode(this.b) + iHashCode;
    }
}
