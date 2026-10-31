package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hm41 {
    public final String a;
    public final xk41 b;
    public final ewx0 c;
    public final String d;
    public final boolean e;
    public final zlk1 f;
    public final boolean g;
    public final u1f1 h;
    public final String i;

    public hm41(String str, xk41 xk41Var, ewx0 ewx0Var, String str2, boolean z, zlk1 zlk1Var, boolean z2, u1f1 u1f1Var, String str3) {
        this.a = str;
        this.b = xk41Var;
        this.c = ewx0Var;
        this.d = str2;
        this.e = z;
        this.f = zlk1Var;
        this.g = z2;
        this.h = u1f1Var;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm41)) {
            return false;
        }
        hm41 hm41Var = (hm41) obj;
        return this.a.equals(hm41Var.a) && this.b.equals(hm41Var.b) && this.c.equals(hm41Var.c) && this.d.equals(hm41Var.d) && this.e == hm41Var.e && u890.j(this.f, hm41Var.f) && this.g == hm41Var.g && this.h.equals(hm41Var.h) && u890.j(this.i, hm41Var.i);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
        zlk1 zlk1Var = this.f;
        int iB = f4i1.b(xcg1.g((iG + (zlk1Var == null ? 0 : zlk1Var.hashCode())) * 31, 31, this.g), 31, this.h.a);
        String str = this.i;
        return iB + (str != null ? str.hashCode() : 0);
    }
}
