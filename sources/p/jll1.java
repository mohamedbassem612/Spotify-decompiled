package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jll1 implements nll1 {
    public final f8h1 a;

    public jll1(f8h1 f8h1Var) {
        this.a = f8h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jll1) && this.a == ((jll1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
