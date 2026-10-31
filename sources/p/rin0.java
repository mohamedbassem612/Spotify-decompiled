package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rin0 {
    public final int a;
    public final t9g b;
    public final mdb1 c;
    public final fxl d;
    public final r4g e;
    public final hpf1 f;
    public final aix0 g;
    public final pxt0 h;
    public final jb30 i;

    public rin0(int i, t9g t9gVar, mdb1 mdb1Var, fxl fxlVar, r4g r4gVar, hpf1 hpf1Var, aix0 aix0Var, pxt0 pxt0Var, jb30 jb30Var) {
        this.a = i;
        this.b = t9gVar;
        this.c = mdb1Var;
        this.d = fxlVar;
        this.e = r4gVar;
        this.f = hpf1Var;
        this.g = aix0Var;
        this.h = pxt0Var;
        this.i = jb30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rin0)) {
            return false;
        }
        rin0 rin0Var = (rin0) obj;
        return this.a == rin0Var.a && this.b.equals(rin0Var.b) && this.c.equals(rin0Var.c) && this.d.equals(rin0Var.d) && u890.j(this.e, rin0Var.e) && this.f.equals(rin0Var.f) && this.g.equals(rin0Var.g) && this.h.equals(rin0Var.h) && this.i.equals(rin0Var.i);
    }

    public final int hashCode() {
        int iF = x0d.f((((this.b.hashCode() + (l1d.C(this.a) * 31)) * 31) + 924670791) * 31, 31, this.d.a.a);
        r4g r4gVar = this.e;
        return this.i.hashCode() + ((this.h.hashCode() + xcg1.g((this.f.hashCode() + ((iF + (r4gVar == null ? 0 : r4gVar.a.hashCode())) * 31)) * 31, 31, false)) * 31);
    }
}
