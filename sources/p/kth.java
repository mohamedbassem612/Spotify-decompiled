package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class kth {
    public static final jth Companion = new jth();
    public static final znb0[] d = {null, null, dm5.S(2, nyf.W0)};
    public final String a;
    public final ib9 b;
    public final List c;

    public /* synthetic */ kth(int i, String str, ib9 ib9Var, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ib9Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kth)) {
            return false;
        }
        kth kthVar = (kth) obj;
        return u890.j(this.a, kthVar.a) && u890.j(this.b, kthVar.b) && u890.j(this.c, kthVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ib9 ib9Var = this.b;
        int iHashCode2 = (iHashCode + (ib9Var == null ? 0 : ib9Var.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
