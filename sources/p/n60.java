package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n60 {
    public final String a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final omd e;
    public final m60 f;

    public n60(String str, String str2, omd omdVar, m60 m60Var, int i) {
        str = (i & 1) != 0 ? null : str;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 16) == 0;
        omdVar = (i & 32) != 0 ? null : omdVar;
        m60Var = (i & 64) != 0 ? null : m60Var;
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = z2;
        this.e = omdVar;
        this.f = m60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n60)) {
            return false;
        }
        n60 n60Var = (n60) obj;
        return u890.j(this.a, n60Var.a) && this.b == n60Var.b && this.c.equals(n60Var.c) && this.d == n60Var.d && this.e == n60Var.e && u890.j(this.f, n60Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iG = xcg1.g(cy30.d(xcg1.g((str == null ? 0 : str.hashCode()) * 961, 31, this.b), 31, this.c), 31, this.d);
        omd omdVar = this.e;
        int iHashCode = (iG + (omdVar == null ? 0 : omdVar.hashCode())) * 31;
        m60 m60Var = this.f;
        return iHashCode + (m60Var != null ? m60Var.hashCode() : 0);
    }
}
