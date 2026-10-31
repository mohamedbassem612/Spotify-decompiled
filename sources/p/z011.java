package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z011 {
    public final List a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final boolean f;
    public final Map g;

    public /* synthetic */ z011(int i, int i2, int i3) {
        this(z6x.a, 0, false, i, i2, (i3 & 32) == 0, b7x.a);
    }

    public static z011 a(z011 z011Var, List list, boolean z, Map map, int i) {
        if ((i & 1) != 0) {
            list = z011Var.a;
        }
        List list2 = list;
        int i2 = (i & 2) != 0 ? z011Var.b : 0;
        if ((i & 4) != 0) {
            z = z011Var.c;
        }
        boolean z2 = z;
        int i3 = (i & 8) != 0 ? z011Var.d : 0;
        int i4 = (i & 16) != 0 ? z011Var.e : 0;
        boolean z3 = z011Var.f;
        if ((i & 64) != 0) {
            map = z011Var.g;
        }
        return new z011(list2, i2, z2, i3, i4, z3, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z011)) {
            return false;
        }
        z011 z011Var = (z011) obj;
        return u890.j(this.a, z011Var.a) && this.b == z011Var.b && this.c == z011Var.c && this.d == z011Var.d && this.e == z011Var.e && this.f == z011Var.f && u890.j(this.g, z011Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + xcg1.g(kaa0.f(this.e, kaa0.f(this.d, xcg1.g(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31), 31, this.f);
    }

    public z011(List list, int i, boolean z, int i2, int i3, boolean z2, Map map) {
        this.a = list;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = i3;
        this.f = z2;
        this.g = map;
    }
}
