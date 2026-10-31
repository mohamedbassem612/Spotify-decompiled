package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ow1 {
    public final bx1 a;
    public final bx1 b;
    public final ax1 c;
    public final vt1 d;
    public final q01 e;
    public final n891 f;
    public final n2 g;
    public final t6 h;
    public final ax1 i;
    public final ax1 j;
    public final bx1 k;
    public final q01 l;
    public final ab m;
    public final q01 n;
    public final d4 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j1 f28p;
    public final bx1 q;

    public ow1(bx1 bx1Var, bx1 bx1Var2, ax1 ax1Var, vt1 vt1Var, q01 q01Var, n891 n891Var, n2 n2Var, t6 t6Var, ax1 ax1Var2, ax1 ax1Var3, bx1 bx1Var3, q01 q01Var2, ab abVar, q01 q01Var3, d4 d4Var, j1 j1Var, bx1 bx1Var4) {
        this.a = bx1Var;
        this.b = bx1Var2;
        this.c = ax1Var;
        this.d = vt1Var;
        this.e = q01Var;
        this.f = n891Var;
        this.g = n2Var;
        this.h = t6Var;
        this.i = ax1Var2;
        this.j = ax1Var3;
        this.k = bx1Var3;
        this.l = q01Var2;
        this.m = abVar;
        this.n = q01Var3;
        this.o = d4Var;
        this.f28p = j1Var;
        this.q = bx1Var4;
    }

    public final iu30 a() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ow1) {
            ow1 ow1Var = (ow1) obj;
            return this.a == ow1Var.a && this.b == ow1Var.b && this.c == ow1Var.c && this.d == ow1Var.d && this.e.equals(ow1Var.e) && this.f == ow1Var.f && this.g == ow1Var.g && this.h == ow1Var.h && this.i == ow1Var.i && this.j == ow1Var.j && this.k == ow1Var.k && this.l.equals(ow1Var.l) && this.m == ow1Var.m && this.n.equals(ow1Var.n) && this.o == ow1Var.o && this.f28p.equals(ow1Var.f28p) && this.q == ow1Var.q;
        }
        return false;
    }

    public final int hashCode() {
        return this.q.hashCode() + ((this.f28p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
