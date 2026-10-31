package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class pi40 {
    public static final oi40 Companion = new oi40();
    public static final znb0[] c = {null, dm5.S(2, bc30.R0)};
    public final String a;
    public final List b;

    public /* synthetic */ pi40(String str, List list, int i) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, ni40.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi40)) {
            return false;
        }
        pi40 pi40Var = (pi40) obj;
        return u890.j(this.a, pi40Var.a) && u890.j(this.b, pi40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
