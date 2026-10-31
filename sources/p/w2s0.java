package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class w2s0 {
    public static final v2s0 Companion = new v2s0();
    public static final znb0[] c = {null, dm5.S(2, v0r0.R0)};
    public final String a;
    public final List b;

    public /* synthetic */ w2s0(String str, List list, int i) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, u2s0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2s0)) {
            return false;
        }
        w2s0 w2s0Var = (w2s0) obj;
        return u890.j(this.a, w2s0Var.a) && u890.j(this.b, w2s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
