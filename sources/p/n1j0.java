package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n1j0 implements w1j0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final tom e;
    public final String f;
    public final String g;
    public final w4i1 h;
    public final long i;
    public final j1j0 j;
    public final List k;
    public final t1j0 l;
    public final boolean m;

    public n1j0(String str, String str2, String str3, String str4, tom tomVar, String str5, String str6, w4i1 w4i1Var, long j, j1j0 j1j0Var, List list, t1j0 t1j0Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = tomVar;
        this.f = str5;
        this.g = str6;
        this.h = w4i1Var;
        this.i = j;
        this.j = j1j0Var;
        this.k = list;
        this.l = t1j0Var;
        this.m = z;
    }

    @Override // p.w1j0
    public final List a() {
        return this.k;
    }

    @Override // p.w1j0
    public final long b() {
        return this.i;
    }

    @Override // p.w1j0
    public final boolean c() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1j0)) {
            return false;
        }
        n1j0 n1j0Var = (n1j0) obj;
        return u890.j(this.a, n1j0Var.a) && u890.j(this.b, n1j0Var.b) && u890.j(this.c, n1j0Var.c) && u890.j(this.d, n1j0Var.d) && this.e.equals(n1j0Var.e) && u890.j(this.f, n1j0Var.f) && u890.j(this.g, n1j0Var.g) && u890.j(this.h, n1j0Var.h) && this.i == n1j0Var.i && this.j.equals(n1j0Var.j) && u890.j(this.k, n1j0Var.k) && this.l.equals(n1j0Var.l) && this.m == n1j0Var.m;
    }

    public final String getId() {
        return this.f;
    }

    @Override // p.w1j0
    public final j1j0 getModerationStatus() {
        return this.j;
    }

    @Override // p.w1j0
    public final w4i1 getSender() {
        return this.h;
    }

    @Override // p.w1j0
    public final t1j0 getState() {
        return this.l;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.m) + ((this.l.hashCode() + f4i1.b((this.j.hashCode() + cy30.f(ydh.d(this.h, cy30.d(cy30.d((this.e.hashCode() + cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31, 31, this.f), 31, this.g), 31), this.i, 31)) * 31, 31, this.k)) * 31);
    }
}
