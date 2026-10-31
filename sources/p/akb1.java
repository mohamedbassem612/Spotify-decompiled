package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class akb1 {
    public final long a;
    public final boolean b;

    public akb1(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akb1)) {
            return false;
        }
        akb1 akb1Var = (akb1) obj;
        return this.a == akb1Var.a && this.b == akb1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
