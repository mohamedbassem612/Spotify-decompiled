package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class voc0 extends zoc0 {
    public final int a;
    public final fab0 b;
    public final tr80 c;
    public final mml d;
    public final dia1 e;
    public final List f;
    public final List g;
    public final boolean h;
    public final List i;
    public final boolean j;
    public final boolean k;

    public voc0(int i, fab0 fab0Var, tr80 tr80Var, mml mmlVar, dia1 dia1Var, List list, List list2, boolean z, List list3, boolean z2, boolean z3) {
        this.a = i;
        this.b = fab0Var;
        this.c = tr80Var;
        this.d = mmlVar;
        this.e = dia1Var;
        this.f = list;
        this.g = list2;
        this.h = z;
        this.i = list3;
        this.j = z2;
        this.k = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof voc0)) {
            return false;
        }
        voc0 voc0Var = (voc0) obj;
        return this.a == voc0Var.a && u890.j(this.b, voc0Var.b) && u890.j(this.c, voc0Var.c) && u890.j(this.d, voc0Var.d) && this.e == voc0Var.e && u890.j(this.f, voc0Var.f) && this.g.equals(voc0Var.g) && this.h == voc0Var.h && u890.j(this.i, voc0Var.i) && this.j == voc0Var.j && this.k == voc0Var.k;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + lf51.e((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c)) * 31)) * 31;
        List list = this.f;
        return Boolean.hashCode(this.k) + xcg1.g(f4i1.b(xcg1.g(f4i1.b((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }
}
