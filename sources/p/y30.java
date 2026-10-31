package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y30 {
    public final int a;
    public final boolean b;

    public y30(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y30)) {
            return false;
        }
        y30 y30Var = (y30) obj;
        return this.a == y30Var.a && this.b == y30Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (l1d.C(this.a) * 31);
    }
}
