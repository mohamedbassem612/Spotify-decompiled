package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uqx0 extends frx0 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;

    public uqx0(long j, long j2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqx0)) {
            return false;
        }
        uqx0 uqx0Var = (uqx0) obj;
        return u890.j(this.a, uqx0Var.a) && u890.j(this.b, uqx0Var.b) && this.c == uqx0Var.c && this.d == uqx0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }
}
