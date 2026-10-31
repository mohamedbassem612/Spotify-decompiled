package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y3d implements z3d {
    public final vg41 a;
    public final v3d b;
    public final j2i c;
    public final dmw0 d;
    public final Function0 e;
    public final iu30 f;
    public final vu30 g;
    public final boolean h;
    public final boolean i;

    public y3d(vg41 vg41Var, v3d v3dVar, j2i j2iVar, dmw0 dmw0Var, Function0 function0, iu30 iu30Var, vu30 vu30Var, boolean z, boolean z2) {
        this.a = vg41Var;
        this.b = v3dVar;
        this.c = j2iVar;
        this.d = dmw0Var;
        this.e = function0;
        this.f = iu30Var;
        this.g = vu30Var;
        this.h = z;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y3d) {
            y3d y3dVar = (y3d) obj;
            if (this.a == y3dVar.a && u890.j(this.b, y3dVar.b) && this.c == y3dVar.c && this.d == y3dVar.d && this.e.equals(y3dVar.e) && this.f.equals(y3dVar.f) && this.g.equals(y3dVar.g) && this.h == y3dVar.h && this.i == y3dVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        v3d v3dVar = this.b;
        return Boolean.hashCode(this.i) + xcg1.g(hrt.g(ktd.g(this.f, rjx.n((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (v3dVar == null ? 0 : v3dVar.hashCode())) * 31)) * 31)) * 31, 31, this.e), 31), 31, this.g), 31, this.h);
    }
}
