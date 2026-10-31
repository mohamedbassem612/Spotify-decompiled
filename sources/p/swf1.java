package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class swf1 {
    public final String a;
    public final List b;
    public final g07 c;
    public final o1v d;
    public final k4m e;
    public final uez0 f;
    public final int g;
    public final boolean h;
    public final h2x0 i;
    public final int j;

    public swf1(String str, List list, g07 g07Var, o1v o1vVar, k4m k4mVar, int i, boolean z, int i2) {
        o1vVar = (i2 & 16) != 0 ? o1v.a : o1vVar;
        k4mVar = (i2 & 32) != 0 ? k4m.d : k4mVar;
        z = (i2 & 512) != 0 ? true : z;
        h2x0 h2x0Var = h2x0.T0;
        this.a = str;
        this.b = list;
        this.c = g07Var;
        this.d = o1vVar;
        this.e = k4mVar;
        this.f = tez0.a;
        this.g = i;
        this.h = z;
        this.i = h2x0Var;
        this.j = 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swf1)) {
            return false;
        }
        swf1 swf1Var = (swf1) obj;
        return this.a.equals(swf1Var.a) && this.b.equals(swf1Var.b) && this.c.equals(swf1Var.c) && this.d == swf1Var.d && this.e == swf1Var.e && this.f.equals(swf1Var.f) && this.g == swf1Var.g && this.h == swf1Var.h && this.i.equals(swf1Var.i) && this.j == swf1Var.j;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + xcg1.g(xcg1.g(ab80.k(this.j, xcg1.g((this.i.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(ab80.k(this.g, (this.f.hashCode() + p3d1.g(this.e, (this.d.hashCode() + xcg1.g((this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, true)) * 31, 961)) * 31, 31), 31, this.h), 31, false), 31, false), 31, false)) * 961, 31, false), 961), 31, false), 31, false);
    }
}
