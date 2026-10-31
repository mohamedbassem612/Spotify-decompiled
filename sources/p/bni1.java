package p;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bni1 {
    public final int a;
    public final List b;
    public final Boolean c;
    public final String d;
    public final b5i1 e;
    public final m4o0 f;
    public final int g;
    public final Set h;
    public final Set i;
    public final Map j;
    public final bh41 k;
    public final boolean l;
    public final String m;

    public bni1(int i, List list, Boolean bool, String str, b5i1 b5i1Var, m4o0 m4o0Var, int i2, Set set, Set set2, Map map, bh41 bh41Var, boolean z, String str2) {
        this.a = i;
        this.b = list;
        this.c = bool;
        this.d = str;
        this.e = b5i1Var;
        this.f = m4o0Var;
        this.g = i2;
        this.h = set;
        this.i = set2;
        this.j = map;
        this.k = bh41Var;
        this.l = z;
        this.m = str2;
    }

    public static bni1 a(bni1 bni1Var, List list, Boolean bool, String str, b5i1 b5i1Var, m4o0 m4o0Var, int i, Set set, Set set2, Map map, bh41 bh41Var, String str2, int i2) {
        int i3 = bni1Var.a;
        List list2 = (i2 & 2) != 0 ? bni1Var.b : list;
        Boolean bool2 = (i2 & 4) != 0 ? bni1Var.c : bool;
        String str3 = (i2 & 8) != 0 ? bni1Var.d : str;
        b5i1 b5i1Var2 = (i2 & 16) != 0 ? bni1Var.e : b5i1Var;
        m4o0 m4o0Var2 = (i2 & 32) != 0 ? bni1Var.f : m4o0Var;
        int i4 = (i2 & 64) != 0 ? bni1Var.g : i;
        Set set3 = (i2 & 128) != 0 ? bni1Var.h : set;
        Set set4 = (i2 & 256) != 0 ? bni1Var.i : set2;
        Map map2 = (i2 & 512) != 0 ? bni1Var.j : map;
        bh41 bh41Var2 = (i2 & 1024) != 0 ? bni1Var.k : bh41Var;
        boolean z = bni1Var.l;
        String str4 = (i2 & 4096) != 0 ? bni1Var.m : str2;
        bni1Var.getClass();
        return new bni1(i3, list2, bool2, str3, b5i1Var2, m4o0Var2, i4, set3, set4, map2, bh41Var2, z, str4);
    }

    public final boolean b() {
        return ((this.f instanceof k4o0) || u890.j(this.c, Boolean.FALSE) || this.g != 0 || (this.k instanceof zg41)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bni1)) {
            return false;
        }
        bni1 bni1Var = (bni1) obj;
        return this.a == bni1Var.a && u890.j(this.b, bni1Var.b) && u890.j(this.c, bni1Var.c) && u890.j(this.d, bni1Var.d) && u890.j(this.e, bni1Var.e) && u890.j(this.f, bni1Var.f) && this.g == bni1Var.g && u890.j(this.h, bni1Var.h) && u890.j(this.i, bni1Var.i) && u890.j(this.j, bni1Var.j) && u890.j(this.k, bni1Var.k) && this.l == bni1Var.l && u890.j(this.m, bni1Var.m);
    }

    public final int hashCode() {
        int iB = f4i1.b(l1d.C(this.a) * 31, 31, this.b);
        Boolean bool = this.c;
        int iHashCode = (iB + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        b5i1 b5i1Var = this.e;
        int iHashCode3 = (iHashCode2 + (b5i1Var == null ? 0 : b5i1Var.hashCode())) * 31;
        m4o0 m4o0Var = this.f;
        int iHashCode4 = (iHashCode3 + (m4o0Var == null ? 0 : m4o0Var.hashCode())) * 31;
        int i = this.g;
        int iG = xcg1.g((this.k.hashCode() + cy30.e(gvg.c(gvg.c((iHashCode4 + (i == 0 ? 0 : l1d.C(i))) * 31, 31, this.h), 31, this.i), 31, this.j)) * 31, 31, this.l);
        String str2 = this.m;
        return iG + (str2 != null ? str2.hashCode() : 0);
    }
}
