package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class j4g1 {
    public final double a;
    public final Integer b;
    public final long c;
    public final long d;
    public final List e;

    public j4g1(double d, Integer num, long j, long j2, List list) {
        this.a = d;
        this.b = num;
        this.c = j;
        this.d = j2;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4g1)) {
            return false;
        }
        j4g1 j4g1Var = (j4g1) obj;
        return Double.compare(this.a, j4g1Var.a) == 0 && u890.j(this.b, j4g1Var.b) && this.c == j4g1Var.c && this.d == j4g1Var.d && this.e.equals(j4g1Var.e);
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.a) * 31;
        Integer num = this.b;
        return this.e.hashCode() + cy30.f(cy30.f((iHashCode + (num == null ? 0 : num.hashCode())) * 31, this.c, 31), this.d, 31);
    }
}
