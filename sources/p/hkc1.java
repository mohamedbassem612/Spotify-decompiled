package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hkc1 {
    public final boolean a;
    public final boolean b;
    public final Object c;
    public final List d;
    public final Object e;
    public final s69 f;
    public final s69 g;
    public final Object h;
    public final String i;
    public final iu30 j;
    public final xu30 k;
    public final vu30 l;
    public final zu30 m;

    public hkc1(boolean z, boolean z2, Object obj, List list, Object obj2, s69 s69Var, s69 s69Var2, Object obj3, String str, iu30 iu30Var, xu30 xu30Var, vu30 vu30Var, zu30 zu30Var) {
        this.a = z;
        this.b = z2;
        this.c = obj;
        this.d = list;
        this.e = obj2;
        this.f = s69Var;
        this.g = s69Var2;
        this.h = obj3;
        this.i = str;
        this.j = iu30Var;
        this.k = xu30Var;
        this.l = vu30Var;
        this.m = zu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkc1)) {
            return false;
        }
        hkc1 hkc1Var = (hkc1) obj;
        return this.a == hkc1Var.a && this.b == hkc1Var.b && u890.j(this.c, hkc1Var.c) && u890.j(this.d, hkc1Var.d) && u890.j(this.e, hkc1Var.e) && u890.j(this.f, hkc1Var.f) && u890.j(this.g, hkc1Var.g) && u890.j(this.h, hkc1Var.h) && this.i.equals(hkc1Var.i) && u890.j(this.j, hkc1Var.j) && this.k.equals(hkc1Var.k) && u890.j(this.l, hkc1Var.l) && u890.j(this.m, hkc1Var.m);
    }

    public final int hashCode() {
        int iG = xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
        Object obj = this.c;
        int iB = f4i1.b((iG + (obj == null ? 0 : obj.hashCode())) * 31, 31, this.d);
        Object obj2 = this.e;
        int iHashCode = (iB + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        s69 s69Var = this.f;
        int iHashCode2 = (iHashCode + (s69Var == null ? 0 : s69Var.hashCode())) * 31;
        s69 s69Var2 = this.g;
        int iHashCode3 = (iHashCode2 + (s69Var2 == null ? 0 : s69Var2.hashCode())) * 31;
        Object obj3 = this.h;
        return this.m.hashCode() + hrt.g((this.k.hashCode() + ktd.g(this.j, cy30.d((iHashCode3 + (obj3 != null ? obj3.hashCode() : 0)) * 31, 31, this.i), 31)) * 31, 31, this.l);
    }
}
