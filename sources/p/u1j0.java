package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class u1j0 implements w1j0 {
    public final String a;
    public final Integer b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final w4i1 g;
    public final long h;
    public final j1j0 i;
    public final List j;
    public final t1j0 k;
    public final boolean l;

    public u1j0(String str, Integer num, String str2, String str3, String str4, String str5, w4i1 w4i1Var, long j, j1j0 j1j0Var, List list, t1j0 t1j0Var, boolean z) {
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = w4i1Var;
        this.h = j;
        this.i = j1j0Var;
        this.j = list;
        this.k = t1j0Var;
        this.l = z;
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
        if (!(obj instanceof u1j0)) {
            return false;
        }
        u1j0 u1j0Var = (u1j0) obj;
        return u890.j(this.a, u1j0Var.a) && u890.j(this.b, u1j0Var.b) && u890.j(this.c, u1j0Var.c) && u890.j(this.d, u1j0Var.d) && u890.j(this.e, u1j0Var.e) && u890.j(this.f, u1j0Var.f) && u890.j(this.g, u1j0Var.g) && this.h == u1j0Var.h && this.i.equals(u1j0Var.i) && u890.j(this.j, u1j0Var.j) && this.k.equals(u1j0Var.k) && this.l == u1j0Var.l;
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
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return Boolean.hashCode(this.l) + ((this.k.hashCode() + f4i1.b((this.i.hashCode() + cy30.f(ydh.d(this.g, cy30.d(cy30.d((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31), this.h, 31)) * 31, 31, this.j)) * 31);
    }
}
