package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y5m1 {
    public final hzl1 a;
    public final List b;
    public final String c;

    public y5m1(hzl1 hzl1Var, smc0 smc0Var, String str) {
        this.a = hzl1Var;
        this.b = smc0Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5m1)) {
            return false;
        }
        y5m1 y5m1Var = (y5m1) obj;
        return u890.j(this.a, y5m1Var.a) && this.b.equals(y5m1Var.b) && u890.j(this.c, y5m1Var.c);
    }

    public final int hashCode() {
        hzl1 hzl1Var = this.a;
        int iB = f4i1.b((hzl1Var == null ? 0 : hzl1Var.hashCode()) * 31, 31, this.b);
        String str = this.c;
        return iB + (str != null ? str.hashCode() : 0);
    }
}
