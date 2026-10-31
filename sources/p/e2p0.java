package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e2p0 extends f2p0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final doj0 d;
    public final String e;
    public final qam f;
    public final u7l g;
    public final xfx0 h;
    public final s1p0 i;
    public final boolean j;
    public final boolean k;

    public e2p0(String str, String str2, boolean z, doj0 doj0Var, String str3, qam qamVar, u7l u7lVar, xfx0 xfx0Var, s1p0 s1p0Var, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = doj0Var;
        this.e = str3;
        this.f = qamVar;
        this.g = u7lVar;
        this.h = xfx0Var;
        this.i = s1p0Var;
        this.j = z2;
        this.k = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2p0)) {
            return false;
        }
        e2p0 e2p0Var = (e2p0) obj;
        return this.a.equals(e2p0Var.a) && u890.j(this.b, e2p0Var.b) && this.c == e2p0Var.c && this.d == e2p0Var.d && this.e.equals(e2p0Var.e) && this.f.equals(e2p0Var.f) && this.g.equals(e2p0Var.g) && this.h.equals(e2p0Var.h) && this.i.equals(e2p0Var.i) && this.j == e2p0Var.j && this.k == e2p0Var.k;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.k) + xcg1.g((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + cy30.d((this.d.hashCode() + xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c)) * 31, 31, this.e)) * 31)) * 31)) * 31)) * 31, 31, this.j);
    }
}
