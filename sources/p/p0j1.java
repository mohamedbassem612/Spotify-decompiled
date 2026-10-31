package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p0j1 implements r0j1 {
    public final String a;
    public final long b;

    public p0j1(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0j1)) {
            return false;
        }
        p0j1 p0j1Var = (p0j1) obj;
        return this.a.equals(p0j1Var.a) && this.b == p0j1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
