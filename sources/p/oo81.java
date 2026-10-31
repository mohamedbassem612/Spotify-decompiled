package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oo81 extends t9p1 {
    public final long c;
    public final boolean d;

    public oo81(long j, boolean z) {
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo81)) {
            return false;
        }
        oo81 oo81Var = (oo81) obj;
        return this.c == oo81Var.c && this.d == oo81Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (Long.hashCode(this.c) * 31);
    }
}
