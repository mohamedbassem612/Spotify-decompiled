package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l1j0 implements w1j0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final tom f;
    public final String g;
    public final String h;
    public final w4i1 i;
    public final long j;
    public final j1j0 k;
    public final List l;
    public final t1j0 m;
    public final boolean n;

    public l1j0(String str, String str2, String str3, String str4, String str5, tom tomVar, String str6, String str7, w4i1 w4i1Var, long j, j1j0 j1j0Var, List list, t1j0 t1j0Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = tomVar;
        this.g = str6;
        this.h = str7;
        this.i = w4i1Var;
        this.j = j;
        this.k = j1j0Var;
        this.l = list;
        this.m = t1j0Var;
        this.n = z;
    }

    @Override // p.w1j0
    public final List a() {
        return this.l;
    }

    @Override // p.w1j0
    public final long b() {
        return this.j;
    }

    @Override // p.w1j0
    public final boolean c() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1j0)) {
            return false;
        }
        l1j0 l1j0Var = (l1j0) obj;
        return u890.j(this.a, l1j0Var.a) && u890.j(this.b, l1j0Var.b) && u890.j(this.c, l1j0Var.c) && u890.j(this.d, l1j0Var.d) && u890.j(this.e, l1j0Var.e) && this.f.equals(l1j0Var.f) && u890.j(this.g, l1j0Var.g) && u890.j(this.h, l1j0Var.h) && u890.j(this.i, l1j0Var.i) && this.j == l1j0Var.j && this.k.equals(l1j0Var.k) && u890.j(this.l, l1j0Var.l) && this.m.equals(l1j0Var.m) && this.n == l1j0Var.n;
    }

    public final String getId() {
        return this.g;
    }

    @Override // p.w1j0
    public final j1j0 getModerationStatus() {
        return this.k;
    }

    @Override // p.w1j0
    public final w4i1 getSender() {
        return this.i;
    }

    @Override // p.w1j0
    public final t1j0 getState() {
        return this.m;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.n) + ((this.m.hashCode() + f4i1.b((this.k.hashCode() + cy30.f(ydh.d(this.i, cy30.d(cy30.d((this.f.hashCode() + cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e)) * 31, 31, this.g), 31, this.h), 31), this.j, 31)) * 31, 31, this.l)) * 31);
    }
}
