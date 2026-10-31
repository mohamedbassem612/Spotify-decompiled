package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fjc0 {
    public final int a;
    public final int b;

    public fjc0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjc0)) {
            return false;
        }
        fjc0 fjc0Var = (fjc0) obj;
        return this.a == fjc0Var.a && this.b == fjc0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
