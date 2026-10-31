package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ca00 {
    public final la00 a;
    public final List b;
    public final List c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final yro0 g;
    public final lto0 h;
    public final hvo0 i;
    public final boolean j;
    public final jmo1 k;
    public final Long l;

    public ca00(la00 la00Var, List list, List list2, boolean z, boolean z2, String str, yro0 yro0Var, lto0 lto0Var, hvo0 hvo0Var, boolean z3, jmo1 jmo1Var, Long l) {
        this.a = la00Var;
        this.b = list;
        this.c = list2;
        this.d = z;
        this.e = z2;
        this.f = str;
        this.g = yro0Var;
        this.h = lto0Var;
        this.i = hvo0Var;
        this.j = z3;
        this.k = jmo1Var;
        this.l = l;
    }

    public static ca00 a(ca00 ca00Var, la00 la00Var, ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2, String str, lto0 lto0Var, hvo0 hvo0Var, boolean z3, jmo1 jmo1Var, Long l, int i) {
        if ((i & 1) != 0) {
            la00Var = ca00Var.a;
        }
        la00 la00Var2 = la00Var;
        List list = arrayList;
        if ((i & 2) != 0) {
            list = ca00Var.b;
        }
        List list2 = list;
        List list3 = (i & 4) != 0 ? ca00Var.c : arrayList2;
        boolean z4 = (i & 8) != 0 ? ca00Var.d : z;
        boolean z5 = (i & 16) != 0 ? ca00Var.e : z2;
        String str2 = (i & 32) != 0 ? ca00Var.f : str;
        yro0 yro0Var = ca00Var.g;
        lto0 lto0Var2 = (i & 128) != 0 ? ca00Var.h : lto0Var;
        hvo0 hvo0Var2 = (i & 256) != 0 ? ca00Var.i : hvo0Var;
        boolean z6 = (i & 512) != 0 ? ca00Var.j : z3;
        jmo1 jmo1Var2 = (i & 1024) != 0 ? ca00Var.k : jmo1Var;
        Long l2 = (i & 2048) != 0 ? ca00Var.l : l;
        ca00Var.getClass();
        return new ca00(la00Var2, list2, list3, z4, z5, str2, yro0Var, lto0Var2, hvo0Var2, z6, jmo1Var2, l2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca00)) {
            return false;
        }
        ca00 ca00Var = (ca00) obj;
        return this.a.equals(ca00Var.a) && u890.j(this.b, ca00Var.b) && u890.j(this.c, ca00Var.c) && this.d == ca00Var.d && this.e == ca00Var.e && u890.j(this.f, ca00Var.f) && this.g.equals(ca00Var.g) && this.h.equals(ca00Var.h) && u890.j(this.i, ca00Var.i) && this.j == ca00Var.j && u890.j(this.k, ca00Var.k) && u890.j(this.l, ca00Var.l);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(f4i1.b(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (this.k.hashCode() + xcg1.g((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((iG + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.j)) * 31;
        Long l = this.l;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }
}
