package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lm11 {
    public final hvl1 a;
    public final List b;

    public lm11(hvl1 hvl1Var, List list) {
        this.a = hvl1Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm11)) {
            return false;
        }
        lm11 lm11Var = (lm11) obj;
        return this.a.equals(lm11Var.a) && u890.j(this.b, lm11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() - 218614113) * 31);
    }
}
