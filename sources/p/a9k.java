package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a9k {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final List e;
    public final int f;
    public final i5d g;
    public final boolean h;
    public final String i;
    public final f8k j;
    public final boolean k;
    public final boolean l;
    public final u7h m;
    public final u7h n;
    public final wr21 o;

    public a9k(String str, String str2, String str3, boolean z, List list, int i, i5d i5dVar, boolean z2, String str4, f8k f8kVar, boolean z3, boolean z4, u7h u7hVar, u7h u7hVar2, wr21 wr21Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = list;
        this.f = i;
        this.g = i5dVar;
        this.h = z2;
        this.i = str4;
        this.j = f8kVar;
        this.k = z3;
        this.l = z4;
        this.m = u7hVar;
        this.n = u7hVar2;
        this.o = wr21Var;
    }

    public static a9k a(a9k a9kVar, String str, List list, int i, i5d i5dVar, boolean z, String str2, f8k f8kVar, boolean z2, boolean z3, u7h u7hVar, u7h u7hVar2, wr21 wr21Var, int i2) {
        return new a9k((i2 & 1) != 0 ? a9kVar.a : str, (i2 & 2) != 0 ? a9kVar.b : null, (i2 & 4) != 0 ? a9kVar.c : null, (i2 & 8) != 0 ? a9kVar.d : false, (i2 & 16) != 0 ? a9kVar.e : list, (i2 & 32) != 0 ? a9kVar.f : i, (i2 & 64) != 0 ? a9kVar.g : i5dVar, (i2 & 128) != 0 ? a9kVar.h : z, (i2 & 256) != 0 ? a9kVar.i : str2, (i2 & 512) != 0 ? a9kVar.j : f8kVar, (i2 & 1024) != 0 ? a9kVar.k : z2, (i2 & 2048) != 0 ? a9kVar.l : z3, (i2 & 4096) != 0 ? a9kVar.m : u7hVar, (i2 & 8192) != 0 ? a9kVar.n : u7hVar2, (i2 & 16384) != 0 ? a9kVar.o : wr21Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9k)) {
            return false;
        }
        a9k a9kVar = (a9k) obj;
        return u890.j(this.a, a9kVar.a) && u890.j(this.b, a9kVar.b) && u890.j(this.c, a9kVar.c) && this.d == a9kVar.d && u890.j(this.e, a9kVar.e) && this.f == a9kVar.f && u890.j(this.g, a9kVar.g) && this.h == a9kVar.h && u890.j(this.i, a9kVar.i) && u890.j(this.j, a9kVar.j) && this.k == a9kVar.k && this.l == a9kVar.l && u890.j(this.m, a9kVar.m) && u890.j(this.n, a9kVar.n) && u890.j(this.o, a9kVar.o);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iF = kaa0.f(this.f, f4i1.b(xcg1.g((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31, this.e), 31);
        i5d i5dVar = this.g;
        int iG = xcg1.g((iF + (i5dVar == null ? 0 : i5dVar.hashCode())) * 31, 31, this.h);
        String str3 = this.i;
        int iHashCode3 = (iG + (str3 == null ? 0 : str3.hashCode())) * 31;
        f8k f8kVar = this.j;
        int iG2 = xcg1.g(xcg1.g((iHashCode3 + (f8kVar == null ? 0 : f8kVar.hashCode())) * 31, 31, this.k), 31, this.l);
        u7h u7hVar = this.m;
        int iHashCode4 = (iG2 + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a))) * 31;
        u7h u7hVar2 = this.n;
        int iHashCode5 = (iHashCode4 + (u7hVar2 == null ? 0 : Long.hashCode(u7hVar2.a))) * 31;
        wr21 wr21Var = this.o;
        return iHashCode5 + (wr21Var != null ? wr21Var.hashCode() : 0);
    }
}
