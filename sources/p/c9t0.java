package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c9t0 {
    public final x8t0 a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public c9t0(x8t0 x8t0Var, String str, String str2, String str3, boolean z, int i) {
        this.a = x8t0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9t0)) {
            return false;
        }
        c9t0 c9t0Var = (c9t0) obj;
        return u890.j(this.a, c9t0Var.a) && u890.j(this.b, c9t0Var.b) && u890.j(this.c, c9t0Var.c) && u890.j(this.d, c9t0Var.d) && this.e == c9t0Var.e && this.f == c9t0Var.f;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Integer.hashCode(this.f) + xcg1.g(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
    }
}
