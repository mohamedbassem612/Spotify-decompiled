package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class ppe1 {
    public static final dpe1 Companion = new dpe1();
    public static final znb0[] e = {null, null, dm5.S(2, orc1.U0), null};
    public final gpe1 a;
    public final cpe1 b;
    public final List c;
    public final mpe1 d;

    public /* synthetic */ ppe1(int i, gpe1 gpe1Var, cpe1 cpe1Var, List list, mpe1 mpe1Var) {
        if (15 != (i & 15)) {
            o6p1.t(i, 15, zoe1.a.getDescriptor());
            throw null;
        }
        this.a = gpe1Var;
        this.b = cpe1Var;
        this.c = list;
        this.d = mpe1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppe1)) {
            return false;
        }
        ppe1 ppe1Var = (ppe1) obj;
        return u890.j(this.a, ppe1Var.a) && u890.j(this.b, ppe1Var.b) && u890.j(this.c, ppe1Var.c) && u890.j(this.d, ppe1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f4i1.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
