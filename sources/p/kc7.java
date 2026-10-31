package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kc7 {
    public final String a;
    public final i b;
    public final List c;
    public final boolean d;
    public final sfu0 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final fsk0 k;
    public final qb7 l;
    public final y77 m;
    public final z77 n;
    public final y77 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y77 f34p;

    public kc7(String str, i iVar, List list, boolean z, sfu0 sfu0Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, fsk0 fsk0Var, qb7 qb7Var, y77 y77Var, z77 z77Var, y77 y77Var2, y77 y77Var3) {
        this.a = str;
        this.b = iVar;
        this.c = list;
        this.d = z;
        this.e = sfu0Var;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = fsk0Var;
        this.l = qb7Var;
        this.m = y77Var;
        this.n = z77Var;
        this.o = y77Var2;
        this.f34p = y77Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kc7) {
            kc7 kc7Var = (kc7) obj;
            return this.a.equals(kc7Var.a) && this.b.equals(kc7Var.b) && this.c.equals(kc7Var.c) && this.d == kc7Var.d && this.e.equals(kc7Var.e) && this.f == kc7Var.f && this.g == kc7Var.g && this.h == kc7Var.h && this.i == kc7Var.i && this.j == kc7Var.j && this.k == kc7Var.k && this.l == kc7Var.l && this.m == kc7Var.m && this.n == kc7Var.n && this.o == kc7Var.o && this.f34p == kc7Var.f34p;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.e.hashCode() + xcg1.g(f4i1.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
