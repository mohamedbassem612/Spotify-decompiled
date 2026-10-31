package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bc41 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final boolean e;

    public bc41(long j, long j2, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc41)) {
            return false;
        }
        bc41 bc41Var = (bc41) obj;
        return u890.j(this.a, bc41Var.a) && u890.j(this.b, bc41Var.b) && this.c == bc41Var.c && this.d == bc41Var.d && this.e == bc41Var.e;
    }

    public final int hashCode() {
        return xcg1.g(cy30.f(cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31), this.d, 31), 31, this.e);
    }
}
