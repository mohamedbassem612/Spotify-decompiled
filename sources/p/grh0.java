package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class grh0 implements lrh0 {
    public final p8i0 a;

    public grh0(p8i0 p8i0Var) {
        this.a = p8i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof grh0) && this.a == ((grh0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
