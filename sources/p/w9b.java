package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w9b implements fg40 {
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;
    public final mvh1 g;
    public final xk41 h;
    public final boolean i;
    public final Set j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final boolean n;

    public w9b(String str, String str2, List list, String str3, String str4, String str5, mvh1 mvh1Var, xk41 xk41Var, boolean z, Set set, String str6, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = mvh1Var;
        this.h = xk41Var;
        this.i = z;
        this.j = set;
        this.k = str6;
        this.l = z2;
        this.m = z3;
        this.n = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9b)) {
            return false;
        }
        w9b w9bVar = (w9b) obj;
        return u890.j(this.a, w9bVar.a) && u890.j(this.b, w9bVar.b) && this.c.equals(w9bVar.c) && this.d.equals(w9bVar.d) && u890.j(this.e, w9bVar.e) && u890.j(this.f, w9bVar.f) && this.g.equals(w9bVar.g) && u890.j(this.h, w9bVar.h) && this.i == w9bVar.i && u890.j(this.j, w9bVar.j) && u890.j(this.k, w9bVar.k) && this.l == w9bVar.l && this.m == w9bVar.m && this.n == w9bVar.n;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iD = cy30.d(f4i1.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        String str2 = this.e;
        int iHashCode2 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (this.g.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        xk41 xk41Var = this.h;
        int iG = xcg1.g((iHashCode3 + (xk41Var == null ? 0 : xk41Var.hashCode())) * 31, 31, this.i);
        Set set = this.j;
        int iHashCode4 = (iG + (set == null ? 0 : set.hashCode())) * 31;
        String str4 = this.k;
        return Boolean.hashCode(this.n) + xcg1.g(xcg1.g((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.l), 31, this.m);
    }
}
