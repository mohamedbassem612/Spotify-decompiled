package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class v3c1 {
    public static final u3c1 Companion = new u3c1();
    public static final znb0[] d = {null, null, dm5.S(2, l4b1.T0)};
    public final String a;
    public final qa90 b;
    public final List c;

    public /* synthetic */ v3c1(int i, String str, qa90 qa90Var, List list) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, t3c1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = qa90Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3c1)) {
            return false;
        }
        v3c1 v3c1Var = (v3c1) obj;
        return u890.j(this.a, v3c1Var.a) && u890.j(this.b, v3c1Var.b) && u890.j(this.c, v3c1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
