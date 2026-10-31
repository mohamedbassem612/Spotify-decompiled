package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m1j0 implements w1j0 {
    public final String a;
    public final String b;
    public final tom c;
    public final String d;
    public final String e;
    public final w4i1 f;
    public final long g;
    public final j1j0 h;
    public final List i;
    public final t1j0 j;
    public final boolean k;

    public m1j0(String str, String str2, tom tomVar, String str3, String str4, w4i1 w4i1Var, long j, j1j0 j1j0Var, List list, t1j0 t1j0Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = tomVar;
        this.d = str3;
        this.e = str4;
        this.f = w4i1Var;
        this.g = j;
        this.h = j1j0Var;
        this.i = list;
        this.j = t1j0Var;
        this.k = z;
    }

    @Override // p.w1j0
    public final List a() {
        return this.i;
    }

    @Override // p.w1j0
    public final long b() {
        return this.g;
    }

    @Override // p.w1j0
    public final boolean c() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1j0)) {
            return false;
        }
        m1j0 m1j0Var = (m1j0) obj;
        return u890.j(this.a, m1j0Var.a) && u890.j(this.b, m1j0Var.b) && this.c.equals(m1j0Var.c) && u890.j(this.d, m1j0Var.d) && u890.j(this.e, m1j0Var.e) && u890.j(this.f, m1j0Var.f) && this.g == m1j0Var.g && this.h.equals(m1j0Var.h) && u890.j(this.i, m1j0Var.i) && this.j.equals(m1j0Var.j) && this.k == m1j0Var.k;
    }

    public final String getId() {
        return this.d;
    }

    @Override // p.w1j0
    public final j1j0 getModerationStatus() {
        return this.h;
    }

    @Override // p.w1j0
    public final w4i1 getSender() {
        return this.f;
    }

    @Override // p.w1j0
    public final t1j0 getState() {
        return this.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + ((this.j.hashCode() + f4i1.b((this.h.hashCode() + cy30.f(ydh.d(this.f, cy30.d(cy30.d((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31), this.g, 31)) * 31, 31, this.i)) * 31);
    }
}
