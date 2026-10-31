package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xan0 {
    public final jlw0 a;
    public final jlw0 b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final long g;

    public xan0(jlw0 jlw0Var, jlw0 jlw0Var2, int i, int i2, String str, String str2, long j) {
        this.a = jlw0Var;
        this.b = jlw0Var2;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = str2;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xan0)) {
            return false;
        }
        xan0 xan0Var = (xan0) obj;
        return u890.j(this.a, xan0Var.a) && this.b.equals(xan0Var.b) && this.c == xan0Var.c && this.d == xan0Var.d && u890.j(this.e, xan0Var.e) && this.f.equals(xan0Var.f) && this.g == xan0Var.g;
    }

    public final int hashCode() {
        jlw0 jlw0Var = this.a;
        return Long.hashCode(this.g) + cy30.d(cy30.d(kaa0.f(this.d, kaa0.f(this.c, (this.b.hashCode() + ((jlw0Var == null ? 0 : jlw0Var.hashCode()) * 31)) * 31, 31), 31), 31, this.e), 31, this.f);
    }
}
