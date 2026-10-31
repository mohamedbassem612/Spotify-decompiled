package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cf7 extends iqo1 {
    public final List d;
    public final tv80 e;

    public cf7(List list, tv80 tv80Var) {
        this.d = list;
        this.e = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf7)) {
            return false;
        }
        cf7 cf7Var = (cf7) obj;
        return u890.j(this.d, cf7Var.d) && u890.j(this.e, cf7Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        tv80 tv80Var = this.e;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
