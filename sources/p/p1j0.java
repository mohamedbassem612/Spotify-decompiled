package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class p1j0 implements w1j0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final bc71 d;
    public final String e;
    public final String f;
    public final w4i1 g;
    public final long h;
    public final j1j0 i;
    public final List j;
    public final t1j0 k;
    public final boolean l;
    public final tom m;
    public final List n;

    public p1j0(String str, String str2, boolean z, bc71 bc71Var, String str3, String str4, w4i1 w4i1Var, long j, j1j0 j1j0Var, List list, t1j0 t1j0Var, boolean z2, tom tomVar, List list2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = bc71Var;
        this.e = str3;
        this.f = str4;
        this.g = w4i1Var;
        this.h = j;
        this.i = j1j0Var;
        this.j = list;
        this.k = t1j0Var;
        this.l = z2;
        this.m = tomVar;
        this.n = list2;
    }

    @Override // p.w1j0
    public final List a() {
        return this.j;
    }

    @Override // p.w1j0
    public final long b() {
        return this.h;
    }

    @Override // p.w1j0
    public final boolean c() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1j0)) {
            return false;
        }
        p1j0 p1j0Var = (p1j0) obj;
        return u890.j(this.a, p1j0Var.a) && u890.j(this.b, p1j0Var.b) && this.c == p1j0Var.c && u890.j(this.d, p1j0Var.d) && u890.j(this.e, p1j0Var.e) && u890.j(this.f, p1j0Var.f) && u890.j(this.g, p1j0Var.g) && this.h == p1j0Var.h && this.i.equals(p1j0Var.i) && u890.j(this.j, p1j0Var.j) && this.k.equals(p1j0Var.k) && this.l == p1j0Var.l && this.m.equals(p1j0Var.m) && u890.j(this.n, p1j0Var.n);
    }

    public final String getId() {
        return this.e;
    }

    @Override // p.w1j0
    public final j1j0 getModerationStatus() {
        return this.i;
    }

    @Override // p.w1j0
    public final w4i1 getSender() {
        return this.g;
    }

    @Override // p.w1j0
    public final t1j0 getState() {
        return this.k;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.n.hashCode() + ((this.m.hashCode() + xcg1.g((this.k.hashCode() + f4i1.b((this.i.hashCode() + cy30.f(ydh.d(this.g, cy30.d(cy30.d((this.d.hashCode() + xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c)) * 31, 31, this.e), 31, this.f), 31), this.h, 31)) * 31, 31, this.j)) * 31, 31, this.l)) * 31);
    }
}
