package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gje1 {
    public final rte1 a;
    public final List b;
    public final String c;

    public gje1(rte1 rte1Var, List list, String str) {
        this.a = rte1Var;
        this.b = list;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gje1)) {
            return false;
        }
        gje1 gje1Var = (gje1) obj;
        return u890.j(this.a, gje1Var.a) && u890.j(this.b, gje1Var.b) && u890.j(this.c, gje1Var.c);
    }

    public final int hashCode() {
        rte1 rte1Var = this.a;
        int iB = f4i1.b((rte1Var == null ? 0 : rte1Var.hashCode()) * 31, 31, this.b);
        String str = this.c;
        return iB + (str != null ? str.hashCode() : 0);
    }
}
