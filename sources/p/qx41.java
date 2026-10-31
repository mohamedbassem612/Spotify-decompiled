package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qx41 extends xyn1 {
    public final String b;
    public final String c;
    public final xo20 d;
    public final String e;
    public final int f;
    public final tv80 g;
    public final gyh h;
    public final boolean i;
    public final List j;

    public qx41(String str, String str2, xo20 xo20Var, String str3, int i, tv80 tv80Var, gyh gyhVar, boolean z, List list) {
        this.b = str;
        this.c = str2;
        this.d = xo20Var;
        this.e = str3;
        this.f = i;
        this.g = tv80Var;
        this.h = gyhVar;
        this.i = z;
        this.j = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx41)) {
            return false;
        }
        qx41 qx41Var = (qx41) obj;
        return u890.j(this.b, qx41Var.b) && u890.j(this.c, qx41Var.c) && u890.j(this.d, qx41Var.d) && u890.j(this.e, qx41Var.e) && this.f == qx41Var.f && u890.j(this.g, qx41Var.g) && this.h == qx41Var.h && this.i == qx41Var.i && u890.j(this.j, qx41Var.j);
    }

    public final int hashCode() {
        int iD = cy30.d(this.b.hashCode() * 31, 31, this.c);
        xo20 xo20Var = this.d;
        int iF = kaa0.f(this.f, cy30.d((iD + (xo20Var == null ? 0 : xo20Var.hashCode())) * 31, 31, this.e), 31);
        tv80 tv80Var = this.g;
        int iG = xcg1.g((this.h.hashCode() + ((iF + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31)) * 31, 31, this.i);
        List list = this.j;
        return iG + (list != null ? list.hashCode() : 0);
    }
}
