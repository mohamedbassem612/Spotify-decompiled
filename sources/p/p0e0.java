package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p0e0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;

    public p0e0(long j, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0e0)) {
            return false;
        }
        p0e0 p0e0Var = (p0e0) obj;
        return this.a.equals(p0e0Var.a) && this.b.equals(p0e0Var.b) && this.c == p0e0Var.c && this.d == p0e0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
