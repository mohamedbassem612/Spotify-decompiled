package p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dk9 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Set d;
    public final Map e;
    public final boolean f;

    public dk9(boolean z, boolean z2, boolean z3, Set set, Map map, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = set;
        this.e = map;
        this.f = z4;
    }

    public static dk9 a(dk9 dk9Var, boolean z, boolean z2, boolean z3, Set set, Map map, int i) {
        if ((i & 1) != 0) {
            z = dk9Var.a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = dk9Var.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = dk9Var.c;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            set = dk9Var.d;
        }
        Set set2 = set;
        if ((i & 16) != 0) {
            map = dk9Var.e;
        }
        return new dk9(z4, z5, z6, set2, map, dk9Var.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk9)) {
            return false;
        }
        dk9 dk9Var = (dk9) obj;
        return this.a == dk9Var.a && this.b == dk9Var.b && this.c == dk9Var.c && u890.j(this.d, dk9Var.d) && u890.j(this.e, dk9Var.e) && this.f == dk9Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + cy30.e(gvg.c(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
