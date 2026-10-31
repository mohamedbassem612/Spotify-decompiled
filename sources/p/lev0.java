package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lev0 {
    public final ydv0 a;
    public final List b;
    public final String c;
    public final int d;

    public lev0(ydv0 ydv0Var, List list, String str, int i) {
        this.a = ydv0Var;
        this.b = list;
        this.c = str;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lev0)) {
            return false;
        }
        lev0 lev0Var = (lev0) obj;
        return this.a.equals(lev0Var.a) && this.b.equals(lev0Var.b) && u890.j(this.c, lev0Var.c) && this.d == lev0Var.d;
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Integer.hashCode(this.d) + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }
}
