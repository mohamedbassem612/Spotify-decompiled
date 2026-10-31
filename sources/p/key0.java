package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class key0 {
    public final hwq a;
    public final h7e0 b;

    public key0(hwq hwqVar, h7e0 h7e0Var) {
        this.a = hwqVar;
        this.b = h7e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof key0)) {
            return false;
        }
        key0 key0Var = (key0) obj;
        return this.a.equals(key0Var.a) && this.b.equals(key0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
