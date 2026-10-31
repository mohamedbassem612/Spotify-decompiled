package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d9t0 {
    public final x8t0 a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;

    public d9t0(String str, String str2, String str3, x8t0 x8t0Var, boolean z) {
        this.a = x8t0Var;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9t0)) {
            return false;
        }
        d9t0 d9t0Var = (d9t0) obj;
        return u890.j(this.a, d9t0Var.a) && u890.j(this.b, d9t0Var.b) && this.c.equals(d9t0Var.c) && this.d == d9t0Var.d && u890.j(this.e, d9t0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
