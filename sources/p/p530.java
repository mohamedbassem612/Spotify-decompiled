package p;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p530 {
    public final List a;
    public final String b;
    public final Map c;
    public final boolean d;
    public final Set e;
    public final g3d0 f;

    public p530(List list, String str, Map map, boolean z, Set set, g3d0 g3d0Var) {
        this.a = list;
        this.b = str;
        this.c = map;
        this.d = z;
        this.e = set;
        this.f = g3d0Var;
    }

    public static p530 a(p530 p530Var, List list, String str, xkg0 xkg0Var, boolean z, Set set, g3d0 g3d0Var, int i) {
        if ((i & 1) != 0) {
            list = p530Var.a;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            str = p530Var.b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            xkg0Var = p530Var.c;
        }
        xkg0 xkg0Var2 = xkg0Var;
        if ((i & 8) != 0) {
            z = p530Var.d;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            set = p530Var.e;
        }
        Set set2 = set;
        if ((i & 32) != 0) {
            g3d0Var = p530Var.f;
        }
        p530Var.getClass();
        return new p530(list2, str2, xkg0Var2, z2, set2, g3d0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p530)) {
            return false;
        }
        p530 p530Var = (p530) obj;
        return u890.j(this.a, p530Var.a) && u890.j(this.b, p530Var.b) && u890.j(this.c, p530Var.c) && this.d == p530Var.d && u890.j(this.e, p530Var.e) && u890.j(this.f, p530Var.f);
    }

    public final int hashCode() {
        List list = this.a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        int iC = gvg.c(xcg1.g(cy30.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        g3d0 g3d0Var = this.f;
        return iC + (g3d0Var != null ? g3d0Var.hashCode() : 0);
    }
}
