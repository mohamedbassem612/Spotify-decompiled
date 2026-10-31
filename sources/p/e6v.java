package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/e6v;", "Lp/uim0;", "Lp/l6v;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e6v extends uim0 {
    public static final u1c i = new u1c((byte) 22);
    public final r6v a;
    public final qqq0 b;
    public final boolean c;
    public final idn0 d;
    public final boolean e;
    public final xu30 f;
    public final xu30 g;
    public final boolean h;

    public e6v(r6v r6vVar, qqq0 qqq0Var, boolean z, idn0 idn0Var, boolean z2, xu30 xu30Var, xu30 xu30Var2, boolean z3) {
        this.a = r6vVar;
        this.b = qqq0Var;
        this.c = z;
        this.d = idn0Var;
        this.e = z2;
        this.f = xu30Var;
        this.g = xu30Var2;
        this.h = z3;
    }

    public final pim0 a() {
        l6v l6vVar = new l6v(i, this.c, this.d, this.b);
        l6vVar.j1 = this.a;
        l6vVar.k1 = this.e;
        l6vVar.l1 = this.f;
        l6vVar.m1 = this.g;
        l6vVar.n1 = this.h;
        return l6vVar;
    }

    public final void b(pim0 pim0Var) {
        boolean z;
        boolean z2;
        l6v l6vVar = (l6v) pim0Var;
        r6v r6vVar = l6vVar.j1;
        r6v r6vVar2 = this.a;
        if (u890.j(r6vVar, r6vVar2)) {
            z = false;
        } else {
            l6vVar.j1 = r6vVar2;
            z = true;
        }
        boolean z3 = l6vVar.n1;
        boolean z4 = this.h;
        if (z3 != z4) {
            l6vVar.n1 = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        l6vVar.l1 = this.f;
        l6vVar.m1 = this.g;
        l6vVar.k1 = this.e;
        l6vVar.b2(i, this.c, this.d, this.b, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e6v.class != obj.getClass()) {
            return false;
        }
        e6v e6vVar = (e6v) obj;
        return u890.j(this.a, e6vVar.a) && this.b == e6vVar.b && this.c == e6vVar.c && u890.j(this.d, e6vVar.d) && this.e == e6vVar.e && u890.j(this.f, e6vVar.f) && u890.j(this.g, e6vVar.g) && this.h == e6vVar.h;
    }

    public final int hashCode() {
        int iG = xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        idn0 idn0Var = this.d;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + xcg1.g((iG + (idn0Var != null ? idn0Var.hashCode() : 0)) * 31, 31, this.e)) * 31)) * 31);
    }
}
