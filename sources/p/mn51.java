package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class mn51 {
    public static final ln51 Companion = new ln51();
    public static final znb0[] d = {dm5.S(2, oa41.W0), dm5.S(2, oa41.X0), dm5.S(2, oa41.Y0)};
    public final List a;
    public final List b;
    public final List c;

    public /* synthetic */ mn51(int i, List list, List list2, List list3) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, kn51.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn51)) {
            return false;
        }
        mn51 mn51Var = (mn51) obj;
        return u890.j(this.a, mn51Var.a) && u890.j(this.b, mn51Var.b) && u890.j(this.c, mn51Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
