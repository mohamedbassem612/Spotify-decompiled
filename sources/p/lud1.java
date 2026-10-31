package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lud1 implements nud1 {
    public final String a;
    public final String b;
    public final long c;
    public final boolean d;

    public lud1(long j, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lud1)) {
            return false;
        }
        lud1 lud1Var = (lud1) obj;
        return u890.j(this.a, lud1Var.a) && u890.j(this.b, lud1Var.b) && this.c == lud1Var.c && this.d == lud1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }
}
