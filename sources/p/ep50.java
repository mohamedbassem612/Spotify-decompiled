package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ep50 {
    public final zv31 a;
    public final int b;

    public ep50(zv31 zv31Var, int i) {
        this.a = zv31Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep50)) {
            return false;
        }
        ep50 ep50Var = (ep50) obj;
        return this.a.equals(ep50Var.a) && this.b == ep50Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
