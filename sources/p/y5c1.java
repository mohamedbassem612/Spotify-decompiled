package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y5c1 {
    public final String a;
    public final vnr0 b;
    public final vnr0 c;
    public final boolean d;
    public final vnr0 e;
    public final int f;
    public final t5c1 g;
    public final w5c1 h;
    public final int i;
    public final String j;
    public final String k;
    public final dzo1 l;

    public y5c1(String str, vnr0 vnr0Var, vnr0 vnr0Var2, boolean z, vnr0 vnr0Var3, int i, t5c1 t5c1Var, w5c1 w5c1Var, int i2, String str2, String str3, dzo1 dzo1Var) {
        this.a = str;
        this.b = vnr0Var;
        this.c = vnr0Var2;
        this.d = z;
        this.e = vnr0Var3;
        this.f = i;
        this.g = t5c1Var;
        this.h = w5c1Var;
        this.i = i2;
        this.j = str2;
        this.k = str3;
        this.l = dzo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5c1)) {
            return false;
        }
        y5c1 y5c1Var = (y5c1) obj;
        return u890.j(this.a, y5c1Var.a) && this.b.equals(y5c1Var.b) && this.c.equals(y5c1Var.c) && this.d == y5c1Var.d && this.e.equals(y5c1Var.e) && this.f == y5c1Var.f && this.g.equals(y5c1Var.g) && this.h.equals(y5c1Var.h) && this.i == y5c1Var.i && u890.j(this.j, y5c1Var.j) && u890.j(this.k, y5c1Var.k) && this.l.equals(y5c1Var.l);
    }

    public final int hashCode() {
        int iD = cy30.d(kaa0.f(this.i, (this.h.hashCode() + ((this.g.hashCode() + kaa0.f(this.f, (this.e.hashCode() + xcg1.g((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31, 31)) * 31)) * 31, 31), 31, this.j);
        String str = this.k;
        return this.l.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
