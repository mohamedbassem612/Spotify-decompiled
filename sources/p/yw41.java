package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yw41 extends xyn1 {
    public final List b;
    public final String c;
    public final boolean d;
    public final tv80 e;

    public yw41(List list, String str, boolean z, tv80 tv80Var) {
        this.b = list;
        this.c = str;
        this.d = z;
        this.e = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw41)) {
            return false;
        }
        yw41 yw41Var = (yw41) obj;
        return this.b.equals(yw41Var.b) && u890.j(this.c, yw41Var.c) && this.d == yw41Var.d && u890.j(this.e, yw41Var.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(this.b.hashCode() * 31, 961, this.c), 31, this.d);
        tv80 tv80Var = this.e;
        return iG + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
