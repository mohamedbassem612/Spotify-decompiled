package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class frh0 implements lrh0 {
    public final p8i0 a;

    public frh0(p8i0 p8i0Var) {
        this.a = p8i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof frh0) && this.a == ((frh0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
