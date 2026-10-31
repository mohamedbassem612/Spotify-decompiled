package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l7j1 implements o7j1 {
    public final long a;
    public final boolean b;

    public l7j1(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7j1)) {
            return false;
        }
        l7j1 l7j1Var = (l7j1) obj;
        return this.a == l7j1Var.a && this.b == l7j1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
