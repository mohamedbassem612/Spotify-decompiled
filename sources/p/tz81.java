package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tz81 implements uz81 {
    public final List a;
    public final ioj0 b;

    public tz81(List list, ioj0 ioj0Var) {
        this.a = list;
        this.b = ioj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tz81)) {
            return false;
        }
        tz81 tz81Var = (tz81) obj;
        return u890.j(this.a, tz81Var.a) && u890.j(this.b, tz81Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ioj0 ioj0Var = this.b;
        return iHashCode + (ioj0Var == null ? 0 : ioj0Var.a.hashCode());
    }
}
