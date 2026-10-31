package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class clj1 {
    public final String a;
    public final int b;
    public final long c;
    public final long d;
    public final String e;
    public final boolean f;

    public clj1(int i, long j, long j2, String str, String str2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = str2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clj1)) {
            return false;
        }
        clj1 clj1Var = (clj1) obj;
        return this.a.equals(clj1Var.a) && this.b == clj1Var.b && this.c == clj1Var.c && this.d == clj1Var.d && this.e.equals(clj1Var.e) && this.f == clj1Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + cy30.d(cy30.f(cy30.f(ab80.k(this.b, this.a.hashCode() * 31, 31), this.c, 31), this.d, 31), 31, this.e);
    }
}
