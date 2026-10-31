package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class blk1 {
    public final long a;
    public final long b;
    public final List c;
    public final boolean d;
    public final boolean e;

    public blk1(long j, long j2, List list, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = list;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blk1)) {
            return false;
        }
        blk1 blk1Var = (blk1) obj;
        return this.a == blk1Var.a && this.b == blk1Var.b && this.c.equals(blk1Var.c) && this.d == blk1Var.d && this.e == blk1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(f4i1.b(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), 31, this.c), 31, this.d);
    }
}
