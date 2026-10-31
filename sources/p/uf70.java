package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class uf70 {
    public static final tf70 Companion = new tf70();
    public static final znb0[] c = {null, dm5.S(2, h050.U0)};
    public final String a;
    public final List b;

    public /* synthetic */ uf70(String str, List list, int i) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, sf70.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf70)) {
            return false;
        }
        uf70 uf70Var = (uf70) obj;
        return u890.j(this.a, uf70Var.a) && u890.j(this.b, uf70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
