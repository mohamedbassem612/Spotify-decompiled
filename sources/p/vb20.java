package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class vb20 {
    public static final pb20 Companion = new pb20();
    public static final znb0[] c = {null, dm5.S(2, ny00.V0)};
    public final boolean a;
    public final List b;

    public /* synthetic */ vb20(int i, boolean z, List list) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, mb20.a.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb20)) {
            return false;
        }
        vb20 vb20Var = (vb20) obj;
        return this.a == vb20Var.a && u890.j(this.b, vb20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
