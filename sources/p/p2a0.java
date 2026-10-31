package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p2a0 {
    public final String a;
    public final xkg0 b;
    public final dqi1 c;
    public final String d;
    public final String e;
    public final String f;

    public p2a0(String str, xkg0 xkg0Var, dqi1 dqi1Var, String str2, String str3, String str4) {
        this.a = str;
        this.b = xkg0Var;
        this.c = dqi1Var;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2a0)) {
            return false;
        }
        p2a0 p2a0Var = (p2a0) obj;
        return u890.j(this.a, p2a0Var.a) && this.b.equals(p2a0Var.b) && this.c.equals(p2a0Var.c) && u890.j(this.d, p2a0Var.d) && u890.j(this.e, p2a0Var.e) && this.f.equals(p2a0Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + kk0.h(this.b, this.a.hashCode() * 31, 31)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return this.f.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
