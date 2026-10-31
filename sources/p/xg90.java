package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class xg90 {
    public static final wg90 Companion = new wg90();
    public static final znb0[] e = {null, null, dm5.S(2, lx70.Q0), null};
    public final String a;
    public final String b;
    public final List c;
    public final boolean d;

    public /* synthetic */ xg90(int i, String str, String str2, List list, boolean z) {
        if (15 != (i & 15)) {
            o6p1.t(i, 15, vg90.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg90)) {
            return false;
        }
        xg90 xg90Var = (xg90) obj;
        return u890.j(this.a, xg90Var.a) && u890.j(this.b, xg90Var.b) && u890.j(this.c, xg90Var.c) && this.d == xg90Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public xg90(String str, String str2, List list, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = z;
    }
}
