package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yw10 {
    public final n5o0 a;
    public final int b;

    public yw10(n5o0 n5o0Var, int i) {
        this.a = n5o0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw10)) {
            return false;
        }
        yw10 yw10Var = (yw10) obj;
        return this.a == yw10Var.a && this.b == yw10Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
