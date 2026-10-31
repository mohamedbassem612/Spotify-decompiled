package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mdz implements ez00 {
    public final y6b1 a;
    public final String b;
    public final String c;
    public final kdz d;
    public final den e;
    public final List f;
    public final List g;
    public final List h;
    public final boolean i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final long n;
    public final idz o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f73p;
    public final String q;
    public final String r;
    public final String s;
    public final idd1 t = new idd1(new pdy(this, (byte) 14));

    public mdz(y6b1 y6b1Var, String str, String str2, kdz kdzVar, den denVar, List list, List list2, List list3, boolean z, int i, boolean z2, boolean z3, String str3, long j, idz idzVar, List list4, String str4, String str5, String str6) {
        this.a = y6b1Var;
        this.b = str;
        this.c = str2;
        this.d = kdzVar;
        this.e = denVar;
        this.f = list;
        this.g = list2;
        this.h = list3;
        this.i = z;
        this.j = i;
        this.k = z2;
        this.l = z3;
        this.m = str3;
        this.n = j;
        this.o = idzVar;
        this.f73p = list4;
        this.q = str4;
        this.r = str5;
        this.s = str6;
    }

    public final Set a() {
        return (Set) this.t.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mdz)) {
            return false;
        }
        mdz mdzVar = (mdz) obj;
        return this.a.equals(mdzVar.a) && this.b.equals(mdzVar.b) && this.c.equals(mdzVar.c) && u890.j(this.d, mdzVar.d) && this.e.equals(mdzVar.e) && this.f.equals(mdzVar.f) && this.g.equals(mdzVar.g) && u890.j(this.h, mdzVar.h) && this.i == mdzVar.i && this.j == mdzVar.j && this.k == mdzVar.k && this.l == mdzVar.l && this.m.equals(mdzVar.m) && this.n == mdzVar.n && this.o.equals(mdzVar.o) && this.f73p.equals(mdzVar.f73p) && this.q.equals(mdzVar.q) && this.r.equals(mdzVar.r) && this.s.equals(mdzVar.s);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        kdz kdzVar = this.d;
        return this.s.hashCode() + cy30.d(cy30.d(f4i1.b((this.o.hashCode() + cy30.f(cy30.d(xcg1.g(xcg1.g(ab80.k(this.j, xcg1.g(f4i1.b(f4i1.b(f4i1.b((this.e.hashCode() + ((iD + (kdzVar == null ? 0 : kdzVar.hashCode())) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31, this.k), 31, this.l), 31, this.m), this.n, 31)) * 31, 31, this.f73p), 31, this.q), 31, this.r);
    }
}
