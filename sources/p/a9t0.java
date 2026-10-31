package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a9t0 {
    public final x8t0 a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public a9t0(String str, String str2, String str3, x8t0 x8t0Var, boolean z) {
        this.a = x8t0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9t0)) {
            return false;
        }
        a9t0 a9t0Var = (a9t0) obj;
        return u890.j(this.a, a9t0Var.a) && u890.j(this.b, a9t0Var.b) && u890.j(this.c, a9t0Var.c) && u890.j(this.d, a9t0Var.d) && this.e == a9t0Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.e) + cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }
}
