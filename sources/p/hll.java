package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hll implements ez00 {
    public final long a;
    public final List b;
    public final List c;
    public final List d;

    /* JADX WARN: Illegal instructions before constructor call */
    public hll(long j, int i) {
        if ((i & 1) != 0) {
            ytw0 ytw0Var = jfv.b;
            j = 0;
        }
        z6x z6xVar = z6x.a;
        this(j, z6xVar, z6xVar, z6xVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hll)) {
            return false;
        }
        hll hllVar = (hll) obj;
        return jfv.f(this.a, hllVar.a) && u890.j(this.b, hllVar.b) && u890.j(this.c, hllVar.c) && u890.j(this.d, hllVar.d);
    }

    public final int hashCode() {
        ytw0 ytw0Var = jfv.b;
        return this.d.hashCode() + f4i1.b(f4i1.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public hll(long j, List list, List list2, List list3) {
        this.a = j;
        this.b = list;
        this.c = list2;
        this.d = list3;
    }
}
