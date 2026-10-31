package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zk31 {
    public final String a;
    public final vnr0 b;
    public final yk31 c;
    public final boolean d;
    public final String e;
    public final String f;
    public final dzo1 g;

    public zk31(String str, vnr0 vnr0Var, yk31 yk31Var, boolean z, String str2, String str3, dzo1 dzo1Var) {
        this.a = str;
        this.b = vnr0Var;
        this.c = yk31Var;
        this.d = z;
        this.e = str2;
        this.f = str3;
        this.g = dzo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk31)) {
            return false;
        }
        zk31 zk31Var = (zk31) obj;
        return u890.j(this.a, zk31Var.a) && this.b.equals(zk31Var.b) && this.c.equals(zk31Var.c) && Float.compare(61.5f, 61.5f) == 0 && Float.compare(0.58f, 0.58f) == 0 && this.d == zk31Var.d && u890.j(this.e, zk31Var.e) && p3v.c(16.0f, 16.0f) && u890.j(this.f, zk31Var.f) && this.g.equals(zk31Var.g);
    }

    public final int hashCode() {
        int iG = xcg1.g(x0d.f(x0d.f((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, 61.5f), 31, 0.58f), 31, this.d);
        String str = this.e;
        int iF = x0d.f((iG + (str == null ? 0 : str.hashCode())) * 31, 31, 16.0f);
        String str2 = this.f;
        return this.g.hashCode() + ((iF + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
