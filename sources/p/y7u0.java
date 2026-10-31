package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y7u0 {
    public final boolean a;
    public final int b;

    public y7u0(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7u0)) {
            return false;
        }
        y7u0 y7u0Var = (y7u0) obj;
        return this.a == y7u0Var.a && this.b == y7u0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
