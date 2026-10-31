package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class gr40 {
    public static final fr40 Companion = new fr40();
    public static final znb0[] d = {dm5.S(2, bc30.Z0), dm5.S(2, bc30.a1), null};
    public final List a;
    public final List b;
    public final yh40 c;

    public /* synthetic */ gr40(int i, List list, List list2, yh40 yh40Var) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, er40.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = list2;
        this.c = yh40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr40)) {
            return false;
        }
        gr40 gr40Var = (gr40) obj;
        return u890.j(this.a, gr40Var.a) && u890.j(this.b, gr40Var.b) && u890.j(this.c, gr40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
