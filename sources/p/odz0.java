package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class odz0 {
    public jh9 a;
    public boolean b;
    public boolean c;
    public xab1 d;
    public xab1 e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odz0)) {
            return false;
        }
        odz0 odz0Var = (odz0) obj;
        return u890.j(this.a, odz0Var.a) && this.b == odz0Var.b && this.c == odz0Var.c && u890.j(this.d, odz0Var.d) && u890.j(this.e, odz0Var.e);
    }

    public final int hashCode() {
        jh9 jh9Var = this.a;
        int iG = xcg1.g(xcg1.g((jh9Var == null ? 0 : jh9Var.hashCode()) * 31, 31, this.b), 31, this.c);
        xab1 xab1Var = this.d;
        int iHashCode = (iG + (xab1Var == null ? 0 : xab1Var.hashCode())) * 31;
        xab1 xab1Var2 = this.e;
        return iHashCode + (xab1Var2 != null ? xab1Var2.hashCode() : 0);
    }
}
