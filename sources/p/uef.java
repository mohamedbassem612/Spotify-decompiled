package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uef {
    public final cso1 a;
    public final String b;
    public final ctf c;
    public final Integer d;
    public final boolean e;
    public final jwm f;
    public final b2j0 g;
    public final List h;
    public final t7q0 i;
    public final w4i1 j;
    public final fef k;
    public final boolean l;
    public final uu2 m;
    public final h5f n;
    public final List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zks0 f35p;
    public final int q;
    public final boolean r;

    public uef(cso1 cso1Var, String str, ctf ctfVar, Integer num, boolean z, jwm jwmVar, b2j0 b2j0Var, List list, t7q0 t7q0Var, w4i1 w4i1Var, fef fefVar, boolean z2, uu2 uu2Var, h5f h5fVar, List list2, zks0 zks0Var, int i, boolean z3) {
        this.a = cso1Var;
        this.b = str;
        this.c = ctfVar;
        this.d = num;
        this.e = z;
        this.f = jwmVar;
        this.g = b2j0Var;
        this.h = list;
        this.i = t7q0Var;
        this.j = w4i1Var;
        this.k = fefVar;
        this.l = z2;
        this.m = uu2Var;
        this.n = h5fVar;
        this.o = list2;
        this.f35p = zks0Var;
        this.q = i;
        this.r = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uef)) {
            return false;
        }
        uef uefVar = (uef) obj;
        return this.a.equals(uefVar.a) && u890.j(this.b, uefVar.b) && u890.j(this.c, uefVar.c) && u890.j(this.d, uefVar.d) && this.e == uefVar.e && u890.j(this.f, uefVar.f) && this.g.equals(uefVar.g) && this.h.equals(uefVar.h) && u890.j(this.i, uefVar.i) && u890.j(this.j, uefVar.j) && this.k.equals(uefVar.k) && this.l == uefVar.l && u890.j(this.m, uefVar.m) && this.n == uefVar.n && u890.j(this.o, uefVar.o) && u890.j(this.f35p, uefVar.f35p) && this.q == uefVar.q && this.r == uefVar.r;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        Integer num = this.d;
        int iB = f4i1.b((this.g.hashCode() + ((this.f.hashCode() + xcg1.g((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.e)) * 31)) * 31, 31, this.h);
        t7q0 t7q0Var = this.i;
        int iHashCode2 = (iB + (t7q0Var == null ? 0 : t7q0Var.hashCode())) * 31;
        w4i1 w4i1Var = this.j;
        return Boolean.hashCode(this.r) + ab80.k(this.q, (this.f35p.hashCode() + f4i1.b((this.n.hashCode() + ((this.m.hashCode() + xcg1.g((this.k.hashCode() + ((iHashCode2 + (w4i1Var != null ? w4i1Var.hashCode() : 0)) * 31)) * 31, 31, this.l)) * 31)) * 31, 31, this.o)) * 31, 31);
    }
}
