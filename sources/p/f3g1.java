package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class f3g1 {
    public static final e3g1 Companion = new e3g1();
    public static final znb0[] c = {dm5.S(2, q9f1.N0), dm5.S(2, q9f1.O0)};
    public final List a;
    public final List b;

    public /* synthetic */ f3g1(int i, List list, List list2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, d3g1.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3g1)) {
            return false;
        }
        f3g1 f3g1Var = (f3g1) obj;
        return u890.j(this.a, f3g1Var.a) && u890.j(this.b, f3g1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
