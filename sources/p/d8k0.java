package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d8k0 {
    public final c8k0 a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;

    public d8k0(c8k0 c8k0Var, String str, boolean z, boolean z2, String str2, boolean z3, int i) {
        z3 = (i & 64) != 0 ? false : z3;
        this.a = c8k0Var;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = str2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8k0)) {
            return false;
        }
        d8k0 d8k0Var = (d8k0) obj;
        return this.a.equals(d8k0Var.a) && this.b.equals(d8k0Var.b) && this.c == d8k0Var.c && this.d == d8k0Var.d && u890.j(this.e, d8k0Var.e) && this.f == d8k0Var.f;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 961, this.c), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.f) + ((iG + (str == null ? 0 : str.hashCode())) * 31);
    }
}
