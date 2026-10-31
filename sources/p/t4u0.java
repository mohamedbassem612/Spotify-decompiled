package p;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t4u0 {
    public final g3d0 a;
    public final Set b;
    public final List c;
    public final Set d;
    public final xzc0 e;
    public final boolean f;
    public final Map g;
    public final mp91 h;
    public final Map i;
    public final src0 j;

    public /* synthetic */ t4u0(g3d0 g3d0Var, Set set, List list, xzc0 xzc0Var, src0 src0Var, int i) {
        g3d0 g3d0Var2 = (i & 1) != 0 ? null : g3d0Var;
        int i2 = i & 2;
        Set set2 = w7x.a;
        Set set3 = i2 != 0 ? set2 : set;
        List list2 = (i & 4) != 0 ? z6x.a : list;
        xzc0 xzc0Var2 = (i & 16) != 0 ? xzc0.c : xzc0Var;
        mp91 mp91Var = new mp91(null, null);
        src0 src0Var2 = (i & 512) != 0 ? qrc0.a : src0Var;
        b7x b7xVar = b7x.a;
        this(g3d0Var2, set3, list2, set2, xzc0Var2, false, b7xVar, mp91Var, b7xVar, src0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4u0)) {
            return false;
        }
        t4u0 t4u0Var = (t4u0) obj;
        return u890.j(this.a, t4u0Var.a) && u890.j(this.b, t4u0Var.b) && u890.j(this.c, t4u0Var.c) && u890.j(this.d, t4u0Var.d) && this.e == t4u0Var.e && this.f == t4u0Var.f && u890.j(this.g, t4u0Var.g) && u890.j(this.h, t4u0Var.h) && u890.j(this.i, t4u0Var.i) && u890.j(this.j, t4u0Var.j);
    }

    public final int hashCode() {
        g3d0 g3d0Var = this.a;
        return this.j.hashCode() + cy30.e((this.h.hashCode() + cy30.e(xcg1.g((this.e.hashCode() + gvg.c(f4i1.b(gvg.c((g3d0Var == null ? 0 : g3d0Var.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g)) * 31, 31, this.i);
    }

    public t4u0(g3d0 g3d0Var, Set set, List list, Set set2, xzc0 xzc0Var, boolean z, Map map, mp91 mp91Var, Map map2, src0 src0Var) {
        this.a = g3d0Var;
        this.b = set;
        this.c = list;
        this.d = set2;
        this.e = xzc0Var;
        this.f = z;
        this.g = map;
        this.h = mp91Var;
        this.i = map2;
        this.j = src0Var;
    }
}
