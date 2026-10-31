package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tq9 {
    public final long a;
    public final Long b;
    public final long c;
    public final float d;
    public final List e;
    public final boolean f;

    public /* synthetic */ tq9(int i, List list, boolean z) {
        this(0L, null, 0L, 0.0f, (i & 16) != 0 ? z6x.a : list, (i & 32) != 0 ? false : z);
    }

    public final long a(long j) {
        long j2 = this.a + ((long) (this.d * (j - this.c)));
        Long l = this.b;
        return yoi1.r(j2, 0L, l != null ? l.longValue() : Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq9)) {
            return false;
        }
        tq9 tq9Var = (tq9) obj;
        return this.a == tq9Var.a && u890.j(this.b, tq9Var.b) && this.c == tq9Var.c && Float.compare(this.d, tq9Var.d) == 0 && u890.j(this.e, tq9Var.e) && this.f == tq9Var.f;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        Long l = this.b;
        return Boolean.hashCode(this.f) + f4i1.b(x0d.f(cy30.f((iHashCode + (l == null ? 0 : l.hashCode())) * 31, this.c, 31), 31, this.d), 31, this.e);
    }

    public tq9(long j, Long l, long j2, float f, List list, boolean z) {
        this.a = j;
        this.b = l;
        this.c = j2;
        this.d = f;
        this.e = list;
        this.f = z;
    }
}
