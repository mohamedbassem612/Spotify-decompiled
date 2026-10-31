package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class r89 {
    public static final q89 Companion = new q89();
    public static final znb0[] e = {null, dm5.S(2, vc7.Y0), null, null};
    public final vea0 a;
    public final List b;
    public final td61 c;
    public final u89 d;

    public /* synthetic */ r89(int i, vea0 vea0Var, List list, td61 td61Var, u89 u89Var) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, p89.a.getDescriptor());
            throw null;
        }
        this.a = vea0Var;
        if ((i & 2) == 0) {
            this.b = z6x.a;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = td61Var;
        }
        if ((i & 8) == 0) {
            this.d = new u89();
        } else {
            this.d = u89Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r89)) {
            return false;
        }
        r89 r89Var = (r89) obj;
        return u890.j(this.a, r89Var.a) && u890.j(this.b, r89Var.b) && u890.j(this.c, r89Var.c) && u890.j(this.d, r89Var.d);
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.a.hashCode() * 31, 31, this.b);
        td61 td61Var = this.c;
        return Boolean.hashCode(this.d.a) + ((iB + (td61Var == null ? 0 : td61Var.hashCode())) * 31);
    }
}
