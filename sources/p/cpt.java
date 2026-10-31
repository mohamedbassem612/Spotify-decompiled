package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cpt {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final int n;
    public final wia o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f4p;
    public final Set q;

    public cpt(String str, String str2, int i, String str3, String str4, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i4, wia wiaVar, List list, Set set) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = i2;
        this.g = i3;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = i4;
        this.o = wiaVar;
        this.f4p = list;
        this.q = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpt)) {
            return false;
        }
        cpt cptVar = (cpt) obj;
        return u890.j(this.a, cptVar.a) && u890.j(this.b, cptVar.b) && this.c == cptVar.c && this.d.equals(cptVar.d) && u890.j(this.e, cptVar.e) && this.f == cptVar.f && this.g == cptVar.g && this.h == cptVar.h && this.i == cptVar.i && this.j == cptVar.j && this.k == cptVar.k && this.l == cptVar.l && this.m == cptVar.m && this.n == cptVar.n && this.o == cptVar.o && this.f4p.equals(cptVar.f4p) && this.q.equals(cptVar.q);
    }

    public final int hashCode() {
        int iD = cy30.d(ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        String str = this.e;
        return this.q.hashCode() + f4i1.b((this.o.hashCode() + ab80.k(this.n, xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(kaa0.f(this.g, kaa0.f(this.f, (iD + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31)) * 31, 31, this.f4p);
    }
}
