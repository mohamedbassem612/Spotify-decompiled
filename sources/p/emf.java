package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class emf {
    public final ctf a;
    public final String b;
    public final jwm c;
    public final List d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f6p;
    public final boolean q;

    public emf(ctf ctfVar, String str, jwm jwmVar, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.a = ctfVar;
        this.b = str;
        this.c = jwmVar;
        this.d = list;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = z9;
        this.n = z10;
        this.o = z11;
        this.f6p = z12;
        this.q = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emf)) {
            return false;
        }
        emf emfVar = (emf) obj;
        return u890.j(this.a, emfVar.a) && this.b.equals(emfVar.b) && u890.j(this.c, emfVar.c) && u890.j(this.d, emfVar.d) && this.e == emfVar.e && this.f == emfVar.f && this.g == emfVar.g && this.h == emfVar.h && this.i == emfVar.i && this.j == emfVar.j && this.k == emfVar.k && this.l == emfVar.l && this.m == emfVar.m && this.n == emfVar.n && this.o == emfVar.o && this.f6p == emfVar.f6p && this.q == emfVar.q;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        jwm jwmVar = this.c;
        return Boolean.hashCode(this.q) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(f4i1.b((iD + (jwmVar == null ? 0 : jwmVar.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.f6p);
    }
}
