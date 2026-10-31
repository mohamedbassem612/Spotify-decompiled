package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w3d {
    public final vg41 a;
    public final v3d b;
    public final j2i c;
    public final Function0 d;
    public final iu30 e;
    public final dmw0 f;
    public final vu30 g;
    public final boolean h;
    public final boolean i;

    public w3d(vg41 vg41Var, v3d v3dVar, j2i j2iVar, Function0 function0, iu30 iu30Var, vu30 vu30Var, boolean z, boolean z2, int i) {
        v3dVar = (i & 2) != 0 ? null : v3dVar;
        z2 = (i & 256) != 0 ? true : z2;
        this.a = vg41Var;
        this.b = v3dVar;
        this.c = j2iVar;
        this.d = function0;
        this.e = iu30Var;
        this.f = dmw0.b;
        this.g = vu30Var;
        this.h = z;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w3d) {
            w3d w3dVar = (w3d) obj;
            if (this.a == w3dVar.a && u890.j(this.b, w3dVar.b) && this.c == w3dVar.c && this.d.equals(w3dVar.d) && this.e.equals(w3dVar.e) && this.f == w3dVar.f && this.g.equals(w3dVar.g) && this.h == w3dVar.h && this.i == w3dVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        v3d v3dVar = this.b;
        return Boolean.hashCode(this.i) + xcg1.g(hrt.g((this.f.hashCode() + ktd.g(this.e, rjx.n((this.c.hashCode() + ((iHashCode + (v3dVar == null ? 0 : v3dVar.hashCode())) * 31)) * 31, 31, this.d), 31)) * 31, 31, this.g), 31, this.h);
    }
}
