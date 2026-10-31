package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n2g0 {
    public final int a;
    public final lik1 b;
    public final List c;
    public final hux d;
    public final String e;
    public final String f;
    public String g;

    public n2g0(int i, lik1 lik1Var, List list, hux huxVar, String str, String str2) {
        this.a = i;
        this.b = lik1Var;
        this.c = list;
        this.d = huxVar;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2g0)) {
            return false;
        }
        n2g0 n2g0Var = (n2g0) obj;
        return this.a == n2g0Var.a && u890.j(this.b, n2g0Var.b) && u890.j(this.c, n2g0Var.c) && u890.j(this.d, n2g0Var.d) && u890.j(this.e, n2g0Var.e) && u890.j(this.f, n2g0Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(eqq.k(f4i1.b(cy30.d(l1d.C(this.a) * 31, 31, this.b.a), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
