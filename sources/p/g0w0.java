package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class g0w0 extends cxm {
    public final ArrayList d;
    public final tv80 e;

    public g0w0(ArrayList arrayList, tv80 tv80Var) {
        this.d = arrayList;
        this.e = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0w0)) {
            return false;
        }
        g0w0 g0w0Var = (g0w0) obj;
        return this.d.equals(g0w0Var.d) && u890.j(this.e, g0w0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        tv80 tv80Var = this.e;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
