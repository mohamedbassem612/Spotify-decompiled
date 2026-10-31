package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cwj1 {
    public final bwj1 a;
    public final List b;
    public final zvj1 c;

    public cwj1(bwj1 bwj1Var, List list, zvj1 zvj1Var) {
        this.a = bwj1Var;
        this.b = list;
        this.c = zvj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwj1)) {
            return false;
        }
        cwj1 cwj1Var = (cwj1) obj;
        return this.a == cwj1Var.a && this.b.equals(cwj1Var.b) && u890.j(this.c, cwj1Var.c);
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        zvj1 zvj1Var = this.c;
        return iB + (zvj1Var == null ? 0 : zvj1Var.hashCode());
    }
}
