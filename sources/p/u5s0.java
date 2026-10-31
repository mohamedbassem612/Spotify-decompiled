package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u5s0 {
    public final boolean a;
    public final int b;

    public u5s0(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5s0)) {
            return false;
        }
        u5s0 u5s0Var = (u5s0) obj;
        return this.a == u5s0Var.a && this.b == u5s0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
