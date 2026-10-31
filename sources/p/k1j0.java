package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k1j0 implements w1j0 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final boolean d;
    public final String e;
    public final String f;
    public final w4i1 g;
    public final long h;
    public final j1j0 i;
    public final List j;
    public final t1j0 k;
    public final boolean l;

    public k1j0(String str, String str2, ArrayList arrayList, boolean z, String str3, String str4, w4i1 w4i1Var, long j, j1j0 j1j0Var, List list, t1j0 t1j0Var, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = z;
        this.e = str3;
        this.f = str4;
        this.g = w4i1Var;
        this.h = j;
        this.i = j1j0Var;
        this.j = list;
        this.k = t1j0Var;
        this.l = z2;
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
        if (!(obj instanceof k1j0)) {
            return false;
        }
        k1j0 k1j0Var = (k1j0) obj;
        return u890.j(this.a, k1j0Var.a) && u890.j(this.b, k1j0Var.b) && this.c.equals(k1j0Var.c) && this.d == k1j0Var.d && u890.j(this.e, k1j0Var.e) && u890.j(this.f, k1j0Var.f) && u890.j(this.g, k1j0Var.g) && this.h == k1j0Var.h && this.i.equals(k1j0Var.i) && u890.j(this.j, k1j0Var.j) && this.k.equals(k1j0Var.k) && this.l == k1j0Var.l;
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
        return Boolean.hashCode(this.l) + ((this.k.hashCode() + f4i1.b((this.i.hashCode() + cy30.f(ydh.d(this.g, cy30.d(cy30.d(xcg1.g(p3d1.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31), this.h, 31)) * 31, 31, this.j)) * 31);
    }
}
