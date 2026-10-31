package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h230 {
    public final mml a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final z030 e;
    public final i4d0 f;
    public final List g;
    public final int h;

    public h230(mml mmlVar, int i, boolean z, boolean z2, z030 z030Var, i4d0 i4d0Var, List list, int i2) {
        this.a = mmlVar;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = z030Var;
        this.f = i4d0Var;
        this.g = list;
        this.h = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h230)) {
            return false;
        }
        h230 h230Var = (h230) obj;
        return u890.j(this.a, h230Var.a) && this.b == h230Var.b && this.c == h230Var.c && this.d == h230Var.d && this.e.equals(h230Var.e) && this.f.equals(h230Var.f) && this.g.equals(h230Var.g) && this.h == h230Var.h;
    }

    public final int hashCode() {
        return l1d.C(this.h) + f4i1.b((this.f.hashCode() + ((this.e.hashCode() + xcg1.g(xcg1.g(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g);
    }
}
