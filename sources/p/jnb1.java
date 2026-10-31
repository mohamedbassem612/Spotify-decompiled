package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jnb1 extends mlb1 {
    public final String c;
    public final int d;
    public final String e;
    public final boolean f;

    public jnb1(int i, String str, String str2, boolean z) {
        super(z, str);
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnb1)) {
            return false;
        }
        jnb1 jnb1Var = (jnb1) obj;
        return u890.j(this.c, jnb1Var.c) && this.d == jnb1Var.d && u890.j(this.e, jnb1Var.e) && this.f == jnb1Var.f;
    }

    public final int hashCode() {
        String str = this.c;
        return Boolean.hashCode(this.f) + cy30.d(ab80.k(this.d, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.e);
    }
}
