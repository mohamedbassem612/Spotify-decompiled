package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xg60 {
    public final List a;
    public final List b;
    public final int c;
    public final double d;

    public xg60(List list, List list2, int i, double d) {
        this.a = list;
        this.b = list2;
        this.c = i;
        this.d = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg60)) {
            return false;
        }
        xg60 xg60Var = (xg60) obj;
        return this.a.equals(xg60Var.a) && this.b.equals(xg60Var.b) && this.c == xg60Var.c && Double.compare(this.d, xg60Var.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + kaa0.f(this.c, f4i1.b(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
