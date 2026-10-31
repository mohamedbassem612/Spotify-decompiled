package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zkn implements bln {
    public final String a;
    public final List b;
    public final t7q0 c;
    public final boolean d;
    public final String e;
    public final String f;
    public final Map g;
    public final int h;
    public final w4i1 i;
    public final boolean j;
    public final boolean k;

    public zkn(String str, List list, t7q0 t7q0Var, boolean z, String str2, String str3, Map map, int i, w4i1 w4i1Var, boolean z2, boolean z3) {
        this.a = str;
        this.b = list;
        this.c = t7q0Var;
        this.d = z;
        this.e = str2;
        this.f = str3;
        this.g = map;
        this.h = i;
        this.i = w4i1Var;
        this.j = z2;
        this.k = z3;
    }

    public static zkn d(zkn zknVar, List list, String str, String str2, Map map, int i, w4i1 w4i1Var, boolean z, boolean z2, int i2) {
        String str3 = zknVar.a;
        if ((i2 & 2) != 0) {
            list = zknVar.b;
        }
        List list2 = list;
        t7q0 t7q0Var = zknVar.c;
        boolean z3 = zknVar.d;
        if ((i2 & 16) != 0) {
            str = zknVar.e;
        }
        return new zkn(str3, list2, t7q0Var, z3, str, (i2 & 32) != 0 ? zknVar.f : str2, (i2 & 64) != 0 ? zknVar.g : map, (i2 & 128) != 0 ? zknVar.h : i, (i2 & 256) != 0 ? zknVar.i : w4i1Var, (i2 & 512) != 0 ? zknVar.j : z, (i2 & 1024) != 0 ? zknVar.k : z2);
    }

    public final Map a() {
        return this.g;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkn)) {
            return false;
        }
        zkn zknVar = (zkn) obj;
        return u890.j(this.a, zknVar.a) && u890.j(this.b, zknVar.b) && u890.j(this.c, zknVar.c) && this.d == zknVar.d && u890.j(this.e, zknVar.e) && u890.j(this.f, zknVar.f) && u890.j(this.g, zknVar.g) && this.h == zknVar.h && u890.j(this.i, zknVar.i) && this.j == zknVar.j && this.k == zknVar.k;
    }

    public final int hashCode() {
        int iG = xcg1.g((this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return Boolean.hashCode(this.k) + xcg1.g(ydh.d(this.i, ab80.k(this.h, cy30.e((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.g), 31), 31), 31, this.j);
    }
}
