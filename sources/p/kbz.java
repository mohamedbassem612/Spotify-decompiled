package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kbz {
    public final String a;
    public final i1z b;
    public final List c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final lnn1 g;
    public final h131 h;
    public final boolean i;
    public final iix0 j;
    public final boolean k;

    public kbz(String str, i1z i1zVar, List list, boolean z, boolean z2, int i, lnn1 lnn1Var, h131 h131Var, boolean z3, iix0 iix0Var, boolean z4) {
        this.a = str;
        this.b = i1zVar;
        this.c = list;
        this.d = z;
        this.e = z2;
        this.f = i;
        this.g = lnn1Var;
        this.h = h131Var;
        this.i = z3;
        this.j = iix0Var;
        this.k = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbz)) {
            return false;
        }
        kbz kbzVar = (kbz) obj;
        return u890.j(this.a, kbzVar.a) && u890.j(this.b, kbzVar.b) && u890.j(this.c, kbzVar.c) && this.d == kbzVar.d && this.e == kbzVar.e && this.f == kbzVar.f && this.g.equals(kbzVar.g) && this.h.equals(kbzVar.h) && this.i == kbzVar.i && u890.j(this.j, kbzVar.j) && this.k == kbzVar.k;
    }

    public final int hashCode() {
        String str = this.a;
        int iG = xcg1.g((this.h.hashCode() + ((this.g.hashCode() + kaa0.f(this.f, xcg1.g(xcg1.g(f4i1.b((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31)) * 31)) * 31, 31, this.i);
        iix0 iix0Var = this.j;
        return Boolean.hashCode(this.k) + ((iG + (iix0Var != null ? iix0Var.hashCode() : 0)) * 31);
    }
}
