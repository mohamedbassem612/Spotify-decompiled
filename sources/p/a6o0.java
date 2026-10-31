package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a6o0 implements dbr0 {
    public final ien0 a;

    public a6o0(ien0 ien0Var) {
        this.a = ien0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a6o0) && this.a == ((a6o0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
