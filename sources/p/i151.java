package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i151 extends q151 {
    public final List a;
    public final tv80 b;

    public i151(List list, tv80 tv80Var) {
        this.a = list;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i151)) {
            return false;
        }
        i151 i151Var = (i151) obj;
        return this.a.equals(i151Var.a) && u890.j(this.b, i151Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
