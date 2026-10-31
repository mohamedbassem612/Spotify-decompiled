package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lhw0 {
    public final boolean a;
    public final boolean b;
    public final long c;

    public lhw0(long j, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhw0)) {
            return false;
        }
        lhw0 lhw0Var = (lhw0) obj;
        return this.a == lhw0Var.a && this.b == lhw0Var.b && this.c == lhw0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public /* synthetic */ lhw0() {
        this(-1L, false, false);
    }
}
