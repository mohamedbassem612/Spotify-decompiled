package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mu8 {
    public final int a;
    public final boolean b;

    public mu8(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu8)) {
            return false;
        }
        mu8 mu8Var = (mu8) obj;
        return this.a == mu8Var.a && this.b == mu8Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
