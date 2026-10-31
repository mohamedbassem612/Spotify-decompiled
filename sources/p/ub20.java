package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class ub20 {
    public static final ob20 Companion = new ob20();
    public static final znb0[] c = {null, dm5.S(2, ny00.U0)};
    public final boolean a;
    public final List b;

    public /* synthetic */ ub20(int i, boolean z, List list) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, lb20.a.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub20)) {
            return false;
        }
        ub20 ub20Var = (ub20) obj;
        return this.a == ub20Var.a && u890.j(this.b, ub20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public ub20() {
        this.a = false;
        this.b = z6x.a;
    }
}
