package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x691 {
    public final k791 a;
    public final boolean b;

    public x691(k791 k791Var, boolean z) {
        this.a = k791Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x691)) {
            return false;
        }
        x691 x691Var = (x691) obj;
        return this.a.equals(x691Var.a) && this.b == x691Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
