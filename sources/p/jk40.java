package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@o661
public final class jk40 {
    public static final ik40 Companion = new ik40();
    public static final znb0[] c = {dm5.S(2, bc30.T0), null};
    public final List a;
    public final Boolean b;

    public /* synthetic */ jk40(int i, List list, Boolean bool) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk40)) {
            return false;
        }
        jk40 jk40Var = (jk40) obj;
        return u890.j(this.a, jk40Var.a) && u890.j(this.b, jk40Var.b);
    }

    public final int hashCode() {
        List list = this.a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public jk40(List list, Boolean bool) {
        this.a = list;
        this.b = bool;
    }
}
