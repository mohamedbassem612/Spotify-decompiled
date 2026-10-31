package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k7k0 {
    public final qxc0 a;
    public final boolean b;
    public final String c;
    public final String d;

    public k7k0(qxc0 qxc0Var, boolean z, String str, String str2) {
        this.a = qxc0Var;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7k0)) {
            return false;
        }
        k7k0 k7k0Var = (k7k0) obj;
        return this.a.equals(k7k0Var.a) && this.b == k7k0Var.b && u890.j(this.c, k7k0Var.c) && u890.j(this.d, k7k0Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
