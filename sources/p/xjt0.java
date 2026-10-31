package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xjt0 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final String e;

    public xjt0(long j, long j2, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjt0)) {
            return false;
        }
        xjt0 xjt0Var = (xjt0) obj;
        return u890.j(this.a, xjt0Var.a) && u890.j(this.b, xjt0Var.b) && this.c == xjt0Var.c && this.d == xjt0Var.d && u890.j(this.e, xjt0Var.e);
    }

    public final int hashCode() {
        return cy30.d(cy30.f(cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31), this.d, 31), 31, this.e);
    }
}
