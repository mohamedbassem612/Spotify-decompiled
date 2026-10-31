package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lqm {
    public final List a;
    public final List b;
    public final qle1 c;

    public lqm(List list, List list2, qle1 qle1Var, int i) {
        list2 = (i & 2) != 0 ? z6x.a : list2;
        qle1Var = (i & 4) != 0 ? null : qle1Var;
        this.a = list;
        this.b = list2;
        this.c = qle1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqm)) {
            return false;
        }
        lqm lqmVar = (lqm) obj;
        return this.a.equals(lqmVar.a) && this.b.equals(lqmVar.b) && u890.j(this.c, lqmVar.c);
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        qle1 qle1Var = this.c;
        return iB + (qle1Var == null ? 0 : qle1Var.hashCode());
    }
}
