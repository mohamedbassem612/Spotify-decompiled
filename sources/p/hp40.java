package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class hp40 {
    public static final gp40 Companion = new gp40();
    public static final znb0[] e = {dm5.S(2, bc30.X0), null, dm5.S(2, bc30.Y0), null};
    public final List a;
    public final plz0 b;
    public final List c;
    public final wlz0 d;

    public /* synthetic */ hp40(int i, List list, plz0 plz0Var, List list2, wlz0 wlz0Var) {
        if (12 != (i & 12)) {
            o6p1.t(i, 12, fp40.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = new plz0();
        } else {
            this.b = plz0Var;
        }
        this.c = list2;
        this.d = wlz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp40)) {
            return false;
        }
        hp40 hp40Var = (hp40) obj;
        return u890.j(this.a, hp40Var.a) && u890.j(this.b, hp40Var.b) && u890.j(this.c, hp40Var.c) && u890.j(this.d, hp40Var.d);
    }

    public final int hashCode() {
        List list = this.a;
        return this.d.hashCode() + f4i1.b((this.b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31)) * 31, 31, this.c);
    }
}
