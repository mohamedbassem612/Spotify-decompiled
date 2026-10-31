package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uf20 {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final vod1 f;
    public final c380 g;
    public final c380 h;
    public final List i;
    public final List j;

    public uf20(int i, int i2, boolean z, boolean z2, boolean z3, vod1 vod1Var, c380 c380Var, c380 c380Var2, List list, List list2) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = vod1Var;
        this.g = c380Var;
        this.h = c380Var2;
        this.i = list;
        this.j = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf20)) {
            return false;
        }
        uf20 uf20Var = (uf20) obj;
        return this.a == uf20Var.a && this.b == uf20Var.b && this.c == uf20Var.c && this.d == uf20Var.d && this.e == uf20Var.e && u890.j(this.f, uf20Var.f) && u890.j(this.g, uf20Var.g) && u890.j(this.h, uf20Var.h) && u890.j(this.i, uf20Var.i) && u890.j(this.j, uf20Var.j);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
        vod1 vod1Var = this.f;
        return this.j.hashCode() + f4i1.b(kk0.f(this.h, kk0.f(this.g, (iG + (vod1Var == null ? 0 : vod1Var.hashCode())) * 31, 31), 31), 31, this.i);
    }
}
