package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zu01 {
    public final List a;
    public final int b;
    public final int c;
    public final List d;
    public final m9m e;
    public final br01 f;
    public final lsg g;
    public final lsg h;
    public final boolean i;
    public final List j;
    public final boolean k;

    public zu01(List list, int i, int i2, List list2, m9m m9mVar, br01 br01Var, lsg lsgVar, lsg lsgVar2, boolean z, List list3, boolean z2) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = list2;
        this.e = m9mVar;
        this.f = br01Var;
        this.g = lsgVar;
        this.h = lsgVar2;
        this.i = z;
        this.j = list3;
        this.k = z2;
    }

    public static zu01 a(zu01 zu01Var, List list, int i, int i2, List list2, m9m m9mVar, br01 br01Var, tr80 tr80Var, boolean z, List list3, boolean z2, int i3) {
        if ((i3 & 1) != 0) {
            list = zu01Var.a;
        }
        List list4 = list;
        if ((i3 & 2) != 0) {
            i = zu01Var.b;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = zu01Var.c;
        }
        int i5 = i2;
        List list5 = (i3 & 8) != 0 ? zu01Var.d : list2;
        m9m m9mVar2 = (i3 & 16) != 0 ? zu01Var.e : m9mVar;
        br01 br01Var2 = (i3 & 32) != 0 ? zu01Var.f : br01Var;
        tr80 tr80Var2 = (i3 & 64) != 0 ? zu01Var.g : tr80Var;
        lsg lsgVar = zu01Var.h;
        boolean z3 = (i3 & 256) != 0 ? zu01Var.i : z;
        List list6 = (i3 & 512) != 0 ? zu01Var.j : list3;
        boolean z4 = (i3 & 1024) != 0 ? zu01Var.k : z2;
        zu01Var.getClass();
        return new zu01(list4, i4, i5, list5, m9mVar2, br01Var2, tr80Var2, lsgVar, z3, list6, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu01)) {
            return false;
        }
        zu01 zu01Var = (zu01) obj;
        return u890.j(this.a, zu01Var.a) && this.b == zu01Var.b && this.c == zu01Var.c && u890.j(this.d, zu01Var.d) && this.e == zu01Var.e && this.f == zu01Var.f && u890.j(this.g, zu01Var.g) && u890.j(this.h, zu01Var.h) && this.i == zu01Var.i && u890.j(this.j, zu01Var.j) && this.k == zu01Var.k;
    }

    public final int hashCode() {
        int iB = f4i1.b(kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
        m9m m9mVar = this.e;
        int iHashCode = (iB + (m9mVar == null ? 0 : m9mVar.hashCode())) * 31;
        br01 br01Var = this.f;
        int iHashCode2 = (iHashCode + (br01Var == null ? 0 : br01Var.hashCode())) * 31;
        lsg lsgVar = this.g;
        int iHashCode3 = (iHashCode2 + (lsgVar == null ? 0 : lsgVar.hashCode())) * 31;
        lsg lsgVar2 = this.h;
        return Boolean.hashCode(this.k) + f4i1.b(xcg1.g((iHashCode3 + (lsgVar2 != null ? lsgVar2.hashCode() : 0)) * 31, 31, this.i), 31, this.j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ zu01(int i, tr80 tr80Var) {
        tr80Var = (i & 64) != 0 ? null : tr80Var;
        z6x z6xVar = z6x.a;
        this(z6xVar, 0, 0, z6xVar, null, null, tr80Var, null, false, z6xVar, false);
    }
}
