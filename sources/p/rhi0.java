package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rhi0 {
    public final pjw0 a;
    public final nbw0 b;
    public final nbw0 c;
    public final jo70 d;
    public final mtl e;
    public final prl f;
    public final xkk1 g;
    public final e2k1 h;
    public final hzy i;

    public rhi0(pjw0 pjw0Var, nbw0 nbw0Var, nbw0 nbw0Var2, jo70 jo70Var, mtl mtlVar, prl prlVar, xkk1 xkk1Var, e2k1 e2k1Var, hzy hzyVar) {
        this.a = pjw0Var;
        this.b = nbw0Var;
        this.c = nbw0Var2;
        this.d = jo70Var;
        this.e = mtlVar;
        this.f = prlVar;
        this.g = xkk1Var;
        this.h = e2k1Var;
        this.i = hzyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhi0)) {
            return false;
        }
        rhi0 rhi0Var = (rhi0) obj;
        return u890.j(this.a, rhi0Var.a) && this.b.equals(rhi0Var.b) && this.c.equals(rhi0Var.c) && this.d.equals(rhi0Var.d) && this.e.equals(rhi0Var.e) && u890.j(this.f, rhi0Var.f) && u890.j(this.g, rhi0Var.g) && u890.j(this.h, rhi0Var.h) && u890.j(this.i, rhi0Var.i);
    }

    public final int hashCode() {
        pjw0 pjw0Var = this.a;
        int iHashCode = (this.e.a.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((pjw0Var == null ? 0 : pjw0Var.hashCode()) * 31)) * 31)) * 31)) * 31)) * 31;
        prl prlVar = this.f;
        int iHashCode2 = (iHashCode + (prlVar == null ? 0 : prlVar.hashCode())) * 31;
        xkk1 xkk1Var = this.g;
        int iHashCode3 = (iHashCode2 + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        e2k1 e2k1Var = this.h;
        int iHashCode4 = (iHashCode3 + (e2k1Var == null ? 0 : Long.hashCode(e2k1Var.a))) * 31;
        hzy hzyVar = this.i;
        return iHashCode4 + (hzyVar != null ? l1d.C(hzyVar.a) : 0);
    }
}
