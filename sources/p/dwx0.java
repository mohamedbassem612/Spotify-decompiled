package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dwx0 {
    public final zvx0 a;
    public final ak80 b;
    public final String c;
    public final String d;
    public final boolean e;
    public final n360 f;
    public final boolean g;
    public final t7a h;
    public final uzi0 i;
    public final boolean j;
    public final int k;
    public final boolean l;
    public final nua0 m;

    public dwx0(zvx0 zvx0Var, ak80 ak80Var, String str, String str2, boolean z, n360 n360Var, boolean z2, t7a t7aVar, uzi0 uzi0Var, boolean z3, int i, boolean z4, nua0 nua0Var) {
        this.a = zvx0Var;
        this.b = ak80Var;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = n360Var;
        this.g = z2;
        this.h = t7aVar;
        this.i = uzi0Var;
        this.j = z3;
        this.k = i;
        this.l = z4;
        this.m = nua0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwx0)) {
            return false;
        }
        dwx0 dwx0Var = (dwx0) obj;
        return this.a.equals(dwx0Var.a) && this.b.equals(dwx0Var.b) && u890.j(this.c, dwx0Var.c) && u890.j(this.d, dwx0Var.d) && this.e == dwx0Var.e && u890.j(this.f, dwx0Var.f) && this.g == dwx0Var.g && this.h.equals(dwx0Var.h) && this.i == dwx0Var.i && this.j == dwx0Var.j && this.k == dwx0Var.k && this.l == dwx0Var.l && u890.j(this.m, dwx0Var.m);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iG = xcg1.g((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        n360 n360Var = this.f;
        return this.m.hashCode() + xcg1.g(kaa0.f(this.k, xcg1.g((this.i.hashCode() + ((this.h.hashCode() + xcg1.g((iG + (n360Var != null ? n360Var.hashCode() : 0)) * 31, 31, this.g)) * 31)) * 31, 31, this.j), 31), 31, this.l);
    }
}
