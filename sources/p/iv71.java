package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iv71 {
    public final pv71 a;
    public final wa5 b;

    public iv71(pv71 pv71Var, wa5 wa5Var) {
        this.a = pv71Var;
        this.b = wa5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof iv71) {
            iv71 iv71Var = (iv71) obj;
            return this.a.equals(iv71Var.a) && this.b == iv71Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
