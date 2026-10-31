package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rgx0 implements sgx0 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;

    public rgx0(long j, long j2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgx0)) {
            return false;
        }
        rgx0 rgx0Var = (rgx0) obj;
        return u890.j(this.a, rgx0Var.a) && u890.j(this.b, rgx0Var.b) && this.c == rgx0Var.c && this.d == rgx0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }
}
