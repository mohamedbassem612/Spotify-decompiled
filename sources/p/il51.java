package p;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class il51 {
    public final List a;
    public final boolean b;
    public final String c;
    public final String d;
    public final List e;
    public final Map f;
    public final String g;
    public final x7i1 h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final Set m;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ il51(List list, String str, int i) {
        int i2 = i & 1;
        List list2 = z6x.a;
        this(i2 != 0 ? list2 : list, false, (i & 4) != 0 ? "" : str, "", list2, b7x.a, null, new x7i1(false, (exc0) null, (rc50) null, false, false, false, false, false, 8191), "", false, false, 0, w7x.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il51)) {
            return false;
        }
        il51 il51Var = (il51) obj;
        return u890.j(this.a, il51Var.a) && this.b == il51Var.b && u890.j(this.c, il51Var.c) && u890.j(this.d, il51Var.d) && u890.j(this.e, il51Var.e) && u890.j(this.f, il51Var.f) && u890.j(this.g, il51Var.g) && u890.j(this.h, il51Var.h) && u890.j(this.i, il51Var.i) && this.j == il51Var.j && this.k == il51Var.k && this.l == il51Var.l && u890.j(this.m, il51Var.m);
    }

    public final int hashCode() {
        int iE = cy30.e(f4i1.b(cy30.d(cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        return this.m.hashCode() + kaa0.f(this.l, xcg1.g(xcg1.g(cy30.d((this.h.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.i), 31, this.j), 31, this.k), 31);
    }

    public il51(List list, boolean z, String str, String str2, List list2, Map map, String str3, x7i1 x7i1Var, String str4, boolean z2, boolean z3, int i, Set set) {
        this.a = list;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = list2;
        this.f = map;
        this.g = str3;
        this.h = x7i1Var;
        this.i = str4;
        this.j = z2;
        this.k = z3;
        this.l = i;
        this.m = set;
    }
}
