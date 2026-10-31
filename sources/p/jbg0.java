package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jbg0 {
    public final int a;
    public final String b;
    public final cww0 c;
    public final f6r d;
    public final boolean e;
    public final j7g0 f;
    public final boolean g;
    public final tk h;
    public final i9t0 i;
    public final l6t j;
    public final int k;
    public final e850 l;
    public final int m;
    public final ArrayList n;
    public final boolean o;

    public jbg0(int i, String str, cww0 cww0Var, f6r f6rVar, boolean z, j7g0 j7g0Var, boolean z2, tk tkVar, i9t0 i9t0Var, l6t l6tVar, int i2, e850 e850Var, int i3, ArrayList arrayList, boolean z3) {
        this.a = i;
        this.b = str;
        this.c = cww0Var;
        this.d = f6rVar;
        this.e = z;
        this.f = j7g0Var;
        this.g = z2;
        this.h = tkVar;
        this.i = i9t0Var;
        this.j = l6tVar;
        this.k = i2;
        this.l = e850Var;
        this.m = i3;
        this.n = arrayList;
        this.o = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbg0)) {
            return false;
        }
        jbg0 jbg0Var = (jbg0) obj;
        return this.a == jbg0Var.a && this.b.equals(jbg0Var.b) && this.c.equals(jbg0Var.c) && u890.j(this.d, jbg0Var.d) && this.e == jbg0Var.e && u890.j(this.f, jbg0Var.f) && this.g == jbg0Var.g && u890.j(this.h, jbg0Var.h) && u890.j(this.i, jbg0Var.i) && u890.j(this.j, jbg0Var.j) && this.k == jbg0Var.k && u890.j(this.l, jbg0Var.l) && this.m == jbg0Var.m && this.n.equals(jbg0Var.n) && this.o == jbg0Var.o;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cy30.d(l1d.C(this.a) * 31, 31, this.b)) * 31;
        f6r f6rVar = this.d;
        int iG = xcg1.g((iHashCode + (f6rVar == null ? 0 : f6rVar.hashCode())) * 31, 31, this.e);
        j7g0 j7g0Var = this.f;
        int iG2 = xcg1.g((iG + (j7g0Var == null ? 0 : Boolean.hashCode(j7g0Var.a))) * 31, 31, this.g);
        tk tkVar = this.h;
        int iHashCode2 = (iG2 + (tkVar == null ? 0 : tkVar.hashCode())) * 31;
        i9t0 i9t0Var = this.i;
        int iHashCode3 = (iHashCode2 + (i9t0Var == null ? 0 : i9t0Var.hashCode())) * 31;
        l6t l6tVar = this.j;
        int iC = (iHashCode3 + (l6tVar == null ? 0 : l1d.C(l6tVar.a))) * 31;
        int i = this.k;
        int iC2 = (iC + (i == 0 ? 0 : l1d.C(i))) * 31;
        e850 e850Var = this.l;
        return Boolean.hashCode(this.o) + p3d1.f(this.n, kaa0.f(this.m, (iC2 + (e850Var != null ? Integer.hashCode(e850Var.a) : 0)) * 31, 31), 31);
    }
}
