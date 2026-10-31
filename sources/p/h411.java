package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class h411 {
    public static final g411 Companion = new g411();
    public static final znb0[] c = {null, dm5.S(2, ijz0.R0)};
    public final String a;
    public final List b;

    public /* synthetic */ h411(String str, List list, int i) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, f411.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h411)) {
            return false;
        }
        h411 h411Var = (h411) obj;
        return u890.j(this.a, h411Var.a) && u890.j(this.b, h411Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
