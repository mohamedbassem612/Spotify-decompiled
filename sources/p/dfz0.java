package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class dfz0 {
    public static final cfz0 Companion = new cfz0();
    public static final znb0[] c = {null, dm5.S(2, h0x0.e1)};
    public final String a;
    public final List b;

    public /* synthetic */ dfz0(String str, List list, int i) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, bfz0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfz0)) {
            return false;
        }
        dfz0 dfz0Var = (dfz0) obj;
        return u890.j(this.a, dfz0Var.a) && u890.j(this.b, dfz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
