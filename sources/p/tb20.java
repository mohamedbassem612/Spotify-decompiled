package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class tb20 {
    public static final nb20 Companion = new nb20();
    public static final znb0[] c = {null, dm5.S(2, ny00.T0)};
    public final boolean a;
    public final List b;

    public /* synthetic */ tb20(int i, boolean z, List list) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, kb20.a.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb20)) {
            return false;
        }
        tb20 tb20Var = (tb20) obj;
        return this.a == tb20Var.a && u890.j(this.b, tb20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public tb20() {
        this.a = false;
        this.b = z6x.a;
    }
}
