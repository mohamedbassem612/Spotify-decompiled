package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lsc1 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;

    public lsc1(long j, long j2, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsc1)) {
            return false;
        }
        lsc1 lsc1Var = (lsc1) obj;
        return u890.j(this.a, lsc1Var.a) && u890.j(this.b, lsc1Var.b) && u890.j(this.c, lsc1Var.c) && this.d == lsc1Var.d && this.e == lsc1Var.e;
    }

    public final int hashCode() {
        return cy30.f(cy30.f(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31), this.e, 31);
    }
}
