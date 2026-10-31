package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vg81 {
    public final List a;
    public final zob1 b;

    public vg81(List list, zob1 zob1Var) {
        this.a = list;
        this.b = zob1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg81)) {
            return false;
        }
        vg81 vg81Var = (vg81) obj;
        return this.a.equals(vg81Var.a) && u890.j(this.b, vg81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
